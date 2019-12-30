package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookingformExample() {
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

        public Criteria andBookingidIsNull() {
            addCriterion("bookingId is null");
            return (Criteria) this;
        }

        public Criteria andBookingidIsNotNull() {
            addCriterion("bookingId is not null");
            return (Criteria) this;
        }

        public Criteria andBookingidEqualTo(Integer value) {
            addCriterion("bookingId =", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotEqualTo(Integer value) {
            addCriterion("bookingId <>", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidGreaterThan(Integer value) {
            addCriterion("bookingId >", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookingId >=", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidLessThan(Integer value) {
            addCriterion("bookingId <", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidLessThanOrEqualTo(Integer value) {
            addCriterion("bookingId <=", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidIn(List<Integer> values) {
            addCriterion("bookingId in", values, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotIn(List<Integer> values) {
            addCriterion("bookingId not in", values, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidBetween(Integer value1, Integer value2) {
            addCriterion("bookingId between", value1, value2, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookingId not between", value1, value2, "bookingid");
            return (Criteria) this;
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

        public Criteria andBookingcodeIsNull() {
            addCriterion("bookingCode is null");
            return (Criteria) this;
        }

        public Criteria andBookingcodeIsNotNull() {
            addCriterion("bookingCode is not null");
            return (Criteria) this;
        }

        public Criteria andBookingcodeEqualTo(String value) {
            addCriterion("bookingCode =", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeNotEqualTo(String value) {
            addCriterion("bookingCode <>", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeGreaterThan(String value) {
            addCriterion("bookingCode >", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bookingCode >=", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeLessThan(String value) {
            addCriterion("bookingCode <", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeLessThanOrEqualTo(String value) {
            addCriterion("bookingCode <=", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeLike(String value) {
            addCriterion("bookingCode like", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeNotLike(String value) {
            addCriterion("bookingCode not like", value, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeIn(List<String> values) {
            addCriterion("bookingCode in", values, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeNotIn(List<String> values) {
            addCriterion("bookingCode not in", values, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeBetween(String value1, String value2) {
            addCriterion("bookingCode between", value1, value2, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingcodeNotBetween(String value1, String value2) {
            addCriterion("bookingCode not between", value1, value2, "bookingcode");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIsNull() {
            addCriterion("bookingTime is null");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIsNotNull() {
            addCriterion("bookingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookingtimeEqualTo(Date value) {
            addCriterion("bookingTime =", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotEqualTo(Date value) {
            addCriterion("bookingTime <>", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeGreaterThan(Date value) {
            addCriterion("bookingTime >", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bookingTime >=", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeLessThan(Date value) {
            addCriterion("bookingTime <", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeLessThanOrEqualTo(Date value) {
            addCriterion("bookingTime <=", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIn(List<Date> values) {
            addCriterion("bookingTime in", values, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotIn(List<Date> values) {
            addCriterion("bookingTime not in", values, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeBetween(Date value1, Date value2) {
            addCriterion("bookingTime between", value1, value2, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotBetween(Date value1, Date value2) {
            addCriterion("bookingTime not between", value1, value2, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingstatusIsNull() {
            addCriterion("bookingStatus is null");
            return (Criteria) this;
        }

        public Criteria andBookingstatusIsNotNull() {
            addCriterion("bookingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBookingstatusEqualTo(String value) {
            addCriterion("bookingStatus =", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusNotEqualTo(String value) {
            addCriterion("bookingStatus <>", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusGreaterThan(String value) {
            addCriterion("bookingStatus >", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusGreaterThanOrEqualTo(String value) {
            addCriterion("bookingStatus >=", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusLessThan(String value) {
            addCriterion("bookingStatus <", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusLessThanOrEqualTo(String value) {
            addCriterion("bookingStatus <=", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusLike(String value) {
            addCriterion("bookingStatus like", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusNotLike(String value) {
            addCriterion("bookingStatus not like", value, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusIn(List<String> values) {
            addCriterion("bookingStatus in", values, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusNotIn(List<String> values) {
            addCriterion("bookingStatus not in", values, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusBetween(String value1, String value2) {
            addCriterion("bookingStatus between", value1, value2, "bookingstatus");
            return (Criteria) this;
        }

        public Criteria andBookingstatusNotBetween(String value1, String value2) {
            addCriterion("bookingStatus not between", value1, value2, "bookingstatus");
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