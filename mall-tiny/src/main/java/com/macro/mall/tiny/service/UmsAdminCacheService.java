package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsResource;

import java.util.List;

public interface UmsAdminCacheService {

    void delAdmin(Long adminId);


    /**
     * 根据管理员id获取url列表
     * @param adminId
     * @return
     */
    List<UmsResource> getResourceList(Long adminId);


    /**
     * 设置缓存后台用户资源列表
     * @param adminId
     * @param resourceList
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
