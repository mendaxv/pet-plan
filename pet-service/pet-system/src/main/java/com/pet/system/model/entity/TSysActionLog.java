package com.pet.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 操作日志表
 * @TableName t_sys_action_log
 */
@TableName(value ="t_sys_action_log")
@Data
public class TSysActionLog extends BaseEntity {

    /**
     * 日志名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 日志类型
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 操作IP地址
     */
    @TableField(value = "ipaddr")
    private String ipaddr;

    /**
     * 产生日志的类
     */
    @TableField(value = "clazz")
    private String clazz;

    /**
     * 产生日志的方法
     */
    @TableField(value = "method")
    private String method;

    /**
     * 产生日志的表
     */
    @TableField(value = "model")
    private String model;

    /**
     * 产生日志的数据id
     */
    @TableField(value = "record_id")
    private Long recordId;

    /**
     * 日志消息
     */
    @TableField(value = "message")
    private String message;
}