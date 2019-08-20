/**  
 * Triangle.java
 * Lab 8, COMP160  2017
 * Marcus Anderson
 * Stores and creates information about a Triangle.
 */
public class Triangle{
  public Triangle (){} // Set default constructor
  private int p1x, p1y, p2x, p2y, p3x, p3y; // Initialises data fields
  private String name;
  
  public Triangle (int ord1, int ord2, int ord3, int ord4, int ord5, int ord6, String n){
    p1x = ord1; // Constructor sets the default values
    p1y = ord2;
    p2x = ord3;
    p2y = ord4;
    p3x = ord5;
    p3y = ord6;
    name = n;
  } // End constructor
  
  private double calcSide (int x1, int y1, int x2, int y2){ 
    double side = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //Calculates a side of a triangle
    return side; //returns the side double
  } // End method
  
  public double getPerimeter (){
    double side1 = calcSide(p1x, p1y, p2x, p2y); //Gets the side number and stores it
    double side2 = calcSide(p1x, p1y, p3x, p3y);
    double side3 = calcSide(p2x, p2y, p3x, p3y);
    double perimeter = side1 + side2 + side3; // Calculates the perimeter
    return perimeter;// Returns the perimeter value
} // End method
  public String getName (){ // Gets the name and returns it
    return name;
  } // End method
} // End class