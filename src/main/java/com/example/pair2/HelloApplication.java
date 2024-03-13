package com.example.pair2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.stage.Stage;



public class HelloApplication extends Application {

    public void start(Stage stage) {

        Mbox pane = new Mbox();
      
        pane.setStyle("-fx-background-color: skyblue");

        Scene scene = new Scene( pane,800,500);
        stage.setTitle("Email Message");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}