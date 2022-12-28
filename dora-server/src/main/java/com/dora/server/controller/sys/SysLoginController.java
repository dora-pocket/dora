package com.dora.server.controller.sys;

import com.dora.framework.api.CommonResult;
import com.dora.server.pojo.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author chen
 * @since 2022-12-22
 */
@RestController
@RequestMapping("/sys")
public class SysLoginController {

    @PostMapping("/login")
    public CommonResult info(@RequestBody SysUser user)
    {

        return CommonResult.success(user);
    }



}
