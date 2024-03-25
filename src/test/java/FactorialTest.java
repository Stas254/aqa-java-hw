import org.junit.jupiter.api.Test;
import ru.astondevs.lesson12_junit.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial fac = new Factorial();
        int result = fac.getFactorial(5);
        assertEquals(120, result);
    }

}
