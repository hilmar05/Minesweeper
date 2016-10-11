package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by hilmar on 10.10.2016.
 */
public class Settings extends Stage {
    private Stage primaryStage;

    public Settings(Stage primaryStage) {
        this.setTitle("Settings");
        this.primaryStage = primaryStage;
        this.create();
    }

    private void create(){
        HBox settingsWindow = new HBox();
        TextField gridSizeInput = new TextField();
        Button applySize = new Button("Apply");
        settingsWindow.getChildren().addAll(gridSizeInput,applySize);
        Scene settingsScene = new Scene(settingsWindow,250,250);
        this.setScene(settingsScene);
        this.initOwner(primaryStage);
    }
}
