import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testAddSkip() throws Exception { // tests that the function is skipping values > 1000
        StringCalculator calc = new StringCalculator();
        int value = StringCalculator.add("1,2,3,4,124124,12512512");
        assertEquals(value, 10);
    }
    @Test
    void testAddNegative() { // tests that the function is throwing exception for negative values
        boolean thrown;
        int value = 0;
        try {
            thrown = false;
            StringCalculator calc = new StringCalculator();
            value = StringCalculator.add("1,-2,-3,-4,124124,12512512");
        } catch (Exception e) {
            thrown = true;
            assert(true);
        }
        assertEquals(value, 10);
    }
}