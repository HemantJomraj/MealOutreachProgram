
package code.ProcessQueue;

/**
 *
 * @author Rajvi
 */
public class FDAApprovalRequest extends ProcessRequest {

    private String restaurantName; // Location
    private int restaurantID; 
    private double restaurantZipCode; //Amount Requested

    public FDAApprovalRequest(String restName, int restID, double restZipCode) {
        this.restaurantName = restName;
        this.restaurantID = restID;
        this.restaurantZipCode = restZipCode;

    }
    //Getters and Setters
    @Override
    public String toString() {
        return restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restName) {
        this.restaurantName = restName;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restID) {
        this.restaurantID = restID;
    }

    public double getRestaurantZipCode() {
        return restaurantZipCode;
    }

    public void setRestaurantZipCode(double restZipCode) {
        this.restaurantZipCode = restZipCode;
    }

}
