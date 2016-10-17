package com.feicuiedu.andori06.java.daily.services;

import com.feicuiedu.andori06.java.daily.dao.DailyDao;
import com.feicuiedu.andori06.java.daily.entity.Daily;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyan on 2016/10/17.
 */
public class DailyService {


    public Map<String, Object> showDailyByUser(String userId) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

        DailyDao dailyDao = new DailyDao();

        Daily paramDaily = new Daily();
        paramDaily.setCreateId(new BigInteger(userId));

        List<Daily> list = dailyDao.getDailyByCondition(paramDaily);

        if (!list.isEmpty()) {
            resultMap.put("result",
                    "success");
            resultMap.put("list",
                    list);
        } else {
            resultMap.put("result",
                    "failed");
        }

        return resultMap;
    }

    public Map<String, String> wirteDaily(String name,
                                          String userId,
                                          String shouldFinishedWork,
                                          String haveFinishedWork,
                                          String unFinishedWorkResaon,
                                          String questionAndAnswer,
                                          String nextDayPlan) {

        Map<String, String> resultMap = new HashMap<String, String>();

        long dailyId = System.currentTimeMillis();

        Daily daily = new Daily(
                name,
                shouldFinishedWork,
                haveFinishedWork,
                unFinishedWorkResaon,
                questionAndAnswer,
                nextDayPlan
        );

        BigInteger id = new BigInteger(dailyId+"");

        daily.setId(id);

        Timestamp createTime = new Timestamp(Calendar.getInstance().getTime().getTime());
        daily.setCreateTime(createTime);
        daily.setCreateId(new BigInteger(userId+""));

        DailyDao dailyDao = new DailyDao();
        try {
            dailyDao.saveDaily(daily);

            resultMap.put("result",
                    "success");
        }
        catch (SQLException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!" + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!" + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!" + e.getMessage());
        }

        return resultMap;
    }
}
