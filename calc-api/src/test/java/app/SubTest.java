package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SubTest {
    Subtracao sub;

    @BeforeEach
    public void setup() {
        sub = new Subtracao();
    }

    @Test
    public void testsub_success() {
        assertEquals(0, sub.sub("2", "2"));
    }

    @Test
    public void testsub_entradaLetra() {
        assertThrows(IllegalArgumentException.class, () -> {
            sub.sub("3", "a");
        });
    }
}