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
    public void testToDevideNumberByNumber(){
        // for every k and every c we will test if the function works.
        for (long k = 0; k < 100; k++) {
            for (long c = 0; c < 100; c++) {
                this.check(k, c, true);
            }
        }
    }
    
    @Test
    public void testToDevideZeroByNumber(){
                // for every k and every c we will test if the function works.
        for (long k = 0; k < 100; k++) {
            this.check(k, 0, true);
        }
    }
    
    @Test
    public void testToDevideNumberByZero(){
        // for every c we will test if the function works if we devide by zero.
        for (long c = 0; c < 100; c++) {
            this.check(0, c, false);
        }
    }
    
    @Test
    public void testToDevideZeroByZero(){
        check(0, 0, false);
    }
    //# END TODO
}
//# END SKELETON
