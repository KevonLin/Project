import java.util.concurrent.TimeUnit;

public class CeShi {
	public static void main(String[] Aargs) {
		String s = "\u5230\u8292\u8c37\u6559\u80b2\u5b66\u004a\u0061\u0076\u0061\uff0c\u53ef\u4e0e\u4e0e\u884c\u4e1a]u5927\u5496\u9762\u4ea4\u6d41";
		for(int i = 0;i < s.length();++i) {
			System.out.println(s.charAt(i));
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
