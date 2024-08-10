package INTERVIEW_QUESTION.TICTACTOE.Model;

import INTERVIEW_QUESTION.TICTACTOE.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PeiceType[][] board;

    public Board(int size){
        this.size = size;
        board = new PeiceType[size][size];
    }

    public boolean addPiece(int row, int col, PeiceType peiceType){
        if(board[row][col] != null) return false;

        board[row][col] = peiceType;
        return true;
    }

    public void printBoard(){
        for(int r=0; r<size; r++){
            for(int c=0; c<size; c++){
                if(board[r][c] != null){
                    System.out.print(board[r][c].name() + "  ");
                }else{
                    System.out.print("  ");
                }
                System.out.print("| ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

}
