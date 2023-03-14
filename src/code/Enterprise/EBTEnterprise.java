/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;

import code.EBTCard.EBTCardDirectory;
import code.EBTMembers.EBTMembersDirectory;
import code.Org.Organization;
import code.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shruti
 */
public class EBTEnterprise extends Enterprise{
    private EBTMembersDirectory ebtMembersDirectory;

    private EBTCardDirectory ebtCardDirectory;

    public EBTEnterprise(String name) {
        super(name, EnterpriseType.EBTEnterprise);
        ebtMembersDirectory = new EBTMembersDirectory();
        ebtCardDirectory = new EBTCardDirectory();

    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgnanizationTypes = new ArrayList<>();
        orgnanizationTypes.add(Organization.Type.EBTAgent);
        orgnanizationTypes.add(Organization.Type.EBTPlanner);
        orgnanizationTypes.add(Organization.Type.EBTFinance);

        return orgnanizationTypes;
    }

    public EBTMembersDirectory getEbtMembersDirectory() {
        return ebtMembersDirectory;
    }

    public void setEbtMemDir(EBTMembersDirectory ebtMembersDirectory) {
        this.ebtMembersDirectory = ebtMembersDirectory;
    }

    public EBTCardDirectory getEbtCardDir() {
        return ebtCardDirectory;
    }

    public void setEbtCardDir(EBTCardDirectory ebtCardDirectory) {
        this.ebtCardDirectory = ebtCardDirectory;
    }


}
