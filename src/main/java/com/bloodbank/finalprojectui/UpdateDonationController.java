package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class UpdateDonationController {


    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
        System.out.println("save to DB");
    }
}