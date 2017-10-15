/**
 *
 */
package com.neil.commons.exception;

/**
 * @author wanghuajian 2015-6-10
 *
 */
public class ExceptionTools {
    /**
     * 判断是否为超时异常
     * <p>
     * 	请判断Exception异常 无需判断BusinessException 异常
     * </p>
     * @param e
     * @return
     */
    public static boolean isTimeOutException(Exception e){
        if(e != null){
            if(e.getCause() != null){
                if(e.getCause().getClass() != null){
                    String className = e.getCause().getClass().getName();
                    if(className != null && !"".equals(className.trim())){
                        if(className.equals("com.alibaba.dubbo.remoting.TimeoutException")){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
