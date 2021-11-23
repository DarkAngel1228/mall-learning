package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsMenu;
import com.macro.mall.tiny.mbg.model.UmsRole;

import java.util.List;

/**
 * 后台角色管理Service
 */
public interface UmsRoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    int create(UmsRole role);

    /**
     * 修改角色
     * @param id
     * @param role
     * @return
     */
    int update(Long id, UmsRole role);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int delete(List<Long> ids);


    /**
     * 获取所有角色列表
     * @return
     */
    List<UmsRole> list();


    /**
     * 根据管理员ID获取对应菜单
     */
    List<UmsMenu> getMenuList(Long adminId);






}
