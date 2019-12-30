package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Bookingform implements Serializable {
    private Integer bookingid;

    private Integer patientid;

    private Integer sourceid;

    private Integer queuingid;

    private String bookingcode;

    private Date bookingtime;

    private String bookingstatus;

    private static final long serialVersionUID = 1L;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public Integer getQueuingid() {
        return queuingid;
    }

    public void setQueuingid(Integer queuingid) {
        this.queuingid = queuingid;
    }

    public String getBookingcode() {
        return bookingcode;
    }

    public void setBookingcode(String bookingcode) {
        this.bookingcode = bookingcode == null ? null : bookingcode.trim();
    }

    public Date getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(Date bookingtime) {
        this.bookingtime = bookingtime;
    }

    public String getBookingstatus() {
        return bookingstatus;
    }

    public void setBookingstatus(String bookingstatus) {
        this.bookingstatus = bookingstatus == null ? null : bookingstatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookingid=").append(bookingid);
        sb.append(", patientid=").append(patientid);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", queuingid=").append(queuingid);
        sb.append(", bookingcode=").append(bookingcode);
        sb.append(", bookingtime=").append(bookingtime);
        sb.append(", bookingstatus=").append(bookingstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}