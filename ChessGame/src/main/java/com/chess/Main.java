package com.chess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.chess.board.Board;
import com.chess.singleton.GameManager;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GameManager gm = GameManager.getInstance();

        GridPane root = new GridPane();
        Board board = new Board();
        root.getChildren().add(board.getGrid());

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
