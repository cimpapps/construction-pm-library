
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;
public class EmployeePositionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String position;

    private Collection<EmployeeDTO> employeeCollection;

    public EmployeePositionDTO() {
    }

    public EmployeePositionDTO(Integer id) {
        this.id = id;
    }

    public EmployeePositionDTO(Integer id, String position) {
        this.id = id;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Collection<EmployeeDTO> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<EmployeeDTO> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public String toString() {
        return position;
    }
    
    

}
