package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testArea() {
        assertEquals(20, new Rectangle(4, 5).area());
    }
}