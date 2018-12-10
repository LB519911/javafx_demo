package _24_滑鼠;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("Label");
        label.setPrefSize(1000,60);
        label.setFont(Font.font("",18));
        AnchorPane.setTopAnchor(label,60.0);
        AnchorPane.setLeftAnchor(label,100.0);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(label, 100.0);
        AnchorPane.setLeftAnchor(label, 20.0);
        anchorPane.getChildren().add(label);

        //添加事件
        Scene scene=new Scene(anchorPane);
        scene.setOnMouseClicked(e->{
            label.setText("setOnMouseClicked");
        });
        scene.setOnMouseEntered(e->{
            label.setText("setOnMouseEntered");
        });
        scene.setOnMouseExited(e->{
            label.setText("setOnMouseExited");
        });
        scene.setOnMouseEntered(e->{
            label.setText("setOnMouseEntered...X:"+e.getX()+"---Y"+e.getY());
        });

        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
