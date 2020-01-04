package com.alan.proxy.staticproxy;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class FatherProxyTest {

	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}

}
