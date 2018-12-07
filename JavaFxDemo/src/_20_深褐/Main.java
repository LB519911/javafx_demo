package _20_深褐;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.applet.Applet;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text=new Text("AAAAAAAAAAAAAAAAAAAAA");
        text.setFill(Color.RED);
        text.setFont(Font.font("宋体", FontWeight.BOLD,45));
        SepiaTone sepiaTone=new SepiaTone();
        sepiaTone.setLevel(1.0);
        text.setEffect(sepiaTone);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(text, 100.0);
        AnchorPane.setLeftAnchor(text, 20.0);
        anchorPane.getChildren().add(text);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
