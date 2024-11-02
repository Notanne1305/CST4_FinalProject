module com.example.cst4_finalproject {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.dlsc.formsfx;
    requires com.jfoenix;
    requires javafx.graphics;


    opens com.example.cst4_finalproject to javafx.fxml;
    exports com.example.cst4_finalproject;
    exports com.example.cst4_finalproject.Model;
    opens com.example.cst4_finalproject.Model to javafx.fxml;
    exports com.example.cst4_finalproject.GUI;
    opens com.example.cst4_finalproject.GUI to javafx.fxml;
    exports com.example.cst4_finalproject.Logic;
    opens com.example.cst4_finalproject.Logic to javafx.fxml;
    exports com.example.cst4_finalproject.Controller;
    opens com.example.cst4_finalproject.Controller to javafx.fxml;
}