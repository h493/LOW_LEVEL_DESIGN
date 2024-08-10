package INTERVIEW_QUESTION.TICTACTOE.Model;

public class Player {
    public String name;
    public PeiceType pieceType;

    public Player(String name, PeiceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeiceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PeiceType pieceType) {
        this.pieceType = pieceType;
    }
}
