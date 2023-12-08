module com.application.messenger {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.application.messenger to javafx.fxml;
    exports com.application.messenger;
}