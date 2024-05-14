package ict.epai.m526;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void constructorRectangleImpl() {
        double length = 3;
        double width = 4;
        RectangleImpl r = new RectangleImpl(length, width);
        assertEquals(length, r.getLength());
        assertEquals(width, r.getWidth());
    }
}
