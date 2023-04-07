package edu.fsu.coe.FeedbackPalette;
import java.util.*;


/**
 * Write a description of class RubricRow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RubricRow
{
    String criteria;
    String longCriteria;
    double maxScore;
    double achievedScore;
    Note comment;
    
    public class Rating {
        public String points;
        public String description;
    }
    
    Vector<Rating> ratings;
    
    

    /**
     * Constructor for objects of class RubricRow
     */
    public RubricRow()
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
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
