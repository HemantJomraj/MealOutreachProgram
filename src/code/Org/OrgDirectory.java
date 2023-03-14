/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Org;
import code.Org.Organization.Type;
import java.util.ArrayList;
import static code.Org.Organization.Type.EBTFinance;

/**
 *
 * @author Rajvi
 */
public class OrgDirectory {
    private ArrayList<Organization> orgList;

    public OrgDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        // Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Volunteer.getValue())) {
            organization = new OrgVolunteer();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.OrderProcess.getValue())) {
            organization = new OrderProcess();
            orgList.add(organization);
        }

        else if (type.getValue().equals(Type.Benificiary.getValue())) {
            organization = new OrgBenificiary();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new OrgAccountant();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.Restaurant.getValue())) {
            organization = new OrgRestaurant();
            orgList.add(organization);

        }

        // Adding Government Organizations

        else if (type.getValue().equals(Type.FoodInspector.getValue())) {
            organization = new OrgFoodInspector();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Secretary.getValue())) {
            organization = new OrgSecretary();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.FDAManger.getValue())) {
            organization = new OrgFDAManager();
            orgList.add(organization);

        }
        // Adding Insurance Organizations

        else if (type.getValue().equals(Type.EBTAgent.getValue())) {
            organization = new OrgEBTAgent();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.EBTFinance.getValue())) {
            organization = new OrgEBTFinance();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.EBTPlanner.getValue())) {
            organization = new OrgEBTPlanner();
            orgList.add(organization);

        }
        // Adding NGO Organizations

        else if (type.getValue().equals(Type.NGOAdministrator.getValue())) {
            organization = new OrgNGOAdmin();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Director.getValue())) {
            organization = new OrgNGODirector();
            orgList.add(organization);

        }
        return organization;
    }
    
}
