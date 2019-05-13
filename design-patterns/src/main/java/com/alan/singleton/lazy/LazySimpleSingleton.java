package com.alan.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {}

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
