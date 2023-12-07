package com.bloodbank.finalprojectui;

import com.bloodbank.finalprojectui.BloodBankApplication;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class SearchDonationController {
    public GridPane searchOptions;
    public TableView resultsTable;
    public TextField id;
    public TextField quantity;
    public TextField donationDate;
    public ComboBox<String> donationDateValue;
    public Button searchButton;

    @FXML
    public void initialize() {
        donationDateValue.getItems().setAll("=", ">", ">=", "<", "<=");
        donationDateValue.getSelectionModel().select(0);
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

        TableColumn donationId = new TableColumn("ID");
        TableColumn donorName = new TableColumn("donorName");
        TableColumn donorId = new TableColumn("donorId");
        TableColumn date = new TableColumn("Date");
        TableColumn Notes = new TableColumn("Notes");
        TableColumn Quantity = new TableColumn("Quantity");

        resultsTable.getColumns().addAll(donationId, donorName, donorId, date, Notes, Quantity);
        resultsTable.setVisible(true);
        resultsTable.setManaged(true);
    }
}