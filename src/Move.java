package src;

public class Move {

  private Player player;
  private Tile startTile;
  private Tile endTile;
  private Piece pieceMoved;
  private Piece pieceKilled;
  private boolean castlingMove;

  public Move(Player player, Tile startTile, Tile endTile) {
    this.player = player;
    this.startTile = startTile;
    this.endTile = endTile;
    this.pieceMoved = startTile.getPiece();
  }
}
