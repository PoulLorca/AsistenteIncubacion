module com.chorombo.asistenteincubacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.chorombo.asistenteincubacion to javafx.fxml;
    exports com.chorombo.asistenteincubacion;
}
