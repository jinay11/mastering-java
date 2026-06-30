package core;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = {"1","2","3","4","5","6","7","8","9"};
        String turn = "X";
       
        while (true) {
            
            //print board
            System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("------------");
            System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("------------");
            System.out.println(board[6] + " | " + board[7] + " | " + board[8]);

            //input
            System.out.println("Player " + turn + " , enter position");
            int choice = sc.nextInt();

            //check position
            if(board[choice-1].equals("X") || board[choice-1].equals("0")){
                System.out.println("Already Failed");
                continue;
            }
            board[choice - 1] = turn;
            if (board[0].equals(board[1]) && board[1].equals(board[2])) {
                System.out.println("Player " + turn + " Wins!");
                break;
            }

            // Change turn
            if (turn.equals("X"))
                turn = "O";
            else
                turn = "X";
        }

        sc.close();

    }
}
