/** COMP160 Lab 12 integerRead.java
  * Marcus Anderson
  */
import java.util.Scanner;
public class integerRead {
  
  /** Main method which takes an input from a user
    * prints out all the mutilples of 2 between those numbers inclusive
    */
  public static void main (String [] args){
    // Creates the local variables
    Scanner scan = new Scanner(System.in);
    boolean iterate = true;
    int count = 2, total = 0;
    System.out.println("Enter an integer greater than 1"); 
    int userInt = scan.nextInt(); //Takes input from user
    while (iterate = true){ //Infinite loop
      if (userInt >= count){
        while (userInt >= count){ //Counts the multiples of 2 between the users input and 2
          total = total + count;
          count += 2;
        }
        System.out.println("Sum of even numbers between 2 and " + userInt + " inclusive is: " + total); //Prints out results
        break; //Breakes the while loop
      }
      else {
        System.out.println("Input value must not be less than 2"); //Error checking if the integer amount is out of bounds
        System.out.println("Enter an integer greater than 1");
        userInt = scan.nextInt();
      }
    }
  } //end method
} // end class