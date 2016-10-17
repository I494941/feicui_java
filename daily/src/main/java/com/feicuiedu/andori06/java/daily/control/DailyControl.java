package com.feicuiedu.andori06.java.daily.control;

import com.feicuiedu.andori06.java.daily.entity.Daily;
import com.feicuiedu.andori06.java.daily.services.DailyService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chenyan on 2016/10/17.
 */
public class DailyControl {

    public void showDaliyByUser(String userId) {

        DailyService dailyService = new DailyService();

        Map<String,Object> resultMap = dailyService.showDailyByUser(userId);

        for (Daily daily:(List<Daily>)resultMap.get("list")) {
            System.out.println(daily);
        }

    }

    public void writeDaily(String userId) {

        DailyService dailyService = new DailyService();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("请输入日报名称:");
            String name = scanner.next();

            System.out.println("应完成工作:");
            String shouldFinishedWork = scanner.next();

            System.out.println("已完成工作:");
            String haveFinishedWork = scanner.next();

            System.out.println("未完成原因:");
            String unFinishedWorkReason = scanner.next();

            System.out.println("遇到问题&解决方案:");
            String questionAndAnswer = scanner.next();

            System.out.println("明日计划:");
            String nextDayPlan = scanner.next();

            Map<String,String> resultMap = dailyService.wirteDaily(name,
                    userId,
                    shouldFinishedWork,
                    haveFinishedWork,
                    unFinishedWorkReason,
                    questionAndAnswer,
                    nextDayPlan);

            String result = resultMap.get("result");

            if (result.equals("success")) {
                showDaliyByUser(userId);
            }
            else {
                break;
            }
        } while (true);
    }
}
