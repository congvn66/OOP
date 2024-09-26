package com.example.oopproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dictionary.fxml"));
       Scene scene = new Scene(fxmlLoader.load(),1530,800);
        stage.setTitle("pp");
       stage.setScene(scene);
       stage.setFullScreen(true);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}