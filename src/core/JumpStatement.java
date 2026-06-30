package core;

public class JumpStatement {
	public static void main(String[] args) {

		// jump statement are used to transfer a controll from one java program to
		// another

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i + " : This is the continue statement");
		}

		// break
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i + " break statement");
		}
	}

}
