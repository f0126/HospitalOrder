package com.woniu.domain;

import java.io.Serializable;

public class Doctor implements Serializable {
    private Integer doctorid;

    private Integer consroomid;

    private Integer departmentid;

    private Integer uid;

    private String doctorname;

    private String doctorlevel;

    private String doctorstatus;

    private String doctorphoto;
    
    private Consultingroom consultingroom;
    
    private Department department;
    
    private Users users;

    public Consultingroom getConsultingroom() {
		return consultingroom;
	}

	public void setConsultingroom(Consultingroom consultingroom) {
		this.consultingroom = consultingroom;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	private static final long serialVersionUID = 1L;

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getConsroomid() {
        return consroomid;
    }

    public void setConsroomid(Integer consroomid) {
        this.consroomid = consroomid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public String getDoctorlevel() {
        return doctorlevel;
    }

    public void setDoctorlevel(String doctorlevel) {
        this.doctorlevel = doctorlevel == null ? null : doctorlevel.trim();
    }

    public String getDoctorstatus() {
        return doctorstatus;
    }

    public void setDoctorstatus(String doctorstatus) {
        this.doctorstatus = doctorstatus == null ? null : doctorstatus.trim();
    }

    public String getDoctorphoto() {
        return doctorphoto;
    }

    public void setDoctorphoto(String doctorphoto) {
        this.doctorphoto = doctorphoto == null ? null : doctorphoto.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorid=").append(doctorid);
        sb.append(", consroomid=").append(consroomid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", uid=").append(uid);
        sb.append(", doctorname=").append(doctorname);
        sb.append(", doctorlevel=").append(doctorlevel);
        sb.append(", doctorstatus=").append(doctorstatus);
        sb.append(", doctorphoto=").append(doctorphoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}