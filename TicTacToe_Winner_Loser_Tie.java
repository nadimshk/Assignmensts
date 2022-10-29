package Assignments;

import java.util.Scanner;

public class TicTacToe_Winner_Loser_Tie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        String[][] arr= new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.next();
            }
        }

        int countX=0;
        int countO=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j].equals("x")){
                    countX++;
                }
                else {
                    countO++;
                }
            }
        }

        if (countX>countO){
            System.out.println("x");
        }
        else if (countO>countX){
            System.out.println("o");
        }
        else {
            System.out.println("Tie");
        }
    }
}
