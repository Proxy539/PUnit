package org.punit;

import org.punit.runner.objects.TestObjectsRunnerImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var testObjectsRunner = new TestObjectsRunnerImpl();

        try {
            var testClass = Class.forName("org.punit.test.TestClass");
            var testClassConstructor = testClass.getConstructor();
            var testClassObject = testClassConstructor.newInstance();
            var testClassObjects = List.of(testClassObject);

            var testResults = testObjectsRunner.runTestObjects(testClassObjects);

            System.out.println(testResults);

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            System.err.println(e);
        }
    }
}