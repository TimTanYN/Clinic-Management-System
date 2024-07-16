/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Payment implements Serializable {

    private static int nextNumber = 1000;
    
    private String userName;
    private String appointment;
    private String date;
    private String time;
    private String price;
    private String paymentMethod;

    public Payment() {
    }

//    public Payment(int paymentID, String userName, String appointment, 
//            String date,String time,String price,String paymentMethod) {
//        this.paymentID = paymentID;
//        this.userName = userName;
//        this.appointment = appointment;
//        this.date = date;
//        this.time = time;
//        this.price = price;
//        this.paymentMethod = paymentMethod;
//    }
    public Payment(String userName, String appointment,
            String date, String time, String price, String paymentMethod) {
        this.userName = userName;
        this.appointment = appointment;
        this.date = date;
        this.time = time;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        Payment.nextNumber = nextNumber;
    }

//    public int getPaymentID() {
//        return paymentID;
//    }
//
//    public void setPaymentID(int paymentID) {
//        this.paymentID = paymentID + 1;
//    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String custName) {
        this.userName = custName;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return userName + "\t" + appointment + "\t" + date + "\t" + time + "\t" + price + "\t" + paymentMethod;
    }

}
