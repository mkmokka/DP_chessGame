package com.chess.pieces;

public class King extends Piece {
    public King(boolean isWhite) { super(isWhite); }

    @Override
    public boolean isValidMove(int newRow, int newCol) {
        return Math.abs(newRow - row) <= 1 && Math.abs(newCol - col) <= 1;
    }
}
