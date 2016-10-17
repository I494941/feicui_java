package com.feicuiedu.andori06.java.daily.control;

import com.feicuiedu.andori06.java.daily.services.UserService;

import java.sql.Date;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/17.
 */
public class UserControl {

    public Map<String,String> showLogin() {

        UserService userService = new UserService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入登录账号:");
        String loginName = scanner.next();
        System.out.println("请输入登录密码:");
        String password = scanner.next();

        Map<String,String> resultMap = userService.login(loginName,password);

       /* String result = resultMap.get("result");
        String userId = null;
        if (result.equals("success")) {
            userId = resultMap.get("userId");
        }*/
        return resultMap;
    }

    public void showRegister() {

        UserService userService = new UserService();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("请输入登录账号:");
            String loginName = scanner.next();

            System.out.println("请输入登录密码:");
            String password = scanner.next();

            System.out.println("请输入确认密码:");
            String rePassword = scanner.next();

            System.out.println("请输入姓名:");
            String name = scanner.next();

            System.out.println("请输入出生日期(yyyy-MM-dd):");
            String strBirthday = scanner.next();

            System.out.println("请输入性别(0:女，1:男):");
            String sex = scanner.next();

            System.out.println("请输入个人描述:");
            String description = scanner.next();

            Date birthday = Date.valueOf(strBirthday);

            if (password.equals(rePassword)) {
                userService.register(
                        name,
                        sex,
                        birthday,
                        loginName,
                        password,
                        description
                );

                break;
            }
        } while (true);
    }
}
