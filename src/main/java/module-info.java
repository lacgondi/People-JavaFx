module hu.petrik.peoplereply {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens hu.petrik.peoplereply to javafx.fxml, com.google.gson;
    exports hu.petrik.peoplereply;
}