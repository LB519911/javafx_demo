package _2_Anchor布局;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Anchor布局是以上下左右位置布局

        Button button1=new Button("左上");
        button1.setPrefSize(100,20);
        AnchorPane.setLeftAnchor(button1,10.0);
        AnchorPane.setTopAnchor(button1,10.0);

        Button button2=new Button("左下");
        button2.setPrefSize(100,20);
        AnchorPane.setLeftAnchor(button2,10.0);
        AnchorPane.setBottomAnchor(button2,10.0);

        Button button3=new Button("右上");
        button3.setPrefSize(100,20);
        AnchorPane.setRightAnchor(button3,10.0);
        AnchorPane.setTopAnchor(button3,10.0);

        Button button4=new Button("右下");
        button4.setPrefSize(100,20);
        AnchorPane.setRightAnchor(button4,10.0);
        AnchorPane.setBottomAnchor(button4,10.0);

        AnchorPane anchorPane=new AnchorPane();
        anchorPane.getChildren().addAll(button1,button2,button3,button4);
        Scene scene=new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(550);
        primaryStage.show();

    }
}
