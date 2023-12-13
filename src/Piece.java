package src;

public abstract class Piece {

  private boolean white;
  private boolean killed;

  public abstract boolean canMove(Board board, Tile start, Tile end);x
}
