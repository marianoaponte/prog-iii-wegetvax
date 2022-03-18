package it.gruppoxxi.progiiiwegetvax;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.*;

import java.io.IOException;

public class App extends Application {

    private static Stage stage;
    @Override
    public void start(Stage primarystage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("prova.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 666, 666);

        primarystage.setTitle("Progetto #WeGetVax");

        primarystage.setScene(scene);
        primarystage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}