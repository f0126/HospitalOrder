package com.woniu.domain;

import java.io.Serializable;

public class Queuing implements Serializable {
    private Integer queuingid;

    private Integer scheduleid;

    private Integer doctorid;

    private String seekmedicalstatus;

    private static final long serialVersionUID = 1L;

    public Integer getQueuingid() {
        return queuingid;
    }

    public void setQueuingid(Integer queuingid) {
        this.queuingid = queuingid;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getSeekmedicalstatus() {
        return seekmedicalstatus;
    }

    public void setSeekmedicalstatus(String seekmedicalstatus) {
        this.seekmedicalstatus = seekmedicalstatus == null ? null : seekmedicalstatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", queuingid=").append(queuingid);
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", seekmedicalstatus=").append(seekmedicalstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}