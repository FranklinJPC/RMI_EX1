import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Obtener el registro
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);

            // Buscar el objeto remoto
            SaludoRemoto objeto = (SaludoRemoto) registro.lookup("SaludoRemoto");

            // Invocar el método remoto
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            String respuesta = objeto.saludar(nombre);
            System.out.println(respuesta);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
