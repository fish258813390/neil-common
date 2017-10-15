/**
 *
 */
package com.neil.commons.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;


public class BaseModel implements Serializable {
    private static final long serialVersionUID = -4114861341940864399L;
    protected String tenantId; // 租户ID
    protected Date addDateTime; // 添加数据时间
    protected String addUserId;// 添加数据用户ID
    protected Date modifyDateTime;// 最后一次修改数据时间
    protected String modifyUserId;// 最后一次修改数据用户ID
    protected Integer dataStatus = 1;// 数据状态 0:无效 1:有效

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    public Date getAddDateTime() {
        return addDateTime;
    }

    public void setAddDateTime(Date addDateTime) {
        this.addDateTime = addDateTime;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }


}
