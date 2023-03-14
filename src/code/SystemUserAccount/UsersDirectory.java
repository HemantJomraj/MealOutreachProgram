/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.SystemUserAccount;
import code.Role.Role;
import code.Employee.Employee;

import java.util.ArrayList;
/**
 *
 * @author Rajvi
 */
public class UsersDirectory {

    //systemUser account details 
    //the user directory added for all system 
    
    private ArrayList<SystemUsers> sysUserAccountList;

    public UsersDirectory() {
        sysUserAccountList = new ArrayList();
    }

    public ArrayList<SystemUsers> getUsrAccList() {
        return sysUserAccountList;
    }

    public SystemUsers createUserAccount(String username, String password, Employee employee, Role role) {
        SystemUsers userAccount = new SystemUsers();
        userAccount.setUsrName(username);
        userAccount.setPsswrd(password);
        userAccount.setEmploye(employee);
        userAccount.setEmpRole(role);
        sysUserAccountList.add(userAccount);
        return userAccount;
    }

    public SystemUsers createUserAccount(String username, String password, Employee employee, Role role, String type) {
        SystemUsers userAccount = new SystemUsers();
        userAccount.setUsrName(username);
        userAccount.setPsswrd(password);
        userAccount.setEmploye(employee);
        userAccount.setEmpRole(role);
        userAccount.setUserType(type);
        sysUserAccountList.add(userAccount);
        return userAccount;
    }

    public boolean isUniqueUser(String username) {
        for (SystemUsers usrAcc : sysUserAccountList) {
            if (usrAcc.getUsrName().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public SystemUsers validateUser(String username, String password) {
        for (SystemUsers usrAcc : sysUserAccountList) {
            if (usrAcc.getUsrName().equals(username) && usrAcc.getPsswrd().equals(password)) {
                return usrAcc;
            }
        }
        return null;
    }    
}
