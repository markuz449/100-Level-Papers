/** 
 * COMP160 Lab19 CalculatorGUIApp.java
 * Marcus Anderson
 * application class for GUI Calculator front-end 
 */
import javax.swing.JFrame;

public class CalculatorGUIApp{
  /**main method - sets up JFrame*/
  public static void main(String [] args){
    JFrame frame = new JFrame("Calculator");
    frame.setContentPane(new CalculatorGUIPanel());
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }//End Method
}//End Class