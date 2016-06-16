
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;



public class ProjectDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Collection<EmployeeDTO> employeeCollection;

    private ProjectCategoryDTO projectCategoriesId;

    private Collection<ProjectLayerDTO> projectLayerCollection;

    public ProjectDTO() {
    }

    public ProjectDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<EmployeeDTO> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<EmployeeDTO> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public ProjectCategoryDTO getProjectCategoriesId() {
        return projectCategoriesId;
    }

    public void setProjectCategoriesId(ProjectCategoryDTO projectCategoriesId) {
        this.projectCategoriesId = projectCategoriesId;
    }

    public Collection<ProjectLayerDTO> getProjectLayerCollection() {
        return projectLayerCollection;
    }

    public void setProjectLayerCollection(Collection<ProjectLayerDTO> projectLayerCollection) {
        this.projectLayerCollection = projectLayerCollection;
    }



}
