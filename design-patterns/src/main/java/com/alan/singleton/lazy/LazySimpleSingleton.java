package com.alan.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {}

    // JDK1.6之后对synchronized优化了不少
    // 但是不可避免的还是存在一定的性能问题（有可能导致整个类都被锁住）
    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
