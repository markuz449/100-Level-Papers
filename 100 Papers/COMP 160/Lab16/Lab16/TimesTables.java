/** TimesTables.java COMP160 Lab 16
  * Marcus Anderson
  */
public class TimesTables{
  /** Main method which prints out a the times table up to 12 x 12
    * Puts a tab space between the column
    */
  public static void main (String [] args){
    //Data fields
    int cols=12;
    int rows=12;
    int index, row = 0;
    int [] [] table = new int[rows][cols];
    
    for (int [] rowLine: table){
      System.out.println();
      index = 1;
      row += 1;
      for (int col: rowLine){
        rowLine[col] = index * row;
        index += 1;
         System.out.print("\t" +rowLine[col]);
      }
    }
  }// End Method
}// End Class