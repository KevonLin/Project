/*
 	����Java�еĸ����������
 	
 		������������������֣�
 		
 			*�����ĸ�ֵ�����
 				=
 			*��չ�ĸ�ֵ�����
 				+=
 				-=
 				*=
 				/=
 				%=
 				
 		  1����ֵ�����������ȼ�����ִ�еȺ��ұߵı��ʽ����ִ�еĽ����ֵ����ߵı�����
 		  
 		  2��ע�����´��룺
 		  	byte i = 10;
 		  	1 += 5;��ͬ�ڣ� i = (byte)(i + 5);
 		  	
 		  	int k = 10 
 		  	k += 5;��ͬ�ڣ� k = (int)(k + 5);
 		  	
 		  	long x = 10L;
 		  	int y =20;
 		  	y += x;��ͬ�ڣ�y = (int)(y + x);
 		  	
 		  3����չ�ำֵ��������ı����������ͣ������������������byte��
 		  	������ô׷�ӻ���׷�������������byte����
 		  
 */
public class OperatorTest04 {
	public static void main(String[] args) {
		
		//�����ĸ�ֵ�����
		int i = 10;
		
		System.out.println(i);
		
		i=i + 5;
		
		System.out.println(i);
		
		//��չ�ĸ�ֵ����� [+= ��������Է���Ϊ"׷��/�ۼ�"]
		i += 5;//��ͬ��:i = i + 5;  �ȼ���i= (byte) (i = i + 5);
		
		System.out.println(i);//20
		
		i -= 5;//��ͬ��i = i - 5;  �ȼ�ͬ��
		
		System.out.println(i);//15
		
		i *= 4;//��ͬ��i = i * 5;
		
		System.out.println(i);//60
		
		i /= 5;
		
		System.out.println(i);//12
		
		i %= 5;
		
		System.out.println(i);//2
		
		//-------------
		
		//10û�г���byteȡֵ��Χ������ֱ�Ӹ���
		byte b = 10;
		//b = b + 5;
		//�������ԭ�򣺱�����ֻ����﷨�������г��򣬱���������b+5��int���ͣ�b����������������byte
		//��������С����ת����Ҫ��ǿ��ת�����ͷ������Գ�����뱨��
		
		b = (byte) (b + 5);
		System.out.println(b);
		
		byte x =10;
		x += 5;
		System.out.println(x);
		
		byte z = 0;
		z += 128;//�ȼ���: z = (byte) (z + 128);  
		System.out.println(z);//�����ʧ���� -128
		
	}
}
