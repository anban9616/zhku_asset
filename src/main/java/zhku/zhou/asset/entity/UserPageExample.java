package zhku.zhou.asset.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
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

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginIp is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIp is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIp =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIp <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIp >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIp >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIp <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIp <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIp like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIp not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIp in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIp not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIp between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIp not between", value1, value2, "loginip");
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