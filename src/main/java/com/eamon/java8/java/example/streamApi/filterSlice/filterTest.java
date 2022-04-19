package com.eamon.java8.java.example.streamApi.filterSlice;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Eamon
 * @Date: 2022/4/18 17:48
 */
public class filterTest {

    Person zhangsan = new Person("张三", 32, "男", true);
    Person lisi = new Person("李四", 62, "男", false);
    Person wangwu = new Person("王五", 22, "女", true);
    Person zhaoliu = new Person("赵六", 58, "女", false);
    Person zhaoliuCopy = new Person("赵六", 58, "女", false);
    List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu, zhaoliuCopy);

    /**
     * filter(Predicate p)
     * 接收Lambda,从流中排除某些元素。
     */
    @Test
    public void filterTest() {
        people.stream().filter(e -> e.getBusiness() == true).forEach(System.out::println);
    }

    /**
     * distinct()
     * 筛选，通过流所生成元素的hashCode()和equals()去除重复元素
     */
    @Test
    public void distinctTest() {
        people.stream().distinct().forEach(System.out::println);
    }

    /**
     * limit(long maxSize)
     * 截断流，使其元素不超过给定数量。
     */
    @Test
    public void limitTest() {
        people.stream().limit(1).forEach(System.out::println);
    }

    /**
     * skip(long n)
     * 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
     */
    @Test
    public void skipTest() {
        people.stream().skip(2).forEach(System.out::println);
    }

}
