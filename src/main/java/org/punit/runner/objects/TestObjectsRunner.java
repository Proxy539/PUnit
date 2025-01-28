package org.punit.runner.objects;


import org.punit.model.TestResult;

import java.util.List;

public interface TestObjectsRunner {

    List<TestResult> runTestObjects(List<Object> testObjects);
}
