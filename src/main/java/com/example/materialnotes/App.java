package com.example.materialnotes;

import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class App implements Initializable {

    public Circle circle;
    @FXML
    private HBox bottomBar;
    @FXML
    private Pane createPane;
    @FXML
    private FlowPane flowPane;
    @FXML
    private ScrollPane notesPane;
    @FXML
    private Pane searchPane;
    @FXML
    private MFXTextField title;

    @FXML
    void createNote(ActionEvent event) {
        Pane note = new Pane();
        note.prefWidth(50);
        note.prefHeight(50);
        note.setVisible(true);
        note.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0,0,0)");
        note.setStyle("-fx-background-color: red");

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setFill(Color.RED);
        flowPane.getChildren().add(circle);
        flowPane.getChildren().add(note);
    }

    @FXML
    void deleteNote(ActionEvent event) {

    }

    @FXML
    void editNote(ActionEvent event) {

    }

    @FXML
    void displayNotes(ActionEvent event) {
        TranslateTransition search = new TranslateTransition(new Duration(250), searchPane);
        TranslateTransition create = new TranslateTransition(new Duration(250), createPane);
        create.setToX(10);
        search.setToX(10);
        create.play();
        search.play();
    }

    @FXML
    void displaySearch(ActionEvent event) {
        TranslateTransition search = new TranslateTransition(new Duration(250), searchPane);
        TranslateTransition create = new TranslateTransition(new Duration(250), createPane);
        create.setToX(0);
        search.setToX(-514);
        create.play();
        search.play();
    }

    @FXML
    void displayCreateNote(ActionEvent event) {
        TranslateTransition create = new TranslateTransition(new Duration(250), createPane);
        TranslateTransition search = new TranslateTransition(new Duration(250), searchPane);
        search.setToX(-514);
        create.setToX(-514);
        search.play();
        create.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition search = new TranslateTransition(new Duration(250), searchPane);
        TranslateTransition create = new TranslateTransition(new Duration(250), createPane);
        search.setToX(10);
        create.setToX(10);
    }
}