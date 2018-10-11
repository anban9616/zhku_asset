package zhku.zhou.asset.entity;

import java.util.Date;

public class DeviceReceivePage {
    private Integer id;

    private String dcode;

    private String drcode;

    private String username;

    private Date receiveDate;

    private Date returnDate;

    private Short status;

    private String rcRemarks;

    private String rtRemarks;

    private Date crtm;

    private Date mdtm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDcode() {
        return dcode;
    }

    public void setDcode(String dcode) {
        this.dcode = dcode == null ? null : dcode.trim();
    }

    public String getDrcode() {
        return drcode;
    }

    public void setDrcode(String drcode) {
        this.drcode = drcode == null ? null : drcode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getRcRemarks() {
        return rcRemarks;
    }

    public void setRcRemarks(String rcRemarks) {
        this.rcRemarks = rcRemarks == null ? null : rcRemarks.trim();
    }

    public String getRtRemarks() {
        return rtRemarks;
    }

    public void setRtRemarks(String rtRemarks) {
        this.rtRemarks = rtRemarks == null ? null : rtRemarks.trim();
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