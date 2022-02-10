module com.example.fsadtools {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.utools to javafx.fxml;
    exports com.example.utools;
}