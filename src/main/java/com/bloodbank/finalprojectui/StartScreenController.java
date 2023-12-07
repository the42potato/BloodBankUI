package com.bloodbank.finalprojectui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartScreenController {
    @FXML
    protected void onDonorButtonClick() {
        BloodBankApplication.setAccessLevel(0);
        BloodBankApplication.setSelectedDonorId(1);
        BloodBankApplication.changeScene("donor-view.fxml");
    }
    @FXML
    protected void onEmployeeButtonClick() {
        BloodBankApplication.setAccessLevel(1);
        BloodBankApplication.setSelectedEmployeeId(1);
        BloodBankApplication.changeScene("employee-view.fxml");
    }
    @FXML
    protected void onAdminButtonClick() {
        BloodBankApplication.setAccessLevel(2);
        BloodBankApplication.setSelectedEmployeeId(5);
        BloodBankApplication.changeScene("employee-view.fxml");
    }
}