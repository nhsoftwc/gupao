package com.alan.singleton.test;

import com.alan.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            // 调用者不走寻常路，显然，破坏了单例
            Class clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);// 强吻
            Object o1 = c.newInstance();

            // 正常渠道
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
