module com.example.mehrabscalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mehrabscalculator to javafx.fxml;
    exports com.example.mehrabscalculator;
}