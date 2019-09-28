package com.alan.singleton.test;

import com.alan.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try {
            // 不通过getInstance()方法获取实例，非要自己搞，导致单例被破坏
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();

            Object o2 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
