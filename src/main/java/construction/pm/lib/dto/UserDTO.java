
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
    private Collection<EmployeeDTO> employeeCollection;

    public UserDTO() {
    }

    public UserDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<EmployeeDTO> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<EmployeeDTO> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

}
