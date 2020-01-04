package com.alan.proxy.dbroute;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;

	public OrderServiceImpl() {
		// 如果是spring，应该是自动注入
		// 这里为了方便，直接在构造方法中初始化dao
		orderDao = new OrderDao();
	}

	@Override
	public int createOrder(Order order) {
		System.out.println("OrderServiceImpl创建order成功");
		return orderDao.insertOrder(order);
	}

}
