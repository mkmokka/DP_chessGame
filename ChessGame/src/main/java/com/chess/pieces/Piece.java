package com.chess.pieces;

public abstract class Piece {
    protected boolean isWhite;
    protected int row, col;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(int newRow, int newCol);
    public void move(int newRow, int newCol) {
        this.row = newRow;
        this.col = newCol;
    }
}
