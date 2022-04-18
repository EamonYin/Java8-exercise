package com.eamon.java8.java.example.streamApi.sort;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Eamon
 * @Date: 2022/4/18 17:51
 */
public class sortTest {

    /**
     * filter(Predicate p)
     * 接收Lambda,从流中排除某些元素。
     */
    @Test
    public void filterTest(){

        Person zhangsan = new Person("张三",32,"男",true);
        Person lisi = new Person("李四",62,"男",false);
        Person wangwu = new Person("王五",22,"女",true);
        Person zhaoliu = new Person("赵六",58,"女",false);

        List<Person> people = Arrays.asList(zhangsan, lisi, wangwu, zhaoliu);
        people.stream().filter(e->e.getBusiness()==true).forEach(System.out::println);

    }

}
