package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andConsroomidIsNull() {
            addCriterion("consroomId is null");
            return (Criteria) this;
        }

        public Criteria andConsroomidIsNotNull() {
            addCriterion("consroomId is not null");
            return (Criteria) this;
        }

        public Criteria andConsroomidEqualTo(Integer value) {
            addCriterion("consroomId =", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidNotEqualTo(Integer value) {
            addCriterion("consroomId <>", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidGreaterThan(Integer value) {
            addCriterion("consroomId >", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("consroomId >=", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidLessThan(Integer value) {
            addCriterion("consroomId <", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidLessThanOrEqualTo(Integer value) {
            addCriterion("consroomId <=", value, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidIn(List<Integer> values) {
            addCriterion("consroomId in", values, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidNotIn(List<Integer> values) {
            addCriterion("consroomId not in", values, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidBetween(Integer value1, Integer value2) {
            addCriterion("consroomId between", value1, value2, "consroomid");
            return (Criteria) this;
        }

        public Criteria andConsroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("consroomId not between", value1, value2, "consroomid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctornameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLike(String value) {
            addCriterion("doctorName like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelIsNull() {
            addCriterion("doctorLevel is null");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelIsNotNull() {
            addCriterion("doctorLevel is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelEqualTo(String value) {
            addCriterion("doctorLevel =", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelNotEqualTo(String value) {
            addCriterion("doctorLevel <>", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelGreaterThan(String value) {
            addCriterion("doctorLevel >", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelGreaterThanOrEqualTo(String value) {
            addCriterion("doctorLevel >=", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelLessThan(String value) {
            addCriterion("doctorLevel <", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelLessThanOrEqualTo(String value) {
            addCriterion("doctorLevel <=", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelLike(String value) {
            addCriterion("doctorLevel like", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelNotLike(String value) {
            addCriterion("doctorLevel not like", value, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelIn(List<String> values) {
            addCriterion("doctorLevel in", values, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelNotIn(List<String> values) {
            addCriterion("doctorLevel not in", values, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelBetween(String value1, String value2) {
            addCriterion("doctorLevel between", value1, value2, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorlevelNotBetween(String value1, String value2) {
            addCriterion("doctorLevel not between", value1, value2, "doctorlevel");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusIsNull() {
            addCriterion("doctorStatus is null");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusIsNotNull() {
            addCriterion("doctorStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusEqualTo(String value) {
            addCriterion("doctorStatus =", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusNotEqualTo(String value) {
            addCriterion("doctorStatus <>", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusGreaterThan(String value) {
            addCriterion("doctorStatus >", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusGreaterThanOrEqualTo(String value) {
            addCriterion("doctorStatus >=", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusLessThan(String value) {
            addCriterion("doctorStatus <", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusLessThanOrEqualTo(String value) {
            addCriterion("doctorStatus <=", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusLike(String value) {
            addCriterion("doctorStatus like", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusNotLike(String value) {
            addCriterion("doctorStatus not like", value, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusIn(List<String> values) {
            addCriterion("doctorStatus in", values, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusNotIn(List<String> values) {
            addCriterion("doctorStatus not in", values, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusBetween(String value1, String value2) {
            addCriterion("doctorStatus between", value1, value2, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorstatusNotBetween(String value1, String value2) {
            addCriterion("doctorStatus not between", value1, value2, "doctorstatus");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoIsNull() {
            addCriterion("doctorPhoto is null");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoIsNotNull() {
            addCriterion("doctorPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoEqualTo(String value) {
            addCriterion("doctorPhoto =", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoNotEqualTo(String value) {
            addCriterion("doctorPhoto <>", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoGreaterThan(String value) {
            addCriterion("doctorPhoto >", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoGreaterThanOrEqualTo(String value) {
            addCriterion("doctorPhoto >=", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoLessThan(String value) {
            addCriterion("doctorPhoto <", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoLessThanOrEqualTo(String value) {
            addCriterion("doctorPhoto <=", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoLike(String value) {
            addCriterion("doctorPhoto like", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoNotLike(String value) {
            addCriterion("doctorPhoto not like", value, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoIn(List<String> values) {
            addCriterion("doctorPhoto in", values, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoNotIn(List<String> values) {
            addCriterion("doctorPhoto not in", values, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoBetween(String value1, String value2) {
            addCriterion("doctorPhoto between", value1, value2, "doctorphoto");
            return (Criteria) this;
        }

        public Criteria andDoctorphotoNotBetween(String value1, String value2) {
            addCriterion("doctorPhoto not between", value1, value2, "doctorphoto");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}