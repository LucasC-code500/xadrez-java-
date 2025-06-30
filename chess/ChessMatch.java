// Aqui vão ficar definidas as regras do jogo.
// A classe ChessMatch define as dimensões do tabuleiro e chama o método que configura as peças iniciais.

package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8); // Cria um tabuleiro de xadrez 8x8
    }

    // Estou trabalhando com camadas. A "piece" da classe Board é a peça do tabuleiro em si, por isso é privada.
    // Essa "ChessPiece" é a peça de xadrez que o programa principal vai ver — apenas a camada de xadrez, e não o tabuleiro.
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; // Cria uma matriz de peças de xadrez com o tamanho do tabuleiro
 
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j); // aqui ele vai ler como peça de xadrez
            }
        }

        return mat; //retorna a matriz de peças de xadrez
    }
}
