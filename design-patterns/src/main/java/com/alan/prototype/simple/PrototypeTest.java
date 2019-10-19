package com.alan.prototype.simple;

import com.alan.prototype.deep.JinGuBang;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {

        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("Alan");
        List<String> hobbies = new ArrayList<>();
        concretePrototype.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(copy);

        System.out.println("克隆对象中引用类型地址的值：" + copy.getHobbies());
        System.out.println("原对象中引用类型地址的值：" + concretePrototype.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concretePrototype.getHobbies()));

    }

}
