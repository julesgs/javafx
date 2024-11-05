package com.example.tp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML
    private Label labelText;

    @FXML
    private Label label_taille;

    @FXML
    private ToggleGroup sizeToggleGroup;

    public void ButtonClickCity(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("city.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 645, 404);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Configurateur");
        stage.show();
    }

    public void ButtonClickAllTerrain(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("allTerrain.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 645, 404);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Configurateur");
        stage.show();
    }



}