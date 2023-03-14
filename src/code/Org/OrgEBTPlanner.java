/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;

import code.Role.Role;
import code.Role.RoleEbtPlanner;
import java.util.ArrayList;

/**
 *
 * @author shruti
 */
public class OrgEBTPlanner extends Organization {

    public OrgEBTPlanner() {
        super(Organization.Type.EBTPlanner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleEbtPlanner());
        return roles;
    }
    
}
