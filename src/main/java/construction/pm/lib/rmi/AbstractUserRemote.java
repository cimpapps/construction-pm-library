
package construction.pm.lib.rmi;

import construction.pm.lib.dto.UserDTO;
import java.rmi.Remote;

/**
 *
 * @author catalin.cimpoeru
 */
public interface AbstractUserRemote extends Remote{
    public boolean register(UserDTO user);
    public UserDTO logIn(UserDTO user);
    public UserDTO findByUsername(String username);
    public void removeUser(UserDTO userDto);
    
}
