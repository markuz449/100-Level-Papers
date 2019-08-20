/* Square.java
 * Lab 23, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import java.awt.*;

/**Creates a square at a random location
  * Has a random colour
  */
public class Square extends Shape{
  public void display (Graphics g){
    g.setColor(colour);
    g.fillRect (x, y, width, height);
  }//End Method
}