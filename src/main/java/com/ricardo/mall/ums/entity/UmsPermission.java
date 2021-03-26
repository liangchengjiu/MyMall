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
 * 后台用户权限表
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("后台用户权限表")
@TableName("ums_permission")
public class UmsPermission extends Model<UmsPermission> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    /**
     * 父级权限id
     */
    @TableField("pid")
    @ApiModelProperty("父级权限id")
    private Long pid;

    /**
     * 名称
     */
    @TableField("name")
    @ApiModelProperty("名称")
    private String name;

    /**
     * 权限值
     */
    @TableField("value")
    @ApiModelProperty("权限值")
    private String value;

    /**
     * 图标
     */
    @TableField("icon")
    @ApiModelProperty("图标")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @TableField("type")
    @ApiModelProperty("权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * 前端资源路径
     */
    @TableField("uri")
    @ApiModelProperty("前端资源路径")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @TableField("status")
    @ApiModelProperty("启用状态；0->禁用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 排序
     */
    @TableField("sort")
    @ApiModelProperty("排序")
    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
