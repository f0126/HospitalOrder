package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ConsultingroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultingroomExample() {
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

        public Criteria andConsroomnameIsNull() {
            addCriterion("consroomName is null");
            return (Criteria) this;
        }

        public Criteria andConsroomnameIsNotNull() {
            addCriterion("consroomName is not null");
            return (Criteria) this;
        }

        public Criteria andConsroomnameEqualTo(String value) {
            addCriterion("consroomName =", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameNotEqualTo(String value) {
            addCriterion("consroomName <>", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameGreaterThan(String value) {
            addCriterion("consroomName >", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameGreaterThanOrEqualTo(String value) {
            addCriterion("consroomName >=", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameLessThan(String value) {
            addCriterion("consroomName <", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameLessThanOrEqualTo(String value) {
            addCriterion("consroomName <=", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameLike(String value) {
            addCriterion("consroomName like", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameNotLike(String value) {
            addCriterion("consroomName not like", value, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameIn(List<String> values) {
            addCriterion("consroomName in", values, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameNotIn(List<String> values) {
            addCriterion("consroomName not in", values, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameBetween(String value1, String value2) {
            addCriterion("consroomName between", value1, value2, "consroomname");
            return (Criteria) this;
        }

        public Criteria andConsroomnameNotBetween(String value1, String value2) {
            addCriterion("consroomName not between", value1, value2, "consroomname");
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