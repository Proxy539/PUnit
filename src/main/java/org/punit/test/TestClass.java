package org.punit.test;

import org.punit.annotation.Test;
import org.punit.assertions.Assertions;

public class TestClass {

    @Test
    public void testAssertTruePasses() {
        Assertions.assertTrue(true, "Boolean value should be true");
    }

    @Test
    public void testAssertTrueThrowsException() {
        Assertions.assertTrue(false, "Boolean value should be true");
    }

    @Test
    public void testAssertFalsePasses() {
        Assertions.assertFalse(false, "Boolean value should be false");
    }

    @Test
    public void testAssertFalseThrowsException() {
        Assertions.assertFalse(true, "Boolean value should be false");
    }
}
