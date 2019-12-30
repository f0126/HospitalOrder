package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Illnesscase implements Serializable {
    private Integer caseid;

    private Integer paymentslipid;

    private Integer patientid;

    private Date deliverytime;

    private String treatment;

    private static final long serialVersionUID = 1L;

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public Integer getPaymentslipid() {
        return paymentslipid;
    }

    public void setPaymentslipid(Integer paymentslipid) {
        this.paymentslipid = paymentslipid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment == null ? null : treatment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseid=").append(caseid);
        sb.append(", paymentslipid=").append(paymentslipid);
        sb.append(", patientid=").append(patientid);
        sb.append(", deliverytime=").append(deliverytime);
        sb.append(", treatment=").append(treatment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}