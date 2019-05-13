package com.alan.singleton.test;

import com.alan.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            // readObject()
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1 == s2);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            // newInstance()源码中的if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("Alan", 666);

            // 从JDK层面就为枚举不被序列化和反射破坏来保驾护航
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
