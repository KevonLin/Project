/*
 	�߼��������
 		&		�߼��� �����ߵ����Ӷ���true���������true��
 		|		�߼��� �����ߵ�����ֻҪ��һ����true���������true��
 		!		�߼��� ��ȡ����!false��true��!true��false������һ����Ŀ�������
 		^		�߼���� �����ߵ�����ֻҪ��һ�����������true��
 		
 		&&		��·��
 		||		��·��
 		
 	1���߼������Ҫ�����ߵ����Ӷ��ǲ������ͣ������߼���������յ�������Ҳ��һ����������
 	2����·����߼������յ�����������ͬ�ģ�ֻ������·����ڶ�·����
 	3����·����߼������յ�����������ͬ�ģ�ֻ������·����ڶ�·����
 	4��ʲô����·�����·����
 	5��ʲôʱ��ѡ��ʹ���߼����������ʲôʱ��ѡ��ʹ���߼����������
 */
public class OperatorTest03 {
	public static void main(String[] args){
		//�߼���Ͷ�·��
		int x = 10;
		int y = 8;
	/*	//�߼���
		System.out.println(x < y & ++x < y);
		System.out.println(x);//11
	*/
		//��·��
		System.out.println(x < y && ++x < y);
		System.out.println(x);//10
		
		/*
		 	��·���ߵı����ǿ��ܲ�ִ�У�����ִ��Ч�ʽϸߡ�
		 	���ַ�ʽ��ʵ�ʿ�����ʹ�ý϶ࡣ��·����߼���ʹ�õĶࡣ
		 	��·���Ϊ����
		 	
		 	������ĳЩ�����ҵ���߼��У�Ҫ����������ߵ����ӱ���ȫ��ִ��
		 	��ʱ����ʹ���߼��룬����ʹ�ö�·�룬ʹ�ö�·����ܵ����ұߵı���ʽ��ִ�С�
		 */
		
		/*
		 	ʲô����·�����·��
		 		*��һ������ʽִ�н����true���ᷢ����·��
		 	ʲô����·�����·�룿
		 *��һ������ʽִ�н����false���ᷢ����·�롣
		 */
		
	}
}