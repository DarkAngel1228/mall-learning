package com.macro.mall.tiny.service;

import com.macro.mall.tiny.nosql.mongodb.ducument.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 */
public interface MemberReadHistoryService {
    /**
     * 生成记录
     * @param memberReadHistory 记录
     * @return int
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     * @param ids id数组
     * @return int
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     * @param memberId 会员
     * @return 记录
     */
    List<MemberReadHistory> list(Long memberId);
}
