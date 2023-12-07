package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EmployeeScreenController {

    public Button bankSearchButton;
    public Button hospitalSearchButton;
    public Button addReceivedDonationButton;
    public Button addEmployeeButton;
    public Button addBankButton;
    public Button addHospitalButton;

    @FXML
    public void initialize() {
        boolean setAdminButtons = (BloodBankApplication.getAccessLevel() >= 2);

        bankSearchButton.setVisible(setAdminButtons);
        hospitalSearchButton.setVisible(setAdminButtons);
        addBankButton.setVisible(setAdminButtons);
        addHospitalButton.setVisible(setAdminButtons);
        addReceivedDonationButton.setVisible(setAdminButtons);
        addEmployeeButton.setVisible(setAdminButtons);
    }

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    public void onSearchDonationButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("search-donation-view.fxml");
    }

    public void onSearchEmployeeButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("search-employee-view.fxml");
    }

    public void onSearchBankButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("search-bank-view.fxml");
    }

    public void onSearchHospitalButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("search-hospital-view.fxml");
    }

    public void onAddDonorButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-donor-view.fxml");
    }

    public void onAddDonationButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-donation-view.fxml");
    }

    public void onAddRecievedDonationButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-received-donation-view.fxml");
    }

    public void onAddEmployeeButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-employee-view.fxml");
    }

    public void onAddBankButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-bank-view.fxml");
    }

    public void onAddHospitalButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("add-hospital-view.fxml");
    }

    public void onEditSelfButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("update-employee-view.fxml");
    }
}
