package trananhkhoa.app;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Tạo một nút bấm
		Button btn = new Button();
		//
		btn.setText("xin chao JavaFX");
		// Tạo cửa sổ
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		// Màn hình / cảnh hiển thị
		Scene scn = new Scene(root, 400, 200);
		primaryStage.setTitle("hello JavaFX");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}

