package zhku.zhou.asset.entity;

import java.util.Date;

public class Role {
    private Integer id;

    private String name;

    private String remarks;

    private Date crtm;

    private Date mdtm;

    private Integer devicePower;

    private Integer carPower;

    private Integer fbPower;

    private Integer landPower;

    private Integer housePower;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public Integer getDevicePower() {
        return devicePower;
    }

    public void setDevicePower(Integer devicePower) {
        this.devicePower = devicePower;
    }

    public Integer getCarPower() {
        return carPower;
    }

    public void setCarPower(Integer carPower) {
        this.carPower = carPower;
    }

    public Integer getFbPower() {
        return fbPower;
    }

    public void setFbPower(Integer fbPower) {
        this.fbPower = fbPower;
    }

    public Integer getLandPower() {
        return landPower;
    }

    public void setLandPower(Integer landPower) {
        this.landPower = landPower;
    }

    public Integer getHousePower() {
        return housePower;
    }

    public void setHousePower(Integer housePower) {
        this.housePower = housePower;
    }
}