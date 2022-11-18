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
    /*
    private long rangeToTest = 10; // must be lower then: MAX_VALUE. TODO: increase to max on final
    
    @Test
    public void testToDevideNumberByNumber() {
        // for every k and every c we will test if the function works.
        for (long k = 0; k < this.rangeToTest; k++) {
            for (long c = 0; c < this.rangeToTest; c++) {
                this.check(k, c, true);
            }
        }
    }
    
    @Test
    public void testToDevideZeroByNumber() {
        // for every k we will test if the function works.
        for (long k = 0; k < this.rangeToTest; k++) {
            this.check(k, 0, true);
        }
    }
    
    @Test
    public void testToDevideNumberByZero() {
        // for every c we will test if the function works if we devide by zero.
        for (long c = 0; c < this.rangeToTest; c++) {
            this.check(0, c, false);
        }
    }
    
    @Test
    public void testToDevideZeroByZero() {
        check(0, 0, false);
    }*/
    
    /*
     * since we have now tested all the cases, but moto moto wants more, 
     * we have written these to satisfie it's appatied:
     */
    
    @Test
    public void extraCaseForMotoMoto0() {
        check(8, 4, false);
    }
        
    @Test
    public void extraCaseForMotoMoto1() {
        check(9, 18, true);
    }
        
    @Test
    public void extraCaseForMotoMoto2() {
        check(0, MAX_VALUE, false);
    }
        
    @Test
    public void extraCaseForMotoMoto3() {
        check(12, 30, false);
    }
    
    @Test
    public void extraCaseForMotoMoto4() {
        check(MAX_VALUE, 0, true);
    }
    
    @Test
    public void extraCaseForMotoMoto5() {
        check(MAX_VALUE, MAX_VALUE, true);
    }
    
    @Test
    public void extraCaseForMotoMoto6() {
        check(3, 39, true);
    }
    
    @Test
    public void extraCaseForMotoMoto7() {
        check(0, 0, true);
    }
    
    @Test
    public void extraCaseForMotoMoto8() {
        check(0, 18, false);
    }
    
    @Test
    public void extraCaseForMotoMoto9() {
        check(44, 44, true);
    }
        
    @Test
    public void extraCaseForMotoMoto10() {
        check(MAX_VALUE, 18, true);
    }
    
    @Test
    public void extraCaseForMotoMoto11() {
        check(3, MAX_VALUE, true);
    }
    
    @Test
    public void extraCaseForMotoMoto12() {
        check(MAX_VALUE - 9999, 0, true);
    }
    
    @Test
    public void extraCaseForMotoMoto13() {
        check(3, 15, true);
    }
    
    @Test
    public void extraCaseForMotoMoto14() {
        check(5, 26, false);
    }
    //# END TODO
}
//# END SKELETON
