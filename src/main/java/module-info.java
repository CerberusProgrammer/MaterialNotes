module com.example.materialnotes {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.joda.time;


    opens com.example.materialnotes to javafx.fxml;
    exports com.example.materialnotes;
}