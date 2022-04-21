package com.eamon.java8.java.example.streamApi.end.reduce;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/21 11:29
 */
public class reduceEx {

    /**
     * reduce(BinaryOperator b)
     * 可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
     */
    @Test
    public void reduceTest() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> reduce = integers.stream().reduce((a, b) -> {
            System.out.println("a=" + a + ",b=" + b);
            return a + b;
        });
        /**
         * 表达式被调用了4次，
         * 第一次a和b分别为stream的第一和第二个元素，
         * 因为第一次没有中间结果可以传递，
         * 所以 reduce方法实现为直接将第一个元素作为中间结果传递。
         */
        System.out.println("结果为：" + reduce.get());
    }

    /**
     * reduce(T iden, BinaryOperator b)
     * 可以将流中元素反复结合起来，得到一个值。 返回 T
     */
    @Test
    public void reduceTest2() {
        Stream<Double> limit = Stream.generate(Math::random).limit(10);
        Double reduce = limit.reduce(0.0, (x, y) -> x + y);
        System.out.println(reduce);
    }


}
