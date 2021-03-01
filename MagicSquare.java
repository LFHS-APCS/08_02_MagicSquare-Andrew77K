
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
        int row = 0;
        int sumRow = 0;
        for( int j = 0; j < array[row].length; j++){
          sumRow += array[row][j];
          
        }
        
        int col = 0;
        int sumCol = 0;
        for ( int i = 0; i < array.length;i++){
          if (col < array[i].length){
            sumCol += array[i][col];
          }
        }
        
        int sumDia = 0;
        for ( int k = 0; k < array.length && k < array[row].length;){

        }

        int sumGonal = 0;

        if(sumCol==sumRow && sumCol==sumDia && sumCol ==sumGonal){
          return true;
        } else {
          return false;   // complete this method
        }
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
