package _30_触控事件;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final ImageView imageView=
                new ImageView(new Image("_26_手势旋转/1.png"));
        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(imageView, 100.0);
        AnchorPane.setLeftAnchor(imageView, 20.0);

        imageView.setOnTouchPressed((TouchEvent event) -> {
        });
        imageView.setOnTouchMoved(event -> {

        });
        imageView.setOnTouchReleased(event -> {
        });
        imageView.setOnTouchStationary(event -> {
        });

        anchorPane.getChildren().add(imageView);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
