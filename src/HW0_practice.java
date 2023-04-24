import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class HW0_practice {
    public static Scanner scanner2;
    public static void battleshipGame2() {
        // TODO: Add your code here (and add more methods).
        String boardSize = new String();
        boardSize = getBoardSize2(boardSize);
        int[] sizeOfBoard = new int[2];
        splitBoard(sizeOfBoard,boardSize);
        String battleships = new String();
        battleships  = getBattleships2(battleships);
        String[] battleships_Array = battleships.split(" ");
        int[][] battleships_Length = new int[battleships_Array.length][2];
        splitBattleships2(battleships_Length,battleships_Array);
        print_all_Ships2(battleships_Length);

    }

    public static String getBoardSize2(String boardSize) {
        System.out.println("Enter the board size");
        boardSize = scanner2.nextLine();
        return  boardSize;
    }
    public static void splitBoard(int[]arr, String boardSize){
        String[] temp = boardSize.split("X");
        arr[0] = Integer.parseInt(temp[0]);
        arr[1] = Integer.parseInt(temp[1]);
    }

    public static String getBattleships2(String battleships) {
        System.out.println("Enter the battleships size :");
        battleships = scanner2.nextLine();
        return battleships;
    }
    public static void splitBattleships2(int arr[][],String arr2[]){
        for (int i = 0 ; i < arr2.length; i++){
            String [] tempArray = arr2[i].split("X");
            int row = Integer.parseInt(tempArray[0]);
            int col = Integer.parseInt(tempArray[1]);
            arr[i][0] = row;
            arr[i][1] = col;
        }
    }
    public static void print_all_Ships2(int arr[][]){
        for (int i = 0 ; i < arr.length;i++){
            System.out.println();
            for (int j = 0 ;j < arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        scanner2 = new Scanner(System.in);
        battleshipGame2();

    }
}
