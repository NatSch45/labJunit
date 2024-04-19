import org.junit.jupiter.api.Test;
import org.nathan.Calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    Calculate calculate = new Calculate();

    @Test
    void plus() {

        assertEquals(3, calculate.plus(1, 2));
        assertEquals(0, calculate.plus(-3, 3));
    }

}
