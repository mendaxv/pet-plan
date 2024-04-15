package com.pet.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.pet.system.model.Constants;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author zw
 * @date 2024/2/1 9:09
 * @description
 */
@Data
public class BaseEntity implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @JsonFormat(pattern = Constants.PATTERN)
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private Integer updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @JsonFormat(pattern = Constants.PATTERN)
    private LocalDateTime updateTime;

    /**
     * 逻辑删除（0-否；1-是）
     */
    @TableField(value = "del")
    @TableLogic(value = "0", delval = "1")
    private Integer del;
}
