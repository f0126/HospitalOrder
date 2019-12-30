package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andSchedulecodeIsNull() {
            addCriterion("scheduleCode is null");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeIsNotNull() {
            addCriterion("scheduleCode is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeEqualTo(String value) {
            addCriterion("scheduleCode =", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeNotEqualTo(String value) {
            addCriterion("scheduleCode <>", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeGreaterThan(String value) {
            addCriterion("scheduleCode >", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeGreaterThanOrEqualTo(String value) {
            addCriterion("scheduleCode >=", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeLessThan(String value) {
            addCriterion("scheduleCode <", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeLessThanOrEqualTo(String value) {
            addCriterion("scheduleCode <=", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeLike(String value) {
            addCriterion("scheduleCode like", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeNotLike(String value) {
            addCriterion("scheduleCode not like", value, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeIn(List<String> values) {
            addCriterion("scheduleCode in", values, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeNotIn(List<String> values) {
            addCriterion("scheduleCode not in", values, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeBetween(String value1, String value2) {
            addCriterion("scheduleCode between", value1, value2, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andSchedulecodeNotBetween(String value1, String value2) {
            addCriterion("scheduleCode not between", value1, value2, "schedulecode");
            return (Criteria) this;
        }

        public Criteria andScheduledayIsNull() {
            addCriterion("scheduleDay is null");
            return (Criteria) this;
        }

        public Criteria andScheduledayIsNotNull() {
            addCriterion("scheduleDay is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledayEqualTo(String value) {
            addCriterion("scheduleDay =", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayNotEqualTo(String value) {
            addCriterion("scheduleDay <>", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayGreaterThan(String value) {
            addCriterion("scheduleDay >", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayGreaterThanOrEqualTo(String value) {
            addCriterion("scheduleDay >=", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayLessThan(String value) {
            addCriterion("scheduleDay <", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayLessThanOrEqualTo(String value) {
            addCriterion("scheduleDay <=", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayLike(String value) {
            addCriterion("scheduleDay like", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayNotLike(String value) {
            addCriterion("scheduleDay not like", value, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayIn(List<String> values) {
            addCriterion("scheduleDay in", values, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayNotIn(List<String> values) {
            addCriterion("scheduleDay not in", values, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayBetween(String value1, String value2) {
            addCriterion("scheduleDay between", value1, value2, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduledayNotBetween(String value1, String value2) {
            addCriterion("scheduleDay not between", value1, value2, "scheduleday");
            return (Criteria) this;
        }

        public Criteria andScheduleampmIsNull() {
            addCriterion("scheduleAmPm is null");
            return (Criteria) this;
        }

        public Criteria andScheduleampmIsNotNull() {
            addCriterion("scheduleAmPm is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleampmEqualTo(String value) {
            addCriterion("scheduleAmPm =", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmNotEqualTo(String value) {
            addCriterion("scheduleAmPm <>", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmGreaterThan(String value) {
            addCriterion("scheduleAmPm >", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmGreaterThanOrEqualTo(String value) {
            addCriterion("scheduleAmPm >=", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmLessThan(String value) {
            addCriterion("scheduleAmPm <", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmLessThanOrEqualTo(String value) {
            addCriterion("scheduleAmPm <=", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmLike(String value) {
            addCriterion("scheduleAmPm like", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmNotLike(String value) {
            addCriterion("scheduleAmPm not like", value, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmIn(List<String> values) {
            addCriterion("scheduleAmPm in", values, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmNotIn(List<String> values) {
            addCriterion("scheduleAmPm not in", values, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmBetween(String value1, String value2) {
            addCriterion("scheduleAmPm between", value1, value2, "scheduleampm");
            return (Criteria) this;
        }

        public Criteria andScheduleampmNotBetween(String value1, String value2) {
            addCriterion("scheduleAmPm not between", value1, value2, "scheduleampm");
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