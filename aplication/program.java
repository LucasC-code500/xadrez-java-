package aplication;
import chess.ChessMatch;
public class Program{
    public void main(String[] args) {

ChessMatch chessMatch = new ChessMatch();
UI.printBoard(chessMatch.getPieces()); //UI é user interface  e o metodo recebe a matriz de peças da partida 
        }

    }
