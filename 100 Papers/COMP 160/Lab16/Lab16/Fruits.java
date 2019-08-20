/** Fruits.java COMP160 Lab 16
  * Marcus Anderson
  */
import java.util.Scanner;

public class Fruits{
  /** Main method which takes a fruit from the user
    * Then checks to see if the user can guess the fruit with the first two letters of that fruit
    */
  public static void main (String [] args){
    //Data fields
    String [] fruits= new String[3];
    Scanner scan = new Scanner(System.in);
    int count;
    
    for (count = 0; count < fruits.length; count ++){
      System.out.println("Name a fruit");
      String userFruit = scan.nextLine();
      fruits[count] = userFruit;
    }
    
    for (String indexFruit: fruits){ 
      boolean check = false;
      while (check == false){
        System.out.println("Guess what fruit I am? " + indexFruit.substring(0, 2) + "\t" + indexFruit.length() + " Letters");
        String userGuess = scan.nextLine();
        if (userGuess.equals(indexFruit)){
          System.out.println("Correct");
          check = true;
        } else{
          System.out.println("Try Again");
        }
      }  
    }
  } // End Method
}// End Class

