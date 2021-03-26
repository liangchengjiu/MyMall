package com.ricardo.mall.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: MyMall
 * @description:
 * @author: liangchengjiu
 * @create: 2021-03-26 22:43
 **/
@Data
public class PageForm implements Serializable {

    /**
     * 当前页
     */
    private Integer current;

    /**
     * 每页显示条数
     */
    private Integer size;
}
