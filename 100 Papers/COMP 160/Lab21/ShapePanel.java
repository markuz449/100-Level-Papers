import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

/* ShapePanel.java
 * Lab 21, COMP160,  2017
 * Marcus Anderson
 */
public class ShapePanel extends JPanel {
  
  private Shape[] shapes = new Shape [20];
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private int count = 0;
  
  /**Constructor class which sets the datafields
    * Adds the datafields to the controlPanel
    * Adds the two panels to the frame
    */
  public ShapePanel(){
    controlPanel = new JPanel();
    addShape = new JButton ("Add Shape");
    countLabel = new JLabel ("Count:");
    showNum = new JTextField(3);
    addShape.addActionListener (new ButtonListener());
    drawPanel = new DrawingPanel();
    
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    add(controlPanel);
    add(drawPanel);
  }// End Constructor
  
  /**Main method which creates the frame
    */
  public static void main (String [] args){
    JFrame contentPane = new JFrame();
    contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    contentPane.getContentPane().add(new ShapePanel());
    contentPane.pack();
    contentPane.setVisible(true);
    contentPane.setTitle("Circle generation Lab 21");
  }//End Method
  
  /** Private inner class DrawingPanel
    * Displays the circles created in the drawing panel
    */
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setBackground(Color.pink);
      setPreferredSize(new Dimension(400,400));
    }// End Constructor
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (int i = 0; i < count; i++){
        shapes[i].display(g);
      } 
    }//End Method
  }//End Inner Class
  
  /** Private inner class ButtonListener
    * Creates instances of the Shape class and adds them into an array
    * Adds a counter and displays it in a text field
    */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if ((e.getSource() == addShape) && (count < shapes.length)){ 
        shapes[count] = new Shape();
        
        count ++;
      }
      showNum.setText(Integer.toString(count));
      repaint();
    }//End Method
  }//End Inner Class
}//End Class
