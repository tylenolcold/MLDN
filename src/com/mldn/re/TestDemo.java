package com.mldn.re;

import java.util.regex.Pattern;
import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String string = "a1b22c333d4444e55555f";
		String regexString = "\\d+";
		Pattern pattern = Pattern.compile(regexString);
		String result [] = pattern.split(string);
		System.out.println(Arrays.deepToString(result));
	}

}
