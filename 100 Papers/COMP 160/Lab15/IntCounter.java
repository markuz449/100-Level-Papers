/** IntCounter.java COMP160 Lab 15
  * Marcus Anderson
  */
public class IntCounter {
  
  private int[] numArray;
  
  /** Constructor method which takes an int array as an input
    * Sets the data field to the input
    * Prints out each value of the array with a space between each value
    * Prints out the length of the array
    */
  public IntCounter (int[] numArray){
    this.numArray = numArray;
    System.out.println();
    for (int i = 0; i < numArray.length; i ++) {
      System.out.print(numArray[i] + "  ");
    }
    System.out.print(" Array is of length " + numArray.length);
  } // end method
  
  /** Method takes int value as an input
    * Checks the data field to see if it contains the same value as the input value
    * If it does, prints out the index position of where they are
    * If there isn't a value in the array which is the same as the input value, the method prints out that there isn't
    */
  public void showTarget (int target){
    boolean check = false; //Local variable
    for (int i = 0; i < numArray.length; i ++) {
      if (numArray[i] == target){
        System.out.print("\n  There is a " + target + " in position " + i);
        check = true; //Says that the array did contain the target
      }
    }
    if (check == false){ //If the array didn't contain the target
      System.out.print("\n  There are no " + target + "'s in this array");
    }
  } // end method
} // end class