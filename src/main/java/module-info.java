module com.example.oopproj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.oopproj to javafx.fxml;
    exports com.example.oopproj;
}