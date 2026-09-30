package arrays;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        String[] board = {
                "1","2","3",
                "4","5","6",
                "7","8","9"
        };

        String currentPlayer = "X";

        int i=1;

        while (i <= 9) {

            // Display board
            System.out.println();
            System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("---------");
            System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("---------");
            System.out.println(board[6] + " | " + board[7] + " | " + board[8]);

            //Ask a Player for position
            System.out.println("Player " + currentPlayer + " Choose the current position");
            int position = sc.nextInt();

            board[position - 1] = currentPlayer;

            //change the player
            if(currentPlayer.equals("X")) {
                currentPlayer = "O";
            }else{
                currentPlayer = "X";
            }

            i++;

        }
        sc.close();
    }

}
