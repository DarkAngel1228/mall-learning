package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 */
public interface UmsMemberService {
    /**
     * 生产验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
