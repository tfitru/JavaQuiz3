package rocks.zipcode.io.quiz3.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {

        return new String[0];
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
