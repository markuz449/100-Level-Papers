/** IntCounterApp.java COMP160 Lab 15
  * Marcus Anderson
  */
import java.util.Scanner;
import java.util.Random;

public class IntCounterApp {
  
  /** Main method which sets the target vaue from the user
    * Calls the makeArray() method to get an array
    * Creates an instance of the support class IntCounter.java
    * Passes the array and target value to the support class
    */
  public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
    for (int i = 0; i < 3; i++){ //Iterates through 3 times
      System.out.println("Which number do you wish to find?");
      int targetNum = scan.nextInt();
      int[] userArray = makeArray();
      IntCounter intCounter1 = new IntCounter(userArray);
      intCounter1.showTarget(targetNum);
      System.out.println("\n");
    }
    System.out.println("Finished");
  } // end method
  
  /** makeArray method returns an array of randomly generated int values
    * The array length is set between 5 and 10
    * Each value in the array is set between 0 and 4
    * Returns the array to the main method
    */
  public static int[] makeArray (){
    //Local variables
    Random generator = new Random();
    int arraySizeMax = 10, arraySizeMin = 5, valueMax = 4, valueMin = 0;
    int arrayLength = generator.nextInt(arraySizeMax - arraySizeMin + 1) + arraySizeMin;
    
    int[] numArray = new int [arrayLength];
    for (int i = 0; i < numArray.length; i ++){
      int randNum = generator.nextInt(valueMax - valueMin + 1) + valueMin;
      numArray[i] = randNum;
    }
    return numArray;
  } // end method
} // end class