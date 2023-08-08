import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SudoMenu {
    public static void main(String[] args) throws IOException {
        SudoHistory his = new SudoHistory();
        Scanner sc = new Scanner(System.in);
        int choice;
        his.generateHistoryFile();
        his.generatePrevGamesFile();

        do{
            System.out.println("Welcome to my Sudoku Game. Choose an option to continue:\n1. Generate New Game\n2. Input a board\n3. See previous games\n4. See previous moves\n5. Quit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    SudokuGame.main(new String[]{});
                    his.writeGames(new char[][]{{'a','p'},{'a','x'}},new File("history.txt"));
                    break;
                case 2:
                    SudokuGame.takeInput();
                    his.writeGames(new char[][]{{'a','p'},{'a','x'}},new File("history1.txt"));
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
        while(choice!=5);
    }
}