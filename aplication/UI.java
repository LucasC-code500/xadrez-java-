package aplication;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " "); // Imprime o número da linha
            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]); // Imprime a peça (ou '-')
            }
            System.out.println(); // Pula para a próxima linha
        }
        System.out.println("  a b c d e f g h"); // Agora imprime as letras das colunas corretamente
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("- "); // Adiciona espaço para alinhar
        } else {
            System.out.print(piece + " "); // Também adiciona espaço
        }
    }
}
