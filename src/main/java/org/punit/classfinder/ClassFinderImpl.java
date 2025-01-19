package org.punit.classfinder;

public class ClassFinderImpl implements ClassFinder {

    @Override
    public Class<?> findClass(String path) throws ClassNotFoundException {
        return Class.forName(path);
    }
}
