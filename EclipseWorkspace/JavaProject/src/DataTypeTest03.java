/*
 ת���ַ�����ͨ�ַ�֮ǰ���������ַ�ת��Ϊ��ͨ�ַ�
 */
public class DataTypeTest03 {
		public static void main(String[] args) {
			char c1 = 'n';
			System.out.println(c1);
			
		//'\n'��һ�����з�������char��������
		//����Java�����С�\������ת�幦��
			
			char c2 = '\n';
			System.out.print("Hello");
			System.out.print(c2);
			System.out.println("World");
			
			//'\t'���Ʊ��
			char c3 = '\t';
			System.out.print(c1);
			System.out.print(c3);
			System.out.println("Hello World");
			
			//Ҫ���ڿ���̨�������\��
			//��б�ܽ���ߵĵ�����ת��ch�ɲ��߱����⺬�����ͨ������
		/*	char k = '\'';
			System.out.println(k);
		*/
			
			//��һ��\����ת�幦��
			char k ='\\';
			System.out.println(k);
			
			//�ڿ���̨���������
			//char a = ''��java�в�������ôд
			
			//��һ�������ź͵ڶ�����������ԣ����һ���ĵ�����z�Ҳ�����һ��
			
			//����б�ܾ���ת�幦�ܣ����ڶ���������ת��Ϊ��ͨ�ַ�
			char a = '\'';
			System.out.println(a);
			//������˫���ŵ�Hello World��
			System.out.println("\"Hello World!\"");
			
			
			char m = '��';
			System.out.println(m);
			
			//Unicode
			char n = '\u4e2d';
			System.out.println(n);
			//char���͵�Ĭ��ֵ
		/*	char d = '\u0000';
			System.out.println(d);
		*/
			
		}
}
