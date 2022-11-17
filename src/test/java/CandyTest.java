//# BEGIN SKELETON
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 *
<!--//# BEGIN TODO: Name, id, and date-->
<p><b>Tygo van den Hurk, 1705709, 17/11/2022</b></p>
<!--//# END TODO-->
 */
// -----8<----- cut line -----8<-----
public class CandyTest {

    static final Candy SUT = null; // to simplify method calls

    static final long MAX_VALUE = 999999999999999999L;

    /**
     * Checks the result of SUT.divide(k, c).
     */
    private void check(long k, long c, boolean expected) {
        System.out.println("divide(" + k + ", " + c + ")");
        long result = SUT.divide(k, c);
        System.out.println("  result = " + result);
        assertEquals(expected, 0 <= result, "possible (0 <= result)");
        if (0 <= result) {
            assertTrue(result <= MAX_VALUE, "range (result <= MAX_VALUE)");
            assertEquals(result * k, c, "quotient (result * k == c)");
        }
    }

    // Test cases

    /** The given example. */
    @Test
    public void testDivideGivenExample() {
        check(3, 15, true);
    }

    //# BEGIN TODO: Additional test cases
    
    // keeps track of how many times the myOwnCheck method has been run.
    private int timesRun = 0;
    
    /**
     * runs the method and then compares the result with,
     * the expected outcome.
     * 
     * @param k the amount of kids that want candy
     * @param c the amount of candy
     * @param expectedResult what we expect each child to get
     */
    private void myOwnCheck(long k, long c, long expectedResult){
        
        Candy instance = new Candy();
        long result = instance.divide(k, c);
        String errorMessage = "should be overwritten";
        
        // now we increase the amount of times this method has been run.
        this.timesRun++;
        
        // Gives information about the test run
        System.out.println(
            "divide method test,\n" +
            "timesRun         = " + this.timesRun + "\n" + 
            "amount of kids   = " + k + "\n" +
            "amount of candy  = " + c + "\n" +
            "result           = " + result + "\n" +
            "expectedResult   = " + expectedResult
        );
        
        // if it is less then 0, that means devicion was not possible, so we check
        if (result < 0) {
            errorMessage = messageMakerForBelowZero(expectedResult, result, k, c);
            assertEquals(expectedResult < 0, result < 0, errorMessage);
            return;
        }
        
        /*
         * if it did not said it was not possible to devide, then we ask it if the devicion
         * was at least done properly. We test the range, outcome, and the expected outcome.
         */
        errorMessage = ", k = " + k + ", c = " + c + ", result = " + result;
        assertEquals(expectedResult, result, "no equal" + errorMessage);
        assertTrue(result <= MAX_VALUE, "result > MAX_VALUE" + errorMessage);
        assertEquals(result * k, c, "result * k != c" + errorMessage);

    }
    
    private String messageMakerForBelowZero(long expectedResult, long result, long k, long c){
    
        // this should be over written. Otherwise, something is very wrong.
        String messageToReturn = "Error: something is going very wrong";
        
        if (!(expectedResult < 0) && result < 0) {
            messageToReturn = "expectedResult was less then zero, while the actual result was not";

        }
        
        if (expectedResult < 0 && !(result < 0)) {
            messageToReturn = "expectedResult was more then zero, while the actual result was not";
        }
        
        // add a little more information to the errorMessage.
        String messageToAddPart1 = ", k = " + k + ", c = " + c +", result = " + result;
        String messageToAddPart2 = ", expectedResult = " + expectedResult;
        messageToReturn = messageToReturn + messageToAddPart1 + messageToAddPart2;
        
        return messageToReturn;
    }
    
    @Test
    public void testDivide() {
        
        // test cases that should "just work"
        myOwnCheck(3, 18, 6);
        myOwnCheck(3, 21, 7);
        myOwnCheck(3, 24, 8);
        myOwnCheck(3, 25, -13);
        myOwnCheck(27, 3, 0);

        // test cases that are a little more "wonky"
        myOwnCheck(7, 0, 0);
        myOwnCheck(0, 6, -13);
        myOwnCheck(0, 0, -13);
        myOwnCheck(0, 99999999, -13);
        myOwnCheck(99999999, 99999999, 13);
    }
    //# END TODO
}
//# END SKELETON
