package edu.fsu.coe.FeedbackPalette;


import java.util.*;

/**
 * Class Document
 */
public class Document {

  //
  // Fields
  //
  /**
   * Set of keywords for the document.
   */
  SortedSet<String> keywords= NULL;
  
  //
  // Constructors
  //
  public Document () { 
    keywords = new TreeSet<String>();
    
    };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //
  public SortedSet<String> getKeywords(){
      return(keywords);
  }

  //
  // Other methods
  //
  
  public boolean addKeyword(String newKeyword) {
    return(keywords.add(newKeyword));
  }
  public void clearKeywords() {
    keywords.clear();
  }
  public boolean hasKeyword(String key){

      return(keywords.contains(key));
  }
  public boolean removeKeyword(String key) {
      keywords.remove(key);
  }
// add, addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray
}
