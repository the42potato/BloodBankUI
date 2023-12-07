package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmployeeController {
    public TextField id;
    public TextField name;
    public TextField address;
    public TextField phone;
    public TextField email;
    public TextField jobTitle;

    @FXML
    public void initialize() throws SQLException {
        id.setEditable(false);
        String query = "SELECT * FROM `Employees` WHERE ID = " + BloodBankApplication.getSelectedEmployeeId() + ";";
        ResultSet res = BloodBankApplication.getDatabase().fetch(query);

        while (res.next()) {
            id.textProperty().set(res.getString("ID"));
            name.textProperty().set(res.getString("Name"));
            address.textProperty().set(res.getString("Address"));
            phone.textProperty().set(res.getString("PhoneNumber"));
            email.textProperty().set(res.getString("Email"));
            jobTitle.textProperty().set(res.getString("JobTitle"));
        }
    }
    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }
    @FXML
    protected void onDonationsButtonClick() {
        BloodBankApplication.changeScene("donations-view.fxml");
    }

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) throws SQLException {
        String query = "UPDATE `Employees`" +
                " SET Name = '" + name.getText() + "', Address = '" + address.getText()
                + "', PhoneNumber = '" + phone.getText() + "', Email = '" + email.getText() + "', JobTitle = '" + jobTitle.getText() + "'" +
                " WHERE ID = " + BloodBankApplication.getSelectedEmployeeId();
        System.out.println(query);
        BloodBankApplication.getDatabase().post(query);
    }
}
