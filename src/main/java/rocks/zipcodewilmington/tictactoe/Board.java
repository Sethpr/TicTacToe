package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() { //on the off chance someone reads this, I would like to state I hate 2d arrays
        int horizontal = 0;
        int vertical = 0;
        int diagonal = 0;
        int reverseDiagonal = 0;
        for(int i = 0; i< matrix.length; i++){
            if(matrix[i][i] == 'X'){
                diagonal++;
            }
            if(matrix[i][matrix.length - i - 1] == 'X'){
                reverseDiagonal++;
            }
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] == 'X'){
                    vertical++;
                }
                if(matrix[i][j] == 'X'){
                    horizontal++;
                }
            }
            if(vertical == 3 || horizontal == 3){
                return true;
            }
            horizontal = 0;
            vertical = 0;
        }


        if(diagonal == 3 || reverseDiagonal == 3){
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        int horizontal = 0;
        int vertical = 0;
        int diagonal = 0;
        int reverseDiagonal = 0;
        for(int i = 0; i< matrix.length; i++){
            if(matrix[i][i] == 'O'){
                diagonal++;
            }
            if(matrix[i][matrix.length - i - 1] == 'O'){
                reverseDiagonal++;
            }
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] == 'O'){
                    vertical++;
                }
                if(matrix[i][j] == 'O'){
                    horizontal++;
                }
            }
            if(vertical == 3 || horizontal == 3){
                return true;
            }
            horizontal = 0;
            vertical = 0;
        }


        if(diagonal == 3 || reverseDiagonal == 3){
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if(isTie()){
            return "";
        }
        else if(isInFavorOfO()){
            return "O";
        }
        else if(isInFavorOfX()){
            return "X";
        }

        return "?";
    }

}
