package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private BorderPane backgroundPane;

    @FXML
    private Button decreaseButton;

    @FXML
    private GridPane board;

    @FXML
    private Button increaseButton;

    @FXML
    void handleIncreaseButtonClicked() {
        board.setMinSize(board.getMinWidth() + 50, board.getMinHeight() + 50);
        board.setMaxSize(board.getMaxWidth() + 50, board.getMaxHeight() + 50);
        board.getColumnConstraints().add(new ColumnConstraints(50));
        board.getRowConstraints().add(new RowConstraints(50));
    }

    @FXML
    void handleDecreaseButtonClicked() {
        board.setMinSize(board.getMinWidth() - 50, board.getMinHeight() - 50);
        board.setMaxSize(board.getMaxWidth() - 50, board.getMaxHeight() - 50);
        board.getColumnConstraints().remove(board.getColumnConstraints().size() - 1);
        board.getRowConstraints().remove(board.getRowConstraints().size() - 1);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Stage window = new Stage();
        Scene scene  = new Scene(backgroundPane);
        window.setScene(scene);
        window.show();
    }


}
