/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.pm.lib.rmi;

import construction.pm.lib.dto.EmployeePositionDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author catalin.cimpoeru
 */
public interface AbstractEmployeePositionRemote extends Remote{
    public boolean addPosition(EmployeePositionDTO employeePositionDTO) throws RemoteException;
    public boolean removePosition(EmployeePositionDTO employeePositionDTO) throws RemoteException;
    public List<EmployeePositionDTO> getAllEmployeePositions() throws RemoteException;
}
