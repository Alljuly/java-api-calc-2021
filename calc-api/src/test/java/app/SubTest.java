package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SubTest {
    Subtraction sub;

    @BeforeEach
    public void setup() {
        sub = new Subtraction();
    }

    @Test
    public void testSub_success() {
        assertEquals(1, sub.sub("3", "2"));
    }

    @Test
    public void testSub_entryLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            sub.sub("3", "a");
        });
    }
}
