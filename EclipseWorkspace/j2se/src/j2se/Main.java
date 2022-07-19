package j2se;

public class Main {
	 public static void main(String[] args) {

	        //生成一个实现可USB接口（标准）的U盘对象

	        YouPan youPan = new YouPan();

	        //调用U盘的read( )方法读取数据

	        youPan.read();

	        //调用U盘的write( )方法写入数据

	        youPan.write();

	        //生成一个实现可USB接口（标准）的键盘对象

	        JianPan jianPan = new JianPan();

	        //调用键盘的read( )方法读取数据

	        jianPan.read();

	        //调用键盘的write( )方法写入数据

	        jianPan.write();

	    }

}
