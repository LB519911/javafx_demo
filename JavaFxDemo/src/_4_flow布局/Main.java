package _4_flow布局;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //flow布局左到右，上到下。默认左到右
        Button button1=new Button("1");
        button1.setPrefSize(100,50);

        Button button2=new Button("2");
        button2.setPrefSize(100,50);

        Button button3=new Button("3");
        button3.setPrefSize(100,50);

        Button button4=new Button("4");
        button4.setPrefSize(100,50);

        Button button5=new Button("5");
        button5.setPrefSize(100,50);

        FlowPane flowPane=new FlowPane();
        flowPane.setVgap(10);
        flowPane.setHgap(20);
        flowPane.setAlignment(Pos.CENTER);
        //设置水平居中
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.getChildren().addAll(button1,button2,button3,button4,button5);
        Scene scene=new Scene(flowPane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(550);
        primaryStage.show();

    }
}
