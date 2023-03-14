/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;

import code.Role.Role;
import code.Role.RoleEbtFinanceManager;
import java.util.ArrayList;

/**
 *
 * @author shruti
 */
public class OrgEBTFinance extends Organization {

    public OrgEBTFinance() {
        super(Organization.Type.EBTFinance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleEbtFinanceManager());
        return roles;
    }
    
}
