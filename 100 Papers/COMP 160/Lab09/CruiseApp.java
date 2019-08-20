/** application class for Customer.java
  * Lab 9 COMP160
  */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CruiseApp{
  //Datafields:
  static DecimalFormat df = new DecimalFormat("#.0"); // Creates Decimal Format instance with 1 decimal place limit
  static int count = 0;
  static ArrayList<String> bookedCustomers = new ArrayList<String>(); //Creates static Arraylist
  /** Main method which sets up a set of customers
    * Chucks each customer into a list for iteration
    * Runs confirmBooking method and showBooked method
    */
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    
    Customer[] customers = new Customer[8]; //Each Customer is put into the list for iteration
    customers[0] = customer1;
    customers[1] = customer2;
    customers[2] = customer3;
    customers[3] = customer4;
    customers[4] = customer5;
    customers[5] = customer6;
    customers[6] = customer7;
    customers[7] = customer8;  
    
    while (count != customers.length){ //Iterating through list
      confirmBooking(customers[count]); //Calls confirm booking method
      count = count + 1;
    }
    showBooked();
  }// end method
  
  /** Retrieves the information about a certain customer
    * Uses the support class customer.java to gain specific information about a customer 
    * Takes user input to see if you want to book them or not
    * If they are booked they are added to an arraylist for later use
    * */
  public static void confirmBooking (Customer customer){
    //Local Variables:
    boolean check = false;
    Scanner sc = new Scanner(System.in);
    //Print out each customers information
    System.out.println (customer.getName() + "\nTicket price:" + df.format(customer.getTicket()) + "\nMeal price:" + df.format(customer.getMeal()) + "\nTotal price:" + df.format(customer.getTotal()));
    System.out.println("Confirm booking for " + customer.getName() + "(Y/N)");
    String book = sc.nextLine();
    while (check != true){ //Check whether we want to save the customers booking or not
      if (book.toUpperCase().equals("Y")){
        bookedCustomers.add(customer.getName()); // Adds booked customers to Arraylist
        System.out.println("Booked");
        break;
      }
      if (book.toUpperCase().equals("N")){
        break;
      }
      else{ //Error testing if user didn't imput 'y' or 'n'
        System.out.println("You did not enter 'Y' or 'N', please re-enter");
        System.out.println("Confirm booking for " + customer.getName() + "(Y/N)");
        book = sc.nextLine();
      } 
    }
  }// end method
  /** Takes the customers name out of an arraylist through iteration
    * Displays the users name in print statements
    */
  public static void showBooked (){
    for(Iterator<String> i = bookedCustomers.iterator(); i.hasNext(); ) { //Iterates through Arraylist
      String bookedCustomerName = i.next();
      System.out.println(bookedCustomerName + " is booked");// Prints out the names of booked customers
    }
  }// end method
} // end class