package BoardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // valor padrão ja é null
    }

    protected Board getBoard() {
        return board;
    }


}
