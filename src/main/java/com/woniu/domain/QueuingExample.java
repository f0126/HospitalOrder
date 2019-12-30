package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class QueuingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueuingExample() {
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

        public Criteria andQueuingidIsNull() {
            addCriterion("queuingId is null");
            return (Criteria) this;
        }

        public Criteria andQueuingidIsNotNull() {
            addCriterion("queuingId is not null");
            return (Criteria) this;
        }

        public Criteria andQueuingidEqualTo(Integer value) {
            addCriterion("queuingId =", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidNotEqualTo(Integer value) {
            addCriterion("queuingId <>", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidGreaterThan(Integer value) {
            addCriterion("queuingId >", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("queuingId >=", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidLessThan(Integer value) {
            addCriterion("queuingId <", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidLessThanOrEqualTo(Integer value) {
            addCriterion("queuingId <=", value, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidIn(List<Integer> values) {
            addCriterion("queuingId in", values, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidNotIn(List<Integer> values) {
            addCriterion("queuingId not in", values, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidBetween(Integer value1, Integer value2) {
            addCriterion("queuingId between", value1, value2, "queuingid");
            return (Criteria) this;
        }

        public Criteria andQueuingidNotBetween(Integer value1, Integer value2) {
            addCriterion("queuingId not between", value1, value2, "queuingid");
            return (Criteria) this;
        }

        public Criteria andScheduleidIsNull() {
            addCriterion("scheduleId is null");
            return (Criteria) this;
        }

        public Criteria andScheduleidIsNotNull() {
            addCriterion("scheduleId is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleidEqualTo(Integer value) {
            addCriterion("scheduleId =", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotEqualTo(Integer value) {
            addCriterion("scheduleId <>", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThan(Integer value) {
            addCriterion("scheduleId >", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduleId >=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThan(Integer value) {
            addCriterion("scheduleId <", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThanOrEqualTo(Integer value) {
            addCriterion("scheduleId <=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidIn(List<Integer> values) {
            addCriterion("scheduleId in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotIn(List<Integer> values) {
            addCriterion("scheduleId not in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidBetween(Integer value1, Integer value2) {
            addCriterion("scheduleId between", value1, value2, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduleId not between", value1, value2, "scheduleid");
            return (Criteria) this;
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

        public Criteria andSeekmedicalstatusIsNull() {
            addCriterion("seekMedicalStatus is null");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusIsNotNull() {
            addCriterion("seekMedicalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusEqualTo(String value) {
            addCriterion("seekMedicalStatus =", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusNotEqualTo(String value) {
            addCriterion("seekMedicalStatus <>", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusGreaterThan(String value) {
            addCriterion("seekMedicalStatus >", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("seekMedicalStatus >=", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusLessThan(String value) {
            addCriterion("seekMedicalStatus <", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusLessThanOrEqualTo(String value) {
            addCriterion("seekMedicalStatus <=", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusLike(String value) {
            addCriterion("seekMedicalStatus like", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusNotLike(String value) {
            addCriterion("seekMedicalStatus not like", value, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusIn(List<String> values) {
            addCriterion("seekMedicalStatus in", values, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusNotIn(List<String> values) {
            addCriterion("seekMedicalStatus not in", values, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusBetween(String value1, String value2) {
            addCriterion("seekMedicalStatus between", value1, value2, "seekmedicalstatus");
            return (Criteria) this;
        }

        public Criteria andSeekmedicalstatusNotBetween(String value1, String value2) {
            addCriterion("seekMedicalStatus not between", value1, value2, "seekmedicalstatus");
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