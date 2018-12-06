package _9_css_layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane=new AnchorPane();
        Scene scene=new Scene(anchorPane);
        //加载样式
        scene.getStylesheets().add("_9_css_layout/Main.css");
        anchorPane.getStyleClass().add("anchorPane");

        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}
