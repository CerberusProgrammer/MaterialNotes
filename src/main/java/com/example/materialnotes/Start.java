package com.example.materialnotes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.joda.time.DateTime;

import java.io.IOException;

public class Start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        DateTime dt = new DateTime();

        int year = dt.getYear();
        int month = dt.getMonthOfYear();
        int day = dt.getDayOfMonth();

        System.out.println("year: " + year + ", month: " + month + ", day: " + day);

        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 720);
        stage.setTitle("Material Notes");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}