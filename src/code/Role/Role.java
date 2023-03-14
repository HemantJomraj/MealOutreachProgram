/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;

import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import code.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public abstract class Role {
    public enum RoleType {
        Admin("Admin"),
        Volunteer("Volunteer"),
        OrderVolunteer("OrderVolunteer"),
        Benificiary("Benificiary"),
        Accountant("Accountant"),
        EBTAgent("EBTAgent"),
        EBTPlanner("EBTPlanner"),
        EBTFinanceManager("EBTFinanceManager"),
        FoodInspector("FoodInspector"),
        FDAManager("FDAManager"),
        FDASecretaries("FDASecretaries"),
        RestaurantManager("RestaurantManager"),
        NGOAdministrator("NGO Administrator"),
        NGODirector("NGO Director");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            SystemUsers account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem ecosystem);

    @Override
    public String toString() {

        return this.getClass().getName();
    }


}
