package com.itcast.day10.demo2;

/*
 * 接恐慌中可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰
 * 从效果上看就是接口的常量
 * 
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 * 备注：
 * 一旦使用final关键字进行修饰说明不可变
 * 
 * 注意事项：
 * 1.接口中的常量可以省略public static final，注意：不屑也照样有
 * 2.必须进行赋值
 * 3.接口中常量的名称使用完全的大写字母，用下划线进行分隔
 */
public interface InterfaceConst {

	public static final int NUM_OF_MY_CLASS =12;
}
