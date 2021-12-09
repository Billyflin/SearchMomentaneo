package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessTest {

    @Test
    void isValid() {
        assertTrue(Access.isValid("203317638", "billy"));
    }

    @Test
    void isValid2() {
        assertFalse(Access.isValid("38", "billy"));
    }
}