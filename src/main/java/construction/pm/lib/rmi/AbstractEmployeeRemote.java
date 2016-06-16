
package construction.pm.lib.rmi;

import construction.pm.lib.dto.EmployeeDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author catalin.cimpoeru
 */
public interface AbstractEmployeeRemote extends Remote{
    
    public boolean addEmployee(EmployeeDTO employeeDto) throws RemoteException;
    public boolean removeEmployee(EmployeeDTO employeeDTO) throws RemoteException;
    public boolean editEmployee(int id, EmployeeDTO employeeDTO) throws RemoteException;
    
}
