package org.punit.assertions;

import org.punit.exception.AssertionException;

public class Assertions {

    public static void assertEquals(int actual, int expected) {

        if (actual == expected) {
            return;
        } else {
            throw new AssertionException("actual value %d is not equal to expected value %d".formatted(actual, expected));
        }
    }

    public static void assertNotEquals(int actual, int expected) {
        if (actual != expected) {
            return;
        } else {
            throw new AssertionException("actual value %d is equal to expected value %d".formatted(actual, expected));
        }
    }
}
