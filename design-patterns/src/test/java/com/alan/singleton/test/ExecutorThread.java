package com.alan.singleton.test;

import com.alan.singleton.lazy.LazyDoubleCheckSingleton;
import com.alan.singleton.lazy.LazySimpleSingleton;
import com.alan.singleton.threadlocal.ThreadLocalSingleton;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}
