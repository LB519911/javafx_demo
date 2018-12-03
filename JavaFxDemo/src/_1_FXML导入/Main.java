package _1_FXML导入;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //加载FXML文档
        Parent load =
                FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene=new Scene(load);
        //添加组件
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);
        primaryStage.show();
    }
}
