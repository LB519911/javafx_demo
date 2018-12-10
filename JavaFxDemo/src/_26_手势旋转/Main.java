package _26_手势旋转;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        //开始旋转
        imageView.setOnRotationStarted(event -> {
            imageView.setEffect(new DropShadow());
            event.consume();
        });
        //旋转中
        imageView.setOnRotate(event -> {
            //加旋转角度(效果)
            imageView.setRotate(imageView.getRotate()+event.getAngle());
            event.consume();
        });
        //旋转完成
        imageView.setOnRotationFinished(event -> {
            //恢复效果
            imageView.setEffect(null);
            event.consume();
        });

        anchorPane.getChildren().add(imageView);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
