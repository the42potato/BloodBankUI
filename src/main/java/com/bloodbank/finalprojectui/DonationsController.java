package com.bloodbank.finalprojectui;

import com.bloodbank.finalprojectui.sql.Donation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DonationsController {
    public TableView donationsTable;

    @FXML
    public void initialize() throws SQLException {
        TableColumn donationId = new TableColumn("ID");
        donationId.setCellFactory(new PropertyValueFactory<>("id"));
        TableColumn donorId = new TableColumn("Donor ID");
        donationId.setCellFactory(new PropertyValueFactory<>("donorId"));
        TableColumn date = new TableColumn("Donation Date");
        donationId.setCellFactory(new PropertyValueFactory<>("donationDate"));
        TableColumn employeeId = new TableColumn("Employee ID");
        donationId.setCellFactory(new PropertyValueFactory<>("employeeId"));
        TableColumn notes = new TableColumn("Notes");
        donationId.setCellFactory(new PropertyValueFactory<>("notes"));
        TableColumn quantity = new TableColumn("Quantity");
        donationId.setCellFactory(new PropertyValueFactory<>("quantity"));

        donationsTable.getColumns().addAll(donationId, donorId, date, employeeId, notes, quantity);

        String query = "SELECT * FROM `Donations` WHERE DonorID = " + BloodBankApplication.getSelectedDonorId() + ";";
        ResultSet res = BloodBankApplication.getDatabase().fetch(query);

        while(res.next()) {

            Donation donation = new Donation(res.getString("ID"), res.getString("DonorID"),
                    res.getString("DonationDate"), res.getString("EmployeeID"), res.getString("Notes"), res.getString("Quantity"));
            donationsTable.getItems().add(donation);
        }
    }

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }
}