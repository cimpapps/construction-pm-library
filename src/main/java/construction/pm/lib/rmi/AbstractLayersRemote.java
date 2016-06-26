/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public interface AbstractLayersRemote extends Remote {
    
    public boolean addLayer(ProjectLayerDTO layer) throws RemoteException;
    public List<ProjectLayerDTO> getAllLayers() throws RemoteException; 
    public List<ProjectLayerDTO> getProjectLayers(ProjectDTO projectDto) throws RemoteException;
}
