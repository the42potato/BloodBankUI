module com.bloodbank.finalprojectui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.bloodbank.finalprojectui to javafx.fxml;
    exports com.bloodbank.finalprojectui;
}