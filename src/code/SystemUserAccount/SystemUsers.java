/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.SystemUserAccount;

import code.ProcessQueue.Process;
import code.Role.Role;

import code.Role.Role;

import code.Employee.Employee;

/**
 *
 * @author Rajvi
 */
public class SystemUsers {

    private String usrName;
    private String psswrd;
    private Employee employe;
    private Role empRole;
    private code.ProcessQueue.Process processQueue;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String type) {
        this.userType = type;
    }

    public SystemUsers() {
        processQueue = new code.ProcessQueue.Process();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String uname) {
        this.usrName = uname;
    }

    public String getPsswrd() {
        return psswrd;
    }

    public void setPsswrd(String pwd) {
        this.psswrd = pwd;
    }

    public Role getEmpRole() {
        return empRole;
    }

    public void setEmploye(Employee emp) {
        this.employe = emp;
    }

    public void setEmpRole(Role role) {
        this.empRole = role;
    }

    public Employee getEmploye() {
        return employe;
    }

    public code.ProcessQueue.Process getProcessQueue() {
        return processQueue;
    }

    @Override
    public String toString() {
        return usrName;
    }

}