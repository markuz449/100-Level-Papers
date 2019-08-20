/** Average.java COMP160 Lab 16
  * Marcus Anderson
  */
public class Average{
  /** Main method which prints out the avaerage of a two dimentional array
    */
  public static void main(String [] args){
    //Data fields
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    double sum;
    
    for (int [] rowLine: table){
      System.out.println();
      sum = 0;
      for (int col: rowLine){
        sum = sum + col;
        System.out.print(col + " ");
      }
      System.out.print("\t Average : " + (sum / rowLine.length));
    }
  }// End Method
}// End Class