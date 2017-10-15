/**
 *
 */
package com.neil.commons.util;

import java.util.UUID;

/**
 * @author wanghuajian 2015-3-5
 * 随机生成uuid
 */
public class UUID32 {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


}
