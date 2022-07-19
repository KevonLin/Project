
public class WhileTest {

	public static void main(String[] args) {
		
		int i = 0;
		
		for(int num = 1;num <= 1000;num++) {
			if(num%5==0)
				System.out.print(num + "\t");
			i++;
			if(i==5) {
				System.out.println(" ");
				i = 0;
			}
		}
		
	}
}
