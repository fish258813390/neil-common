/**
 *
 */
package com.neil.commons.dto;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.neil.commons.util.UUID32;

/**
 * @author wanghuajian 2015-3-6
 *
 */
public class RequestHead implements Serializable{
    private static final long serialVersionUID = 5592474176966660995L;
    /*
     * 请求IP
     */
    private String localIp;
    /*
     * 客户端IP
     */
    private String remoteIp;
    /*
     * 请求的uuid
     */
    private String requestId;
    /*
     *用户登录账号
     */
    private String userAccount;

    /*
     * 登录人名字
     */
    private String userRealName;
    /*
     * 请求操作员ID
     */
    private String userId;
    /*
     * 请求网点ID
     */
    private String agentId;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 获取本机IP
     * @return
     */
    public String getLocalIp() {
        return localIp;
    }
    /**
     * 设置本机IP
     * @return
     */
    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }
    /**
     * 获取远程IP
     * @return
     */
    public String getRemoteIp() {
        return remoteIp;
    }
    /**
     * 设置远程IP
     * @return
     */
    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }
    /**
     * 获取请求ID
     * @return
     */
    public String getRequestId() {
        return requestId;
    }
    /**
     * 设置请求ID
     * @return
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    /**
     * 获取操作员ID
     * @return
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 设置操作员ID
     * @return
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * 获取代理商ID
     * @return
     */
    public String getAgentId() {
        return agentId;
    }
    /**
     * 设置代理商ID
     * @return
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    /**
     * 获取用户登录账号
     * @return
     */
    public String getUserAccount() {
        return userAccount;
    }
    /**
     * 设置用户登录账号
     * @param userAccount
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
    /**
     * 租户ID
     * @return
     */
    public String getTenantId() {
        return tenantId;
    }
    /**
     * 租户ID
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    /**
     * 获取本机IP
     * @return
     */
    public static String getIP() {
        String localIp = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            localIp = addr.getHostAddress().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return localIp;
    }

    /**
     * 构建本地请求head
     * @return
     */
    public static RequestHead getRequestHead(){
        RequestHead requestHead = new RequestHead();
        requestHead.setAgentId("-1");
        requestHead.setLocalIp(RequestHead.getIP());
        requestHead.setRemoteIp(RequestHead.getIP());
        requestHead.setUserRealName("系统");
        requestHead.setUserAccount("SYSTEM");
        requestHead.setUserId("-1");
        requestHead.setRequestId(UUID32.getUUID());
        requestHead.setTenantId("yolly");
        return requestHead;
    }

    public void validateRequestHead() throws Exception{
        if(this.localIp == null || "".equals(localIp.trim())){
            throw new Exception("参数RequestHead中服务器IP(localIp)为空");
        }
        if(this.remoteIp == null || "".equals(remoteIp.trim())){
            throw new Exception("参数RequestHead中远程客户端IP(remoteIp)为空");
        }
        if(this.requestId == null || "".equals(requestId.trim())){
            throw new Exception("参数RequestHead中请求的UUID(requestId)为空");
        }
        if(this.userAccount == null || "".equals(userAccount.trim())){
            throw new Exception("参数RequestHead中用户登录账号(userAccount)为空");
        }
        if(this.userId == null || "".equals(userId.trim())){
            throw new Exception("参数RequestHead中登录账号所属ID(userId)为空");
        }
        if(this.agentId == null || "".equals(agentId.trim())){
            throw new Exception("参数RequestHead中代理商ID(agentId)为空");
        }
        if(this.tenantId == null || "".equals(tenantId.trim())){
            throw new Exception("参数RequestHead中租户ID(tenantId)为空");
        }
        if(this.userRealName == null || "".equals(userRealName.trim())){
            throw new Exception("参数RequestHead中登录人名称(userRealName)为空");
        }
    }
    public String getUserRealName() {
        return userRealName;
    }
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

}
