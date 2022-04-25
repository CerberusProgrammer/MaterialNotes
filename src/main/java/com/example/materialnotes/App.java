package com.example.materialnotes;

import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.utils.TextUtils;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.util.Duration;


import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class App implements Initializable {

    @FXML
    public TextArea content;
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

    ArrayList<Note> notes = new ArrayList<>();

    @FXML
    void createNote(ActionEvent event) {
        Note note = new Note();
        note.setTitle(title.getText());
        note.setContent(content.getText());

        title.setText("");
        content.setText("");

        if (note.getContent().isBlank() && note.getTitle().isBlank())
            return;

        notes.add(note);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setId("note");
        anchorPane.setPrefWidth(220);
        anchorPane.setPrefHeight(200);
        anchorPane.getStylesheets().add(Objects.requireNonNull(getClass().getResource("note.css")).toString());

        Label title = new Label(note.getTitle());
        title.setLayoutX(14);
        title.setLayoutY(14);
        title.setWrapText(true);
        title.setFont(new Font(16));

        TextArea content = new TextArea(note.getContent());
        content.setLayoutX(10);
        content.setLayoutY(43);
        content.setPrefHeight(144);
        content.setPrefWidth(200);
        content.setWrapText(true);
        content.setEditable(false);

        anchorPane.getChildren().add(title);
        anchorPane.getChildren().add(content);

        flowPane.getChildren().add(anchorPane);

        displayNotes();
    }

    @FXML
    void deleteNote(ActionEvent event) {

    }

    @FXML
    void editNote(ActionEvent event) {

    }

    @FXML
    void displayNotes() {
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