//测试类
public class OOTest02 {
	public static void main(String[] args) {
		
		//创建User对象
		//u是局部变量
		//u是一个引用
		//u保存内存地址只想堆内存的User对象
		User u = new User();
		
		//输出User对象内部实例变量的值
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.add);
		
		//修改User对象内部实例变量的值
		u.no = 110;
		u.name = "Jack";//"jack"是一个Java对象，属于String对象	
		u.add = new Address();
		
		//在main方法中目前只能ka看到一个引用“u”
		//一切都是只能通过u来进行访问
		System.out.println(u.name + "居住在哪个城市：" + u.add.city);
		System.out.println(u.name + "居住在哪个街道：" + u.add.street);
		System.out.println("邮编：" + u.add.zipcode);
		
		u.add.city = "北京";
		u.add.street = "朝阳";
		u.add.zipcode = "10000";
		
		System.out.println(u.name + "居住在哪个城市：" + u.add.city);
		System.out.println(u.name + "居住在哪个街道：" + u.add.street);
		System.out.println("邮编：" + u.add.zipcode);
	}
}
