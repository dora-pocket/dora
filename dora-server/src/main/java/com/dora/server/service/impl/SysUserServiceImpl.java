package com.dora.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.dora.server.pojo.LoginUser;
import com.dora.server.pojo.SysUser;
import com.dora.server.mapper.SysUserMapper;
import com.dora.server.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kotlin.jvm.internal.Lambda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2022-12-22
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
//    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUserName,username);
        SysUser sysUser  =  sysUserMapper.selectOne(queryWrapper);

        if(Objects.isNull(sysUser)){
            throw new RuntimeException("错误啦");
        }
        return new LoginUser(sysUser);
    }
}
