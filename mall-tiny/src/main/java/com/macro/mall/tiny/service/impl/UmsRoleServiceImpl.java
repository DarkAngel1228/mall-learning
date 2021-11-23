package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.dao.UmsRoleDao;
import com.macro.mall.tiny.mbg.model.UmsMenu;
import com.macro.mall.tiny.mbg.model.UmsResource;
import com.macro.mall.tiny.mbg.model.UmsRole;
import com.macro.mall.tiny.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleDao roleDao;
    @Override
    public int create(UmsRole role) {
        return 0;
    }

    @Override
    public int update(Long id, UmsRole role) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<UmsRole> list() {
        return null;
    }

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }


}
