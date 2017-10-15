package com.neil.commons.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 分页辅助类
 *
 * @author houwen
 * @param <T>
 */
@SuppressWarnings("unused")
public class Pagination<T> implements Serializable{
    private static final long serialVersionUID = 3175832703974696888L;
    private long start = 0; // 开始条数
    private long pageSize = 10; // 每页显示条数
    private long currentPage; // 当前页
    private long totalPage; // 总页数
    private long total; // 总条数
    private Map<String, Object> where; // 条件参数
    private String order; // 排序条件
    private String orderBy; // 排序方式
    private List<T> rows = new ArrayList<T>();  //返回结果
    private List footer;//统计结果

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
        this.totalPage = (total % pageSize > 0 ? (total / pageSize) + 1 : total
                / pageSize);
    }

    public long getTotalPage() {
        return (total % pageSize > 0 ? (total / pageSize) + 1 : total
                / pageSize);
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getStart() {
        return (currentPage - 1) * pageSize;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public Map<String, Object> getWhere() {
        return where;
    }

    public void setWhere(Map<String, Object> where) {
        this.where = where;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
        if(total != 0){
            this.totalPage = (total % pageSize > 0 ? (total / pageSize) + 1 : total
                    / pageSize);
        }
    }

    public List getFooter() {
        return footer;
    }

    public void setFooter(List footer) {
        this.footer = footer;
    }

}
