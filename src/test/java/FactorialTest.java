import org.testng.annotations.Test;
import ru.astondevs.lesson12_testng.Factorial;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial fac = new Factorial();
        int result = fac.getFactorial2(5);
        assertEquals(120, result);
    }
}
