package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class SearchBankController {

    public GridPane searchOptions;
    public TableView resultsTable;
    public TextField id;
    public TextField address;
    public TextField hours;
    public TextField phoneNumber;
    public Button searchButton;
    public Button donationsButton;

    @FXML
    public void initialize() {
    }

    @FXML
    protected void onBackButtonClick() {
        BloodBankApplication.changeScene("start-view.fxml");
    }

    @FXML
    protected  void onSearchButtonClick() {
        searchOptions.setVisible(false);
        searchOptions.setManaged(false);
        searchButton.setVisible(false);
        searchButton.setManaged(false);

        TableColumn id = new TableColumn("ID");

        resultsTable.getColumns().addAll(id);
        resultsTable.setVisible(true);
        resultsTable.setManaged(true);
        donationsButton.setVisible(true);
        donationsButton.setManaged(true);
    }

    public void onDonationsButtonClick(ActionEvent actionEvent) {
        BloodBankApplication.changeScene("donations-view.fxml");
    }
}
