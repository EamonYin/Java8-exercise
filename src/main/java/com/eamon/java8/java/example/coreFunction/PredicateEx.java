package com.eamon.java8.java.example.coreFunction;

import org.junit.Test;

import java.util.function.Predicate;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 17:20
 */
public class PredicateEx {
    /**
     * Predicate<T> 断定型接
     * 确定类型为T的对象是否满足某约束，并返回boolean 值。包含方法
     * boolean test(T t);
     */
    public Boolean PredicateTestMethod(Predicate<String> predicate, String str) {
        return predicate.test(str);
    }

    @Test
    public void PredicateTest() {
        Boolean flag = PredicateTestMethod(str -> {
            if (str.length() > 0) {
                return true;
            } else {
                return false;
            }
        }, "我是Predicate的测试");

        System.out.println(flag);
    }


}
