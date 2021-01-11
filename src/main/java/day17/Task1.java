package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chess = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            chess[i] = ChessPiece.PAWN_WHITE;
        }
        for (int i = 4; i < 8; i++) {
            chess[i] = ChessPiece.ROOK_BLACK;
        }

        print(chess);
    }

    public static void print(ChessPiece[] chess) {
        for (ChessPiece piece: chess  ) {
            System.out.print(piece + " ");
        }
    }
}