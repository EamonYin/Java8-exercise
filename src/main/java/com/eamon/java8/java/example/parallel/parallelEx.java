package com.eamon.java8.java.example.parallel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/29 14:17
 */
public class parallelEx {

    /**
     * 串行流
     */
    @Test
    public void sequentialTest() {

        // 通过 Stream 接口的静态方法 of() 可以获取对应的流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        // 通过 stream() 方法获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

    }

    /**
     * 并行流
     */
    @Test
    public void parallelTest() {

        // 将串行流调用 parallel() 转成并行流
        ArrayList<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream().parallel();

        // 通过 parallelStream() 获取并行的流
        ArrayList<Integer> list2 = new ArrayList<>();
        Stream<Integer> stream1 = list2.parallelStream();

    }

    @Test
    public void speedComparison() {
        // 并行计算
        long startTime = System.currentTimeMillis();
        //TODO
        long sum = LongStream.rangeClosed(1, 1000000000L).parallel().sum();
        System.out.println("并行执行耗时：" + (System.currentTimeMillis() - startTime));

        // 串行计算
        startTime = System.currentTimeMillis();
        //TODO
        long sum1 = LongStream.rangeClosed(1, 1000000000L).sum();
        System.out.println("串行执行耗时：" + (System.currentTimeMillis() - startTime));

        System.out.println("串行求和结果="+sum+"     "+"并行求和结果="+sum1);
    }

}
