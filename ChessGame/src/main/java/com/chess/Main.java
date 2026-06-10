package com.chess;

import com.chess.board.Board;
import com.chess.singleton.GameManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        GameManager gm = GameManager.getInstance();
        GridPane root = new GridPane();
        Board board = gm.getBoard();
        root.getChildren().add(board.getGrid());

        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("Chess Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
