/* Smiley.java
 * Lab 23, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import java.awt.*;

public class Smiley extends Shape {
   
  /**Sets the datafields so that the face can be made propely
     */
  public Smiley(){
    height = 30;
    width = 30;
    x = randomRange(width, 400);
    y = randomRange(height, 400);
  }
  
  /**Makes a yellow smily face at a random position
    */
  public void display (Graphics g){
    g.setColor(Color.yellow);
    g.fillOval (x, y, width, height);
    g.setColor(Color.black);
    g.fillOval (x + 7, y + 8, 4, 4);
    g.fillOval (x + 20, y + 8, 4, 4);
    g.fillArc (x + 8, y + 10, 15, 13, 190, 160);
  }//End Method
}