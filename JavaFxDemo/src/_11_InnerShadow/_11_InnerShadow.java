package _11_InnerShadow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _11_InnerShadow extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text=new Text("阴影");
        text.setFont(Font.font("微软雅黑", FontWeight.BOLD,45));
        text.setFill(Color.BLACK);

        //添加阴影
        InnerShadow innerShadow=new InnerShadow();
        innerShadow.setColor(Color.GRAY);
        innerShadow.setOffsetX(1.0);
        innerShadow.setOffsetY(12.0);
        innerShadow.setRadius(1.0);
        text.setEffect(innerShadow);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setLeftAnchor(text,40.0);
        AnchorPane.setTopAnchor(text,30.0);
        anchorPane.getChildren().add(text);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(460);
        primaryStage.setHeight(260);
        primaryStage.show();
    }
}
