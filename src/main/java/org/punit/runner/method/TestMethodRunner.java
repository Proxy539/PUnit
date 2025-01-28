package org.punit.runner.method;

import org.punit.model.TestResult;

import java.lang.reflect.Method;

public interface TestMethodRunner {

    TestResult runTestMethod(Object testObject, Method testMethod);
}
