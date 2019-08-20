import java.util.Scanner;
/**  
 * BoxApp.java
 * Lab 7, COMP160  2017
 * Marcus Anderson
 */
public class BoxApp{
  public static void main (String [] args){
    Box box1 = new Box(); //Creates new instance of Box
    Scanner scan = new Scanner(System.in); //Sets the Scanner
    
    System.out.println("Please enter a height value"); //Sets the user inputs to variables and passes them to Box.java
    int userHeight = scan.nextInt();
    box1.setHeight(userHeight);
    System.out.println("Please enter a width value");
    int userWidth = scan.nextInt();
    box1.setWidth(userWidth);
    System.out.println("Please enter a length value");
    int userLength = scan.nextInt();
    box1.setLength(userLength);
    
    Box box2 = new Box(3, 4, 5); //Creates new instance of Box
    
    System.out.println("Please enter a box value"); //Sets the user inputs to variables and passes them to Box.java
    int userBox = scan.nextInt();
    Box box3 = new Box(userBox); //Creates new instance of Box
    
    //Print Statement of the returned data from Box.Java
    System.out.println(box1.toString());
    System.out.println(box2.toString());
    System.out.println(box3.toString());
  }// end method
}// end class