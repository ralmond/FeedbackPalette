package edu.fsu.coe.FeedbackPalette;


/**
 * Write a description of class notereader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class notereader
{
    public static void main(String[] args) {
    try {
      File myObj = new File("EDF_4210FeedbackDatabase_-_Notes.tsv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    
    /*// instance variables - replace the example below with your own
    *private int x;

    /**
     * Constructor for objects of class notereader
     */
    /*public notereader()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /*public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    */
}
