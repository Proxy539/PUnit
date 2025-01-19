package org.punit;

import org.punit.annotation.Test;
import org.punit.classfinder.ClassFinder;
import org.punit.classfinder.ClassFinderImpl;
import org.punit.exception.AssertionException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class PUnit {
    public static void main(String[] args) throws Exception {

        ClassFinder classFinder = new ClassFinderImpl();
        Class<?> testClass = classFinder.findClass("org.punit.TestClass");

        Constructor<?> defaultConstructor = testClass.getConstructor();
        Object testObject = defaultConstructor.newInstance();

        Method[] classMethods = testClass.getMethods();

        List<Method> methods = Arrays.stream(classMethods)
                .filter(method -> method.isAnnotationPresent(Test.class))
                .toList();

        for (Method method : methods) {

            try {
                method.invoke(testObject);
            } catch (InvocationTargetException exception) {
                Throwable targetException = exception.getTargetException();

                System.out.println("Test " + method.getName() + " failed. Message: " + targetException.getMessage());
            }
        }


    }
}
