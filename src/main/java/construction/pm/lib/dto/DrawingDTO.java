
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Date;

public class DrawingDTO implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private Integer id;

    private String number;

    private String description;

    private Date dateStarted;

    private Date dateFinished;

    private Date dateDue;

    private EmployeeDTO employeesId;

    private ProjectLayerDTO projectLayersId;

    public DrawingDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getDateFinished() {
        return dateFinished;
    }

    public void setDateFinished(Date dateFinished) {
        this.dateFinished = dateFinished;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public EmployeeDTO getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(EmployeeDTO employeesId) {
        this.employeesId = employeesId;
    }

    public ProjectLayerDTO getProjectLayersId() {
        return projectLayersId;
    }

    public void setProjectLayersId(ProjectLayerDTO projectLayersId) {
        this.projectLayersId = projectLayersId;
    }
    
    

    
}
