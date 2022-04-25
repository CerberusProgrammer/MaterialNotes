package com.example.materialnotes;

import io.github.palexdev.materialfx.controls.MFXIconWrapper;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.dialogs.MFXGenericDialog;
import io.github.palexdev.materialfx.utils.TextUtils;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
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

        if (note.getContent().isBlank() && note.getTitle().isBlank()) {
            displayNotes();
            return;
        }

        notes.add(note);

        MFXGenericDialog notePane = new MFXGenericDialog();
        notePane.setHeaderText(note.getTitle());
        notePane.setContentText(note.getContent());
        notePane.setShowMinimize(false);
        notePane.setPrefSize(220, 200);
        notePane.setMinSize(220, 200);

        notePane.setOnClose(mouseEvent -> {
            // Delete Note
            notes.remove(note);
            flowPane.getChildren().remove(notePane);
        });

        notePane.setOnAlwaysOnTop(mouseEvent -> {
            // Edit Note
            notes.remove(note);
            flowPane.getChildren().remove(notePane);
            title.setText(note.getTitle());
            content.setText(note.getContent());
            displayCreateNote();
        });

        flowPane.getChildren().add(notePane);
        displayNotes();
    }

    void deleteNote(ActionEvent event) {

    }

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
    void displayCreateNote() {
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