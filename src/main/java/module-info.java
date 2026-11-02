module com.kkando.bignumbersfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires junit;

    opens com.kkando.bignumbersfx to javafx.fxml;
    exports com.kkando.bignumbersfx;
}