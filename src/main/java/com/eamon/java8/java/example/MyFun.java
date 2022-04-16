package com.eamon.java8.java.example;

/**
 * @Author: Eamon
 * @Date: 2022/4/14 20:51
 */
@FunctionalInterface
public interface MyFun<T> {
    public T getValue(T t);
}
