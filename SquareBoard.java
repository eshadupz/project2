public class SquareBoard 
{
    int size;
    XOPiece[][] board;

    /**
      * Constructor that creates an n x n board of
      * XOPieces and each XOPiece is set to an initial Token
      */ 
   
    public SquareBoard(int n, XOPiece e) 
    {
        board = new XOPiece[n][n];
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++ ) {
                setPiece(e, i, j);
            }
        }

    }
    public String toString()
    {
        String returnStr = "";
        for (int i = 0; i < board.length; i++ ) {
            for (int j = 0; j < board.length; j++ ) {
                returnStr = "[" + getPiece(i, j) + "]"; 
            }
            returnStr = "\n";
        }
        return returnStr;
    }

    /**
      * Method that prints out the board with
      * the coordinates of each slot
      * to show the users how to identify each slot
      */
    public void printBoardCoordinates()
    {
        for (int i=0; i<board.length; i++) 
        {
            for (int j=0; j<board[i].length; j++)
            {
                System.out.print("["+i+","+j+"] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
      * Sets a Token on the board with coordinates (i,j)
      */
    public boolean setPiece(XOPiece t, int i, int j)
    {
        board[i][j] = t;
        return true;
    }

    /**
      * Gets an item on the board with coordinates (i,j)
      */  
    public XOPiece getPiece(int i, int j)
    {
         return board[i][j];
    }

}