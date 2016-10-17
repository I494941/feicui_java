package com.feicuiedu.andori06.java.daily.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by chenyan on 2016/10/17.
 */
public class Daily {

    // 日报主键
    private BigInteger id;

    // 日报名称
    private String name;

    // 日报的创建时间
    private Timestamp createTime;

    // 创建人
    private BigInteger createId;

    // 应完成工作
    private String shouldFinishedWork;

    // 已经完成工作
    private String haveFinishedWork;

    // 未完成工作原因
    private String unFinishedWorkReason;

    // 遇到问题和解决方案
    private String questionAndAnswer;

    // 明日计划
    private String nextDayPlan;

    public Daily() {

    }

    public Daily(String name,
                 String shouldFinishedWork,
                 String haveFinishedWork,
                 String unFinishedWorkReason,
                 String questionAndAnswer,
                 String nextDayPlan) {
        this.name = name;
        this.shouldFinishedWork = shouldFinishedWork;
        this.haveFinishedWork = haveFinishedWork;
        this.unFinishedWorkReason = unFinishedWorkReason;
        this.questionAndAnswer = questionAndAnswer;
        this.nextDayPlan = nextDayPlan;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public BigInteger getCreateId() {
        return createId;
    }

    public void setCreateId(BigInteger createId) {
        this.createId = createId;
    }

    public String getShouldFinishedWork() {
        return shouldFinishedWork;
    }

    public void setShouldFinishedWork(String shouldFinishedWork) {
        this.shouldFinishedWork = shouldFinishedWork;
    }

    public String gethaveFinishedWork() {
        return haveFinishedWork;
    }

    public void sethaveFinishedWork(String haveFinishedWork) {
        this.haveFinishedWork = haveFinishedWork;
    }

    public String getunFinishedWorkReason() {
        return unFinishedWorkReason;
    }

    public void setunFinishedWorkReason(String unFinishedWorkReason) {
        this.unFinishedWorkReason = unFinishedWorkReason;
    }

    public String getQuestionAndAnswer() {
        return questionAndAnswer;
    }

    public void setQuestionAndAnswer(String questionAndAnswer) {
        this.questionAndAnswer = questionAndAnswer;
    }

    public String getNextDayPlan() {
        return nextDayPlan;
    }

    public void setNextDayPlan(String nextDayPlan) {
        this.nextDayPlan = nextDayPlan;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", createId=" + createId +
                ", shouldFinishedWork='" + shouldFinishedWork + '\'' +
                ", haveFinishedWork='" + haveFinishedWork + '\'' +
                ", unFinishedWorkReason='" + unFinishedWorkReason + '\'' +
                ", questionAndAnswer='" + questionAndAnswer + '\'' +
                ", nextDayPlan='" + nextDayPlan + '\'' +
                '}';
    }
}


