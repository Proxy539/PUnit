package org.punit.runner.objects;

import org.punit.model.TestResult;
import org.punit.runner.object.TestObjectRunner;
import org.punit.runner.object.TestObjectRunnerImpl;

import java.util.ArrayList;
import java.util.List;

public class TestObjectsRunnerImpl implements TestObjectsRunner {

    private final TestObjectRunner testObjectRunner = new TestObjectRunnerImpl();

    @Override
    public List<TestResult> runTestObjects(List<Object> testObjects) {
        var testResults = new ArrayList<TestResult>();

        for (var testObject : testObjects) {
            var testObjectResult = testObjectRunner.runTestObject(testObject);

            testResults.addAll(testObjectResult);
        }

        return testResults;
    }
}
