package org.punit.runner.object;

import org.punit.model.TestResult;

import java.util.List;

public interface TestObjectRunner {

    List<TestResult> runTestObject(Object testObject);
}
