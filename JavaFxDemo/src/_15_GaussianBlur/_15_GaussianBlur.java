package _15_GaussianBlur;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _15_GaussianBlur extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text=new Text("模糊");
        text.setFont(Font.font("宋体", FontWeight.BOLD,67));

        GaussianBlur gaussianBlur=new GaussianBlur();
        gaussianBlur.setRadius(15.0);
        text.setEffect(gaussianBlur);

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
