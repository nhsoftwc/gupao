package com.alan.proxy.dbroute;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class OrderDao {

	public int insertOrder(Order order) {
		System.out.println("OrderDao创建order成功");
		return 1;
	}

}
