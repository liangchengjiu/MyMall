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
 * 产品分类
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("产品分类")
@TableName("pms_product_category")
public class PmsProductCategory extends Model<PmsProductCategory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField("parent_id")
    @ApiModelProperty("上机分类的编号：0表示一级分类")
    private Long parentId;

    @TableField("name")
    @ApiModelProperty("")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField("level")
    @ApiModelProperty("分类级别：0->1级；1->2级")
    private Integer level;

    @TableField("product_count")
    @ApiModelProperty("")
    private Integer productCount;

    @TableField("product_unit")
    @ApiModelProperty("")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField("nav_status")
    @ApiModelProperty("是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField("show_status")
    @ApiModelProperty("显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @TableField("sort")
    @ApiModelProperty("")
    private Integer sort;

    /**
     * 图标
     */
    @TableField("icon")
    @ApiModelProperty("图标")
    private String icon;

    @TableField("keywords")
    @ApiModelProperty("")
    private String keywords;

    /**
     * 描述
     */
    @TableField("description")
    @ApiModelProperty("描述")
    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
