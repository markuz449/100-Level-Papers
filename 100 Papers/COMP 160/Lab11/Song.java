/** COMP 160 Lab 11 Song.java
  * Marcus Anderson
  * Song.java is a support class for SongApp.java
  */
public class Song{
  private String songLine;
  
  /** Constructor sets datafield to the String which was passed by songLine.java
    */
  public Song (String sLine){
    songLine = sLine;
  }
  
  /** Accessor method which sends back the datafield songLine
    */
  public String toString (){
    return songLine;
  }
  
  /** Does a number of string manipulating operations and prints out the results
    */
  public void process (){
    System.out.println("Length is: " + songLine.length()); //Prints out the length
    int lastChar = songLine.length();
    System.out.println("Last charachter is " + songLine.charAt(lastChar - 1)); //Prints out the last character
    if (songLine.indexOf(" ") != -1){ //Checks if songLine has a space
      int space = songLine.indexOf(" ");
      if ((songLine.indexOf(" ", space + 1)) != -1){ //Checks if songLine has two spaces
        int secSpace = songLine.indexOf(" ", space + 1);
        System.out.println(songLine.substring(0, secSpace) + "\n" + songLine.substring(secSpace)); //Prints out the first two words on one line and the others on the second line
        int thirdWordFirstChar = secSpace + 1;
        System.out.println("Third word's first charachter is  " + songLine.charAt(thirdWordFirstChar)); //Prints out the first charcter of the third word
      }
    }
    System.out.println(songLine.toUpperCase()); //Prints out songLine but changed to all uppercase
    System.out.println(songLine.replaceAll("\\s", "x")); //Prints out songLine with all spaces changed to x
    System.out.println(songLine.indexOf("b")); //Prints out the index of where 'b' is
    System.out.println(songLine); //Prints out songLine
    }
}
