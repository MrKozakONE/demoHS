package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HSApp extends Application {

    private Stage stage;
    private MenuControl menuControl;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        menuControl = new MenuControl(this);
        stage.setTitle("Hearthstone");
        stage.setScene(new Scene(menuControl));
        stage.setMaximized(true);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}