
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    { 
      for (int i=0;i<array.length;i++) {
        if (array[0].length!=array[i].length) {
          return false;
        }
      }
      int sum = 0;
      for(int col = 0; col < array[0].length;col++){
        sum += array[0][col];
      }
      int newSum = 0;
      for(int row = 0; row < array.length;row++){
        for(int col = 0; col < array[0].length;col++){
          newSum += array[row][col];
        }
        if (newSum != sum){
          return false;
        }
        newSum = 0;
      }
      for(int col = 0; col < array[0].length;col++){
        for(int row = 0; row < array.length;row++){
          newSum+=array[row][col];
        }
        if (newSum!=sum) {
          return false;
        }
        newSum = 0;
      }
      for (int i=0;i<array.length;i++) {
        newSum+=array[i][i];
      }
      if (newSum!=sum) {
        return false;
      }
      newSum=0;
      for (int i=0;i<array.length;i++) {
        newSum+=array[i][array.length-i-1];
      }
      if (newSum!=sum) {
        return false;
      }
      return true;
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
