package com.woniu.domain;

import java.io.Serializable;

public class Consultingroom implements Serializable {
    private Integer consroomid;

    private Integer doctorid;

    private String consroomname;

    private static final long serialVersionUID = 1L;

    public Integer getConsroomid() {
        return consroomid;
    }

    public void setConsroomid(Integer consroomid) {
        this.consroomid = consroomid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getConsroomname() {
        return consroomname;
    }

    public void setConsroomname(String consroomname) {
        this.consroomname = consroomname == null ? null : consroomname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", consroomid=").append(consroomid);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", consroomname=").append(consroomname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}