package com.neil.commons.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 过滤html代码，只保留文字
 *
 */
public class RegexString {

    public static String ReplaceTag(String sourceStr) {
        if (sourceStr == null || sourceStr.trim().equals("")) {
            return "";
        }
        StringBuffer substring = new StringBuffer();
        Pattern pattern = null;
        Matcher matcher = null;
        String subStr = "";
        String regexStr = "<[^>]*>";
        pattern = Pattern.compile(regexStr);
        matcher = pattern.matcher(sourceStr);
        while (matcher.find()) {
            matcher.appendReplacement(substring, subStr);
        }
        matcher.appendTail(substring);
        return substring.toString();
    }

}