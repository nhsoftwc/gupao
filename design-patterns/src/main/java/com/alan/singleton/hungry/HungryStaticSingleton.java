package com.alan.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    private static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }

}
