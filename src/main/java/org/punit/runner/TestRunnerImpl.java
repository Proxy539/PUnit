package org.punit.runner;

import org.punit.annotation.Test;
import org.punit.classfinder.ClassFinder;
import org.punit.classfinder.ClassFinderImpl;
import org.punit.exception.TestRunningException;
import org.punit.model.TestResult;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunnerImpl implements TestRunner {

    private ClassFinder classFinder;

    public TestRunnerImpl() {
        this.classFinder = new ClassFinderImpl();
    }

    @Override
    public void runTests(String path) {
        try {
            Class<?> testClass = this.classFinder.findClass(path);

            Constructor<?> testClassConstructor = testClass.getConstructor();
            Object testClassInstance = testClassConstructor.newInstance();

            Method[] testClassMethods = testClass.getMethods();

            List<Method> testMethods = Arrays.stream(testClassMethods)
                    .filter(method -> method.isAnnotationPresent(Test.class))
                    .toList();

            List<TestResult> testResults = new ArrayList<>();

            for (Method testClassMethod : testMethods) {

                TestResult testResult = new TestResult();
                testResult.setTestName(testClassMethod.getName());

                try {
                    testClassMethod.invoke(testClassInstance);

                    testResult.setStatus(TestResult.TestStatus.PASSED);
                } catch (IllegalAccessException e) {
                    throw new TestRunningException(e);
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    testResult.setStatus(TestResult.TestStatus.FAILED);
                    testResult.setFaileMessage(targetException.getMessage());
                }

                testResults.add(testResult);
            }

            System.out.println("TEST RESULTS");

            testResults.forEach(System.out::println);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new TestRunningException(e);
        }
    }
}
