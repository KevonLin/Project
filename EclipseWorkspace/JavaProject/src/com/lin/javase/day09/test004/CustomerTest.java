package com.lin.javase.day09.test004;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		//私有属性不能再外部直接访问，这就是封装
		//c.id = 410;
		
		//操作入口变成了只能通过set和get方法进行访问
		//set方法和get方法执行过程中可以进行安全过滤。
		c.setId(100);
		c.setName("zhangsan");
		c.setAge(500);
		c.setAdd("郑州市");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAdd());
		
	}
}
