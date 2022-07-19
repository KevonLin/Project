package com.lin.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月31日 下午3:46:17
 */

public class EncryptUtils {
	public static String sign(String str, String type) {
		String s = Encrypt(str, type);
		return s;
	}

	public static String Encrypt(String strSrc, String encName) {
		MessageDigest md = null;
		String strDes = null;
		byte[] bt = strSrc.getBytes();
		try {
			md = MessageDigest.getInstance(encName);
			md.update(bt);
			strDes = bytes2Hex(md.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
		return strDes;
	}

	public static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}

	public String getSHA1Encrypt(String str) {
		if (str == "") {
			return null;
		}
		String type = "SHA-1";
		String result = sign(str, type);
		return result;
	}

	@Test
	public void test() {
		String str1 = getSHA1Encrypt("123456");
		System.out.println(str1);
	}
}
