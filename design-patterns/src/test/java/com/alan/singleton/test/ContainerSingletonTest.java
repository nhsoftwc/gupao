package com.alan.singleton.test;

import com.alan.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.alan.singleton.test.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }, 10, 6);

            // 对象方便管理，其实也是属于懒加载
            // 存在线程安全问题

            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + "ms");
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
