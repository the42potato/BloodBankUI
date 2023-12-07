package com.bloodbank.finalprojectui;

import com.bloodbank.finalprojectui.sql.DBConnect;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

import java.io.IOException;

public class BloodBankApplication extends Application {

    private static Stage primaryStage;
    private static Connection con;
    private static int accessLevel = 0;
    private static int selectedDonationId = 0;
    private static int selectedDonorId = 0;
    private static int selectedEmployeeId = 0;

    private static DBConnect database;

    public static void centerStage() {
        primaryStage.centerOnScreen();
    }

    /**
     * Change the displayed scene to the contents of a specified fxml file
     * @param fxml the FXML file to swap to
     */
    public static void changeScene(String fxml) {
        try {
            FXMLLoader fxmlFile = new FXMLLoader(BloodBankApplication.class.getResource(fxml));
            Parent newScene = fxmlFile.load();
            centerStage();
            primaryStage.getScene().setRoot(newScene);
        }
        catch (IOException e) {
            throw new RuntimeException("A file used to render the display could not be found");
        }
    }

    public static Stage getScene() {
        return primaryStage;
    }

    public static int getSelectedDonationId() {
        return selectedDonationId;
    }

    public static void setSelectedDonationId(int selectedDonationId) {
        BloodBankApplication.selectedDonationId = selectedDonationId;
    }

    public static int getSelectedDonorId() {
        return selectedDonorId;
    }

    public static void setSelectedDonorId(int selectedDonorId) {
        BloodBankApplication.selectedDonorId = selectedDonorId;
    }

    public static int getSelectedEmployeeId() {
        return selectedEmployeeId;
    }

    public static void setSelectedEmployeeId(int selectedEmployeeId) {
        BloodBankApplication.selectedEmployeeId = selectedEmployeeId;
    }

    public static DBConnect getDatabase() {
        return database;
    }

    @Override
    public void start(Stage stage) throws IOException {
        // connect to database
        database = new DBConnect();

        primaryStage = stage;

        // load the starting FXML file and assign its contents to the scene
        FXMLLoader fxmlLoader = new FXMLLoader(BloodBankApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 500);

        // set program title and assign scene
        primaryStage.setTitle("BloodBank");
        primaryStage.setScene(scene);

        // lock frame size
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static int getAccessLevel() {
        return accessLevel;
    }

    public static void setAccessLevel(int level) {
        accessLevel = level;
    }

    public static void main(String[] args) {
        launch();
    }
}