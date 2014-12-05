class CheckersMove {
 // A CheckersMove object represents a move in the game of Checkers.
 // It holds the row and column of the piece that is to be moved
 // and the row and column of the square to which it is to be moved.
 // (This class makes no guarantee that the move is legal.)

 // Position of piece to be moved.
  private int fromRow;
  private int fromCol;
 // Square it is to move to.
  private int toRow;
  private int toCol;
 // Constructor.  Just set the values of the instance variables.
  public CheckersMove(int r1,int c1, int r2, int c2)
  {
    fromRow=r1;
    fromCol=c1;
    toRow=r2;
    toCol=c2;
  }
 // Accessors
  public int getFromRow()
  {
    return fromRow;
  }
  public int getFromCol()
  {
    return fromCol;
  }
  public int getToRow()
  {
    return toRow;
  }
  public int getToCol()
  {
    return toCol;
  }
  public boolean isJump()
  {
    return Math.abs(fromRow-toRow)==2;
  }
}   // end class CheckersMove.
