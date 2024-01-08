import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaludoRemotoImpl extends UnicastRemoteObject implements SaludoRemoto {
    public SaludoRemotoImpl() throws RemoteException {
        super();
    }

    // Metodos
    public String saludar(String nombre) throws RemoteException {
        return "Hola " + nombre + " Bienvendio.... Te salduda el Server!";
    }
}
