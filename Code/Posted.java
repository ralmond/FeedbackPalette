
import java.util.*;


/**
 * Class Posted
 */
public class Posted {

  //
  // Fields
  //

  /**
   * A pointer into the document.
   */
  private Reference anchor;
  private Person reviewer;
  private StatusEnum status;
  private Dictionary parameters;
  
  //
  // Constructors
  //
  public Posted () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of anchor
   * A pointer into the document.
   * @param newVar the new value of anchor
   */
  public void setAnchor (Reference newVar) {
    anchor = newVar;
  }

  /**
   * Get the value of anchor
   * A pointer into the document.
   * @return the value of anchor
   */
  public Reference getAnchor () {
    return anchor;
  }

  /**
   * Set the value of reviewer
   * @param newVar the new value of reviewer
   */
  public void setReviewer (Person newVar) {
    reviewer = newVar;
  }

  /**
   * Get the value of reviewer
   * @return the value of reviewer
   */
  public Person getReviewer () {
    return reviewer;
  }

  /**
   * Set the value of status
   * @param newVar the new value of status
   */
  public void setStatus (StatusEnum newVar) {
    status = newVar;
  }

  /**
   * Get the value of status
   * @return the value of status
   */
  public StatusEnum getStatus () {
    return status;
  }

  /**
   * Set the value of parameters
   * @param newVar the new value of parameters
   */
  public void setParameters (Dictionary newVar) {
    parameters = newVar;
  }

  /**
   * Get the value of parameters
   * @return the value of parameters
   */
  public Dictionary getParameters () {
    return parameters;
  }

  //
  // Other methods
  //

}
