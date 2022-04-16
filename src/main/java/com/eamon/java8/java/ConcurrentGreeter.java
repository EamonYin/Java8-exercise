package com.eamon.java8.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: Eamon
 * @Date: 2022/4/10 20:24
 */
public class ConcurrentGreeter extends Greeter{
    @Test
    public void greet(){
        Thread thread = new Thread(super::greet);
        thread.start();
    }

    public void test(){
        Boolean a = null;
//        Optional.ofNullable(a).orElseThrow(IllegalAccessError::new);

        ArrayList<Object> list = new ArrayList<>();
//        list.stream().collect(Collectors.toMap(x -> x, Function.identity()),());
        list.stream().collect(Collectors.groupingBy(x -> x));
    }
}
