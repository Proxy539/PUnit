package org.punit.assertions;

import org.punit.exception.AssertionException;

public class Assertions {

    private static final String VALUE_IS_NOT_EQUAL_MESSAGE = "actual value %s is not equal to expected value %s";
    private static final String VALUE_IS_IS_EQUAL_MESSAGE = "actual value %s is equal to expected value %s";
    private static final String VALUE_IS_TRUE_MESSAGE = "value %s is true";
    private static final String VALUE_IS_FALSE_MESSAGE = "value %s is false";

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new AssertionException(String.format(VALUE_IS_NOT_EQUAL_MESSAGE, actual, expected));
        }
    }

    public static void assertEquals(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            throw new AssertionException(String.format(VALUE_IS_NOT_EQUAL_MESSAGE, actual, expected));
        }
    }

    public static void assertNotEquals(int actual, int expected) {
        if (actual == expected) {
            throw new AssertionException(String.format(VALUE_IS_IS_EQUAL_MESSAGE, actual, expected));
        }
    }

    public static void assertNotEquals(Object actual, Object expected) {
        if (actual.equals(expected)) {
            throw new AssertionException(String.format(VALUE_IS_IS_EQUAL_MESSAGE, actual, expected));
        }
    }

    public static void assertTrue(boolean value) {
        if (value != true) {
            throw new AssertionException(String.format(VALUE_IS_FALSE_MESSAGE, value));
        }
    }

    public static void assertFalse(boolean value) {
        if (value != false) {
            throw new AssertionException(String.format(VALUE_IS_TRUE_MESSAGE, value));
        }
    }
}
