package com.woniu.domain;

import java.io.Serializable;

public class Paymentslip implements Serializable {
    private Integer paymentslipid;

    private Integer caseid;

    private String paymentslipcode;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentslipid() {
        return paymentslipid;
    }

    public void setPaymentslipid(Integer paymentslipid) {
        this.paymentslipid = paymentslipid;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getPaymentslipcode() {
        return paymentslipcode;
    }

    public void setPaymentslipcode(String paymentslipcode) {
        this.paymentslipcode = paymentslipcode == null ? null : paymentslipcode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentslipid=").append(paymentslipid);
        sb.append(", caseid=").append(caseid);
        sb.append(", paymentslipcode=").append(paymentslipcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}