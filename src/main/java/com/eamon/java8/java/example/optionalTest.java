package com.eamon.java8.java.example;

import com.eamon.java8.java.example.streamApi.Person;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @Author: Eamon
 * @Date: 2022/4/28 11:45
 */
public class optionalTest {

    @Test
    public void optionalTesting() {

        Person personNull = null;
        Person person = new Person("张三", 32, "男", true);


        /**
         * 空对象
         */
        Optional<Object> empty = Optional.empty();
        //empty.get();

        /**
         * 非空对象
         */
        Optional<Person> person1 = Optional.of(person);
        //当传入的参数是 null，会抛出异常 NullPointerException，如下
        //Optional<Person> person2 = Optional.of(personNull);

        /**
         * 可为null的Optional
         */
        Optional<Person> personNull1 = Optional.ofNullable(personNull);
        System.out.println(personNull1);

        /**
         * 判断Optional是否为空
         * 非空：true
         * 空：false
         */
        boolean present = person1.isPresent();
        System.out.println(present);

        /**
         * 获取 Optional 实例中的值
         */
        Person getPerson = person1.get();
        System.out.println(getPerson);

        /**
         * 判断Optional是否为空，不为空做一些处理
         */
        person1.ifPresent(e -> System.out.println("我不是空对象"));

        /**
         * 定义为空对象时的返回值
         */
        personNull1.orElse(new Person("李四", 62, "男", false));

        /**
         * 定义为空对象时的返回值(Lambda表达式)
         */
        personNull1.orElseGet(() -> new Person("李四", 62, "男", false));

        /**
         * 如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常
         */
        personNull1.orElseThrow(() -> new NoSuchElementException());

    }

}
