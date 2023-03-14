/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;
import code.Org.Organization;
import code.Org.OrgDirectory;
import java.util.List;

/**
 *
 * @author Rajvi
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrgDirectory orgDirectory;

    public OrgDirectory getOrgDir() {
        return orgDirectory;
    }
//Enums for overall enterprises in healthcare 
    public enum EnterpriseType {

        FoodBankEnterprise("FoodBank"),
        EBTEnterprise("EBT"),
        FDAEnterprise("FDA"),
        NGOEnterprise("NGO");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEntType() {
        return enterpriseType;
    }

    public void setEntType(EnterpriseType entType) {
        this.enterpriseType = entType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        orgDirectory = new OrgDirectory();
    }
    
    public abstract List<Organization.Type> getAllOrgTypes();
}
