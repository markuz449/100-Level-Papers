/**COMP 160 Lab 10 leapYear.java
  * Marcus Anderson
  * Checks whether a year is a leap year or not
  */
import java.util.Scanner;

public class leapYear {
  
  private static int year; // initialises year datafield
  
  /** Main method which iterates through a while loop 5 times
   * Takes an integer value from the user and passes it to the checkYear method
   */
  public static void main (String [] args){ 
    Scanner scan = new Scanner (System.in);
    int i = 0;
    while (i < 5){
      System.out.println ("Please enter a year");
      year = scan.nextInt();
      System.out.println(year + ": " + checkYear(year));
      i += 1;
    }
  }
  
  /** checkYear method which takes an int value as a parameter  and returns a String
    * Initialises 3 local String varaiables
    * Checks if the int 'yearIn' is a leap year and returns the correct response to year back to the main method
    */
  public static String checkYear (int yearIn){
    String trueResult = "is a leap year", 
      falseResult = "is not a leap year", 
      predateError = "predates the Gregorian calendar";
    
    if (yearIn < 1582){
      return predateError;
    }
    else if ((yearIn % 4) == 0){
      if (((yearIn % 100) == 0) && ((yearIn % 400) == 0)){
        return trueResult;
      } 
      else if ((yearIn % 100) == 0) {
        return falseResult; 
      } else {
        return trueResult;
      }
    } else {
      return falseResult;
    }
  }
}
