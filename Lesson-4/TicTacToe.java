/**
 * Java 1. Homework 4
 * 
 * @author ValeriyArkhipenko
 * @version 21.10.2021
 */



import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;



    public static void main(String[] args) {
        new TicTacToe().game();
    }
    TicTacToe() {
        table = new char [3][3];
        random = new Random();
        scanner = new Scanner (System.in);
    }
    
    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if ( isWin (SIGN_X)) {
                System.out.println ("You Win!");
                break;
            }
            if (isTableFull()) {
                System.out.println ("Sorry, DRAW...");
                break;
            }
            turnAi();
            if (isWin(SIGN_O)) {
                System.out.println ("Ai Win!");
                break;
            }
            if (isTableFull()) {
                System.out.println ("Sorry, DRAW");
                break;
            }
        }
        printTable();
    }
    
    
    void initTable() {
        for (int i = 0; i <3; i++){
            for (int j = 0; j <3; j++){
                table[i][j] = SIGN_EMPTY;
            }
        }
    }
    
    void printTable(){
        for (int i = 0; i <3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman(){
        int x, y;
        do {
            System.out.println("Enter (1..3) x y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid (x,y));
        table[x][y] = SIGN_X;
    }
    
    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid (x,y));
        table[x][y] = SIGN_O;
    }
    
    boolean isCellValid (int x, int y){
        if (x < 0 || x >2 || y < 0 || y >2 ){
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }
    
    boolean isWin(char ch) {
        // честно говоря, сначала не очень сумел понять, как именно делать. Потом пытался как то обойтись без повторения ch && table..
        // но не сумел.. Хотя сегодня вот показали, но это конечно пока не мой уровень. Даже позавидовал тому, как было сделано. Надеюсь тоже когда то смогу делать.
        for (int i = 0; i < 3; i++){
            if ( (table[0][i] == ch && table [1][i] == ch && table[2][i] ==ch) || (table [i][0] == ch && table [i][1] == ch && table [i][2] ==ch ))
                return true;
        }
        
        if ((table[0][0] == ch && table [1][1] == ch & table [2][2] == ch) || (table[2][0] == ch&table [1][1] == ch && table[0][2] ==  ch)) {
            return true;
        }
        return false;
    }

    
    
    boolean isTableFull() {
        for (int i = 0; i <3; i++){
            for (int j = 0; j<3; j++){
                if (table[i][j] == SIGN_EMPTY){
                    return false;
                }
            }
        }
        return true;
                
    }
}
