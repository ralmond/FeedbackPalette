package edu.fsu.coe.FeedbackPalette;


import java.util.*;


/**
 * Class Note
 */
public class Note {

  //
  // Fields
  //

  private String label;
  private Document body;
  private Vector<String> parameters;
  private RubricScale scale;
  private int points;
  private Vector<String> tags;
  private String correctiveHeader;
  
  //
  // Constructors
  //
  public Note () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of label
   * @param newVar the new value of label
   */
  public void setLabel (String newVar) {
    label = newVar;
  }

  /**
   * Get the value of label
   * @return the value of label
   */
  public String getLabel () {
    return label;
  }

  /**
   * Set the value of body
   * @param newVar the new value of body
   */
  public void setBody (Document newVar) {
    body = newVar;
  }

  /**
   * Get the value of body
   * @return the value of body
   */
  public Document getBody () {
    return body;
  }

  /**
   * Set the value of parameters
   * @param newVar the new value of parameters
   */
  public void setParameters (Vector<String> newVar) {
    parameters = newVar;
  }

  /**
   * Get the value of parameters
   * @return the value of parameters
   */
  public Vector<String> getParameters () {
    return parameters;
  }

  /**
   * Set the value of scale
   * @param newVar the new value of scale
   */
  public void setScale (RubricScale newVar) {
    scale = newVar;
  }

  /**
   * Get the value of scale
   * @return the value of scale
   */
  public RubricScale getScale () {
    return scale;
  }

  /**
   * Set the value of points
   * @param newVar the new value of points
   */
  public void setPoints (int newVar) {
    points = newVar;
  }

  /**
   * Get the value of points
   * @return the value of points
   */
  public int getPoints () {
    return points;
  }

  /**
   * Set the value of tags
   * @param newVar the new value of tags
   */
  public void setTags (Vector<String> newVar) {
    tags = newVar;
  }

  /**
   * Get the value of tags
   * @return the value of tags
   */
  public Vector<String> getTags () {
    return tags;
  }

  /**
   * Set the value of correctiveHeader
   * @param newVar the new value of correctiveHeader
   */
  public void setCorrectiveHeader (String newVar) {
    correctiveHeader = newVar;
  }

  /**
   * Get the value of correctiveHeader
   * @return the value of correctiveHeader
   */
  public String getCorrectiveHeader () {
    return correctiveHeader;
  }

  //
  // Other methods
  //

  /**
   * Returns the corrective text to use with this note
   * @return       Document
   * @param        parameters Customizations based on the student text
   */
  public static Document get_correctitsve_tex(Vector<String> parameters = NULL)
  {
  }


}
