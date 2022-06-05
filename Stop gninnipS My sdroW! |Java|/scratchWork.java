//Attempt at first code wars kata (probably 6 hours spent from start to finish)

//________________________________________________________________//

//     //we must build out a list of the words so we can reverse the right ones
//     int letterCount = 0;
//     boolean noSpace = true;
//     String newWord = "";
//     String newString = "";
    
//     int wordFirstLetter = 0;
//     for(var j = 0; j < sentence.length(); j++)
//     {
      
//       letterCount++;
//       System.out.println("letterCount = " + letterCount + " letter: " + sentence.charAt(j));
//       System.out.println("j = " + j);
   
//       boolean spaceDetected = sentence.charAt(j) == ' ';
      
//       if(spaceDetected)
//       {
//         noSpace = false;
        
//         System.out.println("Space Deteced");
//         System.out.println("LETTERCOUNT = " + letterCount);
//         if(letterCount > 5)
//         {
//           String substring = sentence.substring(wordFirstLetter, j);
//           //int upper = previousWordLastLetter + substring.length();
//           int upper = j;
//           System.out.println("substring=" + substring +"." );
//           int lower = j - substring.length(); 
//           System.out.println("upper = " + upper);
//           System.out.println("lower = " + lower);
          
//           for(int letter = upper; letter >= lower; letter--)
//           {
//             System.out.println("sentence.charAt(letter) = |" +letter + sentence.charAt(letter) + "|");
//             newWord += sentence.charAt(letter);
//           }
//           System.out.println("newWord = |" + newWord+"|");
// //           for(int letter = j-1; letter >= previousWordLastLetter; letter--)
// //           {
// //             newWord += sentence.charAt(letter);
// //           }
        
//         }
//         else // fewer than 5 letters
//         {
//           newWord = sentence.substring(wordFirstLetter, j + 1);
//           //System.out.println("substring=" + sentence.substring(previousWordLastLetter, j) +"." );
//         }
//         System.out.println("newWord = |" + newWord+"|");
//         newString += newWord;
//         System.out.println("newString="+newString+".");
//         newWord = "";
//         wordFirstLetter = j + 1;
//         System.out.println("wordFirstLetter = " + wordFirstLetter);
//         letterCount = 0;  
//       }
      
      
      
      
      
      
      
      
      
      
      
//       // if there were no spaces
//       boolean oneWord = j == (sentence.length()-1) && noSpace;
//       if(oneWord)
//       {
        
//         if(letterCount >= 5)
//         {
//           String substring = sentence.substring(wordFirstLetter, j+1);
//           int upper = substring.length() - 1;
//           System.out.println("SUBSTRING=" + substring +"." );
//           System.out.println("upper = " + upper);
//           int lower = j - substring.length(); 
          
//           for(var letter = upper; letter > lower; letter--)
//           {
//             //newWord = sentence.substring(previousWordLastLetter, j);
//             newWord += sentence.charAt(letter);
//           }
//         }
        
        
        
//         else
//         {
//           newWord = sentence.substring(wordFirstLetter, j+1);
//         }
//         newString += newWord;
//         System.out.println("newString="+newString+".");
//       }
//       else 
//       {
//         if(j == (sentence.length()-1)) // if this is the last letter in a multiple word string
//         {
//           //newString += " ";
//           if(letterCount > 5)
//           {
          
//             String substring = sentence.substring(previousWordLastLetter, j+1);
//             //int upper = previousWordLastLetter+substring.length() + 1;
//             int upper = j;
//             System.out.println("substring=" + substring +"." );
//             int lower = j - substring.length(); 
          
          
//             for(int letter = upper; letter >= lower; letter--)
//             {
//               newWord += sentence.charAt(letter);
//               System.out.println("lower sentence.charAt(letter) = |" + sentence.charAt(letter) + "|");
//             }
//             System.out.println("newWord = " + newWord);
          
//           } 
//           else
//           {
//             newWord = sentence.substring(previousWordLastLetter, j+1);
//           }
//           System.out.println("newWord = " + newWord);
//           newString += newWord;
//         }
//       }
      
      
      
//     }
    
//     System.out.println("newString =|" + newString + "|");
    
    
//     return newString;
//   }
