package j2se;

public class TestAbstract {

	public static void main(String[] args) {

		Animal cat = new cat();
		cat.name = "Tom";
		cat.age = 1;
		System.out.println(cat.name + "\n" + cat.age);
		cat.cry();
		
		Animal dog = new dog();
		dog.cry();
	}
}

// �����һ��������
abstract class Animal {
	String name;
	int age;

	// ������
	public abstract void cry(); // ��ȷ��������ô�еġ�����ɳ��󷽷�����������෽���Ĳ�ȷ���ԡ����󷽷��ڸ����в���ʵ�֣�����û�к����塣���ں����ڼ̳�ʱ��Ҫ����ʵ�ִ˷�����
}

// ��������Ա��̳�
// ���̳еĸ����ǳ�����ʱ����Ҫ���������е����г��󷽷�ȫ��ʵ�֡�
class cat extends Animal {
	// ʵ�ָ����cry���󷽷�
	public void cry() {
		System.out.println("è��:");

	}
	
}

class dog extends Animal{
	public void cry() {
		System.out.println("����");
	}
}
