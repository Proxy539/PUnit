package org.punit;

import org.punit.runner.TestRunner;
import org.punit.runner.TestRunnerImpl;

public class PUnit {
    public static void main(String[] args) throws Exception {

        TestRunner testRunner = new TestRunnerImpl();
        testRunner.runTests("org.punit.TestClass");

    }
}
