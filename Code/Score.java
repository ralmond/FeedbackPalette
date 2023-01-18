
import java.util.*;


/**
 * Class Score
 */
public class Score {

  //
  // Fields
  //

  protected String name;
  protected double value;
  protected RubricScale rubric;

  public StudentDocument m_scores;
  
  //
  // Constructors
  //
  public Score () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of value
   * @param newVar the new value of value
   */
  public void setValue (double newVar) {
    value = newVar;
  }

  /**
   * Get the value of value
   * @return the value of value
   */
  public double getValue () {
    return value;
  }

  /**
   * Set the value of rubric
   * @param newVar the new value of rubric
   */
  public void setRubric (RubricScale newVar) {
    rubric = newVar;
  }

  /**
   * Get the value of rubric
   * @return the value of rubric
   */
  public RubricScale getRubric () {
    return rubric;
  }

  /**
   * Set the value of m_scores
   * @param newVar the new value of m_scores
   */
  public void setScores (StudentDocument newVar) {
    m_scores = newVar;
  }

  /**
   * Get the value of m_scores
   * @return the value of m_scores
   */
  public StudentDocument getScores () {
    return m_scores;
  }

  //
  // Other methods
  //

}
