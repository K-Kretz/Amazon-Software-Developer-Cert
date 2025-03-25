import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {

    @Test
    public void testMultiplyTwoIntegers(){
        Multiplier multi = new Multiplier();
        assertEquals(10,multi.multiplyTwoIntegers(5,2));
    }
}
