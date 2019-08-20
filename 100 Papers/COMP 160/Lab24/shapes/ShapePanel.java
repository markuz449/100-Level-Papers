/* ShapePanel.java
 * Lab 24, COMP160,  2017
 * Marcus Anderson
 */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel {
  
  private ArrayList<Shape> shapes = new ArrayList <Shape>();
  private ArrayList<JButton> buttons = new ArrayList <JButton>();
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel removeLabel;
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
    JButton circle = new JButton ("Circle");
    buttons.add(circle);
    JButton square = new JButton ("Square");
    buttons.add(square);
    JButton oval = new JButton ("Oval");
    buttons.add(oval);
    JButton smiley = new JButton ("Smiley");
    buttons.add(smiley);
    JButton swirl = new JButton ("Swirl");
    buttons.add(swirl);
    JButton cartman = new JButton ("Cartman");
    buttons.add(cartman);
    JButton pikachu = new JButton ("Pikachu");
    buttons.add(pikachu);
    JButton start = new JButton ("Start");
    buttons.add(start);
    JButton stop = new JButton ("Stop");
    buttons.add(stop);
    JButton remove = new JButton ("Remove");
    buttons.add(remove);
    removeLabel = new JLabel ("Remove which?");
    showNum = new JTextField(3);
    
    for (JButton jb: buttons){
      jb.addActionListener (listener);
      controlPanel.add(jb);
    }
    drawPanel = new DrawingPanel();
    timer = new Timer (DELAY, listener);
    
    controlPanel.add(removeLabel);
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
    contentPane.setTitle("Circle Generation Lab 24");
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
      for (int i = 0; i < shapes.size(); i++){
        shapes.get(i).display(g);
        shapes.get(i).showIndex(g, i);
      } 
    }//End Method
  }//End Inner Class
  
  /** Private inner class ButtonListener
    * Creates instances of the Shape class and adds them into an arraylist
    * Adds a counter and displays it in a text field
    * Runs the timer
    * For every circle it calls the move method
    */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == timer){
        for (int i = 0; i < shapes.size(); i++){
          shapes.get(i).move();
        }
      } else {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Circle")){ 
          shapes.add(new Circle());
        }
        if (button.getText().equals("Square")){ 
          shapes.add(new Square());
        }
        if (button.getText().equals("Oval")){ 
          shapes.add(new Oval());
        }
        if (button.getText().equals("Smiley")){ 
          shapes.add(new Smiley());
        }
        if (button.getText().equals("Swirl")){ 
          shapes.add(new Swirl());
        }
        if (button.getText().equals("Cartman")){ 
          shapes.add(new Cartman());
        }
        if (button.getText().equals("Pikachu")){ 
          shapes.add(new Pikachu());
        }
        if (button.getText().equals("Start")){
          timer.start();
        }
        if (button.getText().equals("Stop")){
          timer.stop();
        }
        if (button.getText().equals("Remove")){
          if (shapes.size() == 0){
          } else {
            try 
            { /**Checks to see if an integer value is entered 
             * Or the value is in the arraylist */
              int removeIndex = Integer.valueOf(showNum.getText());
              shapes.remove(removeIndex);
            } catch (NumberFormatException exception) {
              System.out.println("Can't convert " + showNum.getText() + " to an integer");
            } catch (IndexOutOfBoundsException exception) {
              System.out.println(showNum.getText() + " does not exist");
            }
          }
        }
      }
      if (shapes.size() == 0){
        showNum.setText("");
        repaint();
      } else {
        showNum.setText(Integer.toString(shapes.size()-1));
        repaint();
      }
    }//End Method
  }//End Inner Class
}//End Class
