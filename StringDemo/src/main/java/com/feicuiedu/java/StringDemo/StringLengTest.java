package com.feicuiedu.java.StringDemo;

import java.util.Scanner;

public class StringLengTest {

    public static void main(String[] args) {

        System.out.println("请输入用户名：");
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        if (password.length() < 6) {
            System.out.println("密码不能小于6位");
        }
        else {
            System.out.println("注册成功");
        }

    }
}
