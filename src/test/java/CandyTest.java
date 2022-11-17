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
    @Test
    public void testDivide() {
        
        check(3, 15, true);
        check(3, 18, true);
        check(3, 21, true);
        check(3, 24, true);
        check(3, 27, true);
        check(27, 3, true);
        
        check(4, 16, true);
        check(4, 20, true);
        check(4, 24, true);
        check(4, 28, true);
        check(4, 32, true);
        check(32, 4, true);
        
        check(7, 0, true);
        check(0, 6, false);
        check(0, 0, false);
        check(0, 99999999, false);
        check(99999999, 99999999, true);
    }
    //# END TODO
}
//# END SKELETON
