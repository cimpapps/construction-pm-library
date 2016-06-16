/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.pm.lib.rmi;

import construction.pm.lib.dto.UserDTO;

/**
 *
 * @author catalin.cimpoeru
 */
public interface AbstractUserRemote {
    
    public boolean register(UserDTO user);
    public UserDTO logIn(UserDTO user);
    public UserDTO findByUsername(String username);
    public void removeUser(UserDTO userDto);
    
}
