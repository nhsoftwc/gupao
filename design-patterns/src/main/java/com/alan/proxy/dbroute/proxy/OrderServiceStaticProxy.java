package com.alan.proxy.dbroute.proxy;

import com.alan.proxy.dbroute.Order;
import com.alan.proxy.dbroute.OrderService;
import com.alan.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class OrderServiceStaticProxy implements OrderService {

	private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

	private OrderService orderService;

	public OrderServiceStaticProxy(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public int createOrder(Order order) {
		Long time = order.getCreateTime();
		Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
		System.out.println("静态代理自动分配到【DB_" + dbRouter + "】数据源");
		DynamicDataSourceEntity.set(dbRouter);
		this.orderService.createOrder(order);
		DynamicDataSourceEntity.restore();
		return 0;
	}
}
