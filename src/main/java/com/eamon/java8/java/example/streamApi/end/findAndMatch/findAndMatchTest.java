package com.eamon.java8.java.example.streamApi.end.findAndMatch;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/20 17:47
 */
public class findAndMatchTest {

    List<String> strings = Arrays.asList("我叫小名", "My name is 小李", "我的名字是小名同学");

    Person zhangsan = new Person("张三", 32, "男", true);
    Person lisi = new Person("李四", 62, "男", false);
    Person wangwu = new Person("王五", 22, "女", true);
    Person zhaoliu = new Person("赵六", 58, "女", false);
    Person zhaoliuCopy = new Person("赵六", 58, "女", false);
    List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu, zhaoliuCopy);

    /**
     * allMatch(Predicate p)
     * 检查是否匹配所有元素
     * 必须全部都满足才会返回true
     */
    @Test
    public void allMatchTest() {
        boolean xiaoming = strings.stream().allMatch(e -> e.contains("小名"));
        System.out.println(xiaoming);
    }

    /**
     * anyMatch(Predicate p)
     * 检查是否至少匹配一个元素
     * 只要有一个条件满足即返回true
     */
    @Test
    public void anyMatchTest() {
        boolean xiaoming = strings.stream().anyMatch(e -> e.contains("小名"));
        System.out.println(xiaoming);
    }

    /**
     * noneMatch(Predicate p)
     * 检查是否没有匹配所有元素
     * 全都不满足才会返回true
     */
    @Test
    public void noneMatchTest() {
        boolean xiaoming = strings.stream().noneMatch(e -> e.contains("小名同学"));
        System.out.println(xiaoming);
        System.out.println("-----------------------------");
        boolean xiaogang = strings.stream().noneMatch(e -> e.contains("小刚"));
        System.out.println(xiaogang);
    }

    /**
     * findFirst()
     * 返回第一个元素
     */
    @Test
    public void findFirstTest() {
        Optional<String> first = strings.stream().findFirst();
        System.out.println(first.get());
    }

    /**
     * findAny()
     * 返回当前流中的任意元素
     */
    @Test
    public void findAnyTest() {
        //正常情况下一般会取第一个元素，在并行流的情况下会随机取一个元素。
        System.out.println("----------↓----并行流-----↓------------");
        Optional<String> any = strings.parallelStream().findAny();
        System.out.println(any.get());
        System.out.println("----------↓----普通流-----↓------------");
        Stream.of(10, 20, 30).findAny()
                .ifPresent(s -> System.out.println(s));
    }

    /**
     * count()
     * 返回流中元素总数
     */
    @Test
    public void countTest() {
        long count = strings.stream().count();
        System.out.println(count);
    }

    /**
     * max(Comparator c)
     * 返回流中最大值
     */
    @Test
    public void maxTest() {
        Optional<String> max = strings.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());
    }

    /**
     * min(Comparator c)
     * 返回流中最小值
     */
    @Test
    public void minTest() {
        System.out.println("---------------[获取最小年龄的人：方式一]----------------");
        people.stream().min(Comparator.comparing(new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        })).ifPresent(System.out::println);
        System.out.println("---------------[获取最小年龄的人：方式二]----------------");
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
        System.out.println("---------------[数字取最小值]----------------");
        Stream.of(25262, 48482, 89484, 87412).min(Comparator.comparing(i -> Integer.valueOf(i))).ifPresent(System.out::println);
    }
    /**
     * forEach(Consumer c)
     * 内部迭代(使用 Collection 接口需要用户去做迭代，称为外部迭代。相反，Stream API 使用内部迭代——它帮你把迭代做了)
     */
    @Test
    public void forEachTest(){

        // .stream()和Stream.of()的区别
        Stream<Person> stream = people.stream();
        Stream<List<Person>> people = Stream.of(this.people);

        stream.filter(e->e.getSex().equals("女")).forEach(System.out::println);

    }

}
