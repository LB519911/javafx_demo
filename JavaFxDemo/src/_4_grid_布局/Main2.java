package _4_grid_布局;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //网格，左到右，上到下依次排序
        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(60);
        gridPane.setHgap(30);
        gridPane.setPadding(new Insets(10,10,10,10));
        final int column=3;
        final int row=4;
        Button[][] btns=new Button[column][row];


        Scene scene=new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(550);
        primaryStage.show();
    }
}
