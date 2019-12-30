package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SourcenumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcenumberExample() {
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

        public Criteria andSourceidIsNull() {
            addCriterion("sourceId is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("sourceId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(Integer value) {
            addCriterion("sourceId =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(Integer value) {
            addCriterion("sourceId <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(Integer value) {
            addCriterion("sourceId >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceId >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(Integer value) {
            addCriterion("sourceId <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(Integer value) {
            addCriterion("sourceId <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<Integer> values) {
            addCriterion("sourceId in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<Integer> values) {
            addCriterion("sourceId not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(Integer value1, Integer value2) {
            addCriterion("sourceId between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceId not between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectId is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectId =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectId <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectId >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectId >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectId <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectId <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectId in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectId not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectId between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectId not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIsNull() {
            addCriterion("sourceCode is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIsNotNull() {
            addCriterion("sourceCode is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodeEqualTo(Integer value) {
            addCriterion("sourceCode =", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotEqualTo(Integer value) {
            addCriterion("sourceCode <>", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeGreaterThan(Integer value) {
            addCriterion("sourceCode >", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceCode >=", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeLessThan(Integer value) {
            addCriterion("sourceCode <", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeLessThanOrEqualTo(Integer value) {
            addCriterion("sourceCode <=", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIn(List<Integer> values) {
            addCriterion("sourceCode in", values, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotIn(List<Integer> values) {
            addCriterion("sourceCode not in", values, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeBetween(Integer value1, Integer value2) {
            addCriterion("sourceCode between", value1, value2, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceCode not between", value1, value2, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcetimeIsNull() {
            addCriterion("sourceTime is null");
            return (Criteria) this;
        }

        public Criteria andSourcetimeIsNotNull() {
            addCriterion("sourceTime is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetimeEqualTo(Date value) {
            addCriterion("sourceTime =", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeNotEqualTo(Date value) {
            addCriterion("sourceTime <>", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeGreaterThan(Date value) {
            addCriterion("sourceTime >", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sourceTime >=", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeLessThan(Date value) {
            addCriterion("sourceTime <", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeLessThanOrEqualTo(Date value) {
            addCriterion("sourceTime <=", value, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeIn(List<Date> values) {
            addCriterion("sourceTime in", values, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeNotIn(List<Date> values) {
            addCriterion("sourceTime not in", values, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeBetween(Date value1, Date value2) {
            addCriterion("sourceTime between", value1, value2, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourcetimeNotBetween(Date value1, Date value2) {
            addCriterion("sourceTime not between", value1, value2, "sourcetime");
            return (Criteria) this;
        }

        public Criteria andSourceampmIsNull() {
            addCriterion("sourceAmPm is null");
            return (Criteria) this;
        }

        public Criteria andSourceampmIsNotNull() {
            addCriterion("sourceAmPm is not null");
            return (Criteria) this;
        }

        public Criteria andSourceampmEqualTo(String value) {
            addCriterion("sourceAmPm =", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmNotEqualTo(String value) {
            addCriterion("sourceAmPm <>", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmGreaterThan(String value) {
            addCriterion("sourceAmPm >", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmGreaterThanOrEqualTo(String value) {
            addCriterion("sourceAmPm >=", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmLessThan(String value) {
            addCriterion("sourceAmPm <", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmLessThanOrEqualTo(String value) {
            addCriterion("sourceAmPm <=", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmLike(String value) {
            addCriterion("sourceAmPm like", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmNotLike(String value) {
            addCriterion("sourceAmPm not like", value, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmIn(List<String> values) {
            addCriterion("sourceAmPm in", values, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmNotIn(List<String> values) {
            addCriterion("sourceAmPm not in", values, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmBetween(String value1, String value2) {
            addCriterion("sourceAmPm between", value1, value2, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourceampmNotBetween(String value1, String value2) {
            addCriterion("sourceAmPm not between", value1, value2, "sourceampm");
            return (Criteria) this;
        }

        public Criteria andSourcenumupIsNull() {
            addCriterion("sourceNumUp is null");
            return (Criteria) this;
        }

        public Criteria andSourcenumupIsNotNull() {
            addCriterion("sourceNumUp is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenumupEqualTo(Integer value) {
            addCriterion("sourceNumUp =", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupNotEqualTo(Integer value) {
            addCriterion("sourceNumUp <>", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupGreaterThan(Integer value) {
            addCriterion("sourceNumUp >", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceNumUp >=", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupLessThan(Integer value) {
            addCriterion("sourceNumUp <", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupLessThanOrEqualTo(Integer value) {
            addCriterion("sourceNumUp <=", value, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupIn(List<Integer> values) {
            addCriterion("sourceNumUp in", values, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupNotIn(List<Integer> values) {
            addCriterion("sourceNumUp not in", values, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupBetween(Integer value1, Integer value2) {
            addCriterion("sourceNumUp between", value1, value2, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSourcenumupNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceNumUp not between", value1, value2, "sourcenumup");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNull() {
            addCriterion("surplusNum is null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNotNull() {
            addCriterion("surplusNum is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumEqualTo(Integer value) {
            addCriterion("surplusNum =", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotEqualTo(Integer value) {
            addCriterion("surplusNum <>", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThan(Integer value) {
            addCriterion("surplusNum >", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplusNum >=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThan(Integer value) {
            addCriterion("surplusNum <", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThanOrEqualTo(Integer value) {
            addCriterion("surplusNum <=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIn(List<Integer> values) {
            addCriterion("surplusNum in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotIn(List<Integer> values) {
            addCriterion("surplusNum not in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumBetween(Integer value1, Integer value2) {
            addCriterion("surplusNum between", value1, value2, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotBetween(Integer value1, Integer value2) {
            addCriterion("surplusNum not between", value1, value2, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSourcepriceIsNull() {
            addCriterion("sourcePrice is null");
            return (Criteria) this;
        }

        public Criteria andSourcepriceIsNotNull() {
            addCriterion("sourcePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSourcepriceEqualTo(Double value) {
            addCriterion("sourcePrice =", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotEqualTo(Double value) {
            addCriterion("sourcePrice <>", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceGreaterThan(Double value) {
            addCriterion("sourcePrice >", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sourcePrice >=", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceLessThan(Double value) {
            addCriterion("sourcePrice <", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceLessThanOrEqualTo(Double value) {
            addCriterion("sourcePrice <=", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceIn(List<Double> values) {
            addCriterion("sourcePrice in", values, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotIn(List<Double> values) {
            addCriterion("sourcePrice not in", values, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceBetween(Double value1, Double value2) {
            addCriterion("sourcePrice between", value1, value2, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotBetween(Double value1, Double value2) {
            addCriterion("sourcePrice not between", value1, value2, "sourceprice");
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