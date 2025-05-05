module com.eventhandling.amazon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.eventhandling.amazon to javafx.fxml;
    exports com.eventhandling.amazon;
}
