package org.punit.classfinder;

public interface ClassFinder {

    Class<?> findClass(String path) throws ClassNotFoundException;
}
