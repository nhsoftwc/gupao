package com.alan.prototype.deep;

import org.apache.commons.beanutils.BeanUtils;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        // 只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    // 克隆方法采用的是深克隆
    // 可能会出现单例被破坏的问题
    // 原型模式和单例模式唱反调的意思
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {

        try {

            // 内存中完成操作，对象读写是通过字节码直接操作
            // 跟序列化操作类似
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            // 完整的新的对象
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    // 浅克隆
    public QiTianDaSheng shallowClone(QiTianDaSheng target) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;

    }

}
