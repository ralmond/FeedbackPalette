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

public class Notereader {
    int cxtCols = 0;
    String[] cxtNames = null;
    int rubCols = 0;
    String[] rubName = null;
    int cntCols =0;
    String[] cntName = null;
    int scrCols =0;
    String[] scrNames = null;
    
    public static void main(String[] args) {
    try {
      File myObj = new File("Test.tsv");
      Notereader nr = new Notereader();
      nr.processFile(myObj);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  
  
  /**
   * Method processFile
   *
   * Reads the file and coverts to a vector of notes.
   * 
   * @param infile (java.io.File) The TSV file to read.
   * @throws FileNotFoundException -- On IO errors.
   */
  public void processFile(File infile) throws FileNotFoundException {
    Scanner myReader = new Scanner(infile);
      /* First two lines are headers, treat specially. */
      processHeaders(myReader.nextLine(),myReader.nextLine());
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        processline(data);
      }
      myReader.close();  
  }

  protected void processHeaders(String line1, String line2) {
    int i1=0;
    int i2=0;
    String[] fields1 = line1.split("\t");
    String[] fields2 = line2.split("\t");
    //Context
    if (!fields1[i1].equals("Context")) {
        throw new RuntimeException("In line 1 column "+i1+", got "+
        fields1[i1]+" but expected Context.");
    }
    //Rubric
    //Content
    //Score
      
  }
  
  
  /**
   * Method processline
   *
   * @param data A parameter
   * @return The return value
   */
  protected Note processline(String data) {
    Note result = new Note();
    String[] fields = data.split("\t");
    for (int i=0; i<fields.length; i++) {
        System.out.println(fields[i]);
    }
    return result;
  }
}



/*public class notereader
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class notereader
     */
/*    public notereader()
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
 /*   public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
*/