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
 * 产品属性分类表
 * </p>
 *
 * @author Dawson·Ricardo
 * @since 2021-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pms_product_attribute_category")
public class PmsProductAttributeCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 属性数量
     */
    @TableField("attribute_count")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField("param_count")
    private Integer paramCount;


}
