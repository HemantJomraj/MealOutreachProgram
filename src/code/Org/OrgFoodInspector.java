/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Role.RoleFoodInspector;
import code.Role.RoleOrderVolunterr;
import code.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class OrgFoodInspector extends Organization {

    public OrgFoodInspector() {
        super(Organization.Type.FoodInspector.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleFoodInspector());
        return roles;
    }

}
