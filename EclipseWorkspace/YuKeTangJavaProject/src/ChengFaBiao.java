
public class ChengFaBiao {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				if(i < j)
					System.out.print(i + "��" + j + "=" + i*j + "\t");
				else
					System.out.print(j + "��" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
