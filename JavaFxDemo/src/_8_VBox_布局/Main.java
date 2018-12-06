package _8_VBox_布局;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("月份:");
        label.setFont(Font.font("宋体",20));

        ListView<String> listView=new ListView<>();

        ObservableList<String> strings = FXCollections.observableArrayList("1月", "2月", "3月", "4月"
                , "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月");
        listView.setItems(strings);

        VBox vBox=new VBox();
        vBox.setPadding(new Insets(10));
        //设置优先级
        VBox.setVgrow(listView, Priority.ALWAYS);
        vBox.getChildren().addAll(label,listView);
        Scene scene=new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setHeight(450);
        primaryStage.setWidth(300);
        primaryStage.show();
    }
}
