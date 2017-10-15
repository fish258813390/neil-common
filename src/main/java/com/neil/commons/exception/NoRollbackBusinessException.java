/**
 *
 */
package com.neil.commons.exception;

/**
 * @author wanghuajian 2015-11-20
 *
 */
public class NoRollbackBusinessException extends BusinessException{
    private static final long serialVersionUID = -7631153441578226490L;

    /**
     * @param exceptionResponse
     */
    public NoRollbackBusinessException(ExceptionResponse exceptionResponse) {
        super(exceptionResponse);
        // TODO Auto-generated constructor stub
    }

    public NoRollbackBusinessException(String message){
        super(message);
    }

}
