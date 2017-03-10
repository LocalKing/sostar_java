package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/16.
 */
public class EmployerAuthParam  implements Serializable {
    private int userId;
    @ApiModelProperty(value = "公司logo", required = false)
    private String logoPath;
    @ApiModelProperty(value = "公司名称", required = true)
    private String companyName;
    @ApiModelProperty(value = "联系电话", required = true)
    private String contactPhone;
    @ApiModelProperty(value = "公司简介", required = false)
    private String introduction;
    @ApiModelProperty(value = "公司地址", required = true)
    private String address;
    @ApiModelProperty(value = "企业识别代号", required = true)
    private String companyCode;
    @ApiModelProperty(value = "年检营业执照", required = true)
    private String licPath;
    @ApiModelProperty(value = "税务登记证", required = true)
    private String rifPath;
    @ApiModelProperty(value = "证件", required = true)
    private String cerPath;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getLicPath() {
        return licPath;
    }

    public void setLicPath(String licPath) {
        this.licPath = licPath;
    }

    public String getRifPath() {
        return rifPath;
    }

    public void setRifPath(String rifPath) {
        this.rifPath = rifPath;
    }

    public String getCerPath() {
        return cerPath;
    }

    public void setCerPath(String cerPath) {
        this.cerPath = cerPath;
    }
}
