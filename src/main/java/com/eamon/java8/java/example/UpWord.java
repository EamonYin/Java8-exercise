package com.eamon.java8.java.example;

import org.junit.Test;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * @Author: Eamon
 * @Date: 2022/4/14 20:54
 */
public class UpWord {
    public String toUpperString(MyFun<String> mf, String str) {
        String value = mf.getValue(str);
        return value;
    }

    @Test
    public void test1() {
        String abcdefg = toUpperString((s) -> s.toUpperCase(), "abcdefg");
        System.out.println(abcdefg);
    }
}
