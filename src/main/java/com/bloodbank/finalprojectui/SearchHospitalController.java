package com.bloodbank.finalprojectui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SearchHospitalController {

    public TableView resultsTable;
    public GridPane searchOptions;
    public TextField id;
    public TextField quantity;
    public TextField address;
    public TextField phoneNum;
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
