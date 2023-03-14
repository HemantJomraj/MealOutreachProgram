/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.EBTMembers;

import code.EBTCard.EBTCard;

/**
 *
 * @author shruti
 */
public class EBTMembers {
    private String memLastName;
    private String memFirstName;
    private String ssn;
    private String dob;
    private int age;
    private String phoneNo;
    private String address;
    private String gender;
    private String cardIssueDate;
    private String cardExpDate;
    private EBTCard ebt;
    private String ebtCardNo;
    
    public EBTMembers(EBTCard ebtCard, String cardNumber)
    {
        this.ebt = ebtCard;
        this.ebtCardNo = cardNumber;
    }

    public String getMemLastName() {
        return memLastName;
    }

    public void setMemLastName(String memLastName) {
        this.memLastName = memLastName;
    }

    public String getMemFirstName() {
        return memFirstName;
    }

    public void setMemFirstName(String memFirstName) {
        this.memFirstName = memFirstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(String cardIssuedDate) {
        this.cardIssueDate = cardIssuedDate;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public EBTCard getEbt() {
        return ebt;
    }

    public void setEbt(EBTCard ebt) {
        this.ebt = ebt;
    }

    public String getEbtCardNo() {
        return ebtCardNo;
    }

    public void setEbtCardNo(String ebtCardNo) {
        this.ebtCardNo = ebtCardNo;
    }
    
    @Override
    public String toString() {
        return ebtCardNo;
    }
}
