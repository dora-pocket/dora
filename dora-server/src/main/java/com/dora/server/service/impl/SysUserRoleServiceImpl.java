package com.dora.server.service.impl;

import com.dora.server.pojo.SysUserRole;
import com.dora.server.mapper.SysUserRoleMapper;
import com.dora.server.service.ISysUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2022-12-22
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

}
