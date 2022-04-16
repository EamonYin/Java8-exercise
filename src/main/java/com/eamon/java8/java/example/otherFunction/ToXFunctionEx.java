package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 20:22
 */
public class ToXFunctionEx {

    /**
     * ToIntFunction<T>
     * 计算int值的函数
     */
    public Integer ToIntFunctionTestMethod(ToIntFunction<String> toIntFunction, String a) {
        return toIntFunction.applyAsInt(a);
    }

    /**
     * ToLongFunction<T>
     * 计算long值的函数
     */
    public Long ToLongFunctionTestMethod(ToLongFunction<String> toLongFunction, String a) {
        return toLongFunction.applyAsLong(a);
    }

    /**
     * ToDoubleFunction<T>
     * 计算double值的函数
     */
    public Double ToDoubleFunctionTestMethod(ToDoubleFunction<Integer> toDoubleFunction, Integer a) {
        return toDoubleFunction.applyAsDouble(a);
    }


    @Test
    public void ToXFunctionTest() {
        System.out.println("---------↓--ToInteger--↓---------");
        Integer integer = ToIntFunctionTestMethod(e -> Integer.valueOf(e), "15");
        System.out.println(integer);

        System.out.println("---------↓--ToLong--↓---------");
        Long aLong = ToLongFunctionTestMethod(l -> Long.parseLong(l), "12345654892516561");
        System.out.println(aLong);

        System.out.println("---------↓--ToDouble--↓---------");
        Double aDouble = ToDoubleFunctionTestMethod(i -> i * 1.0, 5);
        System.out.println(aDouble);
    }

}
