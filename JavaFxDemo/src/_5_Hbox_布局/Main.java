package _5_Hbox_布局;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("URL:");
        TextField textField=new TextField();
        Button button=new Button("连接");
        button.setPrefSize(60,20);
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20,10,10,10));

        //随窗口变动而改变大小
        HBox.setHgrow(label, Priority.ALWAYS);
        HBox.setHgrow(textField, Priority.ALWAYS);
        HBox.setHgrow(button, Priority.ALWAYS);
        hBox.getChildren().addAll(label,textField,button);

        Scene scene=new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setHeight(100);
        primaryStage.setWidth(500);
        primaryStage.show();
    }
}
