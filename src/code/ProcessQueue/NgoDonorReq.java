/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.ProcessQueue;

/**
 *
 * @author shruti
 */
public class NgoDonorReq extends ProcessRequest{
    private String nameOfDonor; //Name of Donor
    private String addressOfDonor; //Address of Donor
    private int donation; //Donation
    
    public NgoDonorReq(String nameOfDonor, String addressOfDonor, int donation){
        this.nameOfDonor = nameOfDonor;
        this.addressOfDonor = addressOfDonor;
        this.donation = donation;
    }
    //Getters and Setters
    @Override
    public String toString() {
        return nameOfDonor;
    }
    
    public String getNameOfDonor() {
        return nameOfDonor;
    }

    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }

    public String getAddressOfDonor() {
        return addressOfDonor;
    }

    public void setAddressOfDonor(String addressOfDonor) {
        this.addressOfDonor = addressOfDonor;
    }

    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        this.donation = donation;
    }

}

