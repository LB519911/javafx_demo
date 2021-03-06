package _17_反射;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text=new Text("模糊");
        text.setFont(Font.font("宋体", FontWeight.BOLD,67));

        Reflection reflection=new Reflection();
        reflection.setTopOffset(0);
        reflection.setBottomOpacity(0.5);
        reflection.setFraction(0.5);
        reflection.setFraction(0.6);
        text.setEffect(reflection);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(text, 100.0);
        AnchorPane.setLeftAnchor(text, 20.0);
        anchorPane.getChildren().add(text);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}
