/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;

import code.Role.Role;
import code.Role.RoleRestaurantManager;
import java.util.ArrayList;

/**
 *
 * @author shruti
 */
public class OrgRestaurant extends Organization{
    
    public OrgRestaurant() {
        super(Organization.Type.Restaurant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleRestaurantManager());
        return roles;
    }
    
}
