package khoata;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hellojavafx001 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Tạo 1 nút bấm
        Button btn = new Button();
        btn.setText("Hello World JavaFX");

      // tao cua so
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Tạo Scene màn hình hiển thị
        Scene scn = new Scene(root, 400, 200);

        
        primaryStage.setTitle("Hello World"); 
        primaryStage.setScene(scn);           
        
    
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}