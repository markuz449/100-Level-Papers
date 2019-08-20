/**
 * Lab 3, COMP160, 2017
 * Marcus Anderson 
 */

import java.util.Scanner;
public class Fish{
    public static void main (String [] args){
        System.out.println("Enter verse 4 text:");
        Scanner scan = new Scanner (System.in);
        String verse4 = scan.nextLine();
        printVerse1();
        printVerse2();
        String verse3 = "This one has a little star.";
        printVerse3(verse3);
        printVerse3(verse4);
    }
    /**declares a String variable called verse1 and displays it on the screen.*/
    public static void printVerse1(){
        String verse1 = "\nOne fish\nTwo fish\nRed fish\nBlue fish.\n";
        System.out.println(verse1);
    } //end printVerse1
    /**declares a String variable called verse2 and displays it on the screen.*/
    public static void printVerse2(){
        String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish.\n";
        System.out.println(verse2);
    } //end printVerse2
    /**Imputs String verse3 displays it on the screen as a new variable.*/
    public static void printVerse3(String verse){
        System.out.println("\n" + verse);
    } //end printVerse3
}// end class
    
