package lk.ijse.dto;

import lk.ijse.entity.Admin;

public class BranchDto {
    private String bId;
    private String address;
    private String bNumber;
    private String status;
    private String adminId;

    public BranchDto() {
    }

    public BranchDto(String bId, String address, String bNumber, String status, String adminId) {
        this.bId = bId;
        this.address = address;
        this.bNumber = bNumber;
        this.status = status;
        this.adminId = adminId;
    }

    public BranchDto(String bId, String address, String bNumber, String status) {
        this.bId = bId;
        this.address = address;
        this.bNumber = bNumber;
        this.status = status;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getbNumber() {
        return bNumber;
    }

    public void setbNumber(String bNumber) {
        this.bNumber = bNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "BranchDto{" +
                "bId='" + bId + '\'' +
                ", address='" + address + '\'' +
                ", bNumber='" + bNumber + '\'' +
                ", status='" + status + '\'' +
                ", adminId='" + adminId + '\'' +
                '}';
    }
}
