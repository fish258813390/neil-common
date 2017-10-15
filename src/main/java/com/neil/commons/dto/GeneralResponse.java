package com.neil.commons.dto;

import com.alibaba.fastjson.JSON;
import com.neil.commons.exception.BusinessException;
import com.neil.commons.exception.ExceptionResponse;

import java.io.Serializable;

public class GeneralResponse implements Serializable {
    private boolean status;
    private String code;
    private String externalMessage;
    private String internalMessage;
    private Object result;

    /**
     * 构造函数
     * 默认status 为true
     */
    public GeneralResponse() {
        this.status = true;
    }

    /**
     * @param result          操作结果对象
     * @param code            错误码
     * @param externalMessage 外部消息
     * @param internalMessage 内部消息
     */
    public GeneralResponse(Object result, String code, String externalMessage, String internalMessage) {
        this.result = result;
        this.code = code;
        this.externalMessage = externalMessage;
        this.internalMessage = internalMessage;
    }

    /**
     * @param status          操作状态
     * @param result          操作结果对象
     * @param code            错误码
     * @param externalMessage 外部消息
     * @param internalMessage 内部消息
     */
    public GeneralResponse(boolean status, Object result, String code, String externalMessage, String internalMessage) {
        this.status = status;
        this.result = result;
        this.code = code;
        this.externalMessage = externalMessage;
        this.internalMessage = internalMessage;
    }

    /**
     * @param result          操作结果对象
     * @param externalMessage 外部消息
     */
    public GeneralResponse(Object result, String externalMessage) {
        this.result = result;
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }


    /**
     * @param status          操作状态
     * @param result          操作结果对象
     * @param externalMessage 外部消息
     */
    public GeneralResponse(boolean status, Object result, String externalMessage) {
        this.status = status;
        this.result = result;
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }

    /**
     * 默认为操作失败
     *
     * @param externalMessage 外部消息
     */
    public GeneralResponse(String externalMessage) {
        this.status = false;
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }

    /**
     * @param result          操作结果对象
     * @param code            消息码
     * @param externalMessage 外部消息
     */
    public GeneralResponse(Object result, String code, String externalMessage) {
        this.result = result;
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }

    /**
     * @param status          操作状态
     * @param result          操作结果对象
     * @param code            消息码
     * @param externalMessage 外部消息
     */
    public GeneralResponse(boolean status, Object result, String code, String externalMessage) {
        this.status = status;
        this.result = result;
        this.code = code;
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }

    /**
     * @param e 业务异常对象
     */
    public GeneralResponse(BusinessException e) {
        try {
            ExceptionResponse response = JSON.parseObject(e.getMessage(), ExceptionResponse.class);
            this.code = response.getCode();
            this.externalMessage = response.getExternalMessage();
            this.internalMessage = response.getInternalMessage();
        } catch (Exception e1) {
            this.externalMessage = e.getMessage();
            this.internalMessage = e.getMessage();
        }
    }

    /**
     * @param status 操作状态
     * @param result 操作结果对象
     */
    public GeneralResponse(boolean status, Object result) {
        this.status = status;
        this.result = result;
    }

    public boolean getStatus() {
        return status;
    }

    /**
     * @param status 操作状态
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * 外部消息
     *
     * @return
     */
    public String getExternalMessage() {
        return externalMessage;
    }

    public void setExternalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
    }

    /**
     * 内部消息
     *
     * @return
     */
    public String getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(String internalMessage) {
        this.internalMessage = internalMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public String toFailJSONString() {
        this.status = false;
        return JSON.toJSONString(this);
    }

    public String toSuccessJSONString() {
        this.status = true;
        return JSON.toJSONString(this);
    }
}
