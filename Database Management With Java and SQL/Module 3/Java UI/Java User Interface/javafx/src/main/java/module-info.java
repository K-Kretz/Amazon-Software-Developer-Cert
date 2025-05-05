module com.javauserinterface {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javauserinterface to javafx.fxml;
    exports com.javauserinterface;
}
