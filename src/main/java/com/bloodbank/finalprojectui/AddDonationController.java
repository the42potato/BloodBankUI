package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddDonationController {
    public TextField donorId;
    public TextField notes;
    public TextField quantity;

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    public void onSubmitButtonClick(ActionEvent actionEvent) throws SQLException {
        int newId = BloodBankApplication.getDatabase().getTableLength("Donations") + 1;
        String curDate = BloodBankApplication.getDatabase().getCurrentDate();
        String query = "INSERT INTO Donations (ID, DonorID, EmployeeID, Notes, Quantity, DonationDate)" +
        " VALUES (" + newId + ", '" + donorId.getText() + "', '" + BloodBankApplication.getSelectedEmployeeId()
                + "', '" + notes.getText() + "', '" + quantity.getText() + "', '" + curDate  + "')";
        System.out.println(query);
        BloodBankApplication.getDatabase().post(query);
    }
}
