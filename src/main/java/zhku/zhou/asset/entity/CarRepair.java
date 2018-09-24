package zhku.zhou.asset.entity;

import java.util.Date;

public class CarRepair {
    private Integer id;

    private Integer cid;

    private Integer damager;

    private Date damageDate;

    private String damageRemarks;

    private Date repairDate;

    private Integer repairer;

    private String repairRemarks;

    private Short status;

    private Date crtm;

    private Date mdtm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getDamager() {
        return damager;
    }

    public void setDamager(Integer damager) {
        this.damager = damager;
    }

    public Date getDamageDate() {
        return damageDate;
    }

    public void setDamageDate(Date damageDate) {
        this.damageDate = damageDate;
    }

    public String getDamageRemarks() {
        return damageRemarks;
    }

    public void setDamageRemarks(String damageRemarks) {
        this.damageRemarks = damageRemarks == null ? null : damageRemarks.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public Integer getRepairer() {
        return repairer;
    }

    public void setRepairer(Integer repairer) {
        this.repairer = repairer;
    }

    public String getRepairRemarks() {
        return repairRemarks;
    }

    public void setRepairRemarks(String repairRemarks) {
        this.repairRemarks = repairRemarks == null ? null : repairRemarks.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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