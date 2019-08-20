/** TrafficLightApp.java
  * COMP160 Lab 18
  * Marcus Anderson 
  */
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TrafficLightApp {
  
  /** Main method which creates a JFrame and adds TrafficLightPanel.java to it
    */
  public static void main (String [] args){
    JFrame frame = new JFrame("Traffic Lights"); // create JFrame object
    frame.getContentPane().add(new TrafficLightPanel()); // add JPanel object to JFrame object
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.pack(); // wrap ("pack") JFrame object around JPanel object
    frame.setVisible(true); 
  }//End Method
}//End Class