package com.eamon.java8.java.example.coreFunction;

import org.junit.Test;

import java.util.function.Function;

/**
 * @Author: Eamon
 * @Date: 2022/4/14 21:30
 */
public class FunctionEx {
    /**
     * Function<T, R> 函数型接口
     * 对类型为T的对象应用操作，并返回结果。结果是R类型的对象。包含方法：
     * R apply(T t);
     **/
    public String FunctionTestMethod(Function<Integer, String> fun, Integer num) {
        return fun.apply(num);
    }

    @Test
    public void FunctionTest() {
        String s = FunctionTestMethod(e -> e + "这个数字变成字符串了", 10);
        System.out.println(s);
    }
}
