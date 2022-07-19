package com.itcast.day07;

import java.util.ArrayList;


/*
 * ArrayList集合的长度是可以随意变化的
 * 
 * 对于ArrayList，尖括号<E>表示泛型
 * 泛型：装在集合中的所有元素，全都是统一的类型
 * 注意：反省只能是引用数据类型，不能是基本数据类型
 * 
 * 注意事项：对于ArrayList来说，直接打印得到的不是地址值，而是内容。
 * 如果内容是空，得到的时候空的中括号[]
 * 
 * 
 * 常用方法：
 * public boolean add (E e)：向集合中添加元素，参数的类型和泛型一致。返回值代表添加是否成功
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
 * 对于其他集合来说，add添加动作不一定成功。
 * 
 * public E get(int index)：从集合中获取元素，参数是索引编号，返回值是对应位置的元素
 * 
 * public E remove(int index)：从集合中删除元素，参数是索引编号，返回值是被删除的元素
 * 
 * public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//向集合中添加元素
		list.add("柳岩");
		list.add("赵又廷");
		list.add("赵丽颖");
		list.add("李小璐");
		System.out.println(list);
		
		String name = list.get(2);
		System.out.println(name);
		int size = list.size();
		System.out.println("集合的长度是：" + size);
		
		//从集合中删除元素：remove。索引值从0开始。
		String whoRemoved = list.remove(3);
		System.out.println("被删除的是：" + whoRemoved);
		System.out.println(list);
		
		size = list.size();
		System.out.println("集合的长度是：" + size);
		
	}
}
