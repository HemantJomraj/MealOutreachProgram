
package code.ProcessQueue;

import code.Beneficiary.Beneficiary;


/**
 *
 * @author Rajvi
 */
public class AccountBillRqst extends ProcessRequest {

    private double billTotal;//Total Bill Generated
    private boolean isCovered;//Insurance Status
    private boolean isClmStld;//Claim status

    Beneficiary beneficiary;
    //Getters and Setters
    public double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(double billingAmt) {
        this.billTotal = billingAmt;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public boolean isInsured() {
        return isCovered;
    }

    public void setIsCovered(boolean hasIns) {
        this.isCovered = hasIns;
    }

    public boolean isClmStld() {
        return isClmStld;
    }

    public void setIsClmStld(boolean isInsClmSettled) {
        this.isClmStld = isInsClmSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(billTotal);
    }

}
