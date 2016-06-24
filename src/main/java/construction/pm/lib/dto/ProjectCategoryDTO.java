
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;
public class ProjectCategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String name;
    private Collection<ProjectDTO> projectCollection;

    public ProjectCategoryDTO() {
    }

    public ProjectCategoryDTO(Integer id) {
        this.id = id;
    }

    public ProjectCategoryDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public Collection<ProjectDTO> getProjectCollection() {
        return projectCollection;
    }

    public void setProjectCollection(Collection<ProjectDTO> projectCollection) {
        this.projectCollection = projectCollection;
    }
    
}
