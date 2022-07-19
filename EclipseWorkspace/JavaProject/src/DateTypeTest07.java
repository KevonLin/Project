/*
 	关于布尔型数据类型：
 		boolean
 		
 		Java语言中boolean类型只有两个值：true，false，没有其他之
 		C语言中，0和1可以表示真和假
 		
 		在底层储存的时候boolean类型占用一个字节，因为实际存储的时候false底层是0，true底层是1
 		
 		经常运用在逻辑运算和条件控制语句中。
 */
public class DateTypeTest07 {
	public static void main(String[] args) {
		
		//编译错误：不兼容而类型
		//boolean flag = 1;
		
		boolean loginSuccess = true;
		
		//if条件控制语句
		if(loginSuccess) {
			System.out.println("恭喜你，登陆成功！");
		}
		else {
			System.out.println("对不起，当前用户名不存在或者密码错误！");
		}
		
	}
}
