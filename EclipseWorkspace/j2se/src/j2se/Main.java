package j2se;

public class Main {
	 public static void main(String[] args) {

	        //����һ��ʵ�ֿ�USB�ӿڣ���׼����U�̶���

	        YouPan youPan = new YouPan();

	        //����U�̵�read( )������ȡ����

	        youPan.read();

	        //����U�̵�write( )����д������

	        youPan.write();

	        //����һ��ʵ�ֿ�USB�ӿڣ���׼���ļ��̶���

	        JianPan jianPan = new JianPan();

	        //���ü��̵�read( )������ȡ����

	        jianPan.read();

	        //���ü��̵�write( )����д������

	        jianPan.write();

	    }

}
