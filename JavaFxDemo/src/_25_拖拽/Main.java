package _25_拖拽;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text_source=new Text("拖拽前");
        AnchorPane.setTopAnchor(text_source,100.0);
        AnchorPane.setLeftAnchor(text_source,100.0);
        Text text_done=new Text("拖拽后");
        AnchorPane.setTopAnchor(text_done,100.0);
        AnchorPane.setLeftAnchor(text_done,500.0);
        //侦测拖拽
        text_source.setOnDragDetected(event -> {
            //获取物件
            Dragboard dragboard =
                    text_source.startDragAndDrop(TransferMode.ANY);
            //放入粘贴板
            ClipboardContent clipboardContent=new ClipboardContent();
            clipboardContent.putString(text_source.getText());
            dragboard.setContent(clipboardContent);
            event.consume();
        });
        //拖拽到上方
        text_done.setOnDragOver(event -> {
            //如果拖拽过来的是文字
            if(event.getGestureSource()!=text_done
                    &&event.getDragboard().hasString()){
                //同意拖拽事件
                event.acceptTransferModes(TransferMode.ANY);
            }
            event.consume();
        });
        //当拖拽放开时
        text_done.setOnDragDropped(event -> {
            Dragboard dragboard = event.getDragboard();
            boolean success=false;
            if(dragboard.hasString()){
                //替换文字
                text_done.setText(dragboard.getString());
                success=true;
            }
            //作业完成
            event.setDropCompleted(success);
            event.consume();
        });
        //拖拽完成后清空文字
        text_source.setOnDragDone(event -> {
            if(event.getTransferMode()==TransferMode.MOVE){
                text_source.setText("");
            }
            event.consume();
        });
        
        AnchorPane anchorPane=new AnchorPane();
        anchorPane.getChildren().addAll(text_source,text_done);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(1000);
        primaryStage.setHeight(750);
        primaryStage.show();
    }
}
