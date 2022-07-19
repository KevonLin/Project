package com.itcast.day10.demo1;

public class DefaultTest02 implements MyInterfaceDefault{

	@Override
	public void methodAbs() {
		System.out.println("实现了抽象方法2");		
	}

	public void methodDefault() {
		System.out.println("重写默认接口");
	}

}
