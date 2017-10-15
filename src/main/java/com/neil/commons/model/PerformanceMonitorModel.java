package com.neil.commons.model;

import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.util.Date;

public class PerformanceMonitorModel implements Serializable{
    private static final long serialVersionUID = 6927238596491330061L;
    private String id;
    private Date createTime;
    private String serviceName;
    private String serviceRemark;
    private double maxMemory;
    private double freeMemory;
    private double totalMemory;
    private int totalThread;
    private String driverClassName;
    private String url;
    private int initialSize;
    private int maxActive;
    private int maxIdle;
    private int minIdle;
    private int maxWait;
    private String username;

    private String poolName;
    private int waitCount;
    private int totalSize;
    private int busy;
    private int idle;

    private String serverId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getServiceRemark() {
        return serviceRemark;
    }
    public void setServiceRemark(String serviceRemark) {
        this.serviceRemark = serviceRemark;
    }
    public double getMaxMemory() {
        return maxMemory;
    }
    public void setMaxMemory(double maxMemory) {
        this.maxMemory = maxMemory;
    }
    public double getFreeMemory() {
        return freeMemory;
    }
    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }
    public double getTotalMemory() {
        return totalMemory;
    }
    public void setTotalMemory(double totalMemory) {
        this.totalMemory = totalMemory;
    }
    public int getTotalThread() {
        return totalThread;
    }
    public void setTotalThread(int totalThread) {
        this.totalThread = totalThread;
    }
    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getInitialSize() {
        return initialSize;
    }
    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }
    public int getMaxActive() {
        return maxActive;
    }
    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }
    public int getMaxIdle() {
        return maxIdle;
    }
    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }
    public int getMinIdle() {
        return minIdle;
    }
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }
    public int getMaxWait() {
        return maxWait;
    }
    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPoolName() {
        return poolName;
    }
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }
    public int getWaitCount() {
        return waitCount;
    }
    public void setWaitCount(int waitCount) {
        this.waitCount = waitCount;
    }
    public int getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
    public int getBusy() {
        return busy;
    }
    public void setBusy(int busy) {
        this.busy = busy;
    }
    public int getIdle() {
        return idle;
    }
    public void setIdle(int idle) {
        this.idle = idle;
    }
    public String getServerId() {
        return serverId;
    }
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

}
