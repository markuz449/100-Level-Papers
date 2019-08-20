/** COMP 160 Lab 11 SongApp.java
  * Marcus Anderson
  * SongApp.java is an application which has a support class Song.java
  */
public class SongApp {
  
  /** Creates new Instances of song lyrics and passes them to Song.java
    */
  public static void main (String [] args){
    Song song1 = new Song ("While my guitar gently weeps");
    song1.process();
    //System.out.println(song1.toString());
    Song song2 = new Song ("Let it be");
    song2.process();
    //System.out.println(song2.toString());
    Song song3 = new Song ("Penny Lane");
    song3.process();
  }
}