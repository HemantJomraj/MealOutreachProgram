/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.RoleBeneficiary;
import code.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Rajvi
 */
public class OrgBenificiary extends Organization {

   public OrgBenificiary() {
        super(Organization.Type.Benificiary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleBeneficiary());
        return roles;
    }
    
}

