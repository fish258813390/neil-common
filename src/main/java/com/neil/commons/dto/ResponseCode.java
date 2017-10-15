/**
 *
 */
package com.neil.commons.dto;

/**
 * @author wanghuajian 2015-6-29
 *
 */
public enum ResponseCode {
    /**
     * "000000","成功"
     */
    SUCCESS("000000","成功"),
    /**
     * "111111","失败"
     */
    FAIL("111111","失败"),
    /**
     * "222222","处理中"
     */
    PROCESSING("222222","处理中"),
    /**
     * "333333","参数有误"
     */
    PARAMERROR("333333","参数有误"),
    /**
     * "888888","系统繁忙"
     */
    BUSY("888888","系统繁忙"),
    /**
     * "999999","未知错误"
     */
    ERROR("999999","未知错误");

    private String code;
    private String message;

    private ResponseCode(String code,String message){
        this.code = code;
        this.message = message;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
