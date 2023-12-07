package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class SearchEmployeeController {


    public GridPane searchOptions;
    public ComboBox donationDateValue;
    public TableView resultsTable;
    public TextField id;
    public TextField name;
    public TextField phone;
    public TextField email;
    public TextField jobTitle;
    public Button searchButton;

    @FXML
    public void initialize() {
    }

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    @FXML
    public void onSearchButtonClick(ActionEvent actionEvent) {
        searchOptions.setVisible(false);
        searchOptions.setManaged(false);
        searchButton.setVisible(false);
        searchButton.setManaged(false);

        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("Name");
        TableColumn phone = new TableColumn("Phone #");
        TableColumn email = new TableColumn("Email");
        TableColumn employed = new TableColumn("Bank ID");
        TableColumn address = new TableColumn("Address");
        TableColumn jobTitle = new TableColumn("Job Title");

        resultsTable.getColumns().addAll(id, name, phone, email, employed, address, jobTitle);
        resultsTable.setVisible(true);
        resultsTable.setManaged(true);
    }
}
