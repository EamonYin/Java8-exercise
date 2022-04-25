package com.eamon.java8.java.example.methodReference;

import java.util.function.Supplier;

/**
 * @Author: Eamon
 * @Date: 2022/4/25 16:51
 */
public class Student {
    private String name;
    private int score;


    /**
     * 无参 构造方法
     */
    public Student() {
    }

    /**
     * 有参 构造方法
     */
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 创建 Student的静态方法
     *
     * @param supplier
     * @return
     */
    public static Student create(final Supplier<Student> supplier) {
        return supplier.get();
    }

    /**
     * 输出 Student的静态方法(类方法)
     *
     * @param stu
     */
    public static void getStu(final Student stu) {
        System.out.println("Student " + stu.toString());
    }

    /**
     * 用于 类 调用输出Student的实例方法
     */
    public void getStuForClass() {
        System.out.println("Student " + this.toString());
    }

    /**
     * 用于 对象 调用输出Student的实例方法
     */
    public void getStuForObject(final Student student) {
        System.out.println("Student " + student.toString());
    }

    /**
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
