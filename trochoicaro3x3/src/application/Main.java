package application; 

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private boolean xTurn = true; // true = X, false = O
    private Button[][] board = new Button[3][3];

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Tạo ma trận 9 nút bấm cho bàn cờ
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                Button btn = new Button("");
                btn.setPrefSize(100, 100);
                btn.setFont(new Font("Arial", 36));
                
                int row = r;
                int col = c;
                
                btn.setOnAction(e -> {
                    if (!btn.getText().isEmpty()) return; 

                    if (xTurn) {
                        btn.setText("X");
                        btn.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
                    } else {
                        btn.setText("O");
                        btn.setStyle("-fx-text-fill: blue; -fx-font-weight: bold;");
                    }

                    if (checkWin(row, col)) {
                        showAlert("Chiến thắng!", "Người chơi " + (xTurn ? "X" : "O") + " đã thắng!");
                        resetBoard();
                        return;
                    }

                    if (isBoardFull()) {
                        showAlert("Hòa cờ!", "Bàn cờ đã đầy!");
                        resetBoard();
                        return;
                    }

                    xTurn = !xTurn; 
                });

                board[r][c] = btn;
                gridPane.add(btn, c, r);
            }
        }

        Scene scene = new Scene(gridPane, 360, 360);
        primaryStage.setTitle("Game Caro 3x3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

  