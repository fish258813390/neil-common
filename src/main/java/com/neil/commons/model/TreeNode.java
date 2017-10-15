package com.neil.commons.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * easyui tree 的转换类
 * 创建时间: 2013 - 08 - 09
 * @author lm
 * @version 1.0
 */
public class TreeNode implements Serializable{

    private static final long serialVersionUID = -3469068681667112502L;
    private String id;
    private String text;
    private String state;
    private String iconCls;
    private String site;
    private boolean checked;
    private Map<String,Object> attributes;
    private List<TreeNode> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getIconCls() {
        return iconCls;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
