
package code.ProcessQueue;

import code.Beneficiary.Beneficiary;
import code.SystemUserAccount.SystemUsers;

/**
 *
 * @author jomraj
 */
public class OrderPlaceRequest extends ProcessRequest {

    private String orderDate; //Registration Date
    private String visitReason; //Reason for visit
    private Beneficiary beneficiary; 
    private String orderType; //Type of Lab Test
    private String orderResult; //Result from Lab
    private SystemUsers orderPlacedVolunteer; //Lab Assistant Employee
    private String orderStatus; //Message from lab Test
    private String volunteerNote; //Doctor Note
    private double totalBill; //Total Bill
    private SystemUsers volunteerAssigned; //Docotr Assigned
    private int amountOfFood; //Units of Blood Required
    private String msgFromRestaurant; //Message from Blood Bank
    private SystemUsers restaurantManagement; //Blood Bank Management

    
    //Getters and Setters
    public SystemUsers getRestaurantManagement() {
        return restaurantManagement;
    }

    public void setRestaurantManagement(SystemUsers restaurantManagement) {
        this.restaurantManagement = restaurantManagement;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public String getMsgFromRestaurant() {
        return msgFromRestaurant;
    }

    public void setMsgFromRestaurant(String msgFromRestaurant) {
        this.msgFromRestaurant = msgFromRestaurant;
    }

    public OrderPlaceRequest(String Date, String reasonForVisit, Beneficiary patient) {
        this.orderDate = Date;
        this.visitReason = reasonForVisit;
        this.beneficiary = patient;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String Date) {
        this.orderDate = Date;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderResult() {
        return orderResult;
    }

    public void setOrderResult(String orderResult) {
        this.orderResult = orderResult;
    }

    public SystemUsers getOrderPlacedVolunteer() {
        return orderPlacedVolunteer;
    }

    public void setOrderPlacedVolunteer(SystemUsers orderPlacedVolunteer) {
        this.orderPlacedVolunteer = orderPlacedVolunteer;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getVolunteerNote() {
        return volunteerNote;
    }

    public void setVolunteerNote(String volunteerNote) {
        this.volunteerNote = volunteerNote;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public SystemUsers getVolunteerAssigned() {
        return volunteerAssigned;
    }

    public void setVolunteerAssigned(SystemUsers volunteerAssigned) {
        this.volunteerAssigned = volunteerAssigned;
    }

    @Override
    public String toString() {
        return visitReason;
    }

}
