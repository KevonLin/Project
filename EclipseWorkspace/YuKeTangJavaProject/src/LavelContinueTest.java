
public class LavelContinueTest {

	public static void main(String[] args) {

		// ��ӡ101-150֮�����е�����
		A:for (int i = 101; i <= 150; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					continue A;
			}
			System.out.print(i + " ");
		}
	}
}
