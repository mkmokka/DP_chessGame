package com.chess.factory;

import com.chess.pieces.*;

public class PieceFactory {
    public static Piece createPiece(String type, boolean isWhite) {
        return switch (type.toUpperCase()) {
            case "KING" -> new King(isWhite);
            case "QUEEN" -> new Queen(isWhite);
            case "ROOK" -> new Rook(isWhite);
            case "BISHOP" -> new Bishop(isWhite);
            case "KNIGHT" -> new Knight(isWhite);
            case "PAWN" -> new Pawn(isWhite);
            default -> throw new IllegalArgumentException("Unknown piece type");
        };
    }
}
