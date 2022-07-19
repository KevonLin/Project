package week4;

public class As8 {
	static double sLon = 3000.0;
	static double sDec = 5.0;

	public static void main(String[] args) {
		int count = 0;
		do {
			sLon /= 2;
			count++;
		} while (sLon >= 5);
		System.out.println("一共用" + count + "次");
	}
}
