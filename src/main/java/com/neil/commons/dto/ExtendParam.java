/**
 *
 */
package com.neil.commons.dto;

import java.io.Serializable;

/**
 * @author wanghuajian 2015-6-29
 * 扩展参数对象,请使用构造函数ExtendParam(String paramValue,String paramRemark)构造对象
 */
public class ExtendParam implements Serializable{
    private static final long serialVersionUID = -5875201466639619921L;
    private String paramValue;
    private String paramRemark;
    /**
     * 构造函数
     * @param paramValue 扩展参数值
     * @param paramRemark 扩展参数说明（必须说明该参数的意义）
     */
    public ExtendParam(String paramValue,String paramRemark){
        this.paramRemark = paramRemark;
        this.paramValue = paramValue;
    }
    public ExtendParam(){}
    public String getParamValue() {
        return paramValue;
    }
    public String getParamRemark() {
        return paramRemark;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
    public void setParamRemark(String paramRemark) {
        this.paramRemark = paramRemark;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
