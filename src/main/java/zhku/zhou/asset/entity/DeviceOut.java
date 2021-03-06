package zhku.zhou.asset.entity;

import java.util.Date;

public class DeviceOut {
    private Integer id;

    private Integer did;

    private Integer outter;

    private String outRemarks;

    private Short status;

    private Integer approver;

    private String approvalRemarks;

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

    public Integer getOutter() {
        return outter;
    }

    public void setOutter(Integer outter) {
        this.outter = outter;
    }

    public String getOutRemarks() {
        return outRemarks;
    }

    public void setOutRemarks(String outRemarks) {
        this.outRemarks = outRemarks == null ? null : outRemarks.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getApprover() {
        return approver;
    }

    public void setApprover(Integer approver) {
        this.approver = approver;
    }

    public String getApprovalRemarks() {
        return approvalRemarks;
    }

    public void setApprovalRemarks(String approvalRemarks) {
        this.approvalRemarks = approvalRemarks == null ? null : approvalRemarks.trim();
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