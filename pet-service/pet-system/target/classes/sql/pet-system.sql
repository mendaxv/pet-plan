/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : 127.0.0.1:3306
 Source Schema         : pet-system

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 21/06/2024 17:29:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_base
-- ----------------------------
DROP TABLE IF EXISTS `t_base`;
CREATE TABLE `t_base`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `create_by` int(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '基础表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_action_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_action_log`;
CREATE TABLE `t_sys_action_log`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '日志名称',
  `type` tinyint(0) NULL DEFAULT NULL COMMENT '日志类型',
  `ipaddr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作IP地址',
  `clazz` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产生日志的类',
  `method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产生日志的方法',
  `model` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产生日志的表',
  `record_id` bigint(0) NULL DEFAULT NULL COMMENT '产生日志的数据id',
  `message` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '日志消息',
  `create_by` int(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '操作日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_menu`;
CREATE TABLE `t_sys_menu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '菜单名称',
  `pid` bigint(0) NOT NULL COMMENT '父级编号',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'URL地址',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '权限标识',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '图标',
  `type` tinyint(0) NULL DEFAULT NULL COMMENT '类型（0:系统 1:目录 2:菜单 3:页签 4:按钮）',
  `sort` int(0) NULL DEFAULT NULL COMMENT '排序',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `status` tinyint(0) NOT NULL DEFAULT 1 COMMENT '状态（1:启用,2:禁用）',
  `create_by` int(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 147 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_menu
-- ----------------------------
INSERT INTO `t_sys_menu` VALUES (1, '菜单管理', 2, '/system/menu/index', 'system:menu:index', '', 2, 3, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (2, '系统管理', 0, '#', '#', 'el-icon-setting', 1, 4, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (4, '角色管理', 2, '/system/role/index', 'system:role:index', '', 2, 2, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (6, '主页', 0, '/index', 'index', 'el-icon-s-home', 1, 1, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (7, '用户管理', 2, '/system/user/index', 'system:user:index', '', 2, 1, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (21, '字典管理', 2, '/system/dict/index', 'system:dict:index', '', 2, 5, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (26, '行为日志', 2, '/system/actionLog/index', 'system:actionLog:index', '', 2, 6, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (30, '开发中心', 0, '#', '#', 'fa fa-gavel', 1, 5, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (31, '代码生成', 30, '/dev/code', '#', '', 2, 1, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (125, '表单构建', 30, '/dev/build', '#', '', 2, 2, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (136, '部门管理', 2, '/system/dept/index', 'system:dept:index', '', 2, 4, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);
INSERT INTO `t_sys_menu` VALUES (146, '数据接口', 30, '/dev/swagger', '#', '', 2, 3, '', 1, NULL, '2024-06-19 11:55:00', NULL, '2024-06-19 11:55:00', 0);

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名称',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色标识',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `status` tinyint(0) NOT NULL DEFAULT 1 COMMENT '状态（1:启用,2:禁用）',
  `create_by` int(0) NOT NULL COMMENT '创建人',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES (1, '超级管理员', 'admin', '', 1, 1, '2024-06-19 11:51:24', NULL, '2024-06-19 12:06:23', 0);
INSERT INTO `t_sys_role` VALUES (2, '普通管理员', 'guest', '', 1, 1, '2024-06-19 11:51:24', NULL, '2024-06-19 12:06:26', 0);

-- ----------------------------
-- Table structure for t_sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_menu`;
CREATE TABLE `t_sys_role_menu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `role_id` bigint(0) NOT NULL COMMENT '角色编号',
  `menu_id` bigint(0) NOT NULL COMMENT '权限编号',
  `create_by` int(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色权限关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_role_menu
-- ----------------------------
INSERT INTO `t_sys_role_menu` VALUES (1, 1, 1, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (2, 1, 2, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (3, 1, 4, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (4, 1, 6, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (5, 1, 7, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (6, 1, 21, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (7, 1, 26, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (8, 1, 30, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (9, 1, 31, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (10, 1, 125, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (11, 1, 136, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (12, 1, 146, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (13, 2, 30, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (14, 2, 31, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (15, 2, 125, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);
INSERT INTO `t_sys_role_menu` VALUES (16, 2, 146, NULL, '2024-06-19 11:55:53', NULL, '2024-06-19 11:55:53', 0);

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `account` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '账号',
  `password` char(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `salt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码盐',
  `dept_id` bigint(0) NULL DEFAULT NULL COMMENT '部门ID',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `gender` tinyint(0) NULL DEFAULT NULL COMMENT '性别（1:男,2:女）',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电话号码',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `status` tinyint(0) NOT NULL DEFAULT 1 COMMENT '状态（1:正常,2:封禁）',
  `create_by` bigint(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` bigint(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES (1, '超级管理员', 'admin', '25d8dd839e07001786cd291af98f1e6e', 'bmbfm', 1, NULL, 1, '10086@163.com', '10086', '', 1, NULL, '2024-06-19 11:50:05', NULL, '2024-06-19 11:50:05', 0);
INSERT INTO `t_sys_user` VALUES (2, '刘德华', 'liudehua', '25d8dd839e07001786cd291af98f1e6e', 'bmbfm', 2, NULL, 1, '1008612@qq.com', '1008612', '', 1, NULL, '2024-06-19 11:50:05', NULL, '2024-06-19 11:50:05', 0);

-- ----------------------------
-- Table structure for t_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` bigint(0) NOT NULL COMMENT '用户编号',
  `role_id` bigint(0) NOT NULL COMMENT '角色编号',
  `create_by` int(0) NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(0) NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `del` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除（0-否；1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------
INSERT INTO `t_sys_user_role` VALUES (1, 1, 1, NULL, '2024-06-19 11:55:39', NULL, '2024-06-19 11:55:39', 0);
INSERT INTO `t_sys_user_role` VALUES (2, 2, 2, NULL, '2024-06-19 11:55:39', NULL, '2024-06-19 11:55:39', 0);

SET FOREIGN_KEY_CHECKS = 1;
