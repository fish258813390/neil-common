/**
 *
 */
package com.neil.commons.exception;

import com.alibaba.fastjson.JSON;

/**
 * @author wanghuajian 2015-3-5
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 5760929759758796265L;

    /**
     * 异常消息
     *
     * @param message 异常消息
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     * 构造方法
     *
     * @param exceptionResponse <br>
     *                          <br>code 异常码
     *                          <br>externalMessage 外部说明
     *                          <br>internalMessage 内部说明
     *                          <br>log 日志
     *                          <br>构造方法接收ExceptionResponse对象后会将对象转为json字符作为异常消息抛出
     */
    public BusinessException(ExceptionResponse exceptionResponse) {
        super(JSON.toJSONString(exceptionResponse));
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public ExceptionResponse getExceptionResponse() {
        return JSON.parseObject(this.getMessage(), ExceptionResponse.class);
    }


}
