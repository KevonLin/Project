
public class OOTest04 {
	public static void main(String[] args) {
		
		//创建一个丈夫对象
		Husband huangXiaoMing = new Husband();
		huangXiaoMing.name = "黄晓明";
		
		//创建一个妻子对象
		Wife baby = new Wife();
		baby.name = "baby";
		
		//结婚【能通过丈夫找到妻子，通过妻子找到丈夫】
		huangXiaoMing.w = baby;
		baby.h = huangXiaoMing;
		
		//得到以上“黄晓明”的妻子的名字
		
		//System.out.println(huangXiaoMing.name + "妻子的名字叫：" + baby.name);
		System.out.println(huangXiaoMing.name + "妻子的名字叫：" + huangXiaoMing.w.name);
		System.out.println(baby.name + "丈夫的名字叫：" + baby.h.name);
	}
}
