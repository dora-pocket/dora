package com.dora.server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色和权限关联表
 * </p>
 *
 * @author chen
 * @since 2022-12-22
 */
@Getter
@Setter
@TableName("sys_role_pms")
@ApiModel(value = "SysRolePms对象", description = "角色和权限关联表")
public class SysRolePms implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色ID")
    private Long roleId;

    @ApiModelProperty("权限ID")
    private Long pmsId;


}
