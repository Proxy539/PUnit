package org.punit.runner.object;

import org.punit.annotation.Test;
import org.punit.model.TestResult;
import org.punit.runner.method.TestMethodRunner;
import org.punit.runner.method.TestMethodRunnerImpl;

import java.util.Arrays;
import java.util.List;

public class TestObjectRunnerImpl implements TestObjectRunner {

    private final TestMethodRunner testMethodRunner = new TestMethodRunnerImpl();

    @Override
    public List<TestResult> runTestObject(Object testObject) {
        var objectClass = testObject.getClass();

        var objectMethods = objectClass.getMethods();

        return Arrays.stream(objectMethods)
                .filter(method -> method.isAnnotationPresent(Test.class))
                .map(method -> testMethodRunner.runTestMethod(testObject, method))
                .toList();
    }
}
