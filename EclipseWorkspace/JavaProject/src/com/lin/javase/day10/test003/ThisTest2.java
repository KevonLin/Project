package com.lin.javase.day10.test003;

public class ThisTest2 {
	
	String name;
	public void doSome() {
		System.out.println("do some!");
	}
	
	public static void main(String[] args) {
		//Ã»ÓÐthis
		/*
		System.out.println(name);
		doSome();
		
		System.out.println(this.name);
		this.doSome();
		*/
		
		ThisTest2 tt = new ThisTest2();
		tt.name = "zhangsan";
		System.out.println(tt.name);
		tt.doSome();
	}
}
