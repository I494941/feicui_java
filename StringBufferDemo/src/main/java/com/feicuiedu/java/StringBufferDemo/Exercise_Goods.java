package com.feicuiedu.java.StringBufferDemo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_Goods {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isOk = true;
		do {
			System.out.println("请输入用户名：");
			String name = input.next();
			System.out.println("请输入密码：");
			String pwd = input.next();
			if (name.equals("TOM") && pwd.equals("123")) {
				System.out.println("登录成功！");
				isOk = false;
			}
		} while (isOk);
		if (isOk == false) {
			show();
		}

	}

	public static void show() {
		System.out.println("******欢迎进入商品批发城******");
		System.out.println("\t编号\t商品\t价格");
		System.out.println("\t1\t电风扇\t124.23");
		System.out.println("\t2\t洗衣机\t4,500.0");
		System.out.println("\t3\t电视机\t8,800.9");
		System.out.println("\t4\t冰箱\t5,000.88");
		System.out.println("\t5\t空调机\t4,456.0	");
		System.out.println("******************************");
		System.out.print("请输入商品编号：");
		int num = input.nextInt();
		System.out.println("请输入批发数量：");
		int number = input.nextInt();
		double money = 0;
		switch (num) {
			case 1:
				money += number * 124.23;
				break;
			case 2:
				money += number * 4500.0;
				break;
			case 3:
				money += number * 8800.9;
				break;
			case 4:
				money += number * 5000.88;
				break;
			case 5:
				money += number * 4456.0;
				break;
		}
		DecimalFormat df = new DecimalFormat(".##");
		String allMoney = df.format(money);

		String intPart = allMoney.split("\\.")[0];
		String doublePart = allMoney.split("\\.")[1];
		StringBuffer str = new StringBuffer(intPart);
		for (int i = str.length() - 3; i > 0; i = i - 3) {
			str.insert(i, ',');
		}
		str.append("."+doublePart);
		System.out.println("您需要付款：" + str);
	}
}
