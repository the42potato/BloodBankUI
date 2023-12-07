package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddBankController {
    public TextField name;
    public TextField address;
    public TextField hours;
    public TextField phoneNum;

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) throws SQLException {
        int newId = BloodBankApplication.getDatabase().getTableLength("BloodBank") + 1;
        String query = "INSERT INTO BloodBank (ID, Name, Address, PhoneNumber, Hours)"
                + " VALUES (" + newId + ", '" + name.getText() + "', '" + address.getText() + "', '" + phoneNum.getText() + "', '" + hours.getText() + "')";
        System.out.println(query);
        BloodBankApplication.getDatabase().post(query);
    }
}
