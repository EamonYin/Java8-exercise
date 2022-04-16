package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.BiConsumer;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 19:37
 */
public class BiConsumerEx {
    /**
     * BiConsumer<T, U>
     * 对类型为T, U 参数应用操作。包含方法为
     * void accept(T t, U u)
     */
    public void BiConsumerTestMethod(BiConsumer<String,Integer> biConsumer,String str,Integer num){
        biConsumer.accept(str,num);
    }

    @Test
    public void BiConsumerTest(){
        BiConsumerTestMethod((s,n)-> System.out.println(s+n),"输入的数字是：",155);
    }
}
