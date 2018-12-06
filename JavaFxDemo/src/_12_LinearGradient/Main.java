package _12_LinearGradient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text=new Text("渐变:AAAAAAAAAAAAAAAAAAAAA");
        text.setFont(Font.font("微软雅黑", FontWeight.BOLD,60));
        text.setFill(Color.BLACK);

        //添加渐变
        Stop[] stops=new Stop[]{new Stop(0.0,Color.RED),
                new Stop(0.5,Color.ORANGE),new Stop(1.0,Color.YELLOW)};
        LinearGradient linearGradient=new LinearGradient(0.0,0.0,1.0,0.0
                ,true, CycleMethod.REFLECT,stops);
        text.setFill(linearGradient);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setLeftAnchor(text,40.0);
        AnchorPane.setTopAnchor(text,30.0);
        anchorPane.getChildren().add(text);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(260);
        primaryStage.show();
    }
}
