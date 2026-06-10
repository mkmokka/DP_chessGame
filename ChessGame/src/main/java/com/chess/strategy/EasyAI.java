package com.chess.strategy;

import com.chess.pieces.Piece;
import java.util.Random;

public class EasyAI implements MoveStrategy {
    private Random random = new Random();

    @Override
    public void move(Piece piece) {
        int newRow = random.nextInt(8);
        int newCol = random.nextInt(8);
        if(piece.isValidMove(newRow, newCol)) piece.move(newRow, newCol);
    }
}
