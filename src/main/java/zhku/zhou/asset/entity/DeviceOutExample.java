package zhku.zhou.asset.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceOutExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andOutterIsNull() {
            addCriterion("outter is null");
            return (Criteria) this;
        }

        public Criteria andOutterIsNotNull() {
            addCriterion("outter is not null");
            return (Criteria) this;
        }

        public Criteria andOutterEqualTo(Integer value) {
            addCriterion("outter =", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterNotEqualTo(Integer value) {
            addCriterion("outter <>", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterGreaterThan(Integer value) {
            addCriterion("outter >", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterGreaterThanOrEqualTo(Integer value) {
            addCriterion("outter >=", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterLessThan(Integer value) {
            addCriterion("outter <", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterLessThanOrEqualTo(Integer value) {
            addCriterion("outter <=", value, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterIn(List<Integer> values) {
            addCriterion("outter in", values, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterNotIn(List<Integer> values) {
            addCriterion("outter not in", values, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterBetween(Integer value1, Integer value2) {
            addCriterion("outter between", value1, value2, "outter");
            return (Criteria) this;
        }

        public Criteria andOutterNotBetween(Integer value1, Integer value2) {
            addCriterion("outter not between", value1, value2, "outter");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIsNull() {
            addCriterion("out_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIsNotNull() {
            addCriterion("out_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOutRemarksEqualTo(String value) {
            addCriterion("out_remarks =", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotEqualTo(String value) {
            addCriterion("out_remarks <>", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksGreaterThan(String value) {
            addCriterion("out_remarks >", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("out_remarks >=", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLessThan(String value) {
            addCriterion("out_remarks <", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLessThanOrEqualTo(String value) {
            addCriterion("out_remarks <=", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksLike(String value) {
            addCriterion("out_remarks like", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotLike(String value) {
            addCriterion("out_remarks not like", value, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksIn(List<String> values) {
            addCriterion("out_remarks in", values, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotIn(List<String> values) {
            addCriterion("out_remarks not in", values, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksBetween(String value1, String value2) {
            addCriterion("out_remarks between", value1, value2, "outRemarks");
            return (Criteria) this;
        }

        public Criteria andOutRemarksNotBetween(String value1, String value2) {
            addCriterion("out_remarks not between", value1, value2, "outRemarks");
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

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(Integer value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(Integer value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(Integer value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(Integer value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(Integer value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(Integer value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<Integer> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<Integer> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(Integer value1, Integer value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(Integer value1, Integer value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksIsNull() {
            addCriterion("approval_remarks is null");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksIsNotNull() {
            addCriterion("approval_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksEqualTo(String value) {
            addCriterion("approval_remarks =", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksNotEqualTo(String value) {
            addCriterion("approval_remarks <>", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksGreaterThan(String value) {
            addCriterion("approval_remarks >", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("approval_remarks >=", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksLessThan(String value) {
            addCriterion("approval_remarks <", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksLessThanOrEqualTo(String value) {
            addCriterion("approval_remarks <=", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksLike(String value) {
            addCriterion("approval_remarks like", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksNotLike(String value) {
            addCriterion("approval_remarks not like", value, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksIn(List<String> values) {
            addCriterion("approval_remarks in", values, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksNotIn(List<String> values) {
            addCriterion("approval_remarks not in", values, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksBetween(String value1, String value2) {
            addCriterion("approval_remarks between", value1, value2, "approvalRemarks");
            return (Criteria) this;
        }

        public Criteria andApprovalRemarksNotBetween(String value1, String value2) {
            addCriterion("approval_remarks not between", value1, value2, "approvalRemarks");
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