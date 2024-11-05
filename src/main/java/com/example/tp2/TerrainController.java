package com.example.tp2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;

public class TerrainController {

    // Labels
    @FXML
    private Label label_titlle;
    @FXML
    private Label label_taille;
    @FXML
    private Label label_couleur;
    @FXML
    private Label label_personnalisation;
    @FXML
    private Label label_total;

    // ImageView
    @FXML
    private ImageView image;

    // RadioButtons
    @FXML
    private RadioButton radio_s;
    @FXML
    private RadioButton radio_m;
    @FXML
    private RadioButton radio_l;

    // ToggleGroup
    @FXML
    private ToggleGroup sizeToggleGroup;

    // Buttons for color selection
    @FXML
    private Button cadre_rouge;
    @FXML
    private Button cadre_vert;
    @FXML
    private Button cadre_jaune;
    @FXML
    private Button cadre_orange;

    // Checkbox and TextField for customization
    @FXML
    private CheckBox check_personnalise;
    @FXML
    private TextField field_text;

    @FXML
    public void initialize() {

        Velo v = new Velo();
        Type city = new Type("Ville", 1050);
        v.setOptionActive(city);

        CouleurCadre vert = new CouleurCadre("Vert", 0);
        CouleurCadre jaune = new CouleurCadre("Jaune", 80);
        CouleurCadre rouge = new CouleurCadre("Rouge", 90);
        CouleurCadre orange = new CouleurCadre("Orange", 150);

        Texte perso = new Texte("", 70);

        label_taille.setText("S");
        label_couleur.setText("Vert");
        label_personnalisation.setText("Non");
        field_text.setDisable(true);
        label_total.setText(v.getPrice());

        cadre_rouge.setOnAction(event -> {

            v.setOptionInactive(vert);
            v.setOptionInactive(jaune);
            v.setOptionInactive(orange);

            setLabelCouleur("Rouge");
            v.setOptionActive(rouge);
            label_total.setText(v.getPrice());

        });
        cadre_vert.setOnAction(event -> {

            v.setOptionInactive(rouge);
            v.setOptionInactive(jaune);
            v.setOptionInactive(orange);

            setLabelCouleur("Vert");
            v.setOptionActive(vert);
            label_total.setText(v.getPrice());
        });
        cadre_jaune.setOnAction(event -> {

            v.setOptionInactive(rouge);
            v.setOptionInactive(vert);
            v.setOptionInactive(orange);

            setLabelCouleur("Jaune");
            v.setOptionActive(jaune);
            label_total.setText(v.getPrice());
        });
        cadre_orange.setOnAction(event -> {

            v.setOptionInactive(rouge);
            v.setOptionInactive(vert);
            v.setOptionInactive(jaune);

            setLabelCouleur("Orange");
            v.setOptionActive(orange);
            label_total.setText(v.getPrice());
        });

        check_personnalise.setOnAction(event -> {
            updatePersonalisationLabel();
            if (check_personnalise.isSelected()) {
                v.setOptionActive(perso);
                label_total.setText(v.getPrice());
                field_text.setDisable(false);
            } else {
                v.setOptionInactive(perso);
                label_total.setText(v.getPrice());
                field_text.setDisable(true);
            }

        });



        sizeToggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                label_taille.setText(selectedRadioButton.getText());
            }
        });
    }

    private void setLabelCouleur(String color) {
        label_couleur.setText(color);
    }

    private void updatePersonalisationLabel() {
        if (check_personnalise.isSelected()) {
            label_personnalisation.setText("Oui");
        } else {
            label_personnalisation.setText("Non");
        }
    }
}