package com.eamon.java8.java.example.otherFunction;

import org.junit.Test;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 * @Author: Eamon
 * @Date: 2022/4/16 20:39
 */
public class XFunctionEx {
    /**
     * DoubleFunction<R>
     * 参数为double类型的函数
     */
    public String DoubleFunctionTestMethod(DoubleFunction<String> doubleFunction,Double d){
        return doubleFunction.apply(d);
    }

    /**
     * IntFunction<R>
     * 参数为int类型的函数
     */
    public String IntFunctionTestMethod(IntFunction<String> intFunction,Integer a){
        return intFunction.apply(a);
    }

    /**
     * LongFunction<R>
     * 参数为long类型的函数
     */
    public String LongFunctionTestMethod(LongFunction<String> longFunction,Long l){
        return longFunction.apply(l);
    }

    @Test
    public void XFunctionTest(){
        System.out.println("---------↓--Integer--↓---------");
        String s = IntFunctionTestMethod(a -> "输入的数字为：" + a, 5);
        System.out.println(s);

        System.out.println("---------↓--Doublie--↓---------");
        String s1 = DoubleFunctionTestMethod(d -> "输入的数字为：" + d, 66.0);
        System.out.println(s1);

        System.out.println("---------↓--Long--↓---------");
        String s2 = LongFunctionTestMethod(l -> "输入的数字为：" + l, 151915616516516516L);
        System.out.println(s2);
    }



}
