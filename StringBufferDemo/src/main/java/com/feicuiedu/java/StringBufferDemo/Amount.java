package com.feicuiedu.java.StringBufferDemo;

import java.util.Scanner;

public class Amount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一串数字： ");
		String nums = input.next();
		StringBuffer str = new StringBuffer(nums);
		for (int i = str.length() - 3; i > 0; i = i - 3) {
			str.insert(i, ',');
		}
		System.out.print(str);
	}
}
