package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddHospitalController {
    public TextField name;
    public TextField address;
    public TextField phoneNum;

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    public void onSubmitButtonClick(ActionEvent actionEvent) {
        System.out.println("save to DB");
    }
}
