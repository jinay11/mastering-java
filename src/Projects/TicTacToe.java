package arrays;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] board = {
                "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9"
        };

        String currentPlayer = "X";

        for (int i = 1; i <= 9; i++) {

            // Display board
            System.out.println();

            System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("---------");
            System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("---------");
            System.out.println(board[6] + " | " + board[7] + " | " + board[8]);

            System.out.print("Player " + currentPlayer + ", choose position: ");

            int position = sc.nextInt();

            board[position - 1] = currentPlayer;

            // Check the winner
            if (checkWinner(board)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Switch player
            if (currentPlayer.equals("X")) {
                currentPlayer = "0";
            } else {
                currentPlayer = "X";
            }
        }

        sc.close();
    }

    // Check winner
    static boolean checkWinner(String[] board) {

        // Row 1
        if (board[0].equals(board[1]) && board[1].equals(board[2])) {
            return true;
        }

        // Row 2
        if (board[3].equals(board[4]) && board[4].equals(board[5])) {
            return true;
        }

        // Row 3
        if (board[6].equals(board[7]) && board[7].equals(board[8])) {
            return true;
        }

        // Column 1
        if (board[0].equals(board[3]) && board[3].equals(board[6])) {
            return true;
        }

        // Column 2
        if (board[1].equals(board[4]) && board[4].equals(board[7])) {
            return true;
        }

        // Column 3
        if (board[2].equals(board[5]) && board[5].equals(board[8])) {
            return true;
        }

        // Diagonal 1
        if (board[0].equals(board[4]) && board[4].equals(board[8])) {
            return true;
        }

        // Diagonal 2
        if (board[2].equals(board[4]) && board[4].equals(board[6])) {
            return true;
        }

        return false;
    }
}