module com.weather {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.weather to javafx.fxml;
    exports com.weather;
}