
public class RenBieShuTest {
	public static void main(String[] args) {
		
		Ren zhangsan = new Ren();
		zhangsan .idCard ="124412";
		zhangsan.name = "����";
		zhangsan.sex = true;
		zhangsan.age = 100;
		
		BieShu fangZi = new BieShu();
		fangZi.mianJi = 500.0;
		//�ñ���������
		fangZi.zhuRen = zhangsan;
		
		//��֪���������ε�������ʲô
		System.out.println(fangZi.zhuRen.name);
		
		//���ӻ�������
		//����һ���µ����˶���
		Ren lisi = new Ren();
		lisi.name = "����";
		
		//������
		fangZi.zhuRen = lisi;
		
		//��֪�����ӵ���������
		System.out.println(fangZi.zhuRen.name);
	}
}
