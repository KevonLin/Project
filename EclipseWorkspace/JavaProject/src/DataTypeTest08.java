/*
 	关于基本数据类型之间的互相转换
 	转换规则：
 		1、八种基本数据类型中出布尔类型之外剩下的7中类型之间都可以互相转换
 		
 		2、小容量向大容量转换，成为自动类型转换，容量从小到大排序
 			byte<short<int<long<float<double
 			注意：
 				任何浮点类型，不管占用多少字节都比整数型容量大。
 				char和short可表示的种类数量相同，但char可以取到更大的正整数
 		
 		3、char c = 97;大容量转换成小容量，强制类型转换，需要强制类型转换符，才能编译通过
 		
 		4、证书字面值没有超出byte、short、char的范围，可直接赋值给byte、short、char类型的变量
 		
 		5、byte，short，char混合运算的时候，各自先转换成int类型再做运算
 		
 		6、多种数据类型混合运算，先转换成大容量类型再做运算
 		
 			
 */
public class DataTypeTest08 {
	public static void main(String[] args) {
		
	}

}
