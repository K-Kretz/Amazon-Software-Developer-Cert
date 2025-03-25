import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisorTest {
    Divisor div;

    @BeforeEach
    public void setUp(){
        div = new Divisor();
    }

    @Test
    public void testDivideTwoIntegerNumbers(){

        assertEquals(12,div.divideTwoIntegerNumbers(24,2));
    }

    @Test
    public void testDivideTwoIntegerNumbersWithDivisorZeroThrowsException(){
        assertThrows(IllegalArgumentException.class,() -> {
            div.divideTwoIntegerNumbers(12,0);
        });
    }
}
