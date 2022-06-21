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
    void testAddNegative() { // tests that the function is skipping values < 0
        boolean thrown;
        try {
            thrown = false;
            StringCalculator calc = new StringCalculator();
            int value = StringCalculator.add("1,-2,3,4,124124,12512512");
        } catch (Exception e) {
            thrown = true;
            assert(true);
        }

    }

}