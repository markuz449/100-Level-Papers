/** 
 * Calculator.java
 * Lab 25, COMP160,  2016
 * Marcus Anderson
 * A calculator class - for SIMPLE calculations like 5 + 20 =
 * Large inputs will overload int, should convert to long 
 */


public class Calculator {  
  
  private long currentInput = 0;          //current input
  private long previousInput = 0;         // previous input
  private long result;            // result of calculation
  private String lastOperator = "";  // keeps track of the last operator entered
  private boolean negativeOperator = false;
  
  
  /** New digit entered as integer value i - moves currentInput 1 decimal place to the left and adds i in "one's column" 
    @param i a digit 
    * Has an if statement for negative numbers.
    */
  public void inDigit(int i) {
    if (lastOperator.equals("-") && (currentInput == 0)){
      currentInput = (currentInput * 10) + i;
      currentInput *= -1; //Changes to negative
    } else if (lastOperator.equals("-") && (currentInput != 0) && (previousInput == 0)){
      i *= -1;  //Changes to negative
      currentInput = (currentInput * 10) + i;
    } else if (lastOperator.equals("-") && (previousInput != 0)){
      i *= -1;  //Changes to negative
      currentInput = (currentInput * 10) + i;
    } else {
      currentInput = (currentInput * 10) + i;
    }
  }//End Method
  
  
  /** Operator entered  + - or *   
    @param op an operator symbol, one of + - * */
    public void inOperator(String op) {
      if (lastOperator.equals("+") && (previousInput != 0)) {
        previousInput += currentInput;      // save the new input as previous + the the new input and gets ready for the next input
        lastOperator = op;                 // remember which operator was entered
        if (op.equals("-")){
          negativeOperator = true;
          lastOperator = "+";
        }
      } else if (lastOperator.equals("-") && (previousInput != 0)) { 
        previousInput -= currentInput;     // save the new input as previous - the the new input and gets ready for the next input 
        lastOperator = op;
        if (op.equals("-")){
          negativeOperator = true;
        }
      } else if (lastOperator.equals("*") && (previousInput != 0))  {
        lastOperator = op;
        if (op.equals("-")){
          negativeOperator = true;
          lastOperator = "*";
        } else {
          previousInput *= currentInput;      // save the new input as previous * the the new input and gets ready for the next input 
        }
      } else {
        previousInput = currentInput;      // save the new input as previous to get ready for next input  
        lastOperator = op;
      }
      currentInput = 0;
    } //End Method
    
    
    /** Equals operation sets result to previousInput + - or * currentInput (depending on lastOperator) */
    public void inEquals() {
      if (lastOperator.equals("+")) {
        if (negativeOperator == true){
          result = previousInput + (currentInput * -1);
        } else {
          result = previousInput + currentInput;
        }
      } else if (lastOperator.equals("-")) {
        if (negativeOperator == true){
          result = previousInput + (currentInput * -1);
        } else {
          result = previousInput + currentInput;
        }
      } else if (lastOperator.equals("*"))  {
        if (negativeOperator == true){
          result = previousInput * (currentInput * -1);
        } else {
          result = previousInput * currentInput;
        }
      } else if (lastOperator.equals(""))  {
        result = currentInput;
      } 
      negativeOperator = false;
      lastOperator = "";       // reset last operator to "nothing"
      currentInput = result;
    }//End Method
    
    
    /** Clear operation */
    public void inClear() {
      currentInput = 0;
      previousInput = 0;
      result = 0;
      lastOperator = "";
      negativeOperator = false;
    } //End Method
    
    /** returns the current result 
      @return the current result as a string*/
      public String getResult() {  
        return Long.toString(result);  //converts int to String
      }//End Method
      
      /** returns the previous input value
        @return the previous input as a string */
        public String getPreviousInput() {
          return Long.toString(previousInput);
        }//End Method
        
        /** returns the current input value 
          @return the current input as a string */
          public String getCurrentInput() {
            return Long.toString(currentInput);
          }//End Method
          
}//End Class

