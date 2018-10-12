/*
 Navicat Premium Data Transfer

 Source Server         : centos
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 192.168.116.128:3306
 Source Schema         : zhku_asset

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 12/10/2018 10:13:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) NULL DEFAULT NULL COMMENT '组织机构id',
  `dtid` int(11) NULL DEFAULT NULL COMMENT '设备类型id',
  `code` varchar(7) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备流水号',
  `residual` decimal(16, 2) NULL DEFAULT NULL COMMENT '净残值',
  `original` decimal(16, 2) NULL DEFAULT NULL COMMENT '原值',
  `status` decimal(2, 0) NULL DEFAULT NULL COMMENT '状态 1-入库、2-出库中、3-出库、4-领用、5-报修 6-申请报废 7-确定报废',
  `prod_date` date NULL DEFAULT NULL COMMENT '生产日期',
  `creator` int(11) NULL DEFAULT NULL COMMENT '登记人',
  `sno` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '序列号',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES (3, 2, 1, 'S180003', 5555.00, 122000.00, 7, '2018-10-20', 1, 'asdkjf', '2018-10-09 10:17:32', '2018-10-09 11:13:18');
INSERT INTO `device` VALUES (4, 1, 1, 'S180004', 23123.00, 122000.00, 6, '2010-09-30', 1, 'GASB2233', '2018-10-09 10:23:15', '2018-10-10 19:57:16');
INSERT INTO `device` VALUES (5, 5, 4, 'S180001', 5555.00, 23333.00, 1, '2018-10-08', 1, 'asdkjfl', '2018-10-10 15:58:26', '2018-10-10 15:58:26');
INSERT INTO `device` VALUES (6, 4, 5, 'S180005', 5555.00, 122000.00, 1, '2018-10-09', 1, 'DSFLKJASKL', '2018-10-10 19:55:28', '2018-10-12 00:43:16');

-- ----------------------------
-- Table structure for device_out
-- ----------------------------
DROP TABLE IF EXISTS `device_out`;
CREATE TABLE `device_out`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) NULL DEFAULT NULL COMMENT '设备id',
  `outter` int(11) NULL DEFAULT NULL COMMENT '报废人',
  `out_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `status` decimal(1, 0) NULL DEFAULT NULL COMMENT '状态 1-申请、2-准许、3-拒绝',
  `approver` int(11) NULL DEFAULT NULL COMMENT '审批人',
  `approval_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审批意见',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备报废' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device_out
-- ----------------------------
INSERT INTO `device_out` VALUES (1, 3, 2, '没用了', 1, 3, '确实不能用了', '2018-10-11 01:48:38', '2018-10-11 01:48:41');
INSERT INTO `device_out` VALUES (3, 4, 1, 'sdfasdfdfa', 3, 1, 'sdfasdf', '2018-10-12 01:56:56', '2018-10-12 02:03:26');
INSERT INTO `device_out` VALUES (4, 3, 1, 'asdf', 2, 1, 'asdfasdf', '2018-10-12 02:03:03', '2018-10-12 02:03:17');
INSERT INTO `device_out` VALUES (5, 4, 1, 'sdfasdfdfa', 1, NULL, NULL, '2018-10-12 02:03:48', '2018-10-12 02:03:48');

-- ----------------------------
-- Table structure for device_receive
-- ----------------------------
DROP TABLE IF EXISTS `device_receive`;
CREATE TABLE `device_receive`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) NULL DEFAULT NULL COMMENT '设备id',
  `code` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据号',
  `uid` int(11) NULL DEFAULT NULL COMMENT '领用人',
  `receive_date` datetime(0) NULL DEFAULT NULL COMMENT '领取时间',
  `return_date` datetime(0) NULL DEFAULT NULL COMMENT '归还日期',
  `status` decimal(2, 0) NULL DEFAULT NULL COMMENT '状态 1-领用、2-归还',
  `rc_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领用备注',
  `rt_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '归还备注',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备领取' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device_receive
-- ----------------------------
INSERT INTO `device_receive` VALUES (1, 3, 'DJS180001', 1, '2018-10-02 21:35:53', '2018-10-12 01:04:53', 2, '我双开的积分', '阿斯蒂芬', '2018-10-11 21:37:07', '2018-10-12 01:04:53');
INSERT INTO `device_receive` VALUES (2, 4, 'DJS180002', 2, '2018-10-03 21:35:57', '2018-10-12 01:04:36', 2, '对方水电费', '不换了', '2018-10-11 21:37:14', '2018-10-12 01:04:36');
INSERT INTO `device_receive` VALUES (3, 5, 'DJS180003', 1, '2018-10-02 21:35:59', '2018-10-12 01:04:48', 2, '阿萨水电费', '啥地方', '2018-10-09 21:37:16', '2018-10-12 01:04:48');
INSERT INTO `device_receive` VALUES (6, 6, 'DJS180005', 1, '2018-10-12 00:43:27', '2018-10-12 01:04:51', 2, '你好吗2', '不想还了', '2018-10-12 00:43:27', '2018-10-12 01:04:51');

-- ----------------------------
-- Table structure for device_repair
-- ----------------------------
DROP TABLE IF EXISTS `device_repair`;
CREATE TABLE `device_repair`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) NULL DEFAULT NULL COMMENT '设备id',
  `damager` int(11) NULL DEFAULT NULL COMMENT '报修人',
  `damage_date` datetime(0) NULL DEFAULT NULL COMMENT '报修时间',
  `damage_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '报修备注',
  `repair_date` datetime(0) NULL DEFAULT NULL COMMENT '维修时间',
  `repairer` int(11) NULL DEFAULT NULL COMMENT '维修人',
  `repair_remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '维修备注',
  `status` decimal(1, 0) NULL DEFAULT NULL COMMENT '状态 1-报修、2-修不好 3-修好',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备保修' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device_repair
-- ----------------------------
INSERT INTO `device_repair` VALUES (1, 3, 1, '2018-10-03 11:10:47', '掉沟里了', '2018-10-11 11:10:53', 2, '已修复', 1, '2018-10-10 11:12:55', '2018-10-10 11:13:01');
INSERT INTO `device_repair` VALUES (4, 3, 1, '2018-10-10 15:44:36', '不知道怎么滴就坏了', '2018-10-10 16:56:21', 1, '爱的风景埃里克森放假了', 3, '2018-10-10 15:44:36', '2018-10-10 16:56:21');
INSERT INTO `device_repair` VALUES (5, 5, 1, '2018-10-10 15:58:41', '不知道怎么滴就坏了', NULL, NULL, NULL, 1, '2018-10-10 15:58:41', '2018-10-10 15:58:41');
INSERT INTO `device_repair` VALUES (6, 4, 1, '2018-10-10 15:59:52', '不知道怎么滴就坏了2', NULL, NULL, NULL, 1, '2018-10-10 15:59:52', '2018-10-10 15:59:52');

-- ----------------------------
-- Table structure for device_type
-- ----------------------------
DROP TABLE IF EXISTS `device_type`;
CREATE TABLE `device_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `brand` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌',
  `intlcode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国际编号',
  `model` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '型号',
  `remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `asl` decimal(3, 0) NULL DEFAULT NULL COMMENT '使用年限',
  `anrv` decimal(10, 3) NULL DEFAULT NULL COMMENT '预计净残值',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of device_type
-- ----------------------------
INSERT INTO `device_type` VALUES (1, '跑鞋', '耐克', 'SADFAEQ345', 'ASDG34534', '你好慢', 10, 12345.000, '2018-10-09 16:30:04', '2018-10-10 10:48:41');
INSERT INTO `device_type` VALUES (4, 'iphone5', '苹果', 'nihaoma', 'akjdfl', 'asdfasdf', 6, 200.000, '2018-10-10 10:39:38', '2018-10-10 10:39:38');
INSERT INTO `device_type` VALUES (5, '小米5', '小米手机', 'GB2312', 'hello', '', 3, 12345.000, '2018-10-10 19:45:07', '2018-10-10 19:45:07');
INSERT INTO `device_type` VALUES (6, '小米6', '小米手机', 'utf-8', 'thank you', '', 4, 123456.000, '2018-10-10 19:45:56', '2018-10-10 19:45:56');

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '组织' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES (1, '财务部', '阿斯顿发', '2018-10-08 09:53:18', '2018-10-10 09:53:21');
INSERT INTO `organization` VALUES (2, '销售部', '负责销售的部门', '2018-09-12 09:58:52', '2018-09-08 09:58:55');
INSERT INTO `organization` VALUES (4, 'zhou123', 'asdfasdf', '2018-10-08 10:49:13', '2018-10-08 10:49:13');
INSERT INTO `organization` VALUES (5, '阿道夫阿萨德', '阿萨德', '2018-10-08 11:03:42', '2018-10-08 11:03:42');
INSERT INTO `organization` VALUES (13, 'hello', '问候部门', '2018-10-08 16:46:06', '2018-10-08 16:46:06');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `device_power` int(11) NULL DEFAULT NULL COMMENT '设备管理权力(1-查看,2-查看增加,3-查看增加修改,4-查看增加修改删除)，第一位-登记，2-领取，3-维修，4-类型，5-报废',
  `system_power` int(11) NULL DEFAULT NULL COMMENT '系统管理权力(1-查看,2-查看增加,3-查看增加修改,4-查看增加修改删除)，第一位-用户，2-角色，3-组织',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '超级管理员', '管理所有', '2018-09-05 09:54:13', '2018-09-13 09:54:15', 44444, 444);
INSERT INTO `role` VALUES (2, '设备管理员', '管理设备', '2018-09-05 09:54:18', '2018-09-06 09:54:21', 44444, 444);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rid` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `ogid` int(11) NULL DEFAULT NULL COMMENT '组织机构id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `sex` decimal(1, 0) NULL DEFAULT NULL COMMENT '性别 1-男、2-女',
  `birth` date NULL DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `email` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮件',
  `login_time` datetime(0) NULL DEFAULT NULL COMMENT '登录时间',
  `login_ip` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录ip',
  `crtm` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 1, 1, 'zhou', 'zhou', 1, '1998-09-25', '13533987654', 'a@qq.com', '2018-10-12 09:45:52', '127.0.0.1', '2018-09-12 09:45:33', '2018-09-20 09:45:41');
INSERT INTO `user` VALUES (2, 2, 2, 'zhou3', 'zhou3', 2, '2015-09-09', '13533801121', '123@qq.com', '2018-09-26 16:34:58', '192.168.116.128', '2018-09-26 16:19:39', '2018-09-27 01:28:15');
INSERT INTO `user` VALUES (3, 1, 1, 'junliang', 'junliang', 1, '2018-10-17', '14785462552', '2290838597@qq.com', '2018-10-08 16:48:28', '127.0.0.1', '2018-10-08 11:10:26', '2018-10-08 11:10:47');

-- ----------------------------
-- View structure for device_out_page
-- ----------------------------
DROP VIEW IF EXISTS `device_out_page`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `device_out_page` AS (select `dout`.`id` AS `id`,`d`.`code` AS `dcode`,`u1`.`name` AS `outter`,`dout`.`out_remarks` AS `out_remarks`,`dout`.`status` AS `status`,`u2`.`name` AS `approver`,`dout`.`approval_remarks` AS `approval_remarks`,`dout`.`crtm` AS `crtm`,`dout`.`mdtm` AS `mdtm` from (((`device_out` `dout` left join `user` `u1` on((`u1`.`id` = `dout`.`outter`))) left join `user` `u2` on((`u2`.`id` = `dout`.`approver`))) left join `device` `d` on((`d`.`id` = `dout`.`did`))));

-- ----------------------------
-- View structure for device_page
-- ----------------------------
DROP VIEW IF EXISTS `device_page`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `device_page` AS (select `d`.`code` AS `code`,`u`.`name` AS `creator`,`d`.`crtm` AS `crtm`,`dt`.`name` AS `device_type`,`d`.`id` AS `id`,`d`.`mdtm` AS `mdtm`,`o`.`name` AS `organization`,`d`.`original` AS `original`,`d`.`prod_date` AS `prod_date`,`d`.`residual` AS `residual`,`d`.`sno` AS `sno`,`d`.`status` AS `status` from (((`device` `d` left join `device_type` `dt` on((`d`.`dtid` = `dt`.`id`))) left join `organization` `o` on((`d`.`ogid` = `o`.`id`))) left join `user` `u` on((`d`.`creator` = `u`.`id`))));

-- ----------------------------
-- View structure for device_receive_page
-- ----------------------------
DROP VIEW IF EXISTS `device_receive_page`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `device_receive_page` AS (select `dr`.`id` AS `id`,`d`.`code` AS `dcode`,`dr`.`code` AS `drcode`,`u`.`name` AS `username`,`dr`.`receive_date` AS `receive_date`,`dr`.`return_date` AS `return_date`,`dr`.`status` AS `status`,`dr`.`rc_remarks` AS `rc_remarks`,`dr`.`rt_remarks` AS `rt_remarks`,`dr`.`crtm` AS `crtm`,`dr`.`mdtm` AS `mdtm` from ((`device_receive` `dr` left join `device` `d` on((`dr`.`did` = `d`.`id`))) left join `user` `u` on((`dr`.`uid` = `u`.`id`))));

-- ----------------------------
-- View structure for device_repair_page
-- ----------------------------
DROP VIEW IF EXISTS `device_repair_page`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `device_repair_page` AS (select `dr`.`id` AS `id`,`d`.`code` AS `code`,`u1`.`name` AS `damager`,`dr`.`damage_date` AS `damage_date`,`dr`.`damage_remarks` AS `damage_remarks`,`dr`.`repair_date` AS `repair_date`,`u2`.`name` AS `repairer`,`dr`.`repair_remarks` AS `repair_remarks`,`dr`.`status` AS `status`,`dr`.`crtm` AS `crtm`,`dr`.`mdtm` AS `mdtm` from (((`device_repair` `dr` left join `device` `d` on((`d`.`id` = `dr`.`did`))) left join `user` `u1` on((`u1`.`id` = `dr`.`damager`))) left join `user` `u2` on((`u2`.`id` = `dr`.`repairer`))));

-- ----------------------------
-- View structure for user_page
-- ----------------------------
DROP VIEW IF EXISTS `user_page`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `user_page` AS (select `u`.`id` AS `id`,`r`.`name` AS `role`,`o`.`name` AS `organization`,`u`.`name` AS `name`,`u`.`pwd` AS `pwd`,`u`.`sex` AS `sex`,`u`.`birth` AS `birth`,`u`.`phone` AS `phone`,`u`.`email` AS `email`,`u`.`login_time` AS `loginTime`,`u`.`login_ip` AS `loginIp`,`u`.`crtm` AS `crtm`,`u`.`mdtm` AS `mdtm` from ((`user` `u` left join `role` `r` on((`u`.`rid` = `r`.`id`))) left join `organization` `o` on((`u`.`ogid` = `o`.`id`))));

SET FOREIGN_KEY_CHECKS = 1;
