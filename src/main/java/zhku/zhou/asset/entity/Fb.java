package zhku.zhou.asset.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Fb {
    private Integer id;

    private Integer ogid;

    private Integer fbtid;

    private String code;

    private BigDecimal residual;

    private BigDecimal original;

    private Short status;

    private Date prodDate;

    private Integer creator;

    private Date createTime;

    private Integer buyer;

    private Date buyDate;

    private String sno;

    private Date crtm;

    private Date mdtm;

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

    public Integer getFbtid() {
        return fbtid;
    }

    public void setFbtid(Integer fbtid) {
        this.fbtid = fbtid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
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
}