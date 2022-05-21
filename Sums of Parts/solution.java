import java.io.*;
import java.util.*;

class SumParts {

  public static int[] sumParts(int[] ls) 
  {
      int arrayLength = ls.length;
      int[] returnArray = new int[arrayLength + 1];  
    
      // special case if the array is empty
      if(arrayLength == 0)
      {
        returnArray[0] = 0;
        return returnArray;
      }
      else
      {
        int[] startArray = ls;
        int sum = 0;
        
        //get the sum of all the items
        for(int s = 0; s < arrayLength; s++)
        {
          sum += ls[s];
        }
        
        //[0] is the starting sum, then decrease the sum for each iteration
        for(int i = 0; i < arrayLength; i++)
        {
          returnArray[i] += sum;
          sum = sum - ls[i];
        }
      }
    
      return returnArray;
  }
}
