/* Shape.java
 * Lab 24, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
  
  protected int x, y, width, height, red, green, blue, moveX = 1, moveY = 1;
  protected Color colour;
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
    if (y > (200 + height)){
      moveY = -1;
    }
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
  
  /**Displays the index of a shape
    */
  public void showIndex (Graphics g, int index){
    g.setColor(Color.black);
    g.drawString(Integer.toString(index), x, y);
  }//End Method
  
  /**Moves the position of the circle
    * Makes sure the circles are inside the panel
    */
  public void move(){
    if (x == 0 || y == 0){
      moveX = 1;
      moveY = 1;
    } else if (x == (400-width) || y == (400-height)){
      moveX = -1;
      moveY = -1;
    }
    if (width > 15){
      y += moveY;
    } else {
      x += moveX;
    }
    
    //Switching Colours
    if (red == 255){
      red = 0;
    } if (green == 255){
      green = 0;
    } if (blue == 255){
      blue = 0;
    }
    red += 1;
    green += 1;
    blue += 1;
    colour = new Color(red, green, blue);
  }//End Method
}//End Class
