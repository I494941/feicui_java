package com.feicuiedu.java.StringDemo;

public class Exercise_Fish {
	public static void main(String[] args) {
		String word = "Hello,      ";
		word = word.trim();
		String s = word.concat("小鱼儿!");
		int index1 = s.indexOf(',');
		int index2 = s.indexOf('!');
		System.out.println(s.substring(index1 + 1, index2));
	}
}
