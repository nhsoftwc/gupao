package com.alan.singleton.lazy;

public class LazyDoubleCheckSingleton {

//    private volatile static LazyDoubleCheckSingleton lazy = null;
    private static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    // CPU执行的时候会转换成JVM指令执行
                    // 指令重排序的问题（下面的2、3执行的顺序可能会不一样），volatile
                    // 1、分配内存给这个对象
                    // 2、初始化对象
                    // 3、将初始化好的对象与内存地址建立关联，也就是赋值
                    // 4、用户初次访问
                }
            }
        }
        return lazy;
    }

}
