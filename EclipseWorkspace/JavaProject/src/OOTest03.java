
public class OOTest03 {
	public static void main(String[] args) {
		
		User u = new User();
		//上个版本写的
		//u.add = new Address();
		
		//a是引用
		//a是局部变量
		Address a = new Address();
		u.add = a;
		
		System.out.println(u.add.city);//null
		
		a.city = "天津";
		
		System.out.println(u.add.city);
		
		
	}
}
