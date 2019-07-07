// Implements a 2-D array of characters
import java.util.Arrays;
public class CharMatrix
{
  // Fields:
  private char[][] grid;

  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    new CharMatrix(rows, cols, ' ');
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];
    for (char[] row : grid) {
        Arrays.fill(row, fill);
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    return grid.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return grid[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return grid[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    return grid[row][col] == ' '? true : false;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int row = row0; row <= row1; row++) {
        for(int col = col0; col <= col1; col++) {
            grid[row][col] = fill;
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    fillRect(row0, col0, row1, col1, ' ');
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int notspaces = 0;
    for (int i = 0; i < grid[row].length; ++i) {
        if (grid[row][i] != ' ') {
            notspaces++;
        }
    }
    return notspaces;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int spaces = 0;
    for (int i = 0; i < grid[col].length; ++i) {
        if (grid[i][col] == ' ') {
            spaces++;
        }
    }
    return spaces;
  }
}
