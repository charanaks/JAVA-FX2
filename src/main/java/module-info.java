module com.example.movingcircle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.movingcircle to javafx.fxml;
    exports com.example.movingcircle;
}