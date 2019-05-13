package com.alan.singleton.test;

import com.alan.singleton.lazy.LazySimpleSingleton;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        // LazySimpleSingleton.getInstance();

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();

        System.out.println("Executor End");

    }

}
