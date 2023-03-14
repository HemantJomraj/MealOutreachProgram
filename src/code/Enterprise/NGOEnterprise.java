/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;

import code.Org.Organization;
import code.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shruti
 */
public class NGOEnterprise extends Enterprise{
    public NGOEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NGOEnterprise);
    }
    
     @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgnanizationTypes = new ArrayList<>();
        orgnanizationTypes.add(Organization.Type.NGOAdministrator);
        orgnanizationTypes.add(Organization.Type.Director);

        return orgnanizationTypes;
    }
    
}
