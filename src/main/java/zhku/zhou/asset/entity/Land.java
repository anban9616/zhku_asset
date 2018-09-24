package zhku.zhou.asset.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Land {
    private Integer id;

    private Integer ogid;

    private String code;

    private String name;

    private BigDecimal residual;

    private BigDecimal original;

    private Short status;

    private Date prodDate;

    private Integer creator;

    private Date createTime;

    private Integer buyer;

    private Date buyDate;

    private Date crtm;

    private Date mdtm;

    private Short asl;

    private Short area;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOgid() {
        return ogid;
    }

    public void setOgid(Integer ogid) {
        this.ogid = ogid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getResidual() {
        return residual;
    }

    public void setResidual(BigDecimal residual) {
        this.residual = residual;
    }

    public BigDecimal getOriginal() {
        return original;
    }

    public void setOriginal(BigDecimal original) {
        this.original = original;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBuyer() {
        return buyer;
    }

    public void setBuyer(Integer buyer) {
        this.buyer = buyer;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
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

    public Short getAsl() {
        return asl;
    }

    public void setAsl(Short asl) {
        this.asl = asl;
    }

    public Short getArea() {
        return area;
    }

    public void setArea(Short area) {
        this.area = area;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}