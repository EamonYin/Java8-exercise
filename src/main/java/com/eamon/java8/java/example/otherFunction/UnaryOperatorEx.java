package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.UnaryOperator;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 19:16
 */
public class UnaryOperatorEx {
    /**
     * UnaryOperator<T> (Function子接口)
     * 对类型为T的对象进行一元运算，并返回T类型的结果。包含方法为
     * T apply(T t);
     */
    public Integer UnaryOperatorTestMethod(UnaryOperator<Integer> unaryOperatorEx, Integer a){
        return unaryOperatorEx.apply(a);
    }

    @Test
    public void UnaryOperatorTest(){
        Integer integer = UnaryOperatorTestMethod(e -> e + 20, 10);
        System.out.println(integer);
    }

}
