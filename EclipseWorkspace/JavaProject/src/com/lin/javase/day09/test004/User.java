package com.lin.javase.day09.test004;

/**
 * ��װ�Ĳ��裺
 *  1����������˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�еģ����ε���������ֻ���ڱ����з��ʡ�
 * 
 *  2�������ṩ�򵥵Ĳ�����ڣ�Ҳ����˵�ⲿ���������age���ԣ�����ͨ����Щ�򵥵���ڽ��з��ʣ�
 *  	-�����ṩ���������ķ������ֱ���set������get����
 *  	-���޸�age���ԣ�����set����
 *  	-���ȡ�������ԣ�����get����
 *
 *  3��set�����������淶��
 *  	public void setAge(int a){
 *  		age = a;
 *  	}
 *  
 *  4��get�����������淶��
 *  	public int getAge(){
 *  		return age;
 *  	}
 *  
 * һ������ͨ�����ʵ�ʱ��������з�����ʽ��
 *  -��һ�ַ�ʽ����ȡ������Ե�ֵ����ȡget
 *  -�ڶ��ַ�ʽ���޸�������Ե�ֵ���޸�set
 *  
 *  �����������ݣ�
 *    -setter and getter ����û��static �ؼ���
 *    -��static�ؼ������εķ�����ô���ã�����.������(ʵ��);
 *    -û��static�ؼ������εķ�����ô���ã�����.������(ʵ��);
 *
 */
public class User {
	
	//����˽�л�
	private int age;
	
	//set����û�з���ֵ����Ϊset����ֻ�����޸�����
	/*
	public void setAge(int age) {
		age = age;//Java�оͽ�ԭ�������age���Ǿֲ�����age
	}
	*/
	
	public void setAge(int a) {
		//��дҵ���߼�������а�ȫ����
		//age = a;
		
		if(a < 0 || a > 150) {
			System.out.println("�Բ������ṩ�����䲻�Ϸ�");
			return;
		}
		
		//����ִ�е����˵��a�����ǺϷ��ģ�����и�ֵ����
		age = a;
		
	}
	
	//getter
	public int getAge() {
		return age;
	}
}
