package com.jalinyiel.coursystem.system.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourNoIsNull() {
            addCriterion("cour_no is null");
            return (Criteria) this;
        }

        public Criteria andCourNoIsNotNull() {
            addCriterion("cour_no is not null");
            return (Criteria) this;
        }

        public Criteria andCourNoEqualTo(Integer value) {
            addCriterion("cour_no =", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoNotEqualTo(Integer value) {
            addCriterion("cour_no <>", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoGreaterThan(Integer value) {
            addCriterion("cour_no >", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_no >=", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoLessThan(Integer value) {
            addCriterion("cour_no <", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoLessThanOrEqualTo(Integer value) {
            addCriterion("cour_no <=", value, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoIn(List<Integer> values) {
            addCriterion("cour_no in", values, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoNotIn(List<Integer> values) {
            addCriterion("cour_no not in", values, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoBetween(Integer value1, Integer value2) {
            addCriterion("cour_no between", value1, value2, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_no not between", value1, value2, "courNo");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNull() {
            addCriterion("cour_name is null");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNotNull() {
            addCriterion("cour_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourNameEqualTo(String value) {
            addCriterion("cour_name =", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotEqualTo(String value) {
            addCriterion("cour_name <>", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThan(String value) {
            addCriterion("cour_name >", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_name >=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThan(String value) {
            addCriterion("cour_name <", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThanOrEqualTo(String value) {
            addCriterion("cour_name <=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLike(String value) {
            addCriterion("cour_name like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotLike(String value) {
            addCriterion("cour_name not like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameIn(List<String> values) {
            addCriterion("cour_name in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotIn(List<String> values) {
            addCriterion("cour_name not in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameBetween(String value1, String value2) {
            addCriterion("cour_name between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotBetween(String value1, String value2) {
            addCriterion("cour_name not between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Byte value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Byte value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Byte value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Byte value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Byte value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Byte> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Byte> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Byte value1, Byte value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Byte value1, Byte value2) {
            addCriterion("credit not between", value1, value2, "credit");
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