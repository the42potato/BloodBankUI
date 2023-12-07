package com.bloodbank.finalprojectui.sql;

import com.bloodbank.finalprojectui.BloodBankApplication;

import java.sql.ResultSet;

public class Donation {

    private String id;
    private String donorId;
    private String donationDate;
    private String employeeId;
    private String notes;
    private String quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String date) {
        this.donationDate = date;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Donation(String id, String donorId, String date, String employeeId, String notes, String quantity) {
        this.id = id;
        this.donorId = donorId;
        this.donationDate = date;
        this.employeeId = employeeId;
        this.notes = notes;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + this.id +
                "\nDonor ID: " + this.donorId +
                "\nDate: " + this.donationDate +
                "\nEmployee ID: " + this.employeeId +
                "\nNotes: " + this.notes +
                "\nQuantity: " + this.quantity;
    }
}
