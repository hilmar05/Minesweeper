package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane mainWindow = new BorderPane();
        Scene mainScene = new Scene(mainWindow,500,500);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Minesweeper");


        PlayField playField = new PlayField();
        mainWindow.setCenter(playField);

















        Settings settingsWindow = new Settings(primaryStage);
        settingsWindow.showAndWait();
        primaryStage.show();


    }


    public static void main(String[] args) {

        launch(args);
    }
}
