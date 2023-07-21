package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSum() {
        Map<Integer, Integer> testCases = new HashMap<>();
        testCases.put(1, 1);
        testCases.put(3, 6);
        for ( Map.Entry<Integer, Integer> item: testCases.entrySet()) {
            assertEquals(item.getValue(), sumCalculator.sum(item.getKey()));
        }
    }

    @Test
    void sumZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}