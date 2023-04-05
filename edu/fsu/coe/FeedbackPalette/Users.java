package edu.fsu.coe.FeedbackPalette;
import javax.swing.text.DefaultHighlighter;
import java.awt.Color;



/**
 * Enumeration class Users - write a description of the enum class here
 *
 * @author Victor A. Oguledo.
 * @version (version number or date here)
 */
public enum Users
{
    INSTUCTOR, TA, STUDENT;
    
    private String example =" ";
    //variable to highlight text
    private DefaultHighlighter.DefaultHighlightPainter highlighter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
    private String PositiveExemplar()
    {
         return example;
    }
    public void setPositiveExemplar()
    {
        
    }
    public String getNegativeExemplar()
    {
        return example;
    }
    public void setNegativeExemplar(DefaultHighlighter highlighter)
    {
        //highlights the negative example in red
        DefaultHighlighter neghighlighter= highlighter;
    }
    
}
