package com.woniu.domain;

import java.io.Serializable;

public class Project implements Serializable {
    private Integer projectid;

    private Integer sourceid;

    private String projectname;

    private Double projectidprice;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Double getProjectidprice() {
        return projectidprice;
    }

    public void setProjectidprice(Double projectidprice) {
        this.projectidprice = projectidprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectid=").append(projectid);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", projectname=").append(projectname);
        sb.append(", projectidprice=").append(projectidprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}