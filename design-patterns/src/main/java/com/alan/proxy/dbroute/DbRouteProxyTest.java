package com.alan.proxy.dbroute;

import com.alan.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class DbRouteProxyTest {

	public static void main(String[] args) {
		try {
			Order order = new Order();
//			order.setCreateTime(new Date().getTime());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			Long time = sdf.parse("2019/12/31").getTime();
			order.setCreateTime(time);

			OrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
			orderService.createOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
