import java.util.Scanner;

class TicTacToe {
	  
	public static void main(String[] args) {
		int n = 3;
		char[][] board = new char[n][n];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		Scanner s = new Scanner(System.in);
		System.out.println("Welcome! Let's play tic-tac-toe, the game where you build 3 in a row, column, or diagonal before the other player.");
		
		System.out.println("Enter player 1's name:");
		String p1 = s.nextLine();

		System.out.println("Enter player 2's name:");
		String p2 = s.nextLine();

		
		boolean play1 = true;

		boolean gWon = false;
		while(!gWon) {


			display(board);
			if(play1) {
				System.out.println(p1 + " Turn:");
			} else {
				System.out.println(p2 + " Turn:");
			}

			char c = ' ';
			if(play1) {
				c = 'X';
			} else {
				c = 'O';
			}

			int row = 0;
			int col = 0;

			while(true) {

				System.out.print("Enter a row number (0, 1, or 2): ");
				row = s.nextInt();
				System.out.print("Enter a column number (0, 1, or 2): ");
				col = s.nextInt();

				//Check if the row and col are 0, 1, or 2
				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("This position is off the bounds of the board! Try again.");
				
				//Check if the position on the board the user entered is empty (has a -) or not
				} else if(board[row][col] != '-') {
					System.out.println("Someone has already made a move at this position! Try again.");
				
				//Otherwise, the position is valid so break out of the while loop
				} else {
					break;
				}
			
			}

			board[row][col] = c;

			if(checkWin(board) == 'x') {
				System.out.println(p1 + " has won!");
				gWon = true;
			} else if(checkWin(board) == 'o') {
				System.out.println(p2 + " has won!");
				gWon = true;
			} else {

				//If neither player has won, check to see if there has been a tie (if the board is full)
				if(gameTie(board)) {
					System.out.println("It's a tie!");
					gWon = true;
				} else {
					//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
					play1 = !play1;
				}

			}

		}
		display(board);

  }

	public static void display(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	} 

	public static char checkWin(char[][] board) {

		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
				return board[i][0];
			}
		}
		for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
				return board[0][j];
			}
		}
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != ' ') {
			return board[2][0];
		}
		return ' ';

	}


	public static boolean gameTie(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}