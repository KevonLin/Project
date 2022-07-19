
public class RenBieShuTest {
	public static void main(String[] args) {
		
		Ren zhangsan = new Ren();
		zhangsan .idCard ="124412";
		zhangsan.name = "张三";
		zhangsan.sex = true;
		zhangsan.age = 100;
		
		BieShu fangZi = new BieShu();
		fangZi.mianJi = 500.0;
		//让别墅有主人
		fangZi.zhuRen = zhangsan;
		
		//想知道房子主任的名字是什么
		System.out.println(fangZi.zhuRen.name);
		
		//房子换主人了
		//创建一个新的主人对象
		Ren lisi = new Ren();
		lisi.name = "李四";
		
		//换主人
		fangZi.zhuRen = lisi;
		
		//想知道房子的主人名字
		System.out.println(fangZi.zhuRen.name);
	}
}
