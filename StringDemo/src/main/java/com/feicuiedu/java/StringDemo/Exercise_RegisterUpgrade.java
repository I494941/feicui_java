package com.feicuiedu.java.StringDemo;

import java.util.Scanner;

public class Exercise_RegisterUpgrade {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			boolean isOk = true;
			do {
				System.out.println("***欢迎进入注册系统***");
				System.out.print("请输入身份证：");
				String card = input.next();
				System.out.print("请输入手机号：");
				String phoneNum = input.next();
				System.out.print("请输入座机号：");
				String number1 = input.next();
				if (card.length() == 16 || card.length() == 18) {
					if (phoneNum.length() == 11) {
						String[] num = number1.split("-");
						if (num[0].length() == 4 && num[1].length() == 7) {
							System.out.println("注册成功！");
							isOk = false;
						} else {
							System.out.println("座机号码区号必须为4位，" + "电话号码必须为7位！");
						}
					} else {
						System.out.println("手机号码必须是11位！");
					}
				} else {
					System.out.println("身份证号必须是16位或18位！");
				}
			} while (isOk);
		}
}
