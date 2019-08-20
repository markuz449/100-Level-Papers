/** COMP160 Lab 13 anagramTest.java
  * Marcus Anderson
  */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class anagramTest {
  
  // Datafields, contains an arraylist of the alphabet
  static ArrayList<Character> alphabet = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
  static String sortString1, sortString2, tempStoreString;
  static boolean anagram;
  
  /** Main method which gets 2 pharses from the user
    * Turns those phrases into lowercase
    * Passes a phrase one at a time to sortString()
    * Retrieves the return value and prints it out
    * Compares both of the phrases to see if it is an anagram
    */
  public static void main (String [] args){
    //Local variables
    Scanner scan = new Scanner (System.in);
    String phrase1, phrase1Lower, phrase2, phrase2Lower;
    
    System.out.println("Enter first phrase");
    phrase1 = scan.nextLine();
    phrase1Lower = phrase1.toLowerCase();
    System.out.println("Enter second phrase");
    phrase2 = scan.nextLine();
    phrase2Lower = phrase2.toLowerCase();
    sortString1 = sortString(phrase1Lower); //Passes to sortString()
    sortString2 = sortString(phrase2Lower);
    System.out.println(sortString1 + " are the letters of " + phrase1 + " in order");
    System.out.println(sortString2 + " are the letters of " + phrase2 + " in order");
    if (sortString1.equals(sortString2)) { //Checks if they are an anagram
      System.out.println(phrase1 + " is an anagram of " + phrase2);
    } else {
      System.out.println(phrase1 + " isn't an anagram of " + phrase2);
    }
  } // end method
  
   /** Takes an input string from the main method
     * It then runs through the string inputed and appends the word according to the alphabet
     * returns the newly assorted string back to the main method
     */
  public static String sortString (String check){
    int alphabetIndex, phraseIndex;
    tempStoreString = ""; //Resets the datafield
    
    for (alphabetIndex = 0; alphabetIndex < alphabet.size(); alphabetIndex++) { //Runs the code for every letter in the alphabet
      for (phraseIndex = 0; phraseIndex < check.length(); phraseIndex++) { //Runs the code for every letter in the users phrase
        if (check.charAt(phraseIndex) == (alphabet.get(alphabetIndex))){ //Checks to see if the character in the users phrase is equal to the alphabet
          String appending = Character.toString(check.charAt(phraseIndex)); //converts the certain charcter into a string
          tempStoreString += appending; //adds the string to the datafield
        }
      }
    }
    return tempStoreString; //returns the datafield back to the main method
  } // end method
} // end class