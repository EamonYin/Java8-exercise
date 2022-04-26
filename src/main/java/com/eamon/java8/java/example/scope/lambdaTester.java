package com.eamon.java8.java.example.scope;

import org.junit.Test;

/**
 * @Author: Eamon
 * @Date: 2022/4/26 11:14
 */
public class lambdaTester {

    final String test = "Hello";

    interface lambdaInterface {
        void getMessage(String message);
    }

    /**
     * 1. lambda 表达式可以使用外部 final 变量
     */
    @Test
    public void lambdaScope1() {
        lambdaInterface li = msg -> System.out.println(test + msg);
        li.getMessage(" World!");
    }

    /**
     * 2. lambda 可以引用普通的变量，但这个变量不能被二次赋值(即隐性的具有 final 的语义)
     */
    @Test
    public void lambdaScope2(){
        String var = "你好";
        lambdaInterface li = msg -> System.out.println(var + msg);
        // var = "你好呀";
        li.getMessage(" World!");
    }

}
