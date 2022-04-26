package com.eamon.java8.java.example.newInterfaceMethod;

import org.junit.Test;

/**
 * @Author: Eamon
 * @Date: 2022/4/26 17:21
 */
public class staticMethodTest {

    /**
     * lambda 静态方法
     */
    public interface lambdaInterface {
        static void show(){
            System.out.println("接口中的静态方法");
        }
    }

    @Test
    public void test(){
        lambdaInterface.show();
    }

}
