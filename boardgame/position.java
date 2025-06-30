package boardgame;
public class Position {
private int row;
private int colum;
//atributos privados

public Position(int row, int colum) {
    this.row = row;
    this.colum = colum;
}
// aqui eu estou criando this é o construtor da classe Position, que recebe dois parâmetros: row e colum.
public int getRow() {
    return row;
}

public int getColum() {
    return colum;
}

public void setRow(int row) {
    this.row = row;}

public void setColum(int colum) {
    this.colum = colum;
}
//criando os metodos de acesso get e set para controlara as alterações
@Override
public String toString() {
    return "Position{" +
            "row=" + row +
            ", colum=" + colum+
            '}';
}
// o metodo toString() é sobrescrito para retornar uma representação em string da posição, mostrando a linha e a coluna.
// o tooString aplica o conceito que a classe object é uma suplerclasse de todas as classes 
}
