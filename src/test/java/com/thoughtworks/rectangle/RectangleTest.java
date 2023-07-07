package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        var rectangle = new Rectangle(3.14, 2.67);
        double area = rectangle.area();
        assertThat(area, is(closeTo(8.3838, 0.01)));
    }
    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthAreGiven() {
        var rectangle = new Rectangle(3.14, 2.67);
        double perimeter = rectangle.perimeter();
        assertThat(perimeter, is(closeTo(11.62, 0.01)));
    }
}