package zhku.zhou.asset.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceRepairPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceRepairPageExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDamagerIsNull() {
            addCriterion("damager is null");
            return (Criteria) this;
        }

        public Criteria andDamagerIsNotNull() {
            addCriterion("damager is not null");
            return (Criteria) this;
        }

        public Criteria andDamagerEqualTo(String value) {
            addCriterion("damager =", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerNotEqualTo(String value) {
            addCriterion("damager <>", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerGreaterThan(String value) {
            addCriterion("damager >", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerGreaterThanOrEqualTo(String value) {
            addCriterion("damager >=", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerLessThan(String value) {
            addCriterion("damager <", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerLessThanOrEqualTo(String value) {
            addCriterion("damager <=", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerLike(String value) {
            addCriterion("damager like", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerNotLike(String value) {
            addCriterion("damager not like", value, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerIn(List<String> values) {
            addCriterion("damager in", values, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerNotIn(List<String> values) {
            addCriterion("damager not in", values, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerBetween(String value1, String value2) {
            addCriterion("damager between", value1, value2, "damager");
            return (Criteria) this;
        }

        public Criteria andDamagerNotBetween(String value1, String value2) {
            addCriterion("damager not between", value1, value2, "damager");
            return (Criteria) this;
        }

        public Criteria andDamageDateIsNull() {
            addCriterion("damage_date is null");
            return (Criteria) this;
        }

        public Criteria andDamageDateIsNotNull() {
            addCriterion("damage_date is not null");
            return (Criteria) this;
        }

        public Criteria andDamageDateEqualTo(Date value) {
            addCriterion("damage_date =", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateNotEqualTo(Date value) {
            addCriterion("damage_date <>", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateGreaterThan(Date value) {
            addCriterion("damage_date >", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("damage_date >=", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateLessThan(Date value) {
            addCriterion("damage_date <", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateLessThanOrEqualTo(Date value) {
            addCriterion("damage_date <=", value, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateIn(List<Date> values) {
            addCriterion("damage_date in", values, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateNotIn(List<Date> values) {
            addCriterion("damage_date not in", values, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateBetween(Date value1, Date value2) {
            addCriterion("damage_date between", value1, value2, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageDateNotBetween(Date value1, Date value2) {
            addCriterion("damage_date not between", value1, value2, "damageDate");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksIsNull() {
            addCriterion("damage_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksIsNotNull() {
            addCriterion("damage_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksEqualTo(String value) {
            addCriterion("damage_remarks =", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksNotEqualTo(String value) {
            addCriterion("damage_remarks <>", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksGreaterThan(String value) {
            addCriterion("damage_remarks >", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("damage_remarks >=", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksLessThan(String value) {
            addCriterion("damage_remarks <", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksLessThanOrEqualTo(String value) {
            addCriterion("damage_remarks <=", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksLike(String value) {
            addCriterion("damage_remarks like", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksNotLike(String value) {
            addCriterion("damage_remarks not like", value, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksIn(List<String> values) {
            addCriterion("damage_remarks in", values, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksNotIn(List<String> values) {
            addCriterion("damage_remarks not in", values, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksBetween(String value1, String value2) {
            addCriterion("damage_remarks between", value1, value2, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andDamageRemarksNotBetween(String value1, String value2) {
            addCriterion("damage_remarks not between", value1, value2, "damageRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("repair_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("repair_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterion("repair_date =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterion("repair_date <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterion("repair_date >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repair_date >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterion("repair_date <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterion("repair_date <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterion("repair_date in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterion("repair_date not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterion("repair_date between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterion("repair_date not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNull() {
            addCriterion("repairer is null");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNotNull() {
            addCriterion("repairer is not null");
            return (Criteria) this;
        }

        public Criteria andRepairerEqualTo(String value) {
            addCriterion("repairer =", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotEqualTo(String value) {
            addCriterion("repairer <>", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThan(String value) {
            addCriterion("repairer >", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThanOrEqualTo(String value) {
            addCriterion("repairer >=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThan(String value) {
            addCriterion("repairer <", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThanOrEqualTo(String value) {
            addCriterion("repairer <=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLike(String value) {
            addCriterion("repairer like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotLike(String value) {
            addCriterion("repairer not like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerIn(List<String> values) {
            addCriterion("repairer in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotIn(List<String> values) {
            addCriterion("repairer not in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerBetween(String value1, String value2) {
            addCriterion("repairer between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotBetween(String value1, String value2) {
            addCriterion("repairer not between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIsNull() {
            addCriterion("repair_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIsNotNull() {
            addCriterion("repair_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksEqualTo(String value) {
            addCriterion("repair_remarks =", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotEqualTo(String value) {
            addCriterion("repair_remarks <>", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksGreaterThan(String value) {
            addCriterion("repair_remarks >", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("repair_remarks >=", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLessThan(String value) {
            addCriterion("repair_remarks <", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLessThanOrEqualTo(String value) {
            addCriterion("repair_remarks <=", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLike(String value) {
            addCriterion("repair_remarks like", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotLike(String value) {
            addCriterion("repair_remarks not like", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIn(List<String> values) {
            addCriterion("repair_remarks in", values, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotIn(List<String> values) {
            addCriterion("repair_remarks not in", values, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksBetween(String value1, String value2) {
            addCriterion("repair_remarks between", value1, value2, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotBetween(String value1, String value2) {
            addCriterion("repair_remarks not between", value1, value2, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCrtmEqualTo(Date value) {
            addCriterion("crtm =", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotEqualTo(Date value) {
            addCriterion("crtm <>", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmGreaterThan(Date value) {
            addCriterion("crtm >", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmGreaterThanOrEqualTo(Date value) {
            addCriterion("crtm >=", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmLessThan(Date value) {
            addCriterion("crtm <", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmLessThanOrEqualTo(Date value) {
            addCriterion("crtm <=", value, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmIn(List<Date> values) {
            addCriterion("crtm in", values, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotIn(List<Date> values) {
            addCriterion("crtm not in", values, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmBetween(Date value1, Date value2) {
            addCriterion("crtm between", value1, value2, "crtm");
            return (Criteria) this;
        }

        public Criteria andCrtmNotBetween(Date value1, Date value2) {
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

        public Criteria andMdtmEqualTo(Date value) {
            addCriterion("mdtm =", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotEqualTo(Date value) {
            addCriterion("mdtm <>", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmGreaterThan(Date value) {
            addCriterion("mdtm >", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmGreaterThanOrEqualTo(Date value) {
            addCriterion("mdtm >=", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmLessThan(Date value) {
            addCriterion("mdtm <", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmLessThanOrEqualTo(Date value) {
            addCriterion("mdtm <=", value, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmIn(List<Date> values) {
            addCriterion("mdtm in", values, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotIn(List<Date> values) {
            addCriterion("mdtm not in", values, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmBetween(Date value1, Date value2) {
            addCriterion("mdtm between", value1, value2, "mdtm");
            return (Criteria) this;
        }

        public Criteria andMdtmNotBetween(Date value1, Date value2) {
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