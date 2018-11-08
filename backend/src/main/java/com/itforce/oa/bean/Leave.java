package com.itforce.oa.bean;

import java.util.Date;

public class Leave {
    private Integer id;

    private Integer staffId;

    private Date startTime;

    private Date endTime;

    private String reason;

    private Integer replied;

    private Date repliedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getReplied() {
        return replied;
    }

    public void setReplied(Integer replied) {
        this.replied = replied;
    }

    public Date getRepliedTime() {
        return repliedTime;
    }

    public void setRepliedTime(Date repliedTime) {
        this.repliedTime = repliedTime;
    }
}