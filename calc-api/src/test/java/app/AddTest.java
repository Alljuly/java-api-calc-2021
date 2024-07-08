package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class AddTest {
    Add add;

    @BeforeEach
    public void setup() {
        add = new Add();
    }

    @Test
    public void testAdd_success() {
        assertEquals(5, add.add("3", "2"));
    }

    @Test
    public void testAdd_entryLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            add.add("3", "a");
        });
    }
}
