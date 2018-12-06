package _6_stack_布局;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ListView<String> listView=new ListView<>();
        ObservableList<String> integers =
                FXCollections.observableArrayList("1","2","3","4","5","6");
        listView.setItems(integers);
        Label label=new Label("stackpanl");
        label.setFont(Font.font("微软雅黑",16));

        StackPane stackPane=new StackPane();
        stackPane.setPadding(new Insets(10,10,10,10));
        stackPane.getChildren().addAll(listView,label);

        Scene scene=new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}
