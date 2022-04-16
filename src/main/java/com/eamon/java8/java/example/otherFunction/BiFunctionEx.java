package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.BiFunction;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 19:02
 */
public class BiFunctionEx {

    /**
     * BiFunction<T, U, R>
     * 对类型为 T, U参数应用操作,返回R类型的结果。包含方法为
     * R apply(T t, U u);
     */
    public String BiFunctionTestMethod(BiFunction<Integer, Integer, String> biFunction, Integer a, Integer b) {
        return biFunction.apply(a, b);
    }

    @Test
    public void BiFunctionTest() {
        String s = BiFunctionTestMethod((x, y) -> {
            Integer sum = x + y;
            String str = "两数之和为：";
            return str + sum;
        }, 10, 5);

        System.out.println(s);
    }

}
