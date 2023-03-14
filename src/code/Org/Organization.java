/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Employee.EmployeeDirectory;
import code.Role.Role;
import code.SystemUserAccount.UsersDirectory;
import code.ProcessQueue.Process;
import java.util.ArrayList;
/**
 *
 * @author Rajvi
 */
public abstract class Organization {
    private String organisationName; //organisation name
    private Process processQueue;
    private EmployeeDirectory empDir; //employee directory
    private UsersDirectory usrAccDir; //added user account directory
    private int orgID; //organisation id
    private static int cntr = 0; //counter
    
// Enums for ogranisation types
    public enum Type {

        
        Admin("Admin Organization"), Volunteer("Volunteer Organization"), OrderProcess("OrderProcess Organization"), Benificiary("Beneficiary Organization"), Accountant("Accountant Organization"),Restaurant("Reastaurant Organization"),
        
        EBTAgent("EBTAgent Organization"), EBTPlanner("EBTPlanner Organization"), EBTFinance("EBTFinance Organization"),
        
        FDAManger("FDAManger Organization"), Secretary("Secretary Organization"), FoodInspector("FoodInspector Organization"),
        
        NGOAdministrator("Administrator Organization"), Director("Director Organization");
        

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organisationName = name;
        processQueue = new Process();
        empDir = new EmployeeDirectory();
        usrAccDir = new UsersDirectory();
        orgID = cntr;
        ++cntr;
    }

    public abstract ArrayList<Role> getSupportRole();

    public UsersDirectory getUsrAccDir() {
        return usrAccDir;
    }

    public int getOrgID() {
        return orgID;
    }

    public EmployeeDirectory getEmpDir() {
        return empDir;
    }

    public String getName() {
        return organisationName;
    }

    public Process getProcessQueue() {
        return processQueue;
    }

    public void setName(String name) {
        this.organisationName = name;
    }

    public void setProcessQueue(Process processQueue) {
        this.processQueue = processQueue;
    }

    @Override
    public String toString() {
        return organisationName;
    } 
}
