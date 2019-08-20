import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
/** FilePanel.java
  * Lab 20, COMP160,  2017
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    String fileName = "LongBadData.txt";
    try {
      Scanner fileScan = new Scanner (new File(fileName));
      while ((fileScan.hasNextLine()) && (drawObjects[9] == null)) {
        String inputLine = fileScan.nextLine();
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner lineScan = new Scanner (inputLine);
          int fillOrDrawfile = lineScan.nextInt();
          int colourSelect = lineScan.nextInt();
          int x = lineScan.nextInt();
          int y = lineScan.nextInt();
          int width = lineScan.nextInt();
          int height = lineScan.nextInt();
          boolean reglangleFill;
          Color colour = new Color(0,0,0);
          
          
          if (fillOrDrawfile == 0){
            reglangleFill = false;
          } else {
            reglangleFill = true;
          }
          if (colourSelect == 1) {
            colour = Color.red;
          } else if (colourSelect == 2) {
            colour = Color.blue;
          } else if (colourSelect == 3) {
            colour = Color.green;
          }
          
          drawObjects[count] = new Rectangle(reglangleFill, colour, x, y, width, height);
          count++;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found. Check file name location");
      System.exit(1);
    }
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
