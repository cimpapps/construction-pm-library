
package construction.pm.lib.rmi;

import construction.pm.lib.dto.ProjectDTO;
import construction.pm.lib.dto.ProjectLayerDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author catalin.cimpoeru
 */
public interface AbstractProjectRemote extends Remote {
    
    public ProjectDTO addProject(ProjectDTO projectDto) throws RemoteException;
    public List<ProjectDTO> getAllProjects() throws RemoteException;
    public List<ProjectLayerDTO> getProjectLayers(ProjectDTO projectDto) throws RemoteException;
    
}
