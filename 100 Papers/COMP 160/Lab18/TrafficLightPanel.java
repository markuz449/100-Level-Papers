/** TrafficLightPanel.java extends JPAnel
  * COMP160 Lab 18
  * Marcus Anderson 
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel {
  
  //Intialising Data Fields
  private JButton redButton, greenButton, amberButton;
  private JLabel buttonLabel, lastPressedLabel;
  public JPanel buttonPanel;
  
  /** Constructor method which creates the three buttons, one label and, one panel
    * Adds listener classes to those buttons
    * Sets the panals size and colour
    * Adds the three buttons and the label to the panel
    * Adds the panel to the JFrame
    * Sets the JFrame's size and colour
    */
  public TrafficLightPanel(){
    //Sets the datafields
    buttonLabel = new JLabel("Button Panel");
    redButton = new JButton("Red");
    amberButton = new JButton("Amber");
    greenButton = new JButton("Green");
    lastPressedLabel = new JLabel("Last Pressed");
    // Sets listeners for the buttons
    redButton.addActionListener (new ButtonListener());
    amberButton.addActionListener (new ButtonListener());
    greenButton.addActionListener (new ButtonListener());
    
    buttonPanel = new JPanel();
    buttonPanel.add(buttonLabel);
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground (Color.white);
    
    add(buttonPanel);
    add(new LightPanel());
    setPreferredSize(new Dimension(200,300));
    setBackground (Color.blue);
  }// End Constructor Method
  
  /** Private inner class ButtonListener which implements ActionListener
    * Checks where the source of the event came from
    * Then sets the text and colour depending on where the event came from
    */
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent event){
      System.out.println(event.getSource());
      if (event.getSource() == redButton){
        lastPressedLabel.setText("Red");
        buttonPanel.setBackground (Color.red);
        repaint();
      }
      if (event.getSource() == amberButton){
        lastPressedLabel.setText("Amber");
        buttonPanel.setBackground (Color.orange);
        repaint();
      }
      if (event.getSource() == greenButton){
        lastPressedLabel.setText("Green");
        buttonPanel.setBackground (Color.green);
        repaint();
      }
    }//End Method
  } //End Inner Class
  
  private class LightPanel extends JPanel{
    public LightPanel(){
      setPreferredSize(new Dimension(80,290));
      setBackground (Color.cyan);
    }//End Constructor Method
    
    public void paintComponent (Graphics g){
      super.paintComponent(g);
      g.setColor (Color.black);
      g.fillOval (20, 30, 40, 40);
      g.setColor (Color.black);
      g.fillOval (20, 90, 40, 40);
      g.setColor (Color.black);
      g.fillOval (20, 150, 40, 40);
      
      if (lastPressedLabel.getText().equals("Red")){
        g.setColor (Color.red);
        g.fillOval (20, 30, 40, 40);
      }
      if (lastPressedLabel.getText().equals("Amber")){
        g.setColor (Color.orange);
        g.fillOval (20, 90, 40, 40);
      }
      if (lastPressedLabel.getText().equals("Green")){
        g.setColor (Color.green);
        g.fillOval (20, 150, 40, 40);
      }
    }//End Method
  }//End Inner Class
}// End Outer Class