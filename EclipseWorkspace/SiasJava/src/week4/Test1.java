package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			System.out.println("�������ַ�����");
			str = buf.readLine();
			System.out.println("��������ַ����ǣ�" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int b = 1;
		int c = 0;
		
		c = b + Integer.valueOf(str).intValue();
		System.out.println("c=" + c);
		System.out.println("==================");
        int x = -1;
        assert x > 0;	//JVMĬ�Ͻ��ö��ԣ�ֻ���������м�-ea���ö��Բ���Ч��
        System.out.println(x);
	}
}
