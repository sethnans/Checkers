module com.example.checkersgroupproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.checkersgroupproject to javafx.fxml;
    exports com.example.checkersgroupproject;
}