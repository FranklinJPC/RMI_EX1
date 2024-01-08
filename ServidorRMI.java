import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Se crea el objeto remoto
            SaludoRemoto objeto = new SaludoRemotoImpl();

            // Crear y obtener el registro de objetos remotos
            Registry registro = LocateRegistry.createRegistry(1099);

            // Registrar el objeto remoto
            registro.rebind("SaludoRemoto", objeto);

            // Mensaje de éxito
            System.out.println("Servidor listo");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
