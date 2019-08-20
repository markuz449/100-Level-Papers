import java.awt.*;
import java.util.Random;

/* Shape.java
 * Lab 21, COMP160,  2017
 * Marcus Anderson
 */
public class Shape {
  
  private int x, y, width, height, red, green, blue;
  private Color colour;
  private Random generator = new Random();
  
  /** Default constructor which sets the datafields to random values
    */
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = randomRange(width, 400);
    y = randomRange(height, 400);
    red = randomRange(0, 255);
    green = randomRange(0, 255);
    blue = randomRange(0, 255);
    colour = new Color(red, green, blue);
  }// End Constructor
  
  /**Generates Random number and returns the value
    */
  public int randomRange(int lo, int hi){
    return generator.nextInt(hi-lo + 1) + lo;
  }//End Method
  
  /**Paints the circles depending on the datafield values.
    */
  public void display (Graphics g){
    g.setColor(colour);
    g.fillOval (x, y, width, height);
  }//End Method
}//End Class
  