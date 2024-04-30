package com.pet.system.service.login;

import cn.dev33.satoken.stp.StpUtil;
import com.pet.common.exception.BusinessException;
import com.pet.common.response.ResultCode;
import com.pet.system.model.entity.User;
import com.pet.system.model.enums.LoginTypeEnum;
import com.pet.system.model.enums.UserStatusEnum;
import com.pet.system.model.request.UserLoginRequest;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author zw
 * @date 2024/4/25 15:43
 * @description 账号密码登录
 */
@Component
public class UsernamePasswordUserLogin implements UserLogin {

    @Resource
    private UserService userService;

    @Override
    public LoginUserInfo doLogin(UserLoginRequest request) {

        User user = Optional.ofNullable(userService.getByAccount(request.getAccount()))
                .orElseThrow(() -> new BusinessException(ResultCode.DATA_EMPTY));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new BusinessException(ResultCode.LOGIN_FAILURE);
        }

        if (!UserStatusEnum.NORMAL.getCode().equals(user.getStatus())) {
            throw new BusinessException(ResultCode.LOGIN_ACCOUNT_ABNORMAL);
        }

        StpUtil.login(10001);

        LoginUserInfo loginUserInfo = new LoginUserInfo();
        loginUserInfo.setUserId(user.getId());
        loginUserInfo.setNickname(user.getNickname());
        loginUserInfo.setAccount(user.getAccount());

        return loginUserInfo;
    }

    @Override
    public LoginTypeEnum apply() {
        return LoginTypeEnum.NORMAL;
    }
}
