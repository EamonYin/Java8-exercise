package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.BinaryOperator;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 19:34
 */
public class BinaryOperatorEx {

    /**
     * BinaryOperator<T> (BiFunction 子接口)
     * 对类型为T的对象进行二元运算，并返回T类型的结果。包含方法为
     * T apply(T t1, T t2);
     */
    public Integer BinaryOperatorTestMethod(BinaryOperator<Integer> binaryOperator,Integer a,Integer b){
        return binaryOperator.apply(a,b);
    }

    @Test
    public void BinaryOperatorTest(){
        Integer integer = BinaryOperatorTestMethod((x, y) -> x * y, 3, 9);
        System.out.println(integer);
    }

}
