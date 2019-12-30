package com.woniu.domain;

import java.io.Serializable;

public class Nurse implements Serializable {
    private Integer nurseid;

    private Integer uid;

    private String nursename;

    private String nurselevel;

    private String nursephoto;

    private static final long serialVersionUID = 1L;

    public Integer getNurseid() {
        return nurseid;
    }

    public void setNurseid(Integer nurseid) {
        this.nurseid = nurseid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNursename() {
        return nursename;
    }

    public void setNursename(String nursename) {
        this.nursename = nursename == null ? null : nursename.trim();
    }

    public String getNurselevel() {
        return nurselevel;
    }

    public void setNurselevel(String nurselevel) {
        this.nurselevel = nurselevel == null ? null : nurselevel.trim();
    }

    public String getNursephoto() {
        return nursephoto;
    }

    public void setNursephoto(String nursephoto) {
        this.nursephoto = nursephoto == null ? null : nursephoto.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nurseid=").append(nurseid);
        sb.append(", uid=").append(uid);
        sb.append(", nursename=").append(nursename);
        sb.append(", nurselevel=").append(nurselevel);
        sb.append(", nursephoto=").append(nursephoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}