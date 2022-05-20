public class SpinWords 
{
  public String spinWords(String sentence) 
  {
//     String testString = "Hey fellow warriors";
  
//     System.out.println(sentence.length());
//     System.out.println("(0, 3) = |" + testString.substring(0, 4) + "|");
//     System.out.println("(4, 11) = |" + testString.substring(4, 11)+ "|");
//     System.out.println("(11, 19) = |" + testString.substring(11, 19)+ "|");
    
//     for(int i = 9; i >= 4; i--)
//     {
//       System.out.println(testString.charAt(i));
//     }
    
    int letterCount = 0;
    String newString = "";
    int wordFirstLetter = 0;
    String newWord = "";
    
    for(var j = 0; j < sentence.length(); j++)
    {
      letterCount++;
      boolean spaceDetected = sentence.charAt(j) == ' ';
      
      //System.out.println("j = " + j);
      System.out.println("letterCount = " + letterCount + "| sentence.charAt(" + j + ") = " + sentence.charAt(j));
      
      if(spaceDetected)
      {
        if(letterCount > 5)
        {
          for(int b = j-1; b >= wordFirstLetter; b--)
          {
            newWord += sentence.charAt(b);
          }
        } 
        else
        {
          newWord = sentence.substring(wordFirstLetter, j);
        }
        
        newString += newWord;
        newString += " ";
        newWord = "";
        wordFirstLetter = j + 1;
        letterCount = 0;
      }
      
      // end of string
      if((j + 1) == sentence.length())
      {
        if(letterCount > 5)
        {
          for(int b = j; b >= wordFirstLetter; b--)
          {
            newWord += sentence.charAt(b);
          }
        } 
        else
        {
          newWord = sentence.substring(wordFirstLetter, sentence.length());
        }
        
        newString += newWord;
      }
      
    }
    
    System.out.println("newString = " + newString);
    return newString;
 } 
 
}
