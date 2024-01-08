import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaludoRemoto extends Remote{
    // Metodos
    public String saludar(String nombre) throws RemoteException;
}