package com.eamon.java8.java.example.streamApi.sort;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Eamon
 * @Date: 2022/4/18 17:51
 */
public class sortTest {

    Person zhangsan = new Person("张三", 32, "男", true);
    Person lisi = new Person("李四", 62, "男", false);
    Person wangwu = new Person("王五", 22, "女", true);
    Person zhaoliu = new Person("赵六", 58, "女", false);
    List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu);

    /**
     * sorted()
     * 产生一个新流，其中按自然顺序排序
     */
    @Test
    public void sortedTest(){
        Stream<Integer> integerStream = Stream.of(561561, 532, 54, 546, 12, 1);
        integerStream.sorted().forEach(System.out::println);
    }

    /**
     * sorted(Comparator comp)
     * 产生一个新流，其中按比较器顺序排序
     */
    @Test
    public void sortedTest2(){
        System.out.println("-------------------------[升序]------------------------");
        //按年龄升序排序
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        System.out.println("-------------------------[降序]------------------------");
        //按年龄降序排序
        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
    }

}
