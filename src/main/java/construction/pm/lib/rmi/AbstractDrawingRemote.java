package construction.pm.lib.rmi;

import construction.pm.lib.dto.DrawingDTO;
import construction.pm.lib.dto.EmployeeDTO;
import construction.pm.lib.dto.ProjectLayerDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author cimbonda
 */
public interface AbstractDrawingRemote extends Remote{
    
    public DrawingDTO addDrawing(DrawingDTO drawingDTO) throws RemoteException;
    public List<DrawingDTO> getDrawingsByLayer(ProjectLayerDTO layerDTO) throws RemoteException;
    public List<DrawingDTO> getDrawingsByEmployee(EmployeeDTO employeeDTO) throws RemoteException;
    public List<DrawingDTO> getDrawingsWithNoEmployeesAssigned() throws RemoteException;
    public boolean assignEmployeeToDrawing(EmployeeDTO employeeDTO) throws RemoteException;
    
    
}
