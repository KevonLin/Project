/*
 	if语句
 */
public class IfTest04 {
	public static void main(String[] args) {
		boolean sex = false;
		
		if(sex) {
			System.out.println('男');
		}else {
			System.out.println('女');
		}
		
		sex = false;
		
		if(sex) System.out.println('男');else System.out.println('女');
		
		//-------------------------------------------
		
		if(sex)
			System.out.println("男");
			System.out.println("呵呵");
			
		//编译不能通过的原因else没有if
	/*		
		else
			System.out.println("女");
	*/
	}
}
