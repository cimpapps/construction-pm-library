
package construction.pm.lib.dto;

import java.io.Serializable;
import java.util.Collection;
public class ProjectLayerDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Collection<DrawingDTO> drawingCollection;
    private ProjectDTO projectsId;

    public ProjectLayerDTO() {
    }

    public ProjectLayerDTO(Integer id) {
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

    public Collection<DrawingDTO> getDrawingCollection() {
        return drawingCollection;
    }

    public void setDrawingCollection(Collection<DrawingDTO> drawingCollection) {
        this.drawingCollection = drawingCollection;
    }

    public ProjectDTO getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(ProjectDTO projectsId) {
        this.projectsId = projectsId;
    }


}
