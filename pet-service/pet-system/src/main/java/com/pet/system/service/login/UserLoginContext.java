package com.pet.system.service.login;

import cn.hutool.core.collection.CollUtil;
import com.pet.common.exception.BusinessException;
import com.pet.common.response.ResultCode;
import com.pet.system.model.dto.LoginUserInfo;
import com.pet.system.model.request.UserLoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zw
 * @date 2024/4/30 15:01
 * @description 登录上下文
 */
@Component
@Slf4j
public class UserLoginContext {

    @Resource
    private List<UserLogin> userLoginList;

    public LoginUserInfo login(UserLoginRequest request) {
        List<UserLogin> loginList = userLoginList.stream()
                .filter(e -> e.apply().equals(request.getLoginType())).collect(Collectors.toList());
        if (CollUtil.isEmpty(loginList)) {
            log.error("未匹配到登录处理器");
            throw new BusinessException(ResultCode.SYSTEM_ERROR);
        } else if (loginList.size() == 1) {
            return loginList.get(0).doLogin(request);
        } else {
            log.error("匹配到多个登录处理器");
            throw new BusinessException(ResultCode.SYSTEM_ERROR);
        }
    }
}
