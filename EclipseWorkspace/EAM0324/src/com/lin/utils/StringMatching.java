package com.lin.utils;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月23日 下午8:26:44
 */

public class StringMatching {

	private int[] nextval = null;

	public static String stringMatching() {
		return null;
	}

	public int KMP(String s, String mode, int pos) {
		int i = pos, j = 1;
		while (i <= s.length() && j <= mode.length()) {
			if (s.charAt(i - 1) == mode.charAt(j - 1)) {
				++i;
				++j;
			} else {
				j = nextval[j];
			}
		}
		if (j > mode.length()) {
			return i - mode.length();
		}
		return 0;
	}

	public int[] getNextval(String s) {

		return nextval;
	}

}
