/**
 *
 */
package com.neil.commons.util;

import java.util.UUID;

/**
 * @author wanghuajian 2015-3-5
 *
 */
public class UUID32 {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    
}
