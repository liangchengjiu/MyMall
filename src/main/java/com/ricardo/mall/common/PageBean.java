package com.ricardo.mall.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: MyMall
 * @description: 分页工具类
 * @author: liangchengjiu
 * @create: 2021-03-26 22:40
 **/
@Data
public class PageBean<T> implements Serializable{
    /**
     * 总记录数
     */
    private int total;
    /**
     * 每页记录数
     */
    private int size;
    /**
     * 总页数
     */
    private int pages;
    /**
     * 当前页数
     */
    private int current;
    /**
     * 列表数据
     */
    private List<?> records;

    /**
     * 分页
     *
     * @param records 列表数据
     * @param total   总记录数
     * @param size    每页记录数
     * @param current 当前页数
     */
    public PageBean(List<?> records, int total, int size, int current) {
        this.records = getCurrentList(records, size, current);
        this.total = total;
        this.size = size;
        this.current = current;
        this.pages = (int) Math.ceil((double) total / size);
    }

    public List<?> getCurrentList(List<?> records, int size, int current) {
        int toIndex = current * size > records.size() ? records.size() : current * size;
        return records.subList((current - 1) * size, toIndex);
    }


    public PageBean() {

    }

    /**
     * 分页
     */
    public PageBean(IPage<?> page) {
        this.records = page.getRecords();
        this.total = (int) page.getTotal();
        this.size = (int) page.getSize();
        this.current = (int) page.getCurrent();
        this.pages = (int) page.getPages();
    }

    /**
     * 根据PageForm对象，返回Page对象
     *
     * @return
     */
    public static Page getPage(PageForm pageForm) {
        int page = 1, size = 10;
        if (pageForm.getCurrent() != null) {
            page = pageForm.getCurrent();
        }
        if (pageForm.getSize() != null) {
            size = pageForm.getSize();
        }
        return new Page<>(page, size);
    }

}
