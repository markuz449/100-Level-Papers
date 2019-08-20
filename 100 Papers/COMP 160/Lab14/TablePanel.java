import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {
  
  public TablePanel(){
        setPreferredSize(new Dimension(300,300));  // set size of JPanel
        JFrame frame = new JFrame();                 // create JFrame object
        frame.getContentPane().add(this);            // add JPanel object to JFrame object
        frame.pack();                                // wrap ("pack") JFrame object around JPanel object
        frame.setVisible(true);                      // set visible
    }
  
  public static void main (String [] args){
    Diner dine = new Diner (30, 40, "Manse", 6, Color.yellow);
    dine.print();
    //dine.draw();
  }
}