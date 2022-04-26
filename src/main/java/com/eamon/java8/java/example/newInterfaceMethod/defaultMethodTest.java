package com.eamon.java8.java.example.newInterfaceMethod;

import org.junit.Test;

/**
 * @Author: Eamon
 * @Date: 2022/4/26 16:50
 */
public class defaultMethodTest {

    /**
     * lambda 默认方法
     */
    interface lambdaInterface {
        String getMessage(String message);

        default double pow(int num) {
            return Math.pow(num,2);
        }
    }

    @Test
    public void test() {
        lambdaInterface lambdaInterface = new lambdaInterface() {
            @Override
            public String getMessage(String message) {
                return message;
            }
        };
        System.out.println(lambdaInterface.getMessage("Hello"));
        System.out.println(lambdaInterface.pow(50));
    }

}
