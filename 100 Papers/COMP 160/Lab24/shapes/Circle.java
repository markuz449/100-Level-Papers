/* Circle.java
 * Lab 23, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import java.awt.*;

/**Creates a circle at a random location
  * Has a random colour
  */
public class Circle extends Shape {
  public void display (Graphics g){
    g.setColor(colour);
    g.fillOval (x, y, width, height);
  }//End Method
}