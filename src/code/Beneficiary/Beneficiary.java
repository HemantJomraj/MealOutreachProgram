/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Beneficiary;

import code.EBTMembers.EBTMembers;

/**
 *
 * @author jomraj
 */
public class Beneficiary {
    

    private String benId;//Beneficiary ID
    private String benLastName;//Beneficiary Last Name
    private String benFirstName;//Beneficiary First Name
    private String ssn;//Beneficiary SSN
    private String benAge;
    private String contactNo;//Beneficiary Contact Number
    private String address;
    private String gender;
    private boolean isOrderDelivered;//Is the Order Delivered
    private String orderDate;//Order Date
    private String benMail;//Email Id of Beneficiary
    private String volType;// Volunteer Type

    //Getters and Setters
    public String getVolType() {
        return volType;
    }

    public void setVolType(String volType) {
        this.volType = volType;
    }

    public String getBenMail() {
        return benMail;
    }

    public void setBenMail(String benMail) {
        this.benMail = benMail;
    }

    private EBTMembers ebtMember;

    public Beneficiary() {

    }

    public String getBenLastName() {
        return benLastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBenAge() {
        return benAge;
    }

    public void setBenAge(String benAge) {
        this.benAge = benAge;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EBTMembers getEBTMembers() {
        return ebtMember;
    }

    public void setEBTMembers(EBTMembers ebtMember) {
        this.ebtMember = ebtMember;
    }

    public String getBenId() {
        return benId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBenFirstName(String benFirstName) {
        this.benFirstName = benFirstName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return String.valueOf(benId);
    }

    public void setBenId(String benId) {
        this.benId = benId;
    }

    public boolean isIsOrderDelivered() {
        return isOrderDelivered;
    }

    public void setIsOrderDelivered(boolean isOrderDelivered) {
        this.isOrderDelivered = isOrderDelivered;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setBenLastName(String benLastName) {
        this.benLastName = benLastName;
    }

    public String getBenFirstName() {

        return benFirstName;

    }

}
    
