package _3_Border布局;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button1=new Button("左上");
        button1.setPrefSize(100,20);

        Button button2=new Button("左下");
        button2.setPrefSize(100,20);

        Button button3=new Button("右上");
        button3.setPrefSize(100,20);

        Button button4=new Button("右下");
        button4.setPrefSize(100,20);

        Button button5=new Button("中 ");
        button5.setPrefSize(100,20);

        BorderPane borderPane=new BorderPane();
        borderPane.setTop(button1);
        borderPane.setBottom(button2);
        borderPane.setLeft(button3);
        borderPane.setRight(button4);
        borderPane.setCenter(button5);

        BorderPane.setAlignment(button1, Pos.CENTER);
        BorderPane.setAlignment(button2, Pos.CENTER);
        BorderPane.setAlignment(button3, Pos.CENTER);
        BorderPane.setAlignment(button4, Pos.CENTER);
        BorderPane.setAlignment(button5, Pos.CENTER);

        Scene scene=new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(550);
        primaryStage.show();

    }
}
