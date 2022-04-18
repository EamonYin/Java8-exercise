package com.eamon.java8.java.example.streamApi;

import java.util.Objects;

/**
 * @Author: Eamon
 * @Date: 2022/4/18 20:46
 */

public class Person {
    String name;
    Integer age;
    String sex;
    Boolean business;

    public Person(String name, Integer age, String sex, Boolean business) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.business = business;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(sex, person.sex) && Objects.equals(business, person.business);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, business);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", business=" + business + '}';
    }
}
