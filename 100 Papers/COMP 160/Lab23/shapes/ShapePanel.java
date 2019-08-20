/* ShapePanel.java
 * Lab 21, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class ShapePanel extends JPanel {
  
  private Shape[] shapes = new Shape [20];
  private JButton[] buttons = new JButton[7];
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel;
  private int count = 0;
  private ButtonListener listener = new ButtonListener();
  private Timer timer;
  private final int DELAY = 8;
  
  /**Constructor class which sets the datafields
    * Adds the buttons to an array
    * Gives the buttons listeners and adds them to the control panel
    * Adds the datafields to the controlPanel
    * Adds the two panels to the frame
    */
  public ShapePanel(){
    controlPanel = new JPanel();
    JButton circle = new JButton ("Add Circle");
    buttons[0] = circle;
    JButton square = new JButton ("Add Square");
    buttons[1] = square;
    JButton oval = new JButton ("Add Oval");
    buttons[2] = oval;
    JButton smiley = new JButton ("Add Smiley");
    buttons[3] = smiley;
    JButton swirl = new JButton ("Add Swirl");
    buttons[4] = swirl;
    JButton start = new JButton ("Start");
    buttons[5] = start;
    JButton stop = new JButton ("Stop");
    buttons[6] = stop;
    countLabel = new JLabel ("Count:");
    showNum = new JTextField(3);
    
    for (JButton jb: buttons){
      jb.addActionListener (listener);
      controlPanel.add(jb);
    }
    drawPanel = new DrawingPanel();
    timer = new Timer (DELAY, listener);
    
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
    * Runs the timer
    * For every circle it calls the move method
    */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == timer){
        for (int i = 0; i < count; i++){
          shapes[i].move();
        }
      } else {
        JButton button = (JButton) e.getSource();
        
        if ((button.getText().equals("Add Circle")) && (count < shapes.length)){ 
          shapes[count] = new Circle();
          count ++;
        }
        if ((button.getText().equals("Add Square")) && (count < shapes.length)){ 
          shapes[count] = new Square();
          count ++;
        }
        if ((button.getText().equals("Add Oval")) && (count < shapes.length)){ 
          shapes[count] = new Oval();
          count ++;
        }
        if ((button.getText().equals("Add Smiley")) && (count < shapes.length)){ 
          shapes[count] = new Smiley();
          count ++;
        }
        if ((button.getText().equals("Add Swirl")) && (count < shapes.length)){ 
          shapes[count] = new Swirl();
          count ++;
        }
        if (button.getText().equals("Start")){
          timer.start();
        }
        if (button.getText().equals("Stop")){
          timer.stop();
        }
      }
      showNum.setText(Integer.toString(count));
      repaint();
    }//End Method
  }//End Inner Class
}//End Class
