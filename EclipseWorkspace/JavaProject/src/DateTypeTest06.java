/*
 	浮点型数据类型
 		float 单精度【4个字节】
 		double 双精度【4个字节，精度较高】
 		
 		double的精度太低【相对来说】，不适合做财务软件
 		java.math.BigDecimal 不属于基本属于类型
 		
 		java语言中，所有的浮点型字面值默认被当作double类型来处理
 		想该字面值当作float类型处理，需要在字面值后加F/f
 		
 		注意：
 			double和float在计算机内部二进制存储的时候存储的都是近似值。
 			无限循环小数，有限的资源存储无限的数据只能存储近似值
 			
 */
public class DateTypeTest06 {
	public static void main(String[] args) {
		
		//大容量转换成小容量需要加强制类型转换符，以下编译错误。
		//float f = 5.1;
		//float
		
		//解决方案：
		//第一种：强制转换符转换
		//float f = (float)5.1;
		
		//第二种方式：没有类型转换
		float f =5.1f;
		System.out.println(f);
		
	}

}
