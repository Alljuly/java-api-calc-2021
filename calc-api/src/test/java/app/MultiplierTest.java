package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class MultiplierTest {
    Multiplier mult;

    @BeforeEach
    public void setup() {
        mult = new Multiplier();
    }

    @Test
    public void testMult_success() {
        assertEquals(6, mult.mult("3", "2"));
    }

    @Test
    public void testMul_entryLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            mult.mult("3", "a");
        });
    }
}
