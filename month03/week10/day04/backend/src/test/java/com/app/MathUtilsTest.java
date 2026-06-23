package nippon_spring_2026.month03.week10.day04.backend.src.test.java.com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    public void testFactorialMethod(){
        MathUtils math = new MathUtils();
        assertEquals(2, math.factorial(2));
    }

    @Test
    public void testisPrimeMethod(){
        MathUtils math = new MathUtils();
        assertTrue(MathUtils.isPrime(2));
        assertFalse(MathUtils.isPrime(5));
    }

    @Test
    public void testGcdMethod(){
        MathUtils math = new MathUtils();
        assertEquals(4, math.gcd(5, 8));
    }

    @Test
    public void testAverageMethod(){
        assertEquals(3.0, MathUtils.average(new int[]{1, 2, 3, 4, 5}), 0.001);
        assertEquals(5.0, MathUtils.average(new int[]{5}), 0.001);
    }

}
