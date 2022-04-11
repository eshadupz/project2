public class XOPiece
{
    /** enumerated type that dictates the two values of 
      * tic tac toe
      */
    public static enum XO {X, O} 

    public XO t;

    
    public XOPiece() 
    {
        t = null;
    }

    /** Constructor that creates a piece for 
      * the TicTacToe board -- either an X or O
      * See sample output.
      */
    public XOPiece(XO choice) //fix
    {
        t = choice; 
    
    }

    public String toString()
    {
        String returnString = null;
        if (t == null) {
            returnString = "aa";
        }
        else if (t == XO.X) {
            returnString = "-X-";
        }
        else {
            returnString = "-O-";
        }

        return returnString;
    }

    /** Method that checks if one XOPiece has the same XO value.
      * If the calling object has the same internal XO value as the
      * object sent as a formal parameter.
      */
    public boolean match (XOPiece piece)
    {
        if(t == piece.t) {
            return true;
        }
        return false; 
    }


}