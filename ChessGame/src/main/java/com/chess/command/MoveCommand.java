package com.chess.command;

import com.chess.pieces.Piece;

public class MoveCommand implements Command {
    private Piece piece;
    private int newRow, newCol;

    public MoveCommand(Piece piece, int newRow, int newCol){
        this.piece = piece;
        this.newRow = newRow;
        this.newCol = newCol;
    }

    @Override
    public void execute() {
        piece.move(newRow, newCol);
    }
}
