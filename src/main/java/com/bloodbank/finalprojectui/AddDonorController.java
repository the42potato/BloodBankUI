package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddDonorController {
    public TextField name;
    public TextField age;
    public TextField weight;
    public TextField gender;
    public TextField bloodType;
    public TextField phoneNum;
    public TextField bloodIron;
    public TextField hemoglobin;

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    public void onSubmitButtonClick(ActionEvent actionEvent) throws SQLException {
        int newId = BloodBankApplication.getDatabase().getTableLength("Donors") + 1;
        String curDate = BloodBankApplication.getDatabase().getCurrentDate();
        String query = "INSERT INTO Donors (ID, Name, Age, Weight, Gender, BloodType, PhoneNumber, BloodIron, Hemoglobin)" +
                " VALUES ("+ newId +", '" + name.getText() + "', " + age.getText() + ", " + weight.getText() + ", '"
                + gender.getText() + "', '" + bloodType.getText() + "', '" + phoneNum.getText() + "', '" + bloodIron.getText()
                + "', '" + hemoglobin.getText() + "')";
        System.out.println(query);
        BloodBankApplication.getDatabase().post(query);
    }
}
