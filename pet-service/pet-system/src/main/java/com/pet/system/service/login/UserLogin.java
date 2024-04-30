package com.pet.system.service.login;

import com.pet.system.model.enums.LoginTypeEnum;
import com.pet.system.model.request.UserLoginRequest;
import com.pet.system.model.dto.LoginUserInfo;

/**
 * @author zw
 * @date 2024/4/25 14:27
 * @description
 */
public interface UserLogin {

    /**
     * 实际登录逻辑
     *
     * @param request
     * @return
     */
    LoginUserInfo doLogin(UserLoginRequest request);

    /**
     * 匹配的登录方式
     *
     * @return
     */
    LoginTypeEnum apply();
}
