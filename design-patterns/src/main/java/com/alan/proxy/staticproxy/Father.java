package com.alan.proxy.staticproxy;

/**
 * Created by Alan.W on 2020/1/4.
 */
public class Father {

	private Person person;

	public Father(Person person) {
		this.person = person;
	}

	public void findLove() {
		System.out.println("父亲物色对象");
		this.person.findLove();
		System.out.println("双方父母同意，确立关系");
	}
}
