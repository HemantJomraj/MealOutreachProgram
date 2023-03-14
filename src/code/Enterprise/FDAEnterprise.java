/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;

import java.util.ArrayList;
import java.util.List;
import code.Org.Organization;
import code.Role.Role;

/**
 *
 * @author jomraj
 */
public class FDAEnterprise extends Enterprise {

    //For enterprise government list is bein maintained 
    public FDAEnterprise(String name) {
        super(name, EnterpriseType.FDAEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    //List to get all organiation types in heathcare system
    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> organizationTypes = new ArrayList<>();
        //Secretary healthcare and treasurer is added in organisation in enterpise
        organizationTypes.add(Organization.Type.Secretary);
        organizationTypes.add(Organization.Type.FoodInspector);
        organizationTypes.add(Organization.Type.FDAManger);

        return organizationTypes;
    }

}
