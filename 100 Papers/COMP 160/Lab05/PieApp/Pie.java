import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2017 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,200));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      //your pie chart code goes here
      final int HorizMid = 150;
      final int Vertmid = 100;
      final int arcAngle = 45;
      page.setColor (Color.black);
      page.fillArc(HorizMid  - 75, Vertmid - 95, 180, 180, 0, arcAngle);
      page.setColor (Color.green);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + arcAngle, arcAngle);
      page.setColor (Color.cyan);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 2), arcAngle);
      page.setColor (Color.magenta);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 3), arcAngle);
      page.setColor (Color.yellow);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 4), arcAngle);
      page.setColor (Color.blue);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 5), arcAngle);
      page.setColor (Color.red);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 6), arcAngle);
      page.setColor (Color.orange);
      page.fillArc(HorizMid  - 90, Vertmid  - 90, 180, 180, 0 + (arcAngle * 7), arcAngle);
    }
}
