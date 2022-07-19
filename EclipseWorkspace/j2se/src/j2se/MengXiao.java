package j2se;

public class MengXiao {

	public static void main(String[] args) {
		int m = 48;
		char ch = 'a';
		int n = 0;
		System.out.println((m >= n&& ch < 'b'));
		
		int a = 7 ;
		float x = 2.5f;
		float y = 4.7f;
		System.out.println(x + a%3 *(int)(x+y)%2/4);
		

		System.out.println('A'+4*25.0-'b');
		
		int k =7;
		int j = 12;
		System.out.println( j%k);
		
		a=5;
		System.out.println(a+=a-=a*a);
		
	}
}
