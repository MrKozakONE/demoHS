package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Logger;

public class MenuControl extends BorderPane {

    private static final Logger LOGGER = Logger.getLogger(MenuControl.class.getName());

    private final HSApp app;

    @FXML
    protected void onSoloButtonClick() {
        System.out.println("Solo");
    }

    @FXML
    protected void onVersusButtonClick() {
        System.out.println("Versus");
    }

    @FXML
    protected void onEditorButtonClick() {
        System.out.println("Editor");
    }

    @FXML
    protected void onSettingsButtonClick() {
        //settingsBTN.setOnAction(e -> app.);
        System.out.println("Settings");
    }

    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }

    @FXML
    private Button soloBTN;

    @FXML
    private Button versusBTN;

    @FXML
    private Button editorBTN;

    @FXML
    private Button settingsBTN;

    @FXML
    private Button exitBTN;

    MenuControl(HSApp app) {
        this.app = app;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainMenu.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
