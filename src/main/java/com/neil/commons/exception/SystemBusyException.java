/**
 *
 */
package com.neil.commons.exception;

import java.io.Serializable;

/**
 * @author wanghuajian 2015-5-9
 */
public class SystemBusyException extends BusinessException implements Serializable {
    private static final long serialVersionUID = -4072771257956097237L;

    public SystemBusyException(String message) {
        super(message);
    }

    /**
     * @param exceptionResponse
     */
    public SystemBusyException(ExceptionResponse exceptionResponse) {
        super(exceptionResponse);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
