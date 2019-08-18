package com.alan.prototype.deep;

public class DeepCloneTest {

    public static void main(String[] args) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng deepCopy = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == deepCopy.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        QiTianDaSheng shallowCopy = qiTianDaSheng.shallowClone(qiTianDaSheng);
        System.out.println("浅克隆：" + (qiTianDaSheng.jinGuBang == shallowCopy.jinGuBang));

    }

}
