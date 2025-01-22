package org.punit;

import org.punit.annotation.Test;
import org.punit.assertions.Assertions;

public class TestClass {

    @Test
    public void testNotEquals() {
        Assertions.assertNotEquals(1, 2);
    }

    @Test
    public void testEquals() {
        Assertions.assertEquals(2, 2);
    }


}
