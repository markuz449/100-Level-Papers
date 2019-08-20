/** StyleOptionsPanel.java
  * COMP160 Lab 19
  * Marcus Anderson 
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton courier, timesNewRoman, helvetica;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  private GridLayout singleColumn = new GridLayout(0,1);
  private JPanel myPanel;
  
  /** Constructor method which sets some of the data fields
    * Groups the radio buttons
    * Register the listener class to the objects
    * Adds the objects to the panel data field
    */
  public StyleOptionsPanel() {
    setLayout(singleColumn);
    
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    courier = new JRadioButton ("Courier");
    courier.setBackground (Color.cyan);
    timesNewRoman = new JRadioButton ("Times New Roman");
    timesNewRoman.setBackground (Color.cyan);
    helvetica = new JRadioButton ("Helvetica");
    helvetica.setBackground (Color.cyan);
    
    //Grouping the radio Buttons
    ButtonGroup group = new ButtonGroup();
    group.add(courier);
    group.add(timesNewRoman);
    group.add(helvetica);
    
    //Registering the listner class
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    courier.addItemListener (listener);
    timesNewRoman.addItemListener (listener);
    helvetica.addItemListener (listener);
    
    add (saying);
    add (bold);
    add (italic);
    add (courier);
    add (timesNewRoman);
    add (helvetica);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 100));
  }//End constructor method
  
  /** Listener class for both the check boxes and radio buttons
    */
  private class StyleListener implements ItemListener
  {
    //Updates the text depending on the event
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      if (courier.isSelected())
        typeFace = "Courier";
      
      if (timesNewRoman.isSelected())
        typeFace = "Times New Roman";
      
      if (helvetica.isSelected())
        typeFace = "Helvetica";
      
      saying.setFont (new Font (typeFace, style, 20));
    }//End Method
  }// End inner class
}//End Class
