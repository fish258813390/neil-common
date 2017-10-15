package com.neil.commons.exception;

import java.io.Serializable;

import com.neil.commons.dto.GeneralResponse;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = -2054159799456458610L;
    private String code;
    private String externalMessage;
    private String internalMessage;


    public ExceptionResponse() {
    }

    /**
     * @param code            异常码
     * @param externalMessage 外部说明（显示给用户）
     * @param internalMessage 内部说明（显示给运营人员）
     */
    public ExceptionResponse(String code, String externalMessage, String internalMessage) {
        this.code = code;
        this.externalMessage = externalMessage;
        this.internalMessage = internalMessage;
    }

    public ExceptionResponse(GeneralResponse response) {
        this.code = response.getCode();
        this.externalMessage = response.getExternalMessage();
        this.internalMessage = response.getInternalMessage();
    }

    /**
     * @param externalMessage 外部说明（显示给用户）
     * @param internalMessage 内部说明（显示给运营人员）
     */
    public ExceptionResponse(String externalMessage, String internalMessage) {
        this.externalMessage = externalMessage;
        this.internalMessage = internalMessage;
    }

    /**
     * @param externalMessage 外部说明
     */
    public ExceptionResponse(String externalMessage) {
        this.externalMessage = externalMessage;
        this.internalMessage = externalMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExternalMessage() {
        return externalMessage;
    }

    public void setExternalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
    }

    public String getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(String internalMessage) {
        this.internalMessage = internalMessage;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
