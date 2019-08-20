/**  
 * Box.java
 * Lab 7, COMP160  2017
 * Marcus Anderson
 * Stores and displays information about a Box.
 */
public class Box{
  //Initiates the Data fields
  private int height; // Height of Box
  private int width; // Width of Box
  private int length; // Length of Box
  public Box (){} //Sets default constructor
  
  /** Sets the value of the data field height to input parameter value
   *@param h height of the box */
  public void setHeight(int h){
    height = h; // end method
  }
  /** Sets the value of the data field width to input parameter value
   *@param w width of the box */
  public void setWidth(int w){
    width = w; // end method
  }
  /** Sets the value of the data field length to input parameter value
   *@param l length of the box */
  public void setLength(int l){
    length = l; // end method
  }
  
  /** Returns the value of the variable volume with input parameters
   *@param(h height, w width, l length)*/
  public int findVolume(int h, int w, int l){
    int volume = h * w * l;
    return volume; // end method
  }
  /** Returns the value of the variable surfaceArea with input parameters
   *@param(h height, w width, l length)*/
  public int findSurfaceArea(int h, int w, int l){
    int surfaceArea = (2*l*w) + (2*l*h) + (2*h*w);
    return surfaceArea; // end method
  }
  
  /** Sets the value of the data fields height,width and length to input parameter value
   *@param (h height, w width, l length) */
  public Box(int h, int w, int l){
     height = h;
     width = w;
     length = l;
  }// end method
  /** Sets the value of the data fields height,width and length to input parameter value
   *@param (b Box Value) */
  public Box(int b){
     height = b;
     width = b;
     length = b;
  }// end method
  
  //Sets output String and returns the variable result
  public String toString(){
    String result = "Height is: " + height + ", Width is: " + width + ", Length is: " + length + ", Volume is: " + findVolume(height, width, length) + ", Surface Area is: " + findSurfaceArea(height, width, length);
    return result;
  }// end method
}// end class