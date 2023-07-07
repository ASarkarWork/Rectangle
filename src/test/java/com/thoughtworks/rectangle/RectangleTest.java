package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        assertThat(20, is(equalTo(new Rectangle(4, 5).area())));
    }
}