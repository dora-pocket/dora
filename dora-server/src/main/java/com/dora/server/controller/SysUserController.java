package com.dora.server.controller;

import com.alibaba.fastjson2.JSONObject;
import com.dora.framework.api.CommonResult;
import com.dora.server.pojo.SysUser;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author chen
 * @since 2022-12-22
 */
@RestController
@RequestMapping("/sys/user")

public class SysUserController {

    @PostMapping("/info")
    public CommonResult info(@RequestBody SysUser user)
    {
        return CommonResult.success(user);
    }

    @GetMapping ("/getInfo")
    public String getInfo()
    {
        return "getInfo";
    }

}
