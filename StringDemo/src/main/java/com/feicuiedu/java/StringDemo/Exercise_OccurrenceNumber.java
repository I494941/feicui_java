package com.feicuiedu.java.StringDemo;

import java.util.Scanner;

public class Exercise_OccurrenceNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String str = input.nextLine();
		System.out.print("请输入要查找的字符：");
		char find = input.nextLine().charAt(0);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == find) {

				sum++;
			}
		}

		System.out.println(sum);
	}
}
