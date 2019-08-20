import javax.swing.*;
import java.awt.*;

public class Diner {
  
  private int x, y, seatNum;
  private String name;
  private Color colour;
  private final int DIAMETER = 50;
  
  public Diner (int x, int y, String name, int seatName, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatName;
    this.colour = colour;
  }
  
  public void draw (Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, DIAMETER, DIAMETER);
    g.setColor(Color.black);
    g.setFont(new Font("Courier", Font.PLAIN, 8));
    g.drawString(name, x, y);
    
  }
  
  public void print (){
    System.out.println(x + " " + y + " " + name + " " + seatNum + " " + colour);
  }
}