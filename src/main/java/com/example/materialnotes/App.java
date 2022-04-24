package com.example.materialnotes;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class App implements Initializable {

    public Circle circle;
    @FXML
    private HBox bottomBar;
    @FXML
    private ScrollPane createPane;
    @FXML
    private ScrollPane notesPane;
    @FXML
    private ScrollPane searchPane;

    @FXML
    void createNote(ActionEvent event) {

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
        search.setToX(-498);
        create.play();
        search.play();
    }

    @FXML
    void displayCreateNote(ActionEvent event) {
        TranslateTransition create = new TranslateTransition(new Duration(250), createPane);
        TranslateTransition search = new TranslateTransition(new Duration(250), searchPane);
        search.setToX(-498);
        create.setToX(-498);
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