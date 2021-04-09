package com.emmano.emailclient;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Launcher extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("views/launcher.fxml")));

        Scene scene = new Scene(parent, 300, 250);

        primaryStage.setTitle("Hello World !");

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public void buttonAction(){
        System.out.println("Hello here....");
    }
}
