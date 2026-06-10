package com.chess.board;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board {
    private GridPane grid;

    public Board() {
        grid = new GridPane();
        int size = 8;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle tile = new Rectangle(100, 100);
                if ((row + col) % 2 == 0) {
                    tile.setFill(Color.BEIGE);
                } else {
                    tile.setFill(Color.BROWN);
                }
                grid.add(tile, col, row);
            }
        }
    }

    public GridPane getGrid() {
        return grid;
    }
}
