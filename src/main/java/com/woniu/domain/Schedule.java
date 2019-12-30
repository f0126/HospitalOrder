package com.woniu.domain;

import java.io.Serializable;

public class Schedule implements Serializable {
    private Integer scheduleid;

    private String schedulecode;

    private String scheduleday;

    private String scheduleampm;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulecode() {
        return schedulecode;
    }

    public void setSchedulecode(String schedulecode) {
        this.schedulecode = schedulecode == null ? null : schedulecode.trim();
    }

    public String getScheduleday() {
        return scheduleday;
    }

    public void setScheduleday(String scheduleday) {
        this.scheduleday = scheduleday == null ? null : scheduleday.trim();
    }

    public String getScheduleampm() {
        return scheduleampm;
    }

    public void setScheduleampm(String scheduleampm) {
        this.scheduleampm = scheduleampm == null ? null : scheduleampm.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", schedulecode=").append(schedulecode);
        sb.append(", scheduleday=").append(scheduleday);
        sb.append(", scheduleampm=").append(scheduleampm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}