package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DonorScreenController {
    public TableView<String> donorInfo;
    public TextField Id;
    public TextField Name;
    public TextField Age;
    public TextField Weight;
    public TextField Gender;
    public TextField BloodType;
    public TextField Phone;

    @FXML
    public void initialize() throws SQLException {
        Id.setEditable(false);
        BloodType.setEditable(false);
        String query = "SELECT * FROM `Donors` WHERE ID = " + BloodBankApplication.getSelectedDonorId() + ";";
        ResultSet res = BloodBankApplication.getDatabase().fetch(query);

        while (res.next()) {
            Id.textProperty().set(res.getString("ID"));
            Name.textProperty().set(res.getString("Name"));
            Age.textProperty().set(res.getString("Age"));
            Weight.textProperty().set(res.getString("Weight"));
            Gender.textProperty().set(res.getString("Gender"));
            BloodType.textProperty().set(res.getString("BloodType"));
            Phone.textProperty().set(res.getString("PhoneNumber"));
        }

    }

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    @FXML
    public void onDonationsButtonClick(ActionEvent actionEvent) {
        // set selected item's primary key to pass through to next scene
        BloodBankApplication.changeScene("donations-view.fxml");
    }

    @FXML
    public void submitChangesButton(ActionEvent actionEvent) throws SQLException {
        String query = "UPDATE `Donors`" +
                " SET Name = '" + Name.getText() + "', Age = '" + Age.getText() + "', Weight = '" + Weight.getText() +
                "', Gender = '" + Gender.getText() + "', BloodType = '" + BloodType.getText() +  "', PhoneNumber = '" + Phone.getText() +
                "' WHERE ID = " + BloodBankApplication.getSelectedDonorId();
        System.out.println(query);
        BloodBankApplication.getDatabase().post(query);
    }
}
