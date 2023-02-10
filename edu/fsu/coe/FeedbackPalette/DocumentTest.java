package edu.fsu.coe.FeedbackPalette;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DocumentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DocumentTest
{
    /**
     * Default constructor for test class DocumentTest
     */
    public DocumentTest()
    {
        Document testSample;
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        testSample = new Document();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        testSample= null;
    }
    
    /**
     * Test the hasKeyword method
     */
    public boolean testHasKeyword() {
        Assertions.assertFalse(testSample.hasKeyword("PTH!!!!!!",
        "Found unexpected keyword in document");
        testSample.addKeyword("TestKeyword");
        Assertions.assertTrue(testSample.hasKeyword("TestKeyword");
        return (true);
        
    }
}
