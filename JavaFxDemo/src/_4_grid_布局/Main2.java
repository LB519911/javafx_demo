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
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));
        final int column=3;
        final int row=4;
        Button[][] btns=new Button[column][row];
        btns[0][0] = new Button("0,0");
        btns[0][0].setPrefSize(130,20);
        gridPane.add(btns[0][0],0,0,2,1);

        btns[2][0]=new Button("2,0");
        btns[2][0].setPrefSize(60,20);
        gridPane.add(btns[2][0],2,0);

        btns[0][1]=new Button("0,1");
        btns[0][1].setPrefSize(60,20);
        gridPane.add(btns[0][1],0,1);

        btns[1][1]=new Button("1,1");
        btns[1][1].setPrefSize(130,20);
        gridPane.add(btns[1][1],1,1,2,1);

        btns[0][2]=new Button("0,2");
        btns[0][2].setPrefSize(60,50);
        gridPane.add(btns[0][2],0,2,1,2);

        btns[1][2]=new Button("1,2");
        btns[1][2].setPrefSize(60,20);
        gridPane.add(btns[1][2],1,2);

        btns[1][3]=new Button("1,3");
        btns[1][3].setPrefSize(60,20);
        gridPane.add(btns[1][3],1,3);

        btns[2][2]=new Button("2,2");
        btns[2][2].setPrefSize(60,50);
        gridPane.add(btns[2][2],2,2,1,2);

        Scene scene=new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(550);
        primaryStage.show();
    }
}
