module com.askisi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.askisi to javafx.fxml;
    exports com.askisi;
}
