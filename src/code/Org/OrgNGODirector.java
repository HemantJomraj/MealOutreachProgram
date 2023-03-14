/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.RoleNGODirector;
import code.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class OrgNGODirector extends Organization{
    public OrgNGODirector() {
        super(Organization.Type.Director.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNGODirector());
        return roles;
    }
}
