module dk.davidcho.versioncontrolsystemdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.davidcho.versioncontrolsystemdemo1 to javafx.fxml;
    exports dk.davidcho.versioncontrolsystemdemo1;
}