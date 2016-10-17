package com.feicuiedu.java.StringDemo;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String uname, pwd;
		System.out.print("请输入用户名： ");
		uname = input.next();
		System.out.print("请输入密码： ");
		pwd = input.next();
		if (uname.equals("TOM") && pwd.equals("1234567")) {
			System.out.print("登录成功！ ");
		} else {
			System.out.print("用户名或密码不匹配，登录失败！");
		}

		/**
		 * 第二种
		 */
		if (uname.equals("tom") && pwd.equals("abcd")) {
			System.out.print("登录成功！ ");
		} else {
			System.out.print("用户名或密码不匹配，登录失败！");
		}

	}
}
