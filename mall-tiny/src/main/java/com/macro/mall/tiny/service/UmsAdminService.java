package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsPermission;
import com.macro.mall.tiny.mbg.model.UmsResource;
import com.macro.mall.tiny.mbg.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);


    /**
     * 刷新token
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     *
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    UserDetails loadUserDetails(String username);


    /**
     * 根据管理员id获取RUL资源列表
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(Long adminId);


    /**
     * 通过用户名获取用户信息
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);

}
