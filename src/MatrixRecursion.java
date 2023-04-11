import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class MatrixRecursion {

  private int[][] matrix;
  private int[][] dir = {
      { -1, 0 },
      { 1, 0 },
      { 0, -1 },
      { 0, 1 },
      { 1, 1 },
      { -1, -1 },
      { -1, 1 },
      { 1, -1 }
  };

  public boolean search(int[][] matrix, MatrixPosition curr, boolean[][] seen, ArrayList<MatrixPosition> path) {

    if (curr.x < 0 || curr.x >= matrix[0].length || curr.y < 0 || curr.y >= matrix.length) {
      return false;
    }

    if (seen[curr.y][curr.x]) {
      return false;
    }

    if (matrix[curr.y][curr.x] == 0) {
      return false;
    }
    seen[curr.y][curr.x] = true;
    path.add(curr);

    for (int i = 0; i < dir.length; i++) {
      int x = dir[i][0];
      int y = dir[i][1];
      MatrixPosition currPos = new MatrixPosition();
      currPos.x = curr.x + x;
      currPos.y = curr.y + y;

      if (search(matrix, currPos, seen, path)) {
        return true;
      }
    }

    return false;
  }

  public int MatrixRecursion(int[][] matrix) {

    boolean[][] seen = new boolean[matrix.length][matrix.length];
    ArrayList<MatrixPosition> path = new ArrayList<MatrixPosition>();

    Arrays.setAll(seen, i -> {
      Arrays.fill(seen[i], false);
      return seen[i];
    });
    MatrixPosition currPos = new MatrixPosition();
    currPos.x = 0;
    currPos.y = 0;
    search(matrix, currPos, seen, path);
    return path.size();

  }

}