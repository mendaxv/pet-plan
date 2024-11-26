package com.pidan.common.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zw
 * @date 2024/11/4 9:14
 * @description BigDecimal类型JSON序列化器
 * 用于前后端交互场景，后端将金额保留两位小数返回给前端进行展示
 */
public class BigDecimalJsonSerializer extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(value.setScale(2, RoundingMode.HALF_UP));
    }

}
