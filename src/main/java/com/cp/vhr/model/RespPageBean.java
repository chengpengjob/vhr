package com.cp.vhr.model;

import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-04-07 20:45
 */
public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
