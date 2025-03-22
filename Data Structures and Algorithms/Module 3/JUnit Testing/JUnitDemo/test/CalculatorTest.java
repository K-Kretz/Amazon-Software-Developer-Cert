import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void multiplyShouldReturnProductOfTwoNumbers() {
        Calculator calc = new Calculator();
        double product = calc.multiply(2,3);
        assertEquals(6,product);
    }
}
