/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.ProcessQueue;

import code.EBTMembers.EBTMembers;

/**
 *
 * @author shruti
 */
public class cardRequest extends ProcessRequest {

    private String cardNumber; //Policy Number
    private String socialsecurityNumber; //Social Security Number
    private String typeOfCard; //Name of the policy
    private String insuranceName; //Insurance Name
    private double clmAmt; //Claim Amount
    private String ebtAgent; //Insurance Policy Agent
    private String financerName; //Financer Name
    private double billingAmt; //Billing Amount
    private EBTMembers ebtMember; //Insurance Customer
    private String foodBank; //Health Center Name

    //Getter and Setters
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String plcyNo) {
        this.cardNumber = plcyNo;
    }

    public String getSocialsecurityNumber() {
        return socialsecurityNumber;
    }

    public void setSocialsecurityNumber(String ssn) {
        this.socialsecurityNumber = ssn;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String policyType) {
        this.typeOfCard = policyType;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insCmpny) {
        this.insuranceName = insCmpny;
    }

    public double getClmAmt() {
        return clmAmt;
    }

    public void setClmAmt(double claimAmt) {
        this.clmAmt = claimAmt;
    }

    @Override
    public String toString() {
        return cardNumber;
    }

    public String getEbtAgent() {
        return ebtAgent;
    }

    public void setEbtAgent(String agent) {
        this.ebtAgent = agent;
    }

    public String getFinancerName() {
        return financerName;
    }

    public void setFinancerName(String financer) {
        this.financerName = financer;
    }

    public double getBillingAmt() {
        return billingAmt;
    }

    public void setBillingAmt(double billAmt) {
        this.billingAmt = billAmt;
    }

    public EBTMembers getEbtMember() {
        return ebtMember;
    }

    public void setEbtMember(EBTMembers insCust) {
        this.ebtMember = insCust;
    }

    public String getFoodBank() {
        return foodBank;
    }

    public void setFoodBank(String healthCtr) {
        this.foodBank = healthCtr;
    }

}

