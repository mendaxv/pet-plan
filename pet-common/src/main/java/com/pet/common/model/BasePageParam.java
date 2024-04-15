package com.pet.common.model;

import com.pet.common.exception.BusinessException;
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
    private int pageNo = 1;

    /**
     * 每页记录数
     */
    private int pageSize = 10;

    public void setPageNo(int pageNo) {
        if (pageNo < 1) {
            throw new BusinessException("页码需大于0");
        }
        this.pageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        if (pageSize > 10000) {
            throw new BusinessException("单次查询数量过大");
        }
        this.pageSize = pageSize;
    }
}
