/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author songj
 */
public class appointment {
    private String id;
    private String specialty;
    private String doctor;
    private String date;
    private String time;
    private String firstName;
    private String lastName;
    private String ic;
    private String dateOfBirth;
    private String email;
    private String contactNumber;
    
    public appointment() {
        
    }

    public appointment(String id, String specialty, String doctor, String date, String time, String firstName, String lastName, String ic, String dateOfBirth, String email, String contactNumber) {
        this.id = id;
        this.specialty = specialty;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ic = ic;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getID() {
        return id;
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIc() {
        return ic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setID(String id) {
        this.id = id;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "appointment{" + "id=" + id + ", specialty=" + specialty + ", doctor=" + doctor + ", date=" + date + ", time=" + time + ", firstName=" + firstName + ", lastName=" + lastName + ", ic=" + ic + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", contactNumber=" + contactNumber + '}';
    }
}
