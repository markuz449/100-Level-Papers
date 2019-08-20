/** COMP160 Lab 12 vowelCount.java
  * Marcus Anderson
  */
import java.util.Scanner;
import java.lang.*;

public class vowelCount { 
  
  /** Main method which inputs a sentence from a user
    * Then checks how many constant and vowel letters there are
    * Stores the amounts in variables
    * Displays the amount of the variables at the end of the method
    */
  public static void main (String [] args){
    char vowelCheck; //initialises the local variables
    int index = 0, vowelCount = 0, constantCount = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a sentence");
    String userSentence = scan.nextLine(); //inputs sentence from user
    System.out.println("Sentence is : " + userSentence); //prints out users sentence
    while (index < userSentence.length()){
      vowelCheck = userSentence.charAt(index); //Gets the character at the certain index 
      char vowelCheckUpper = Character.toUpperCase(vowelCheck); //Converts the char to uppercase
      switch (vowelCheckUpper){ 
        case 'A': //Cases of vowels
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          vowelCount += 1; //Adds 1 to vowels
          break;
        case 'B': //Cases of contants
        case 'C':
        case 'D':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
         constantCount += 1; //Adds 1 to contants
         break;
        default: //This operation would happen for every charchter that isn't a case. In this program this is not needed
      }
      index += 1; //Adds one to index so the iteration will get the next character in the sentence
    }
    System.out.println("Vowel Count : " + vowelCount); //Prints out the constants and vowels
    System.out.println("Constant Count : " + constantCount);
  } // end method
} // end class