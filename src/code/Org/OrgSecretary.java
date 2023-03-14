/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.FDASecratary;
import code.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class OrgSecretary extends Organization {

    public OrgSecretary() {
        super(Organization.Type.Secretary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FDASecratary());
        return roles;
    }
    
}

