package com.alan.singleton.test;

import com.alan.singleton.lazy.LazySimpleSingleton;

// 断点切换到thread模式
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
