
public class ZhiShu {

	// 输出1-100的所有质数
	// 五个换一行
	public static void main(String[] args) {
		int num = 0;
		for (int i = 2; i <= 100; i++) {
			boolean isZhiShu = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isZhiShu = false;
				}
			}
			if (isZhiShu) {
				System.out.print(i + "\t");
				num++;
				if (num == 5) {
					System.out.println(" ");
					num = 0;
				}
			}
		}
	}
}
