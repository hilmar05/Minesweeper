package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 * Created by hilmar on 10.10.2016.
 */
public class PlayField extends GridPane {
    SimpleIntegerProperty size = new SimpleIntegerProperty();


    public PlayField() {
        this.setGridLinesVisible(true);
    }

    public void setSize(int numberOfTiles){
        int totalSize = numberOfTiles * size.getValue();
        this.setMaxSize(totalSize, totalSize);
        this.setMinSize(totalSize, totalSize);
    }


    public void create(int numberOfTiles){
        for(int i=0;i<size.getValue();i++){
            this.getRowConstraints().add(new RowConstraints(numberOfTiles));
            this.getColumnConstraints().add(new ColumnConstraints(numberOfTiles));
        }
    }
}
