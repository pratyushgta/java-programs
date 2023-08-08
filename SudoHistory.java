import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 *
 *
 */
public class SudoHistory {

    /**
     * This method generates a file that stores the history of a game that allows the Undo-Redo function in the game.
     * The file name is History.txt and is stored in the project directory
     */
    public void generateHistoryFile() throws IOException {
        File file = new File("History.txt");
    }

    /**
     * This method generates a file that stores the history of a game that allows the Undo-Redo function in the game.
     * The file name is PrevGames.txt and is stored in the project directory
     */
    public void generatePrevGamesFile(){
        File file = new File("PrevGames.txt");
    }

    /**
     * char[][] sudoku explanation:
     * 1. Index 1 and 2 are the sudoku rows and columns
     * File-file is the file object with the appropriate file name attached to it
     */
    public void writeMove(char[][] sudoku, File file, int moveNumber) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write("<MOVE "+moveNumber+">\n");
        sudoToFile(sudoku,file);
        bw.write("<<<>>>\n");
    }

    /**
     * char[][][] sudokuGames explanation:
     * 1. Index 1 is the game number
     * 2. Index 2 and 3 are the sudoku rows and columns
     */
    public void writeGames(char[][] sudokuGames, File file) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        sudoToFile(sudokuGames, file);
    }
    /**
     * char[][] sudoku explanation:
     * 1. Index 1 and 2 are the sudoku rows and columns
     * File file is the file object with the appropriate file name attached to it
     */
    public void sudoToFile(char[][] sudoku, File file) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku[i].length;j++){
                bw.write(sudoku[i][j]);
            }
            bw.newLine();
        }
        bw.close();
    }

}
