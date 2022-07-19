import java.math.BigDecimal;

public class DentiferTest {

	public static void main(String[] args) {
		
		int a123 = 23;
		int $12a = 124;
		int _12 = 1;
		
		System.out.println("-------------------");
		
		//使用j精确浮点运行，推荐：BigDecimal
		//subtract：减
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		
		BigDecimal a = BigDecimal.valueOf(1.0);
		a = a.add(BigDecimal.valueOf(0.1));
		System.out.println(a);
	}
}
