/*
 	����
 		����һ��������ࡾ����/�ʼǱ�����������ԣ�
 			*Ʒ��
 			*�ͺ�
 			*��ɫ
 			
 		����һ��ѧ���࣬���ԣ�
 			*ѧ��
 			*����
 			*��һ̨�ʼǱ�����
 			
 		��д�����ʾ�����࣬�ֱ��ഴ��Ϊ����
 		�����������ޣ�������һ��ͬѧʹ������һ̨�ʼǱ�����
 			
 		���벢���У����ҽ�����ִ�й��̲���ͼ�εķ�ʽ��������
 			
 	���еĴ���ȫ��д����ǰ��JavaԴ�ļ���
 */
public class OOTest06 {
	public static void main(String[] args) {
		Computer biJiBen = new Computer();
		
		biJiBen.brand = "ASUA";
		biJiBen.style = "FL8550";
		biJiBen.color = "Black";
		
		Student1 zhangsan = new Student1();
		
		zhangsan.name = "����";
		zhangsan.no = 10;
		zhangsan.notepad = biJiBen;
		
		//�����ѧ���ͱʼǱ����������ϵ��ͨ��ѧ���ҵ��ʼǱ���
		//��֪�������ʼǱ���Ʒ��
		System.out.println(zhangsan.notepad.brand);
		
		//�޸�Ʒ��
		zhangsan.notepad.brand = "Apple";
		System.out.println(zhangsan.notepad.brand);
		
		//����������һ̨�µĵ���
		zhangsan.notepad = new Computer();
		
		System.out.println(zhangsan.notepad);//null
	}
}

class Computer{
	
	String brand;
	
	String style;
	
	String color;
	
}
class Student1{
	
	int no;
	
	String name;
	
	Computer notepad;
	
}