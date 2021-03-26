package com.ricardo.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 产品属性分类表
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("产品属性分类表")
@TableName("pms_product_attribute_category")
public class PmsProductAttributeCategory extends Model<PmsProductAttributeCategory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    @TableField("name")
    @ApiModelProperty("")
    private String name;

    /**
     * 属性数量
     */
    @TableField("attribute_count")
    @ApiModelProperty("属性数量")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField("param_count")
    @ApiModelProperty("参数数量")
    private Integer paramCount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
