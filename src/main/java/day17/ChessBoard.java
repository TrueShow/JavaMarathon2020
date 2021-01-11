package day17;

public class ChessBoard {
    ChessPiece[][] chess;

    public ChessBoard(ChessPiece[][] chess) {
        this.chess = chess;
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j] == null) {
                    chess[i][j] = ChessPiece.EMPTY;
                    System.out.print(chess[i][j] + "\t");
                } else {
                    System.out.print(chess[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
