package com.ricardo.mall.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

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
 * 后台用户角色表
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("后台用户角色表")
@TableName("ums_role")
public class UmsRole extends Model<UmsRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    /**
     * 名称
     */
    @TableField("name")
    @ApiModelProperty("名称")
    private String name;

    /**
     * 描述
     */
    @TableField("description")
    @ApiModelProperty("描述")
    private String description;

    /**
     * 后台用户数量
     */
    @TableField("admin_count")
    @ApiModelProperty("后台用户数量")
    private Integer adminCount;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 启用状态：0->禁用；1->启用
     */
    @TableField("status")
    @ApiModelProperty("启用状态：0->禁用；1->启用")
    private Integer status;

    @TableField("sort")
    @ApiModelProperty("")
    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
