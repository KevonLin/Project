package j2se;

public class YouPan implements USB {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("U盘正在通过USB功能读取数据");

	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("U盘正在通过USB功能写入数据");
	}

}
