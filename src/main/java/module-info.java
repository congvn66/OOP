module com.example.oopproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopproj to javafx.fxml;
    exports com.example.oopproj;
}