import java.rmi.*;
import java.util.HashMap;

/**
 * This is a remote interface for illustrating RMI 
 * client callback.
 * @author M. L. Liu
 */

public interface ServerInterface extends Remote {

  public String sayHello( )   
    throws java.rmi.RemoteException;

// This remote method allows an object client to 
// register for callback
// @param callbackClientObject is a reference to the
//        object of the client; to be used by the server
//        to make its callbacks.

  public void registerForCallback(
    ClientInterface callbackClientObject , Usuario u
    ) throws java.rmi.RemoteException;

// This remote method allows an object client to 
// cancel its registration for callback

  public void unregisterForCallback(
    ClientInterface callbackClientObject)
    throws java.rmi.RemoteException;
  
  public String verificarUsuario(String usuario, String clave) throws java.rmi.RemoteException;
  public HashMap<String, Usuario> buscarAmigos(Usuario usuario) throws java.rmi.RemoteException;
  public boolean usuarioYaExiste(String usuario) throws java.rmi.RemoteException;
   public void registrarUsuario(String usuario, String clave) throws java.rmi.RemoteException;
  
}
