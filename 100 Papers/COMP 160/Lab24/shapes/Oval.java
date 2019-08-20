/* Oval.java
 * Lab 23, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import java.awt.*;

public class Oval extends Shape {
  
  /**Sets new height and y value
    */
  public Oval(){
    height = 4 * width;
    y = randomRange(height, 400);
  }
  
  /**Creates a circle at a random location
  * Has a random colour
  */
  public void display (Graphics g){
    g.setColor(colour);
    g.fillOval (x, y, width, height);
  }//End Method
}