package com.itcast.day10.demo1;

/*
 * public default 返回值类型 方法名称(参数列表){
 * 		方法体
 * }
 * 
 * 接口中的默认方法可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
	
	public abstract void methodAbs();
	
//	public abstract void methodAvs2();
	
	public default void methodDefault() {
		System.out.println("新添加的默认方法");
	}

}
