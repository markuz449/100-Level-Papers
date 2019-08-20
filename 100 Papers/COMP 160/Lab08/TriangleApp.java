/**  
 * TriangleApp.java
 * Lab 8, COMP160  2017
 * Marcus Anderson
 * Retrieves and displays information about a Triangle.
 */
import java.text.DecimalFormat;

public class TriangleApp {
  public static void main (String [] args){
    DecimalFormat df = new DecimalFormat("#.00"); // Creates Decimal Format instance with 2 decimal place limit
    
    Triangle triangle1 = new Triangle(0, 3, 3, 4, 1, 9, "A"); // Creates new triangle instance
    System.out.println("Triangle " + triangle1.getName() + " perimeter is " + df.format(triangle1.getPerimeter()) + " units"); // Displays information about triangle
    
    Triangle triangle2 = new Triangle(4, 2, 9, 4, 6, 7, "B"); // Creates new triangle instance
    System.out.println("Triangle " + triangle2.getName() + " perimeter is " + df.format(triangle2.getPerimeter()) + " units"); // Displays information about triangle
    
    Triangle triangle3 = new Triangle(0, 0, 3, 0, 3, 4, "Your triangle"); // Creates new triangle instance
    System.out.println(triangle3.getName() + " perimeter is " + df.format(triangle3.getPerimeter()) + " units"); // Displays information about triangle
    
    Triangle triangle4 = new Triangle(6, 6, 6, 4, 2, 0, "The Test case"); // Creates new triangle instance
    System.out.println(triangle4.getName() + " perimeter is " + df.format(triangle4.getPerimeter()) + " units"); // Displays information about triangle
  } // End method
} // End Class