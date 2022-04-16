package com.eamon.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/10 15:24
 */
public class lambda_exp {
//    public static void main(String[] args) {
////        String first = "Hello";
////        String second = "Hello,world";
////
//        Comparator<String> stringComparator = (first, second) -> {
//            int compare = Integer.compare(first.length(), second.length());
//            return compare;
//        };
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 10; i++) System.out.println(i);
//        };
////        System.out.println(runnable);
//
//        Arrays.sort(word,);
//
//    }
//
//    public Comparator<String> com(String first,String second){
//                (first, second) -> {
//            int compare = Integer.compare(first.length(), second.length());
//            return compare;
//        };
//    }

    @Test
    public void test(){
        String s = strHandler("\t\t\t Hello World!", (str) -> str.trim());
        System.out.println(s);
        String str = strHandler("我的名字是小名", e -> e.substring(5, 7));
        System.out.println(str);
    }

    public String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    //创建stream
    public void getStream(){
//        1）通过Collection系列集合提供的stream() 或 parallelStream()
        ArrayList<String> strings = new ArrayList<>();
        Stream<String> stream1 = strings.stream();

//        2）通过Arrays中的静态方法stream() 获取数组流
        int[] ints = new int[10];
        IntStream stream2 = Arrays.stream(ints);

//        3）通过Stream类中的静态发发of()
        Stream<String> stream3 = Stream.of("aa", "bb", "cc");

//        4）创建无限流
//        迭代
        Stream<Integer> stream4 = Stream.iterate(0, x -> x + 2);
        stream4.limit(10).forEach(System.out::println);
//        生成
        Stream<Double> stream5 = Stream.generate(() -> Math.random());
    }


}
