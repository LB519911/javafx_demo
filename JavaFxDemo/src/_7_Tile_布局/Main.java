package _7_Tile_布局;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane tilePane=new TilePane(Orientation.HORIZONTAL);
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setPadding(new Insets(10));

        //****************************最佳列数**********************
        tilePane.setPrefRows(4);
        //****************************最佳列数**********************

        Button[] btns=new Button[10];
        for(int i=0;i!=10;i++){
            btns[i]=new Button(i+1+"");
            btns[i].setPrefSize(100,50);
            tilePane.getChildren().addAll(btns[i]);
        }

        Scene scene=new Scene(tilePane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
