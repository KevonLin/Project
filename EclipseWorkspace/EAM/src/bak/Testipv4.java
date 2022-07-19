package bak;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:48:25
 */

public class Testipv4 {
	public static void main(String[] args) {
		try {
			InetAddress ip4 = InetAddress.getLocalHost();
			String str = ip4.getHostAddress();
			System.out.println(str);
			System.out.println(ip4.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
