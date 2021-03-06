package zhku.zhou.asset.entity;

import java.util.Date;

public class DeviceReceive {
    private Integer id;

    private Integer did;

    private String code;

    private Integer uid;

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

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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