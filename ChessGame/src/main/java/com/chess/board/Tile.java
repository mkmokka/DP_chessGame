package com.chess.board;

import com.chess.pieces.Piece;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends StackPane {

    private int row;
    private int col;
    private Piece currentPiece;
    private Rectangle rectangle;

    private static final int TILE_SIZE = 100;

    public Tile(int row, int col) {
        this.row = row;
        this.col = col;

        rectangle = new Rectangle(TILE_SIZE, TILE_SIZE);
        setColor();

        this.getChildren().add(rectangle);
    }

    private void setColor() {
        if ((row + col) % 2 == 0) {
            rectangle.setFill(Color.BEIGE);
        } else {
            rectangle.setFill(Color.BROWN);
        }
    }

    public void highlight(Color color) {
        rectangle.setFill(color);
    }

    public void resetColor() {
        setColor();
    }

    public boolean hasPiece() {
        return currentPiece != null;
    }

    public void setPiece(Piece piece) {
        this.currentPiece = piece;
    }

    public Piece getPiece() {
        return currentPiece;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
