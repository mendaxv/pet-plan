package com.pidan.common.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zw
 * @date 2024/10/17 11:36
 * @description：校验工具
 */
public class ValidatorUtil {

    private static final ValidatorFactory VALIDATOR_FACTORY = Validation.buildDefaultValidatorFactory();

    public static <T> Map<String, String> validate(T object, Class<?>... groups){

        Validator validator = VALIDATOR_FACTORY.getValidator();
        Set<ConstraintViolation<T>> validateSet = validator.validate(object, groups);

        if (validateSet.isEmpty()){
            return Collections.emptyMap();
        }else{
            // 不为空则表示有异常，收集异常信息
            return validateSet.stream().collect(Collectors.toMap(
                    e -> e.getPropertyPath().toString(), ConstraintViolation::getMessage));
        }
    }
}