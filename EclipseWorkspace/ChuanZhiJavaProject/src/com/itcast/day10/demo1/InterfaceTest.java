package com.itcast.day10.demo1;

/*
 * �ӿ�ʱ�����Ĺ����淶
 * �ӿ���һ�������������ͣ�����Ҫ�����ݾ������еĳ��󷽷�
 * 
 * ���ɹؼ���inteface֮�󣬱������ɵ��ֽ����ļ���Ȼ��java -->class
 * 
 * �ӿ�ʹ�ò��裺
 * 1���ӿڲ���ֱ��ʹ�ã�������һ��ʵ������ʵ�ָýӿ�
 * 2���ӿڵ�ʵ�ֱ��븲����д��ʵ�֣��ӿ������еĳ��󷽷�
 * ʵ�֣�ȥ��abstract�ؼ��֣����Ϸ����������
 * 3������ʵ������󣬽���ʹ��
 * 
 * ע�⣺
 * ���ʵ����û�и�����д�ӿ������еĳ��󷽷�����ô���ʵ�����Լ����Ǹ�������
 */
public class InterfaceTest {

	public static void main(String[] args) {
		MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
		impl.methodAbs1();
		impl.methodAbs2();
	}
}
