package zhku.zhou.asset.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FbTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbTypeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andIntlcodeIsNull() {
            addCriterion("intlcode is null");
            return (Criteria) this;
        }

        public Criteria andIntlcodeIsNotNull() {
            addCriterion("intlcode is not null");
            return (Criteria) this;
        }

        public Criteria andIntlcodeEqualTo(String value) {
            addCriterion("intlcode =", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeNotEqualTo(String value) {
            addCriterion("intlcode <>", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeGreaterThan(String value) {
            addCriterion("intlcode >", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeGreaterThanOrEqualTo(String value) {
            addCriterion("intlcode >=", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeLessThan(String value) {
            addCriterion("intlcode <", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeLessThanOrEqualTo(String value) {
            addCriterion("intlcode <=", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeLike(String value) {
            addCriterion("intlcode like", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeNotLike(String value) {
            addCriterion("intlcode not like", value, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeIn(List<String> values) {
            addCriterion("intlcode in", values, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeNotIn(List<String> values) {
            addCriterion("intlcode not in", values, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeBetween(String value1, String value2) {
            addCriterion("intlcode between", value1, value2, "intlcode");
            return (Criteria) this;
        }

        public Criteria andIntlcodeNotBetween(String value1, String value2) {
            addCriterion("intlcode not between", value1, value2, "intlcode");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andAslIsNull() {
            addCriterion("asl is null");
            return (Criteria) this;
        }

        public Criteria andAslIsNotNull() {
            addCriterion("asl is not null");
            return (Criteria) this;
        }

        public Criteria andAslEqualTo(Short value) {
            addCriterion("asl =", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslNotEqualTo(Short value) {
            addCriterion("asl <>", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslGreaterThan(Short value) {
            addCriterion("asl >", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslGreaterThanOrEqualTo(Short value) {
            addCriterion("asl >=", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslLessThan(Short value) {
            addCriterion("asl <", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslLessThanOrEqualTo(Short value) {
            addCriterion("asl <=", value, "asl");
            return (Criteria) this;
        }

        public Criteria andAslIn(List<Short> values) {
            addCriterion("asl in", values, "asl");
            return (Criteria) this;
        }

        public Criteria andAslNotIn(List<Short> values) {
            addCriterion("asl not in", values, "asl");
            return (Criteria) this;
        }

        public Criteria andAslBetween(Short value1, Short value2) {
            addCriterion("asl between", value1, value2, "asl");
            return (Criteria) this;
        }

        public Criteria andAslNotBetween(Short value1, Short value2) {
            addCriterion("asl not between", value1, value2, "asl");
            return (Criteria) this;
        }

        public Criteria andAnrvIsNull() {
            addCriterion("anrv is null");
            return (Criteria) this;
        }

        public Criteria andAnrvIsNotNull() {
            addCriterion("anrv is not null");
            return (Criteria) this;
        }

        public Criteria andAnrvEqualTo(BigDecimal value) {
            addCriterion("anrv =", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvNotEqualTo(BigDecimal value) {
            addCriterion("anrv <>", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvGreaterThan(BigDecimal value) {
            addCriterion("anrv >", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("anrv >=", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvLessThan(BigDecimal value) {
            addCriterion("anrv <", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("anrv <=", value, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvIn(List<BigDecimal> values) {
            addCriterion("anrv in", values, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvNotIn(List<BigDecimal> values) {
            addCriterion("anrv not in", values, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("anrv between", value1, value2, "anrv");
            return (Criteria) this;
        }

        public Criteria andAnrvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("anrv not between", value1, value2, "anrv");
            return (Criteria) this;
        }

        public Criteria andCrtmIsNull() {
            addCriterion("crtm is null");
            return (Criteria) this;
        }

        public Criteria andCrtmIsNotNull() {
            addCriterion("crtm is not null");
            return (Criteria) this;
        }

        public Criteria andCrtmEqualTo(String value) {
            addCriterion("crtm =", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotEqualTo(String value) {
            addCriterion("crtm <>", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmGreaterThan(String value) {
            addCriterion("crtm >", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmGreaterThanOrEqualTo(String value) {
            addCriterion("crtm >=", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmLessThan(String value) {
            addCriterion("crtm <", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmLessThanOrEqualTo(String value) {
            addCriterion("crtm <=", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmLike(String value) {
            addCriterion("crtm like", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotLike(String value) {
            addCriterion("crtm not like", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmIn(List<String> values) {
            addCriterion("crtm in", values, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotIn(List<String> values) {
            addCriterion("crtm not in", values, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmBetween(String value1, String value2) {
            addCriterion("crtm between", value1, value2, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotBetween(String value1, String value2) {
            addCriterion("crtm not between", value1, value2, "crtm");
            return (Criteria) this;
        }

        public Criteria andMdtmIsNull() {
            addCriterion("mdtm is null");
            return (Criteria) this;
        }

        public Criteria andMdtmIsNotNull() {
            addCriterion("mdtm is not null");
            return (Criteria) this;
        }

        public Criteria andMdtmEqualTo(String value) {
            addCriterion("mdtm =", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotEqualTo(String value) {
            addCriterion("mdtm <>", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmGreaterThan(String value) {
            addCriterion("mdtm >", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmGreaterThanOrEqualTo(String value) {
            addCriterion("mdtm >=", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmLessThan(String value) {
            addCriterion("mdtm <", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmLessThanOrEqualTo(String value) {
            addCriterion("mdtm <=", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmLike(String value) {
            addCriterion("mdtm like", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotLike(String value) {
            addCriterion("mdtm not like", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmIn(List<String> values) {
            addCriterion("mdtm in", values, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotIn(List<String> values) {
            addCriterion("mdtm not in", values, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmBetween(String value1, String value2) {
            addCriterion("mdtm between", value1, value2, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotBetween(String value1, String value2) {
            addCriterion("mdtm not between", value1, value2, "mdtm");
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