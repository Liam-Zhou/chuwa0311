package com.chuwa.tutorial.t01_basic.generic_copy;

/**
 * @author b1go
 * @date 7/25/22 12:17 AM
 */
public class GenericClass<T> {
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
