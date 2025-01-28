package org.punit.runner.method;

import org.punit.model.TestResult;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethodRunnerImpl implements TestMethodRunner {

    @Override
    public TestResult runTestMethod(Object testObject, Method testMethod) {
        var testResult = new TestResult();
        testResult.setTestName(testMethod.getName());

        try {
            testMethod.invoke(testObject);

            testResult.setStatus(TestResult.TestStatus.PASSED);

        } catch (IllegalAccessException e) {
            testResult.setStatus(TestResult.TestStatus.FAILED);
            testResult.setFaileMessage(e.getMessage());
        } catch (InvocationTargetException e) {
            testResult.setStatus(TestResult.TestStatus.FAILED);
            testResult.setFaileMessage(e.getTargetException().getMessage());
        }

        return testResult;
    }
}
