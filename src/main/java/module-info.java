module it.gruppoxxi.progiiiwegetvax {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens it.gruppoxxi.progiiiwegetvax to javafx.fxml;
    exports it.gruppoxxi.progiiiwegetvax;
}