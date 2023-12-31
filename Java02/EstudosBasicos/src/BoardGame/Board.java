package BoardGame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if ( rows < 1 || columns < 1) {
            throw new BoardExeption("Não pode criar um tabuleiro com 1 linha ou coluna apenas");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }

    public Piece piece(int rows, int columns) {
        if (!positionExists(rows, columns)) {
            throw new BoardExeption("Posição não está no tabuleiro");
        }
        return pieces[rows][columns];
    }
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardExeption("Posição não está no tabuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece (Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardExeption("Já tem uma peça nessa posição");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column){
        return row >=0 && row < rows && column >=0 && column < columns;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)) {
            throw new BoardExeption("Posição não está no tabuleiro");
        }
        return piece(position) != null;
    }

}
