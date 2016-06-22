
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;



public class EmployeeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    private Collection<ProjectDTO> projectCollection;

    private Collection<DrawingDTO> drawingCollection;

    private EmployeePositionDTO employeePositionsId;

    private UserDTO usersId;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Collection<ProjectDTO> getProjectCollection() {
        return projectCollection;
    }

    public void setProjectCollection(Collection<ProjectDTO> projectCollection) {
        this.projectCollection = projectCollection;
    }

    public Collection<DrawingDTO> getDrawingCollection() {
        return drawingCollection;
    }

    public void setDrawingCollection(Collection<DrawingDTO> drawingCollection) {
        this.drawingCollection = drawingCollection;
    }

    public EmployeePositionDTO getEmployeePositionsId() {
        return employeePositionsId;
    }

    public void setEmployeePositionsId(EmployeePositionDTO employeePositionsId) {
        this.employeePositionsId = employeePositionsId;
    }

    public UserDTO getUsersId() {
        return usersId;
    }

    public void setUsersId(UserDTO usersId) {
        this.usersId = usersId;
    }

}
