package org.punit;

import org.punit.annotation.Test;
import org.punit.assertions.Assertions;

public class TestClass {

    @Test
    public void test() {
        Assertions.assertEquals(1, 2);
    }
}
