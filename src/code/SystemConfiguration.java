/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import code.Employee.Employee;
import code.Role.RoleSysAdmin;
import code.SystemUserAccount.SystemUsers;

/**
 *
 * @author jomraj
 */
public class SystemConfiguration {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        Employee employee = ecosystem.getEmpDir().createEmployee("sysadmin");
        
        SystemUsers userAccount = ecosystem.getUsrAccDir().createUserAccount("sysadmin", "sysadmin", employee, new RoleSysAdmin());
        
        return ecosystem;
    }
    
}

