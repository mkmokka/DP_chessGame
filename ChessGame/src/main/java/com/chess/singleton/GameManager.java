package com.chess.singleton;

import com.chess.board.Board;

public class GameManager {
    private static GameManager instance;
    private Board board;

    private GameManager() {
        board = new Board();
    }

    public static GameManager getInstance() {
        if(instance == null){
            instance = new GameManager();
        }
        return instance;
    }

    public Board getBoard() {
        return board;
    }
}
