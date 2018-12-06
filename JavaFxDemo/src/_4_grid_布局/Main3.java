package _4_grid_布局;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main3 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));
        Button[] btns=new Button[5];
        btns[0]=new Button();
        btns[0].setPrefSize(300,80);
        gridPane.add(btns[0],0,0,3,4);

        btns[1]=new Button();
        btns[1].setPrefSize(100,20);
        gridPane.add(btns[1],3,0);

        btns[2]=new Button();
        btns[2].setPrefSize(100,40);
        gridPane.add(btns[2],3,1,1,3);

        btns[3]=new Button();
        btns[3].setPrefSize(410,80);
        gridPane.add(btns[3],0,4,5,3);

        Scene scene=new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(550);
        primaryStage.setHeight(350);
        primaryStage.show();
    }
}
