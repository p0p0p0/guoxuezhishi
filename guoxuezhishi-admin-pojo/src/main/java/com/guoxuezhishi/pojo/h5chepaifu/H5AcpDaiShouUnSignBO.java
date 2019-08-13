package com.guoxuezhishi.pojo.h5chepaifu;

import com.guoxuezhishi.pojo.BaseBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: jiang
 * @date: 2019/7/2
 */
@ApiModel(value = "车牌付代付解约", description = "车牌付代付解约")
public class H5AcpDaiShouUnSignBO extends BaseBO {

    @ApiModelProperty(value = "", name = "", example = "00", required = true)
    private String charset;
    @ApiModelProperty(value = "", name = "", example = "1.0", required = true)
    private String version;
    @ApiModelProperty(value = "", name = "", example = "H5AcpDaiShouUnSign", required = true)
    private String service;
    @ApiModelProperty(value = "", name = "", example = "1", required = true)
    private String requestTime;
    @ApiModelProperty(value = "", name = "", example = "e582f174-ef4d-427e-b8bf-fefb7de626ac", required = true)
    private String customerId;
    @ApiModelProperty(value = "", name = "", example = "9201907010017030108", required = true)
    private String agrNo;

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAgrNo() {
        return agrNo;
    }

    public void setAgrNo(String agrNo) {
        this.agrNo = agrNo;
    }
}
