package com.eamon.java8.java.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: Eamon
 * @Date: 2022/4/25 14:09
 */
public class jdk8Grammar {
    @Test
    public void grammarTest() {

        System.out.println("-----------------语法格式一:------------------");
        /**
         * 语法格式一：
         * 无参数，无返回值
         * () -> System.out.println("语法格式一：无参数，无返回值");
         */
        Runnable runnable = () -> System.out.println("语法格式一：无参数，无返回值");
        runnable.run();

        System.out.println("-----------------语法格式二:------------------");
        /**
         * 语法格式二:
         * Lambda 表达式的参数列表的数据类型可以省略不写，
         * 因为JVM编译器通过上下文推断出，数据类型，即“类型推断”
         */
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("↓【一般写法】↓");
        ints.forEach((Integer x) -> System.out.println(x));
        System.out.println("↓【类型推断】↓");
        ints.forEach((x) -> System.out.println(x));

        System.out.println("-----------------语法格式三:------------------");
        /**
         * 语法格式三：
         * 有一个参数，并且无返回值
         * (x) -> System.out.println(x)
         */
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        integers.forEach((x) -> System.out.println(x));

        System.out.println("-----------------语法格式四:------------------");
        /**
         * 语法格式四：
         * 若只有一个参数，小括号可以省略不写
         * x -> System.out.println(x)
         */
        integers.forEach(x -> System.out.println(x));

        System.out.println("-----------------语法格式五:------------------");
        /**
         * 语法格式五：
         * 有两个以上的参数且有返回值，Lambda 体中若只有一条语句，
         * return 可以省略不写
         */
        List<Integer> nums1 = Arrays.asList(12829, 298, 45333, 45454, 5457, 4536, 54147);
        System.out.println("排序前" + nums1);
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        Collections.sort(nums1, com);
        System.out.println("排序后" + nums1);

        System.out.println("-----------------语法格式六:------------------");
        /**
         * 语法格式六：有两个以上的参数且有返回值，Lambda 体中有多条语句要使用{}（花括号）包裹方法体
         */
        List<Integer> nums2 = Arrays.asList(13829, 8598, 51623, 68254, 4847, 6236, 68147);
        System.out.println("排序前" + nums2);
        Comparator<Integer> com2 = (x, y) -> {
            System.out.print("x=" + x + " , " + "y=" + y);
            System.out.println();
            return Integer.compare(x, y);
        };
        Collections.sort(nums2, com2);
        System.out.println("排序后" + nums2);

    }
}
