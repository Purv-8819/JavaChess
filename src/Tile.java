package src;

public class Tile {

  private int x;
  private int y;
  private Piece piece;

  /*
   * Initialize Tile object
   * x: x index of tile
   * y: y index of tile
   * piece: piece on tile
   */
  public Tile(int x, int y, Piece piece) {
    this.x = x;
    this.y = y;
    this.piece = piece;
  }

  public Piece getPiece() {
    return this.piece;
  }
}