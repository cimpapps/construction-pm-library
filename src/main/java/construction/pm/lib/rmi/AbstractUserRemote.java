
package construction.pm.lib.rmi;

import construction.pm.lib.dto.UserDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author catalin.cimpoeru
 */
public interface AbstractUserRemote extends Remote{
    public boolean register(UserDTO user) throws RemoteException;
    public UserDTO logIn(UserDTO user) throws RemoteException;
    public UserDTO findByUsername(String username) throws RemoteException;
    public void removeUser(UserDTO userDto) throws RemoteException;
    
}
