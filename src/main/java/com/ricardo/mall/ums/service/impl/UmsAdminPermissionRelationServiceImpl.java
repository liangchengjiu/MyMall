package com.ricardo.mall.ums.service.impl;

import com.ricardo.mall.ums.entity.UmsAdminPermissionRelation;
import com.ricardo.mall.ums.mapper.UmsAdminPermissionRelationMapper;
import com.ricardo.mall.ums.service.UmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

}
