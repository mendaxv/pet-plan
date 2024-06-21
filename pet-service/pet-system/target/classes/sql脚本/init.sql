CREATE TABLE `t_sys_user` (
                              `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                              `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
                              `account` varchar(255) DEFAULT NULL COMMENT '账号',
                              `password` char(64) DEFAULT NULL COMMENT '密码',
                              `salt` varchar(255) DEFAULT NULL COMMENT '密码盐',
                              `dept_id` bigint DEFAULT NULL COMMENT '部门ID',
                              `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
                              `sex` tinyint DEFAULT NULL COMMENT '性别（1:男,2:女）',
                              `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
                              `phone` varchar(255) DEFAULT NULL COMMENT '电话号码',
                              `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                              `create_date` datetime DEFAULT NULL COMMENT '创建时间',
                              `update_date` datetime DEFAULT NULL COMMENT '更新时间',
                              `status` tinyint DEFAULT NULL COMMENT '状态（1:正常,2:冻结）',
                              `create_by` int DEFAULT NULL COMMENT '创建人',
                              `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `update_by` int DEFAULT NULL COMMENT '更新人',
                              `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                              `del` tinyint(1) DEFAULT '0' COMMENT '逻辑删除（0-否；1-是）',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

CREATE TABLE `t_sys_role` (
                              `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                              `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
                              `code` varchar(255) DEFAULT NULL COMMENT '角色标识',
                              `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                              `status` tinyint DEFAULT NULL COMMENT '状态（1:启用,2:禁用）',
                              `create_by` int DEFAULT NULL COMMENT '创建人',
                              `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `update_by` int DEFAULT NULL COMMENT '更新人',
                              `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                              `del` tinyint(1) DEFAULT '0' COMMENT '逻辑删除（0-否；1-是）',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色表';

CREATE TABLE `t_sys_menu` (
                              `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                              `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
                              `pid` bigint DEFAULT NULL COMMENT '父级编号',
                              `url` varchar(255) DEFAULT NULL COMMENT 'URL地址',
                              `code` varchar(255) DEFAULT NULL COMMENT '权限标识',
                              `icon` varchar(255) DEFAULT NULL COMMENT '图标',
                              `type` tinyint DEFAULT NULL COMMENT '类型（0:系统 1:目录 2:菜单 3:页签 4:按钮）',
                              `sort` int DEFAULT NULL COMMENT '排序',
                              `remark` varchar(255) DEFAULT NULL COMMENT '备注',
                              `status` tinyint DEFAULT NULL COMMENT '状态（1:启用,2:禁用）',
                              `create_by` int DEFAULT NULL COMMENT '创建人',
                              `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `update_by` int DEFAULT NULL COMMENT '更新人',
                              `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                              `del` tinyint(1) DEFAULT '0' COMMENT '逻辑删除（0-否；1-是）',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限表';

CREATE TABLE `t_sys_user_role` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                   `user_id` bigint NOT NULL COMMENT '用户编号',
                                   `role_id` bigint NOT NULL COMMENT '角色编号',
                                   `create_by` int DEFAULT NULL COMMENT '创建人',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_by` int DEFAULT NULL COMMENT '更新人',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   `del` tinyint(1) DEFAULT '0' COMMENT '逻辑删除（0-否；1-是）',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户角色关联表';

CREATE TABLE `t_sys_role_menu` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                   `role_id` bigint NOT NULL COMMENT '角色编号',
                                   `menu_id` bigint NOT NULL COMMENT '权限编号',
                                   `create_by` int DEFAULT NULL COMMENT '创建人',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_by` int DEFAULT NULL COMMENT '更新人',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   `del` tinyint(1) DEFAULT '0' COMMENT '逻辑删除（0-否；1-是）',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色权限关联表';