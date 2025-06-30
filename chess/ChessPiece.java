// subclasse da classe peça aonde  vai estar os tipos das peças e etc
package chess;
import boardgame.Board;
import boardgame.Piece;
public class ChessPiece extends Piece {
private Color  color;

public ChessPiece(Board board, Color color){
super(board);// o  board repassa a chamada do construtor da superclasse peiece ou seja o construtor que criei da classe piece
this.color = color;

}
public Color getColor(){
    return color;
    // método para obter a cor da peça
}



}