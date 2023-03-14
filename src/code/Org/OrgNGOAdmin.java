/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.RoleNGOAdmin;
import code.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class OrgNGOAdmin extends Organization{

    public OrgNGOAdmin() {
        super(Organization.Type.NGOAdministrator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNGOAdmin());
        return roles;
    }
     
}
