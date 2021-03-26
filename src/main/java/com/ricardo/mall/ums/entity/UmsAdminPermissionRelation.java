package com.ricardo.mall.ums.entity;

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
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("后台用户和权限关系表(除角色中定义的权限以外的加减权限)")
@TableName("ums_admin_permission_relation")
public class UmsAdminPermissionRelation extends Model<UmsAdminPermissionRelation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    @TableField("admin_id")
    @ApiModelProperty("")
    private Long adminId;

    @TableField("permission_id")
    @ApiModelProperty("")
    private Long permissionId;

    @TableField("type")
    @ApiModelProperty("")
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
