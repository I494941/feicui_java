package com.feicuiedu.andori06.java.daily.dao;

import com.feicuiedu.andori06.java.daily.db.DBUtils;
import com.feicuiedu.andori06.java.daily.entity.Daily;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyan on 2016/10/17.
 */
public class DailyDao {

    // 新增一笔user_资料

    public void saveDaily(Daily daily) throws
            SQLException,
            IOException,
            ClassNotFoundException {


        StringBuilder sql = new StringBuilder();
        sql.append(" insert into ");
        sql.append("    daily_ ");
        sql.append("        (id,name,create_time,create_id,should_finished_work,");
        sql.append("         have_finished_work,unfinished_work_reason,question_and_answer,");
        sql.append("         next_day_plan)  ");
        sql.append("    values");
        sql.append("         ('" + daily.getId() + "','" + daily.getName() + "',");
        sql.append("          '" + daily.getCreateTime() + "','" + daily.getCreateId() + "',");
        sql.append("          '" + daily.getShouldFinishedWork() + "',");
        sql.append("          '" + daily.gethaveFinishedWork() + "',");
        sql.append("          '" + daily.getunFinishedWorkReason() + "',");
        sql.append("          '" + daily.getQuestionAndAnswer() +"',");
        sql.append("          '" + daily.getNextDayPlan() + "')");

        DBUtils.modifyTable(sql.toString());
    }

    // 根据条件 返回user资料集合
    public List<Daily> getDailyByCondition(Daily daily) {

        StringBuilder sb = new StringBuilder();
        sb.append(" select ");
        sb.append("     * ");
        sb.append(" from ");
        sb.append("     daily_ ");
        sb.append(" where 1=1 ");

        if (daily.getId() != null) {

            sb.append(" and    id = '" + daily.getId()+ "'");
        }

        if (daily.getName() != null) {

            sb.append(" and  name = '" + daily.getName()+ "'");
        }

        if (daily.getCreateTime() != null) {

            sb.append(" and  create_time = '" + daily.getCreateTime()+ "'");
        }

        if (daily.getCreateId() != null) {

            sb.append(" and  create_id = '" + daily.getCreateId()+ "'");
        }

        if (daily.getShouldFinishedWork() != null) {

            sb.append(" and  should_finished_work = '" + daily.getShouldFinishedWork()+ "'");
        }

        if (daily.gethaveFinishedWork() != null) {

            sb.append(" and  have_finished_work = '" + daily.gethaveFinishedWork()+ "'");
        }

        if (daily.getunFinishedWorkReason() != null) {

            sb.append(" and  unfinished_work_reason = '" + daily.getunFinishedWorkReason()+ "'");
        }

        if (daily.getQuestionAndAnswer() != null) {

            sb.append(" and  question_and_answer = '" + daily.getQuestionAndAnswer()+ "'");
        }

        if (daily.getNextDayPlan() != null) {

            sb.append(" and  next_day_plan = '" + daily.getNextDayPlan()+ "'");
        }
        sb.append(" order by create_time desc ");

        System.out.println(sb.toString());
        List<Daily> listDaily = new ArrayList<Daily>();

        List<Map<String, Object>> list = DBUtils.queryTable(sb.toString());

        for (Map<String, Object> map : list) {

            Long id = (Long) map.get("id");
            String name = (String) map.get("name");
            Timestamp createTime = (Timestamp) map.get("create_time");
            Long createId = (Long) map.get("create_id");
            String shouldFinishedWork = (String) map.get("should_finished_work");
            String haveFinishedWork = (String) map.get("have_finished_work");
            String unfinishedWorkReason = (String) map.get("unfinished_work_reason");
            String questionAndAnswer = (String) map.get("question_and_answer");
            String nextDayPlan = (String) map.get("next_day_plan");


            Daily tmpDaily = new Daily();

            tmpDaily.setId(new BigInteger(id + ""));
            tmpDaily.setName(name);

            tmpDaily.setCreateTime(createTime);
            tmpDaily.setCreateId(new BigInteger(createId + ""));

            tmpDaily.setShouldFinishedWork(shouldFinishedWork);
            tmpDaily.sethaveFinishedWork(haveFinishedWork);
            tmpDaily.setunFinishedWorkReason(unfinishedWorkReason);
            tmpDaily.setQuestionAndAnswer(questionAndAnswer);
            tmpDaily.setNextDayPlan(nextDayPlan);

            listDaily.add(tmpDaily);
        }

        return listDaily;
    }
}
