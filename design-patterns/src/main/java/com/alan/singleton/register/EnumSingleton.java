package com.alan.singleton.register;

// 《Effective Java》推荐的单例写法
// 反编译得知：枚举式单例是饿汉式，所以是线程安全的
// 反序列化：readObject()中，枚举通过Enum.valueOf((Class)cl, name)唯一确定一个实例，
//           所以始终是单例，不会被反序列破坏
// 反射：首先EnumSingleton类中没有无参的构造方法，通过反射去获取实例会报NoSuchMethodException；
//       就算根据有参的构造方法去反射获取实例，也会在newInstance()方法中去判断((clazz.getModifiers() & Modifier.ENUM) != 0)是不是枚举，
//       显然是枚举，所以会报参数异常的错误，因此也不会被反射破坏
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
