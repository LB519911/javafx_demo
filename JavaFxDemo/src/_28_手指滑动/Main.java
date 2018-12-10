package _28_手指滑动;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final ImageView imageView=
                new ImageView(new Image("_26_手势旋转/1.png"));
        final double HEIGHT=300;
        final double WIDTH=600;
        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(imageView, 100.0);
        AnchorPane.setLeftAnchor(imageView, 20.0);

        TranslateTransition translateTransition =
                new TranslateTransition(Duration.seconds(2),imageView);
        imageView.setOnSwipeUp(event -> {
            if(imageView.getY()>0){
                translateTransition.setByX(0);
                translateTransition.setByY(-HEIGHT);
                //开启动画
                translateTransition.playFromStart();
            }
        });
        imageView.setOnSwipeDown(event -> {
            if(imageView.getY()<=0){
                translateTransition.setByX(0);
                translateTransition.setByY(HEIGHT);
                //开启动画
                translateTransition.playFromStart();
            }
        });
        imageView.setOnSwipeLeft(event -> {
            if(imageView.getX()>0){
                translateTransition.setByX(0);
                translateTransition.setByY(-WIDTH);
                //开启动画
                translateTransition.playFromStart();
            }
        });
        imageView.setOnSwipeDown(event -> {
            if(imageView.getX()<=0){
                translateTransition.setByX(0);
                translateTransition.setByY(WIDTH);
                //开启动画
                translateTransition.playFromStart();
            }
        });

        anchorPane.getChildren().add(imageView);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
