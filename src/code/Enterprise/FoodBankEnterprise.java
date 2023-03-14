/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;

import code.Org.Organization;
import code.Org.OrgDirectory;
import code.Beneficiary.BeneficiaryDirectory;
import code.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajvi
 */
public class FoodBankEnterprise extends Enterprise {
    private BeneficiaryDirectory benificiaryDirectory;

    public FoodBankEnterprise(String name) {
        super(name, EnterpriseType.FoodBankEnterprise);
        benificiaryDirectory = new BeneficiaryDirectory();
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Volunteer);
        orgTypes.add(Organization.Type.OrderProcess);
        orgTypes.add(Organization.Type.Accountant);
        orgTypes.add(Organization.Type.Restaurant);
        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public BeneficiaryDirectory getBenificiaryDirectory() {
        return benificiaryDirectory;
    }

    public void setBenificiaryDirectory(BeneficiaryDirectory benificiaryDirectory) {
        this.benificiaryDirectory = benificiaryDirectory;
    }

}
