/**
 *
 */
package com.neil.commons.dto;

/**
 * @author wanghuajian 2016年8月25日
 *
 */
public enum StatusDictionary {
    SUCCESS("success","成功"),
    PROCESSING("processing","处理中"),
    FAIL("fail","失败"),
    CANCEL("cancel","取消"),
    REVERSE("reverse","冲正"),
    WRITE_OFF("write_off","冲销"),
    CHECKED("checked","已审核"),
    CHECKING("checking","审核中"),
    PASS("pass","通过"),
    NOT_PASS("not_pass","未通过"),
    YES("yes","是"),
    NO("no","否"),
    ENABLED("enabled","启用"),
    DISABLED("disabled","禁用"),
    FREEZE("freeze","冻结"),
    TRUE("true","是"),
    FALSE("false","否");


    private String code;
    private String message;

    private StatusDictionary(String code,String message){
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

    public static StatusDictionary getStatusByCode(String code){
        for(StatusDictionary statusDictionary:StatusDictionary.values()){
            if(statusDictionary.getCode().equals(code)){
                return statusDictionary;
            }
        }
        return null;
    }

}
