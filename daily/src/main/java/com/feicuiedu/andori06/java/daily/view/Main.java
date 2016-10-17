package com.feicuiedu.andori06.java.daily.view;

import com.feicuiedu.andori06.java.daily.control.DailyControl;
import com.feicuiedu.andori06.java.daily.control.UserControl;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserControl userControl = new UserControl();

        String userId = null;
        while (true) {
            System.out.println("翡翠欢迎你");
            System.out.println("请选择你的操作");
            System.out.println("1:登录");
            System.out.println("2:注册");

            int selected = scanner.nextInt();

            if (selected == 1) {
                Map<String, String> resultMap = userControl.showLogin();

                String result = resultMap.get("result");

                if (result.equals("success")) {
                    userId = resultMap.get("userId");
                    break;
                }
                else {
                    System.out.println("登录失败");
                }

            }
            else if (selected == 2){
                userControl.showRegister();
            }
            else {
                System.out.println("这就是乱输入的代价！！！");
                System.exit(0);
            }
        }

        if (userId != null ) {

            DailyControl dailyControl = new DailyControl();

            do {
                System.out.println("请选择你的操作");
                System.out.println("1:查看当前日报");
                System.out.println("2:新增日报");

                int selected = scanner.nextInt();

                if (selected == 1) {
                   dailyControl.showDaliyByUser(userId);


                } else
                    if (selected == 2) {
                        dailyControl.writeDaily(userId);
                    } else {
                        System.out.println("这就是乱输入的代价！！！");
                        System.exit(0);
                    }
            }while (true);
        }
    }
}
