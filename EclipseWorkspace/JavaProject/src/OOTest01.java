/*
 	����Ĵ�����ʹ��
 */
public class OOTest01 {
	public static void main(String[] args) {
		//int��һ��������������
		//i��һ��������
		//10��һ��int���͵�����ֵ
		int i = 10;
		
		//ͨ��һ�������ʵ����n������
		//ʵ����������﷨��new ����();
		//new��Java�����е�һ�������
		//new������������Ǵ���������JVM���п����µ��ڴ�ռ�
		//�������ڴ棺������ص�ʱ��class�ֽ������Ƭ�α����ص����ڴ�ռ��С�
		//ջ�ڴ棨�ֲ�����������������Ƭ��ִ�е�ʱ�򣬻���Ĵ���Ƭ�η����ڴ�ռ䣬��ջ�ڴ���ѹջ��
		//���ڴ棺new�Ķ����ڶ��ڴ��д洢
		
		//Student��һ��������������
		//s��һ��������
		//new Student()��һ��ѧ������
		//s��һ���ֲ���������ջ�ڴ��д洢��
		//ʲô�Ƕ���new������ڶ��ڴ��п��ٵ��ڴ�ռ��Ϊ����
		//ʲô�����ã�������һ�������������б�������һ��Java������ڴ��ַ
		//Java�����У�����Ա����ֱ�Ӳ������ڴ棬Javaû��ָ��
		//Java�����У�����Աֻ��ͨ�������á�ȥ���ʶ��ڴ��ж�����ڲ�ʵ������
		Student s = new Student();
		
		//����ʵ���������﷨��ʽ��
		//  ��ȡ���ݣ�����.������
		//	�޸����ݣ�����.������ = ֵ
		int stuNo = s.no;
		String stuName = s.name;
		int stuAge = s.age;
		boolean stuSex = s.sex;
		String stuAdd = s.add;
		
		System.out.println(stuNo);//0
		System.out.println(stuName);//null
		System.out.println(stuAge);//0
		System.out.println(stuSex);//false
		System.out.println(stuAdd);//null
		
		System.out.println(s.no);//0
		System.out.println(s.name);//null
		System.out.println(s.age);//0
		System.out.println(s.sex);//false
		System.out.println(s.add);//null
		
		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.add = "Beijing";
		
		System.out.println(s.no);//10
		System.out.println(s.name);//jack
		System.out.println(s.age);//20
		System.out.println(s.sex);//true
		System.out.println(s.add);//beijing
		
		//��ͨ����ʵ����һ��ȫ�µĶ���
		//stu��һ������
		//stuͬʱҲ��һ���ֲ�����
		//Student�Ǳ�������������
		Student stu = new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.sex);
		System.out.println(stu.add);
		
		//���뱨��no���ʵ����������ֱ�Ӳ��á��������ķ�ʽ����
		//��Ϊno��ʵ�����������󼶱�ı����������洢��Java������ڲ����������ж���
		//ͨ��������ܷ���no���ʵ������������ֱ��ͨ��������������
		//System.out.println(Student.no);
			
	}
}
/*
 	�ֲ�������ջ�ڴ��д洢
 	��Ա�����е�ʵ�������ڶ��ڴ��Java�����ڲ��洢
 	
 	ʵ��������һ������һ�ݣ�100��������100��
 */
