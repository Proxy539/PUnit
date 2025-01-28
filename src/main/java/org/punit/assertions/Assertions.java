package org.punit.assertions;

import org.punit.exception.AssertionException;

public class Assertions {

    public static void assertTrue(boolean value, String message) {
        if (!value) {
            throw new AssertionException(message);
        }
    }

    public static void assertFalse(boolean value, String message) {
        if (value) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(byte actual, byte expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(byte actual, byte expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(char actual, byte expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(char actual, char expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(boolean actual, boolean expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(boolean actual, boolean expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(int actual, int expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(int actual, int expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(long actual, long expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(long actual, long expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(float actual, float expected, double delta, String message) {
        float subtractResult = Math.abs(actual - expected);

        if (!(subtractResult < delta)) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(float actual, float expected, double delta, String message) {
        float subtractResult = Math.abs(actual - expected);

        if (!(subtractResult > delta)) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(double actual, double expected, double delta, String message) {
        double subtractResult = Math.abs(actual - expected);

        if (!(subtractResult < delta)) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(double actual, double expected, double delta, String message) {
        double subtractResult = Math.abs(actual - expected);

        if (!(subtractResult > delta)) {
            throw new AssertionException(message);
        }
    }

    public static void assertEquals(Object actual, Object expected, String message) {
        if (!actual.equals(expected)) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotEquals(Object actual, Object expected, String message) {
        if (actual.equals(expected)) {
            throw new AssertionException(message);
        }
    }

    public static void assertSame(Object actual, Object expected, String message) {
        if (actual != expected) {
            throw new AssertionException(message);
        }
    }

    public static void assertNotSame(Object actual, Object expected, String message) {
        if (actual == expected) {
            throw new AssertionException(message);
        }
    }
}
