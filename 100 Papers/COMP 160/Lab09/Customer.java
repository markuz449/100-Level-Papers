/** support class for CruiseApp.java
  * Lab 9 COMP160
  */
public class Customer{
  private String name;
  private boolean child, student, booked;
  private double ticket = 56.0, meal = 30.0;
  
  /** Constructor method which sets the datafields of each customer
    */
  public Customer (String nameIn, int age, boolean studentIn){ //Constructor sets the values of a customer
    name = nameIn;
    child = isChild(age);
    student = isStudent(studentIn);
  }
  
  /** Accessor methods which are used by CruiseApp.java
    */
  public String getName(){
    return name;
  }// end method
  public boolean getChild(){
    return child;
  } // end method
  public boolean getStudent(){
    return student;
  }// end method
  
  /**Sets the ticket price for everyone, price changes for students and children
    */
  public double getTicket(){ 
    if (student == true || child == true){ 
      ticket = ticket / 2;
      return ticket;
    }else{
      ticket *= 0.8;
      return ticket;
    }
  }// end method
  
  /** Sets the meal price for everyone, price changes for students and children
    */
  public double getMeal(){ 
    if (child == true){
      meal = meal / 2;
      return meal;
    } else {
      meal *= 0.9;
      return meal;
    }
  }// end method
  /** Finds the total amount and returns the new value
    */
  public double getTotal(){
    double total = ticket + meal;
    return total;
  }// end method
 /** Checks whether the customer is a child or not
    */
  public boolean isChild (int ageIn){
    if (5 < ageIn && ageIn <= 16){
      return true;
    } else {  
      return false;
    }
  }// end method
  /** Checks whether the customer is a student or not
    */
  public boolean isStudent(boolean student){
    return student;
  }// end method
} // end class