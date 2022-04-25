package com.eamon.java8.java.example.methodReference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Eamon
 * @Date: 2022/4/25 16:54
 */
public class methodRefTest {

    @Test
    public void test(){

        /**
         * 类名::构造方法
         */
        Student student = Student.create(Student::new);

        List<Student> students = Arrays.asList(student);
        /**
         * 类名::静态方法
         */
        students.forEach(Student::getStu);

        /**
         * 类名::实例方法
         */
        students.forEach(Student::getStuForClass);

        /**
         * 对象::实例方法
         */
        Student student1 = new Student();
        students.forEach(student1::getStuForObject);

    }
}
