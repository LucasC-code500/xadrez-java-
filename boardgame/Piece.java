// a classe peca ela tem uma posição e essa posição é do tipo "protected" porque esse tipo de posição é simples e não quero que essa posição seja visivel
package boardgame;
public class Piece{
protected Position position;
private Board board;

public  Piece(Board board) {
    this.board = board;
    this.position = null; // Inicializa a posição como nula

//eu passei o tabuleiro na hora de criar a peça para a posição de uma peça recem criada ser nula, ou seja, a peça não está em nenhuma posição específica no tabuleiro.
}
protected Board gettBoard(){
    return board;
    //metodo de controlador de acesso para obter o tabuleiro ao qual a peça pertence.
}
//só vai ter o método para o tabuleiro não ser alterado diretamente, mas sim através do construtor da peça.
// o método de acesso do tabuleiro vai ser privado para apenas classes do mesmo pacote e subclasses possam acessar o tabuleiro.
// o tabuleiro tem que ser acessado somente pelo pacote boradgame para apenas as peças assessarem o tabuleiro 
// assim permite evitar erros e a programação mais estruturada

}