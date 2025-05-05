module com.javafx.amazon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javafx.amazon to javafx.fxml;
    exports com.javafx.amazon;
}
