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
 * 后台用户表
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("后台用户表")
@TableName("ums_admin")
public class UmsAdmin extends Model<UmsAdmin> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    @TableField("username")
    @ApiModelProperty("")
    private String username;

    @TableField("password")
    @ApiModelProperty("")
    private String password;

    /**
     * 头像
     */
    @TableField("icon")
    @ApiModelProperty("头像")
    private String icon;

    /**
     * 邮箱
     */
    @TableField("email")
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 昵称
     */
    @TableField("nick_name")
    @ApiModelProperty("昵称")
    private String nickName;

    /**
     * 备注信息
     */
    @TableField("note")
    @ApiModelProperty("备注信息")
    private String note;

    /**
     * 创建时间
     */
    @TableField("create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @TableField("login_time")
    @ApiModelProperty("最后登录时间")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @TableField("status")
    @ApiModelProperty("帐号启用状态：0->禁用；1->启用")
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
