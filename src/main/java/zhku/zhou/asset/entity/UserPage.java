package zhku.zhou.asset.entity;

import java.util.Date;

public class UserPage {
	private Integer id;

    private String role;

    private String organization;

    private String name;

    private String pwd;

    private Short sex;

    private Date birth;

    private String phone;

    private String email;

    private Date loginTime;

    private String loginIp;

    private Date crtm;

    private Date mdtm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getCrtm() {
		return crtm;
	}

	public void setCrtm(Date crtm) {
		this.crtm = crtm;
	}

	public Date getMdtm() {
		return mdtm;
	}

	public void setMdtm(Date mdtm) {
		this.mdtm = mdtm;
	}

	@Override
	public String toString() {
		return "UserPage [id=" + id + ", role=" + role + ", organization=" + organization + ", name=" + name + ", pwd="
				+ pwd + ", sex=" + sex + ", birth=" + birth + ", phone=" + phone + ", email=" + email + ", loginTime="
				+ loginTime + ", loginIp=" + loginIp + ", crtm=" + crtm + ", mdtm=" + mdtm + "]";
	}



	    
}
