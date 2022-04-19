package com.eamon.java8.java.example.streamApi.map;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/18 17:50
 */
public class mapTest {

    Person zhangsan = new Person("张三", 32, "男", true);
    Person lisi = new Person("李四", 62, "男", false);
    Person wangwu = new Person("王五", 22, "女", true);
    Person zhaoliu = new Person("赵六", 58, "女", false);
    Person zhaoliuCopy = new Person("赵六", 58, "女", false);
    List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu, zhaoliuCopy);

    /**
     * map(Function f)
     * 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
     */
    @Test
    public void mapTest() {
        people.stream().map(e -> {
            if (e.getSex().equals("女")) {
                return e;
            } else {
                return null;
            }
        }).forEach(System.out::println);
        //突然想起来的一个操作，不属于此处！！！
        System.out.println("--------------↓-----给所有人加10岁------↓------------");
        people.stream()
                .forEach(e ->
                {
                    e.setAge(e.getAge() + 10);
                    System.out.println(e);
                });
    }

    /**
     * mapToDouble(ToDoubleFunction f)
     * 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。
     */
    @Test
    public void mapToDoubleTest() {
        OptionalDouble average = people.stream().mapToDouble(Person::getAge).average();
        System.out.println(average.getAsDouble());
    }

    /**
     * mapToInt(ToIntFunction f)
     * 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
     */
    @Test
    public void mapToIntTest() {
        //求最大年龄
        OptionalInt max = people.stream().mapToInt(Person::getAge).max();
        System.out.println(max.getAsInt());
    }

    /**
     * mapToLong(ToLongFunction f)
     * 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。
     */
    @Test
    public void mapToLong() {
        //求最小年龄
        OptionalLong min = people.stream().mapToLong(Person::getAge).min();
        System.out.println(min.getAsLong());
    }

    /**
     * flatMap(Function f)
     * 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
     */
    @Test
    public void flatMapTest() {

        List<String> hello = Arrays.asList("Hello", "World");
        //一对多的处理，把每个字符串拆成一个个字符，输出，这点map就无法做到。
        hello.stream().flatMap(e-> Stream.of(e.split(""))).forEach(System.out::println);

        System.out.println("------------------------------------");

        //flatMap升维
        List<Integer> integers = Arrays.asList(1, 23, 54654, 789564);
        List<String> strings = Arrays.asList("小红", "小名", "小刚");
        List<String[]> collect = integers.stream()
                .flatMap(x -> strings.stream()
                        .map(y -> new String[]{x.toString(), y}))
                .collect(Collectors.toList());
        for (String[] c : collect) {
            System.out.println(Arrays.toString(c));
        }
    }
}
