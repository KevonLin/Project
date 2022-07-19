package j2se;

import java.util.ArrayList;
import java.util.List;

public class ImplatementsTest {
	/**
	 * This is the Test program.
	 * 
	 * @version 2018-04-06
	 * @author Octopusfly
	 */
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add(0, "string0");
		stringList.add(1, "string1");
		stringList.add(2, "string2");
		stringList.add(3, "string3");
		stringList.add(4, "string4");
		System.out.println(stringList);
	}
}
