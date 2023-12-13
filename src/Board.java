package src;

public class Board {

  private Tile[][] Tiles;

  public Board() {
    this.resetBoard();
  }

  private void resetBoard() {

  }

  public Tile getTile(int x, int y) {
    return Tiles[x][y];
  }
}
