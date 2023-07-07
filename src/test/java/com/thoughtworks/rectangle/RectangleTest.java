package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        var rectangle = new Rectangle(4, 5);
        int area = rectangle.area();
        assertThat(area, is(equalTo(20)));
    }
}