package org.punit.runner;

import java.lang.reflect.InvocationTargetException;

public interface TestRunner {

    void runTests(String path) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException;
}
