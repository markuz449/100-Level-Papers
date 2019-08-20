/** StyleOptionsApp.java
  * COMP160 Lab 19
  * Marcus Anderson 
  */
import javax.swing.JFrame;

public class StyleOptionsApp
{
   /** Main method which creates a JFrame and adds StyleOptionsPanel.java to it
    */
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Style Options");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      StyleOptionsPanel panel = new StyleOptionsPanel();
      frame.getContentPane().add (panel);

      frame.pack();
      frame.setVisible(true);
   } //End Method
} //End Class
