package _25_拖拽;

import javafx.application.Application;
import javafx.scene.Scene;
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
        ImageView imageView=new ImageView(new Image("_25_拖拽/img.PNG"));
        AnchorPane.setLeftAnchor(imageView,100.0);
        AnchorPane.setTopAnchor(imageView,100.0);

        AnchorPane anchorPane=new AnchorPane();
        anchorPane.getChildren().add(imageView);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(1000);
        primaryStage.setHeight(650);
        primaryStage.show();
    }
}
