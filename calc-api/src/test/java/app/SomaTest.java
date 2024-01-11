package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void setup() {
        soma = new Soma();
    }

    @Test
    public void testsoma_success() {
        assertEquals(5, soma.soma("3", "2"));
    }

    @Test
    public void testSoma_entradaLetra() {
        assertThrows(IllegalArgumentException.class, () -> {
            soma.soma("3", "a");
        });
    }
}
