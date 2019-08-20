/** 
 * Calculator.java
 * 
 * Lab 19, COMP160,  2016
 * 
 * Marcus Anderson
 * 
 * A calculator class - for SIMPLE calculations like 5 + 20 =
 * Large inputs will overload int, should convert to long 
 */
import java.util.ArrayList;

public class Calculator {  
  
  private long currentInput = 0;          //current input
  private long result;            // result of calculation
  private String returnString = "";  // keeps track of the last operator entered
  private ArrayList<String> formulaText = new ArrayList<String>();
  
  
  /** New digit entered as integer value i - moves currentInput 1 decimal place to the left and adds i in "one's column" 
    @param i a digit 
    * Has an if statement for negative numbers.
    */
  public void inDigit(int i) {
    currentInput = (currentInput * 10) + i;
  }//End Method
  
  
  /** Operator entered  + - or *   
    @param op an operator symbol, one of + - * */
    public void inOperator(String op) {
      if (currentInput != 0){
        formulaText.add(Long.toString(currentInput));
      }
      if (formulaText.get(formulaText.size() - 1).equals("+") ||
          formulaText.get(formulaText.size() - 1).equals("*")) {
      } else if (formulaText.get(formulaText.size() - 1).equals("-")) {
        if (formulaText.get(formulaText.size() - 2).equals("+") ||
            formulaText.get(formulaText.size() - 2).equals("*")) {
          formulaText.add(op);
        }
      } else {
        formulaText.add(op);
      }
      currentInput = 0;
    } //End Method
    
    
    /** Equals operation sets result to previousInput + - or * currentInput (depending on lastOperator) */
    public void inEquals() {
      formulaText.add("=");
      currentInput = result;
    }//End Method
    
    
    /** Clear operation */
    public void inClear() {
      currentInput = 0;
      result = 0;
      formulaText.clear();
    } //End Method
    
    public String getCurrentInput() {
      return Long.toString(currentInput);
    }
    
    /** returns the current result 
      * @return the current result as a string*/
    public String getArrayString() {  
      for (String s : formulaText){
        returnString += s + " ";
      }
      return returnString;
    }//End Method
    
}//End Class

