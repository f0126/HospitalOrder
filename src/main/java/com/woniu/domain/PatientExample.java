package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientidIsNull() {
            addCriterion("patientId is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("patientId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(Integer value) {
            addCriterion("patientId =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(Integer value) {
            addCriterion("patientId <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(Integer value) {
            addCriterion("patientId >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientId >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(Integer value) {
            addCriterion("patientId <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(Integer value) {
            addCriterion("patientId <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<Integer> values) {
            addCriterion("patientId in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<Integer> values) {
            addCriterion("patientId not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(Integer value1, Integer value2) {
            addCriterion("patientId between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(Integer value1, Integer value2) {
            addCriterion("patientId not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnameEqualTo(String value) {
            addCriterion("patientName =", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThan(String value) {
            addCriterion("patientName <", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLike(String value) {
            addCriterion("patientName like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotLike(String value) {
            addCriterion("patientName not like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameIn(List<String> values) {
            addCriterion("patientName in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientageIsNull() {
            addCriterion("patientAge is null");
            return (Criteria) this;
        }

        public Criteria andPatientageIsNotNull() {
            addCriterion("patientAge is not null");
            return (Criteria) this;
        }

        public Criteria andPatientageEqualTo(Integer value) {
            addCriterion("patientAge =", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotEqualTo(Integer value) {
            addCriterion("patientAge <>", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageGreaterThan(Integer value) {
            addCriterion("patientAge >", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientAge >=", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageLessThan(Integer value) {
            addCriterion("patientAge <", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageLessThanOrEqualTo(Integer value) {
            addCriterion("patientAge <=", value, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageIn(List<Integer> values) {
            addCriterion("patientAge in", values, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotIn(List<Integer> values) {
            addCriterion("patientAge not in", values, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageBetween(Integer value1, Integer value2) {
            addCriterion("patientAge between", value1, value2, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientageNotBetween(Integer value1, Integer value2) {
            addCriterion("patientAge not between", value1, value2, "patientage");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardIsNull() {
            addCriterion("patientProvincialcard is null");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardIsNotNull() {
            addCriterion("patientProvincialcard is not null");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardEqualTo(String value) {
            addCriterion("patientProvincialcard =", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardNotEqualTo(String value) {
            addCriterion("patientProvincialcard <>", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardGreaterThan(String value) {
            addCriterion("patientProvincialcard >", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardGreaterThanOrEqualTo(String value) {
            addCriterion("patientProvincialcard >=", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardLessThan(String value) {
            addCriterion("patientProvincialcard <", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardLessThanOrEqualTo(String value) {
            addCriterion("patientProvincialcard <=", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardLike(String value) {
            addCriterion("patientProvincialcard like", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardNotLike(String value) {
            addCriterion("patientProvincialcard not like", value, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardIn(List<String> values) {
            addCriterion("patientProvincialcard in", values, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardNotIn(List<String> values) {
            addCriterion("patientProvincialcard not in", values, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardBetween(String value1, String value2) {
            addCriterion("patientProvincialcard between", value1, value2, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientprovincialcardNotBetween(String value1, String value2) {
            addCriterion("patientProvincialcard not between", value1, value2, "patientprovincialcard");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIsNull() {
            addCriterion("patientPhone is null");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIsNotNull() {
            addCriterion("patientPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientphoneEqualTo(String value) {
            addCriterion("patientPhone =", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotEqualTo(String value) {
            addCriterion("patientPhone <>", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneGreaterThan(String value) {
            addCriterion("patientPhone >", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneGreaterThanOrEqualTo(String value) {
            addCriterion("patientPhone >=", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneLessThan(String value) {
            addCriterion("patientPhone <", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneLessThanOrEqualTo(String value) {
            addCriterion("patientPhone <=", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneLike(String value) {
            addCriterion("patientPhone like", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotLike(String value) {
            addCriterion("patientPhone not like", value, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneIn(List<String> values) {
            addCriterion("patientPhone in", values, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotIn(List<String> values) {
            addCriterion("patientPhone not in", values, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneBetween(String value1, String value2) {
            addCriterion("patientPhone between", value1, value2, "patientphone");
            return (Criteria) this;
        }

        public Criteria andPatientphoneNotBetween(String value1, String value2) {
            addCriterion("patientPhone not between", value1, value2, "patientphone");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNull() {
            addCriterion("surplusMoney is null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNotNull() {
            addCriterion("surplusMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyEqualTo(Double value) {
            addCriterion("surplusMoney =", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotEqualTo(Double value) {
            addCriterion("surplusMoney <>", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThan(Double value) {
            addCriterion("surplusMoney >", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("surplusMoney >=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThan(Double value) {
            addCriterion("surplusMoney <", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThanOrEqualTo(Double value) {
            addCriterion("surplusMoney <=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIn(List<Double> values) {
            addCriterion("surplusMoney in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotIn(List<Double> values) {
            addCriterion("surplusMoney not in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyBetween(Double value1, Double value2) {
            addCriterion("surplusMoney between", value1, value2, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotBetween(Double value1, Double value2) {
            addCriterion("surplusMoney not between", value1, value2, "surplusmoney");
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