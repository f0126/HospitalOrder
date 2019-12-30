package com.woniu.domain;

import java.io.Serializable;

public class Patient implements Serializable {
    private Integer patientid;

    private String patientname;

    private Integer patientage;

    private String patientprovincialcard;

    private String patientphone;

    private Double surplusmoney;

    private static final long serialVersionUID = 1L;

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public Integer getPatientage() {
        return patientage;
    }

    public void setPatientage(Integer patientage) {
        this.patientage = patientage;
    }

    public String getPatientprovincialcard() {
        return patientprovincialcard;
    }

    public void setPatientprovincialcard(String patientprovincialcard) {
        this.patientprovincialcard = patientprovincialcard == null ? null : patientprovincialcard.trim();
    }

    public String getPatientphone() {
        return patientphone;
    }

    public void setPatientphone(String patientphone) {
        this.patientphone = patientphone == null ? null : patientphone.trim();
    }

    public Double getSurplusmoney() {
        return surplusmoney;
    }

    public void setSurplusmoney(Double surplusmoney) {
        this.surplusmoney = surplusmoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientid=").append(patientid);
        sb.append(", patientname=").append(patientname);
        sb.append(", patientage=").append(patientage);
        sb.append(", patientprovincialcard=").append(patientprovincialcard);
        sb.append(", patientphone=").append(patientphone);
        sb.append(", surplusmoney=").append(surplusmoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}