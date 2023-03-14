/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.ProcessQueue;

import code.SystemUserAccount.SystemUsers;
import java.util.Date;

/**
 *
 * @author shruti
 */
public class ProcessRequest {
     private String processMessage; //Work Request Message
    private SystemUsers sndr; //Sender of work request
    private SystemUsers rcvr; //Receiver of work requests
    private String processStatus; //Request status
    private Date ProcessDate; //Date of Request
    private Date solveOn; //Resolved on date
    private String orderType = " "; //Type of test

    
    //Getters and Setters
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String bloodTestType) {
        this.orderType = bloodTestType;
    }

    public ProcessRequest() {
        ProcessDate = new Date();
    }

    public String getProcessMessage() {
        return processMessage;
    }

    public void setProcessMessage(String processMessage) {
        this.processMessage = processMessage;
    }

    public SystemUsers getSndr() {
        return sndr;
    }

    public void setSndr(SystemUsers sndr) {
        this.sndr = sndr;
    }

    public SystemUsers getRcvr() {
        return rcvr;
    }

    public void setRcvr(SystemUsers rcvr) {
        this.rcvr = rcvr;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public Date getProcessDate() {
        return ProcessDate;
    }

    public void setProcessDate(Date ProcessDate) {
        this.ProcessDate = ProcessDate;
    }

    public Date getSolveOn() {
        return solveOn;
    }

    public void setSolveOn(Date solveOn) {
        this.solveOn = solveOn;
    }
}
