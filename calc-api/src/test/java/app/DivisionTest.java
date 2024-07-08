package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class DivisionTest {
    Division div;

    @BeforeEach
    public void setup() {
        div = new Division();
    }

    @Test
    public void testDiv_success() {
        assertEquals(5, div.division("10", "2"));
    }

    @Test
    public void testDiv_entryLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            div.division("3", "a");
        });
    }
}
