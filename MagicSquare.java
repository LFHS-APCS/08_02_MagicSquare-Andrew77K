
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
        int sumRow = 0;
        for( int j = 0; j < data[row].length; j++){
          sumRow += data[row][j];
        }
        
        int sumCol = 0;
        for ( int i = 0; i < data.length;i++){
          if (col < data[i].length){
            sumCol += data[i][col];
          }
        }
        
        int sumDiag1 = 0;
        for ( int k = 0; k < data.length && k < data[row].length;)

        int sumDiag2 = 0;

        if(sumCol==sumRow && sumCol==sumDiag1 && sumCol ==sumDiag2)

        return false;   // complete this method
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
