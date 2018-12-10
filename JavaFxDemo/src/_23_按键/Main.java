package _23_按键;

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
        label.setPrefSize(100,60);
        label.setFont(Font.font("宋体",36));
        AnchorPane.setTopAnchor(label,60.0);
        AnchorPane.setLeftAnchor(label,100.0);

        AnchorPane anchorPane=new AnchorPane();
        AnchorPane.setTopAnchor(label, 100.0);
        AnchorPane.setLeftAnchor(label, 20.0);
        anchorPane.getChildren().add(label);

        //添加事件
        Scene scene=new Scene(anchorPane);
        scene.setOnKeyPressed(e->{
            int dx=0;
            int dy=0;

            if(e.isAltDown()){
                label.setText("Alt...");
            }
            if(e.isShiftDown()){
                label.setText("Shift...");
            }
            if(e.isControlDown()){

                label.setText("Control...");
            }

            //按键码
            if(e.getCode()== KeyCode.UP){
                dy-=5;
            }else if(e.getCode()==KeyCode.DOWN){
                dy+=5;
            }else if(e.getCode()==KeyCode.LEFT){
                dx-=5;
            }else if(e.getCode()==KeyCode.RIGHT){
                dx+=5;
            }
            primaryStage.setX(primaryStage.getX()+dx);
            primaryStage.setY(primaryStage.getY()+dy);
        });

        primaryStage.setScene(scene);
        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
