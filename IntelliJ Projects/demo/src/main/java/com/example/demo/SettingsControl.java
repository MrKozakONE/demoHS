package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;


public class SettingsControl extends BorderPane {

    @FXML
    private RadioButton soundOnBtn;

    @FXML
    private RadioButton soundOffBtn;

    @FXML
    private RadioButton musicOnBtn;

    @FXML
    private RadioButton musicOffBtn;

    @FXML
    private Slider soundSlider;

    @FXML
    private Slider musicSlider;

    @FXML
    private Button backBtn;

}
