package com.jorey.housekeeping.bean;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNull() {
            addCriterion("test_name is null");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNotNull() {
            addCriterion("test_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestNameEqualTo(String value) {
            addCriterion("test_name =", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotEqualTo(String value) {
            addCriterion("test_name <>", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThan(String value) {
            addCriterion("test_name >", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThanOrEqualTo(String value) {
            addCriterion("test_name >=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThan(String value) {
            addCriterion("test_name <", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThanOrEqualTo(String value) {
            addCriterion("test_name <=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLike(String value) {
            addCriterion("test_name like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotLike(String value) {
            addCriterion("test_name not like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameIn(List<String> values) {
            addCriterion("test_name in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotIn(List<String> values) {
            addCriterion("test_name not in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameBetween(String value1, String value2) {
            addCriterion("test_name between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotBetween(String value1, String value2) {
            addCriterion("test_name not between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestGenderIsNull() {
            addCriterion("test_gender is null");
            return (Criteria) this;
        }

        public Criteria andTestGenderIsNotNull() {
            addCriterion("test_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTestGenderEqualTo(String value) {
            addCriterion("test_gender =", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderNotEqualTo(String value) {
            addCriterion("test_gender <>", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderGreaterThan(String value) {
            addCriterion("test_gender >", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderGreaterThanOrEqualTo(String value) {
            addCriterion("test_gender >=", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderLessThan(String value) {
            addCriterion("test_gender <", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderLessThanOrEqualTo(String value) {
            addCriterion("test_gender <=", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderLike(String value) {
            addCriterion("test_gender like", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderNotLike(String value) {
            addCriterion("test_gender not like", value, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderIn(List<String> values) {
            addCriterion("test_gender in", values, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderNotIn(List<String> values) {
            addCriterion("test_gender not in", values, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderBetween(String value1, String value2) {
            addCriterion("test_gender between", value1, value2, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestGenderNotBetween(String value1, String value2) {
            addCriterion("test_gender not between", value1, value2, "testGender");
            return (Criteria) this;
        }

        public Criteria andTestEmailIsNull() {
            addCriterion("test_email is null");
            return (Criteria) this;
        }

        public Criteria andTestEmailIsNotNull() {
            addCriterion("test_email is not null");
            return (Criteria) this;
        }

        public Criteria andTestEmailEqualTo(String value) {
            addCriterion("test_email =", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotEqualTo(String value) {
            addCriterion("test_email <>", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailGreaterThan(String value) {
            addCriterion("test_email >", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailGreaterThanOrEqualTo(String value) {
            addCriterion("test_email >=", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLessThan(String value) {
            addCriterion("test_email <", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLessThanOrEqualTo(String value) {
            addCriterion("test_email <=", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailLike(String value) {
            addCriterion("test_email like", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotLike(String value) {
            addCriterion("test_email not like", value, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailIn(List<String> values) {
            addCriterion("test_email in", values, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotIn(List<String> values) {
            addCriterion("test_email not in", values, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailBetween(String value1, String value2) {
            addCriterion("test_email between", value1, value2, "testEmail");
            return (Criteria) this;
        }

        public Criteria andTestEmailNotBetween(String value1, String value2) {
            addCriterion("test_email not between", value1, value2, "testEmail");
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