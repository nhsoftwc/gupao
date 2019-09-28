package com.alan.singleton.lazy;

// 全程没有用到synchronized
// 性能最优的一种写法
// 作业：理解内部类的执行逻辑
public class LazyInnerClassSingleton {

    // 虽然构造方法私有化了，但还是会被反射攻击
    private LazyInnerClassSingleton() {
        // 防止反射攻击
        if (LazyHolder.lazy != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 懒汉式单例
    // LazyHolder里面的逻辑需要等到外部方法调用时才执行
    // 巧妙利用了内部类的特性
    // JVM底层执行逻辑，完美地避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.lazy;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
