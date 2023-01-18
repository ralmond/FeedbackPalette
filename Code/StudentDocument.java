
import java.util.*;


/**
 * Class StudentDocument
 */
public class StudentDocument {

  //
  // Fields
  //

  private Document body;
  private Person Author;

  public StudentDocument m_scores;
  
  //
  // Constructors
  //
  public StudentDocument () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of Author
   * @param newVar the new value of Author
   */
  public void setAuthor (Person newVar) {
    Author = newVar;
  }

  /**
   * Get the value of Author
   * @return the value of Author
   */
  public Person getAuthor () {
    return Author;
  }

  //
  // Other methods
  //

}
