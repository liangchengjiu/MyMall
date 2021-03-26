package com.ricardo.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 产品分类
 * </p>
 *
 * @author Dawson·Ricardo
 * @since 2021-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pms_product_category")
public class PmsProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField("parent_id")
    private Long parentId;

    @TableField("name")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField("level")
    private Integer level;

    @TableField("product_count")
    private Integer productCount;

    @TableField("product_unit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField("nav_status")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField("show_status")
    private Integer showStatus;

    @TableField("sort")
    private Integer sort;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    @TableField("keywords")
    private String keywords;

    /**
     * 描述
     */
    @TableField("description")
    private String description;


}
