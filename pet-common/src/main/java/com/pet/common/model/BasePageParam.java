package com.pet.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zw
 * @date 2024/1/25 10:27
 * @description 基础分页参数
 */
@Data
public class BasePageParam implements Serializable {

    /**
     * 页码
     */
    private int pageNo;

    /**
     * 每页记录数
     */
    private int pageSize;
}
