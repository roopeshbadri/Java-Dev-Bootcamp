package Challenges;
import java.util.*;
public class ChallengeSix {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char gameBoard[][]={
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
        };
        printGame(gameBoard);  
        for(int i=0;i<9;i++){
            if(i%2==0){
                System.out.println("Turn X");
                int[] spot=askUser(gameBoard);
                gameBoard[spot[0]][spot[1]]='X';
            }
            else{
                System.out.println("Turn O");
                int[] spot=askUser(gameBoard);
                gameBoard[spot[0]][spot[1]]='O';
            }
            printGame(gameBoard); 
            int count = checkWin(gameBoard);
            if(count==3){
                System.out.println("X wins");
            }else{
                System.out.println("O wins");
            }
        } 
        
    }
    public static void printGame(char gameBoard[][]){
        System.out.println("Let's play tic tac toe!");
        for(int i=0;i<gameBoard.length;i++){
            System.out.println("\t  ");
            for(int j=0;j<gameBoard[i].length;j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static int[] askUser(char gameBoard[][]){
        System.out.print("Pick a row and a column number: ");
        int row=scan.nextInt();
        int column = scan.nextInt();
        if(gameBoard[row][column]=='X' || gameBoard[row][column]=='O' ){
            System.out.print("Spot taken, try again: ");
            row=scan.nextInt();
            column=scan.nextInt();
        }
        return new int[] {row,column};
    }
    public static int checkWin(char gameBoard[][]){
        int rows=checkRows(gameBoard);
        if(Math.abs(rows)==3) return rows;
        int columns= checkColumns(gameBoard);
        if(Math.abs(columns)==3) return columns;
        int leftDiagonal= checkLeft( gameBoard);
        if(Math.abs(leftDiagonal)==3) return leftDiagonal;
        int rightDiagonal = checkRight(gameBoard);
        if(Math.abs(rightDiagonal)==3) return rightDiagonal;
        return -1;
    }
    public static int checkRows(char[][] gameboard) {
        int count=0;
        for(int i=0;i<gameboard.length;i++){
            for(int j=0;j<gameboard[i].length;j++){
                if(gameboard[i][j]=='X'){
                    count++;
                }
                else if(gameboard[i][j]=='O'){
                    count--;
                }
            }
            if(count==3 || count == -3){
                break;
            }
            else{
                count = 0;
            }
        }
        return count;
    }
     
     
    public static int checkColumns(char[][] gameboard) {
        int count=0;
        for(int i=0;i<gameboard.length;i++){
            for(int j=0;j<gameboard.length;j++){
                if(gameboard[j][i]=='X'){
                    count++;
                }
                else{
                    count--;
                }
            }
            if(count==3 || count == -3){
                break;
            }
            else{
                count = 0;
            }
        }
        return count;
    }
     
     
    public static int checkLeft(char[][] gameboard) {
        int count=0;
        for(int i=0;i<gameboard.length;i++){
            if(gameboard[i][i]=='X'){
                count++;
            }
            else if(gameboard[i][i]=='O'){
                count--;
            }
            }
        return count;
    }
     
     
    public static int checkRight(char[][] gameboard) {
        int count=0;
        for(int i=0;i<gameboard.length;i++){
            if(gameboard[2 - i][i]=='X'){
                count++;
            }
            else if(gameboard[2 -i][i]=='O'){
                count--;
            }
            }
        return count;
    }
}
