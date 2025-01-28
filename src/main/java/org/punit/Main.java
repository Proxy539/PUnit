package org.punit;

import org.punit.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            var testClass = Class.forName("org.punit.test.TestClass");
            var testClassConstructor = testClass.getConstructor();
            var testClassObject = testClassConstructor.newInstance();

            var classMethods = testClass.getMethods();

            Arrays.stream(classMethods)
                    .filter(method -> method.isAnnotationPresent(Test.class))
                    .forEach(testMethod -> {
                        try {
                            testMethod.invoke(testClassObject);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            System.err.println(e);
                        }
                    });

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.err.println(e);
        }
    }
}