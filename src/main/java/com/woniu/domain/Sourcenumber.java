package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Sourcenumber implements Serializable {
    private Integer sourceid;

    private Integer projectid;

    private Integer sourcecode;

    private Date sourcetime;

    private String sourceampm;

    private Integer sourcenumup;

    private Integer surplusnum;

    private Double sourceprice;
    
    private Project project;
    
    private static final long serialVersionUID = 1L;
    
    
    public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(Integer sourcecode) {
        this.sourcecode = sourcecode;
    }

    public Date getSourcetime() {
        return sourcetime;
    }

    public void setSourcetime(Date sourcetime) {
        this.sourcetime = sourcetime;
    }

    public String getSourceampm() {
        return sourceampm;
    }

    public void setSourceampm(String sourceampm) {
        this.sourceampm = sourceampm == null ? null : sourceampm.trim();
    }

    public Integer getSourcenumup() {
        return sourcenumup;
    }

    public void setSourcenumup(Integer sourcenumup) {
        this.sourcenumup = sourcenumup;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
    }

    public Double getSourceprice() {
        return sourceprice;
    }

    public void setSourceprice(Double sourceprice) {
        this.sourceprice = sourceprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sourceid=").append(sourceid);
        sb.append(", projectid=").append(projectid);
        sb.append(", sourcecode=").append(sourcecode);
        sb.append(", sourcetime=").append(sourcetime);
        sb.append(", sourceampm=").append(sourceampm);
        sb.append(", sourcenumup=").append(sourcenumup);
        sb.append(", surplusnum=").append(surplusnum);
        sb.append(", sourceprice=").append(sourceprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}