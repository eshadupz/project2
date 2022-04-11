public class Player 
{
//Two players will be playing -- player 1 and player 2. Each is an object of the Player class.
//Each player object should maintain the player's name and the number of wins. 
//Also, it should own its own particular XOPiece object assigned by the game logic (i.e -- driver program).
	String name; 
	XOPiece piece;
	public Player(String name, XOPiece pie) {
		this.name = name;
		this.piece = pie;
	}

	public XOPiece getPiece(){
		return this.piece;
	}

	//Player player1 = new Player;
	//Player player2 = new Player;

}

