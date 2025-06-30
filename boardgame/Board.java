//lembrando que as peças e colunas e linhas são privadas para apenas serem acessadas pelo pacote boardgame, assim evitando erros e mantendo a programação mais estruturada.
package boardgame;
public class Board {
  private int rows; //atributos da classe
  private int columns;
  private Piece[][] pieces; // matriz de peças as peças do jogo ficam aqui

public Board(int rows, int columns){ // construtor da classe Board que recebe o número de linhas e colunas, e uma matriz de peças
this.rows = rows;
this.columns = columns;
this.pieces = new Piece[rows][columns]; // inicializa a matriz de peças com o tamanho especificado
}

public int getRows(){
    return rows;
}
public void setRows(int rows){
    this.rows = rows;
}
public int getColumns(){
    return columns;
  }
public void  setColumns(int columns){
    this.columns = columns;
}
public Piece piece(int row, int column) {
  return pieces[row][column]; // método que retorna a peça na posição especificada da matriz
}
public Piece piece(Position position) {
  return pieces[position.getRow()][position.getColum()]; // método que retorna a peça na posição especificada por um objeto Position

}






}