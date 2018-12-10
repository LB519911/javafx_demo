package _29_缩放;

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
        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(imageView, 100.0);
        AnchorPane.setLeftAnchor(imageView, 20.0);

        //缩放级别
        double zoomFactor=1.0;
        //开始缩放
        imageView.setOnZoomStarted(event -> {
            imageView.setEffect(new DropShadow());
            event.consume();
        });
        //缩放中
        imageView.setOnZoom(event -> {
            imageView.setScaleX(event.getTotalZoomFactor()+zoomFactor);
            imageView.setScaleY(event.getTotalZoomFactor()+zoomFactor);
            event.consume();
        });
        //缩放后
        imageView.setOnZoomFinished(event -> {
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
