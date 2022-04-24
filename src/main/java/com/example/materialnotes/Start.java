package com.example.materialnotes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
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

/*
<MFXCircleToggleNode text="hello" accessibleRole="BUTTON" contentDisplay="TOP" gap="0.0" graphicTextGap="1.0" layoutX="419.0" layoutY="4.0" prefHeight="42.0" prefWidth="86.0" size="20.0">
            </MFXCircleToggleNode>


            <MFXButton buttonType="RAISED" depthLevel="LEVEL1" rippleColor="#1fa8d9" text="Notes" />
            <MFXButton buttonType="RAISED" depthLevel="LEVEL1" rippleColor="#1fa8d9" text="Search" />
 */