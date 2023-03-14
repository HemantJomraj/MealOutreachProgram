/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.Role;
import code.Role.FDAManager;

import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class OrgFDAManager extends Organization {

   public OrgFDAManager() {
        super(Organization.Type.FDAManger.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FDAManager());
        return roles;
    }
    
}
