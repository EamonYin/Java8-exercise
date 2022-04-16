package com.eamon.java8.java.example.coreFunction;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @Author: Eamon
 * @Date: 2022/4/14 21:23
 */
public class ConsumerEx {
    /**
     * Consumer<T> 消费型接
     * 对类型为T的对象应用操作，包含方法：
     * void accept(T t)
     */
    public void ConsumerTestMethod(Consumer<String> str) {
        str.accept("Hello world");
    }

    public void ConsumerTestMethod2(Consumer<Integer> num) {
        num.accept(10);
    }

    @Test
    public void ConsumerTest() {
        ConsumerTestMethod(e -> System.out.println(e + " Consumer"));

        ConsumerTestMethod2(e -> {
            e = e + 10;
            System.out.println(e);
        });
    }
}
