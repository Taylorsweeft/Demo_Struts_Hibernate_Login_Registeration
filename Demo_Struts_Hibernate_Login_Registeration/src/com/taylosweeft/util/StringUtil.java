package com.taylosweeft.util;

public class StringUtil {
	public String getRandomString() {
		String str = "";
		for (int i = 0; i < 5; i++) {
			str = str + (char) (Math.random() * 26 + 'A');
		}
		return str;

	}

}
