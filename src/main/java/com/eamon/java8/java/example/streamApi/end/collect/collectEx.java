package com.eamon.java8.java.example.streamApi.end.collect;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author: Eamon
 * @Date: 2022/4/21 13:40
 */
public class collectEx {

    Person zhangsan = new Person("张三", 32, "男", true);
    Person lisi = new Person("李四", 62, "男", false);
    Person wangwu = new Person("王五", 22, "女", true);
    Person zhaoliu = new Person("赵六", 58, "女", false);
    Person zhaoliuCopy = new Person("赵六", 58, "女", false);
    List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu, zhaoliuCopy);

    /**
     * collect(Collector c)
     * 将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
     */
    @Test
    public void collectTest() {
        System.out.println("--------------------list----------------------");
        //toList把流中元素收集到List
        List<Person> list = people.stream().collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("--------------------set----------------------");
        //toSet把流中元素收集到Set
        Set<Person> set = people.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("--------------------Collection----------------------");
        //toCollection把流中元素收集到创建的集合
        people.stream()
                .distinct()
                .collect(Collectors.toMap(Person::getName, e -> e.getAge()))
                .forEach((k,v)-> System.out.println("[key]:"+k+"  [value]:"+v));

        System.out.println("--------------------counting----------------------");
        //counting计算流中元素的个数
        Long count = people.stream().collect(Collectors.counting());
        System.out.println(count);

        System.out.println("--------------------summingInt----------------------");
        //summingInt对流中元素的整数属性求和
        Integer sumAge = people.stream().collect(Collectors.summingInt(Person::getAge));
        System.out.println(sumAge);

        System.out.println("--------------------averagingInt----------------------");
        //averagingInt计算流中元素Integer属性的平均值
        Double average = people.stream().collect(Collectors.averagingInt(Person::getAge));
        System.out.println(average);

        System.out.println("--------------------summarizingInt----------------------");
        //summarizingInt收集流中Integer属性的统计值。如:平均值
        IntSummaryStatistics collect = people.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(collect);

        System.out.println("--------------------joining----------------------");
        //joining连接流中每个字符串
        String join = people.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(join);

        System.out.println("--------------------maxBy----------------------");
        //maxBy根据比较器选择最大值
        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        System.out.println("--------------------minBy----------------------");
        //minBy根据比较器选择最小值
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        System.out.println("--------------------reducing----------------------");
        //reducing从一个作为累加器的初始值开始，利用BinaryOperator与流中元素逐个结合，从而归约成单个值
        List<Integer> integers = Arrays.asList(1, 51, 854, 5, 156, 1, 187);
        Integer collect1 = integers.stream().collect(Collectors.reducing(70000, Integer::sum));
        System.out.println(collect1);

        System.out.println("--------------------collectingAndThen----------------------");
        //collectingAndThen包裹另一个收集器，对其结果转换函数【还需后续继续理解】
        List<Person> collect2 = people.stream().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println(collect2);

        System.out.println("--------------------groupingBy----------------------");
        //groupingBy根据某属性值对流分组，属性为K，结果为V
        Map<String, List<Person>> map = people.stream().collect(Collectors.groupingBy(Person::getSex));
        map.forEach((k,v)-> System.out.println("[key]"+k+"   [value]"+v));

        System.out.println("--------------------partitioningBy----------------------");
        //partitioningBy根据true或false进行分区
        people.stream().collect(Collectors.partitioningBy(Person::getBusiness)).forEach((k,v)-> System.out.println("[key]"+k+"   [value]"+v));

    }
}
