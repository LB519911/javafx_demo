package _21_旋转;

import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
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
        Text text=new Text("AAAAAAAAAAA");
        text.setFill(Color.RED);
        text.setFont(Font.font("宋体", FontWeight.BOLD,79));

        PerspectiveTransform perspectiveTransform=
                new PerspectiveTransform();
        perspectiveTransform.setUlx(50.0);
        perspectiveTransform.setUly(10.0);
        perspectiveTransform.setUrx(450.0);
        perspectiveTransform.setUry(60.0);

        perspectiveTransform.setLlx(50);
        perspectiveTransform.setLly(230);
        perspectiveTransform.setLrx(450);
        perspectiveTransform.setLry(120);
        text.setEffect(perspectiveTransform);

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
