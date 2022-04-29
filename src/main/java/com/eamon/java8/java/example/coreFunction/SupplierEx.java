package com.eamon.java8.java.example.coreFunction;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * @Author: Eamon
 * @Date: 2022/4/14 21:23
 */
public class SupplierEx {

    /**
     *Supplier<T> 供给型接口
     * 返回类型为T的对象，包含方法：
     * T get();
    **/
    public Integer SupplierTestMethod(Supplier<Integer> num){
        return num.get();
    }

    public String SupplierTestMethod2(Supplier<String> str){
        return str.get();
    }

    @Test
    public void SupplierTest(){
        Integer integer = SupplierTestMethod(() -> 10);
        System.out.println(integer);

        String s = SupplierTestMethod2(() -> "Hello!");
        System.out.println(s);
    }


}
