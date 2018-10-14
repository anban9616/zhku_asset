/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.23 : Database - zhku_asset
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zhku_asset` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `zhku_asset`;

/*Table structure for table `device` */

DROP TABLE IF EXISTS `device`;

CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `dtid` int(11) DEFAULT NULL COMMENT '设备类型id',
  `code` varchar(7) DEFAULT NULL COMMENT '设备流水号',
  `residual` decimal(16,2) DEFAULT NULL COMMENT '净残值',
  `original` decimal(16,2) DEFAULT NULL COMMENT '原值',
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-入库、2-出库中、3-出库、4-领用、5-报修 6-申请报废 7-确定报废',
  `prod_date` date DEFAULT NULL COMMENT '生产日期',
  `creator` int(11) DEFAULT NULL COMMENT '登记人',
  `sno` varchar(32) DEFAULT NULL COMMENT '序列号',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='设备';

/*Data for the table `device` */

insert  into `device`(`id`,`ogid`,`dtid`,`code`,`residual`,`original`,`status`,`prod_date`,`creator`,`sno`,`crtm`,`mdtm`) values 
(8,1,1,'S180001',5555.00,122000.00,1,'2018-09-30',1,'abcd1230','2018-10-14 16:39:30','2018-10-14 16:39:30'),
(9,1,4,'S180002',789.00,23333.00,1,'2018-09-30',1,'efgh4560','2018-10-14 16:40:14','2018-10-14 16:40:14'),
(10,2,5,'S180003',789.00,789000.00,7,'2018-10-18',1,'hijk7890','2018-10-14 16:41:00','2018-10-14 16:41:00'),
(11,4,6,'S180004',5555.00,123456.00,1,'2014-10-14',1,'lmn1230','2018-10-14 16:41:43','2018-10-14 16:41:43');

/*Table structure for table `device_out` */

DROP TABLE IF EXISTS `device_out`;

CREATE TABLE `device_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) DEFAULT NULL COMMENT '设备id',
  `outter` int(11) DEFAULT NULL COMMENT '报废人',
  `out_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `status` decimal(1,0) DEFAULT NULL COMMENT '状态 1-申请、2-准许、3-拒绝',
  `approver` int(11) DEFAULT NULL COMMENT '审批人',
  `approval_remarks` varchar(200) DEFAULT NULL COMMENT '审批意见',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='设备报废';

/*Data for the table `device_out` */

insert  into `device_out`(`id`,`did`,`outter`,`out_remarks`,`status`,`approver`,`approval_remarks`,`crtm`,`mdtm`) values 
(6,10,1,'已损坏',2,1,'还能用','2018-10-14 16:42:59','2018-10-14 17:28:18');

/*Table structure for table `device_receive` */

DROP TABLE IF EXISTS `device_receive`;

CREATE TABLE `device_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) DEFAULT NULL COMMENT '设备id',
  `code` varchar(9) DEFAULT NULL COMMENT '单据号',
  `uid` int(11) DEFAULT NULL COMMENT '领用人',
  `receive_date` datetime DEFAULT NULL COMMENT '领取时间',
  `return_date` datetime DEFAULT NULL COMMENT '归还日期',
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-领用、2-归还',
  `rc_remarks` varchar(200) DEFAULT NULL COMMENT '领用备注',
  `rt_remarks` varchar(200) DEFAULT NULL COMMENT '归还备注',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='设备领取';

/*Data for the table `device_receive` */

insert  into `device_receive`(`id`,`did`,`code`,`uid`,`receive_date`,`return_date`,`status`,`rc_remarks`,`rt_remarks`,`crtm`,`mdtm`) values 
(7,8,'DJS180001',1,'2018-10-14 16:42:28','2018-10-14 16:43:18',2,'你好吗','不想还了','2018-10-14 16:42:28','2018-10-14 16:43:18'),
(8,11,'DJS180002',1,'2018-10-14 16:43:57','2018-10-14 17:27:42',2,'我要用','啥地方','2018-10-14 16:43:57','2018-10-14 17:27:42');

/*Table structure for table `device_repair` */

DROP TABLE IF EXISTS `device_repair`;

CREATE TABLE `device_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) DEFAULT NULL COMMENT '设备id',
  `damager` int(11) DEFAULT NULL COMMENT '报修人',
  `damage_date` datetime DEFAULT NULL COMMENT '报修时间',
  `damage_remarks` varchar(200) DEFAULT NULL COMMENT '报修备注',
  `repair_date` datetime DEFAULT NULL COMMENT '维修时间',
  `repairer` int(11) DEFAULT NULL COMMENT '维修人',
  `repair_remarks` varchar(200) DEFAULT NULL COMMENT '维修备注',
  `status` decimal(1,0) DEFAULT NULL COMMENT '状态 1-报修、2-修完了',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='设备保修';

/*Data for the table `device_repair` */

insert  into `device_repair`(`id`,`did`,`damager`,`damage_date`,`damage_remarks`,`repair_date`,`repairer`,`repair_remarks`,`status`,`crtm`,`mdtm`) values 
(7,9,1,'2018-10-14 16:42:35','不知道怎么滴就坏了','2018-10-14 17:25:33',1,'爱的风景埃里克森放假了',2,'2018-10-14 16:42:35','2018-10-14 17:25:33'),
(8,8,1,'2018-10-14 16:43:38','不知道怎么滴就坏了2','2018-10-14 17:25:17',1,'修不好了，建议报废',2,'2018-10-14 16:43:38','2018-10-14 17:25:17'),
(11,10,1,'2018-10-14 17:15:00','不知道怎么滴就坏了','2018-10-14 17:25:35',1,'爱的风景埃里克森放假了',2,'2018-10-14 17:15:00','2018-10-14 17:25:35');

/*Table structure for table `device_type` */

DROP TABLE IF EXISTS `device_type`;

CREATE TABLE `device_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `intlcode` varchar(100) DEFAULT NULL COMMENT '国际编号',
  `model` varchar(100) DEFAULT NULL COMMENT '型号',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `asl` decimal(3,0) DEFAULT NULL COMMENT '使用年限',
  `anrv` decimal(10,3) DEFAULT NULL COMMENT '预计净残值',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='设备类型';

/*Data for the table `device_type` */

insert  into `device_type`(`id`,`name`,`brand`,`intlcode`,`model`,`remarks`,`asl`,`anrv`,`crtm`,`mdtm`) values 
(1,'跑鞋','耐克','SADFAEQ345','ASDG34534','你好慢',10,12345.000,'2018-10-09 16:30:04','2018-10-10 10:48:41'),
(4,'iphone5','苹果','nihaoma','akjdfl','asdfasdf',6,200.000,'2018-10-10 10:39:38','2018-10-10 10:39:38'),
(5,'小米5','小米手机','GB2312','hello','',3,12345.000,'2018-10-10 19:45:07','2018-10-10 19:45:07'),
(6,'小米6','小米手机','utf-8','thank you','',4,123456.000,'2018-10-10 19:45:56','2018-10-10 19:45:56');

/*Table structure for table `organization` */

DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='组织';

/*Data for the table `organization` */

insert  into `organization`(`id`,`name`,`remarks`,`crtm`,`mdtm`) values 
(1,'财务部','阿斯顿发','2018-10-08 09:53:18','2018-10-10 09:53:21'),
(2,'销售部','负责销售的部门','2018-09-12 09:58:52','2018-09-08 09:58:55'),
(4,'zhou123','asdfasdf','2018-10-08 10:49:13','2018-10-08 10:49:13'),
(5,'阿道夫阿萨德','阿萨德','2018-10-08 11:03:42','2018-10-08 11:03:42'),
(13,'hello','问候部门','2018-10-08 16:46:06','2018-10-08 16:46:06');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  `device_power` int(11) DEFAULT NULL COMMENT '设备管理权力(1-查看,2-查看增加,3-查看增加修改,4-查看增加修改删除)，第一位-登记，2-领取，3-维修，4-类型，5-报废',
  `system_power` int(11) DEFAULT NULL COMMENT '系统管理权力(1-查看,2-查看增加,3-查看增加修改,4-查看增加修改删除)，第一位-用户，2-角色，3-组织',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='角色';

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`remarks`,`crtm`,`mdtm`,`device_power`,`system_power`) values 
(1,'超级管理员','管理所有','2018-09-05 09:54:13','2018-10-14 01:13:41',44444,444),
(2,'三级管理员','所有三级权限','2018-09-05 09:54:18','2018-10-14 00:35:42',33333,333),
(5,'二级管理员','所有二级权限','2018-10-12 15:47:00','2018-10-14 00:36:23',22222,222),
(6,'一级管理员','所有一级权限','2018-10-12 15:50:28','2018-10-14 00:36:53',11111,111),
(7,'test','test','2018-10-12 16:37:09','2018-10-12 16:37:09',1234,123);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rid` int(11) DEFAULT NULL COMMENT '角色id',
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `pwd` varchar(50) DEFAULT NULL COMMENT '密码',
  `sex` decimal(1,0) DEFAULT NULL COMMENT '性别 1-男、2-女',
  `birth` date DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `email` varchar(500) DEFAULT NULL COMMENT '邮件',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `login_ip` varchar(500) DEFAULT NULL COMMENT '登录ip',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `user` */

insert  into `user`(`id`,`rid`,`ogid`,`name`,`pwd`,`sex`,`birth`,`phone`,`email`,`login_time`,`login_ip`,`crtm`,`mdtm`) values 
(1,1,1,'zhou','zhou',1,'1998-09-25','13533987654','a@qq.com','2018-10-14 21:56:46','127.0.0.1','2018-09-12 09:45:33','2018-10-14 21:49:13'),
(2,1,2,'zhou3','zhou3',2,'2015-09-09','13533801121','123@qq.com','2018-10-14 00:46:55','127.0.0.1','2018-09-26 16:19:39','2018-10-14 00:40:29'),
(3,1,1,'zhou2','zhou2',1,'2018-10-17','14785462552','2290838597@qq.com','2018-10-14 21:57:08','127.0.0.1','2018-10-08 11:10:26','2018-10-14 21:56:22');

/*Table structure for table `device_out_page` */

DROP TABLE IF EXISTS `device_out_page`;

/*!50001 DROP VIEW IF EXISTS `device_out_page` */;
/*!50001 DROP TABLE IF EXISTS `device_out_page` */;

/*!50001 CREATE TABLE  `device_out_page`(
 `id` int(11) ,
 `dcode` varchar(7) ,
 `outter` varchar(50) ,
 `out_remarks` varchar(200) ,
 `status` decimal(1,0) ,
 `approver` varchar(50) ,
 `approval_remarks` varchar(200) ,
 `crtm` datetime ,
 `mdtm` datetime 
)*/;

/*Table structure for table `device_page` */

DROP TABLE IF EXISTS `device_page`;

/*!50001 DROP VIEW IF EXISTS `device_page` */;
/*!50001 DROP TABLE IF EXISTS `device_page` */;

/*!50001 CREATE TABLE  `device_page`(
 `code` varchar(7) ,
 `creator` varchar(50) ,
 `crtm` datetime ,
 `device_type` varchar(50) ,
 `id` int(11) ,
 `mdtm` datetime ,
 `organization` varchar(50) ,
 `original` decimal(16,2) ,
 `prod_date` date ,
 `residual` decimal(16,2) ,
 `sno` varchar(32) ,
 `status` decimal(2,0) 
)*/;

/*Table structure for table `device_receive_page` */

DROP TABLE IF EXISTS `device_receive_page`;

/*!50001 DROP VIEW IF EXISTS `device_receive_page` */;
/*!50001 DROP TABLE IF EXISTS `device_receive_page` */;

/*!50001 CREATE TABLE  `device_receive_page`(
 `id` int(11) ,
 `dcode` varchar(7) ,
 `drcode` varchar(9) ,
 `username` varchar(50) ,
 `receive_date` datetime ,
 `return_date` datetime ,
 `status` decimal(2,0) ,
 `rc_remarks` varchar(200) ,
 `rt_remarks` varchar(200) ,
 `crtm` datetime ,
 `mdtm` datetime 
)*/;

/*Table structure for table `device_repair_page` */

DROP TABLE IF EXISTS `device_repair_page`;

/*!50001 DROP VIEW IF EXISTS `device_repair_page` */;
/*!50001 DROP TABLE IF EXISTS `device_repair_page` */;

/*!50001 CREATE TABLE  `device_repair_page`(
 `id` int(11) ,
 `code` varchar(7) ,
 `damager` varchar(50) ,
 `damage_date` datetime ,
 `damage_remarks` varchar(200) ,
 `repair_date` datetime ,
 `repairer` varchar(50) ,
 `repair_remarks` varchar(200) ,
 `status` decimal(1,0) ,
 `crtm` datetime ,
 `mdtm` datetime 
)*/;

/*Table structure for table `user_page` */

DROP TABLE IF EXISTS `user_page`;

/*!50001 DROP VIEW IF EXISTS `user_page` */;
/*!50001 DROP TABLE IF EXISTS `user_page` */;

/*!50001 CREATE TABLE  `user_page`(
 `id` int(11) ,
 `role` varchar(50) ,
 `organization` varchar(50) ,
 `name` varchar(50) ,
 `pwd` varchar(50) ,
 `sex` decimal(1,0) ,
 `birth` date ,
 `phone` varchar(11) ,
 `email` varchar(500) ,
 `loginTime` datetime ,
 `loginIp` varchar(500) ,
 `crtm` datetime ,
 `mdtm` datetime 
)*/;

/*View structure for view device_out_page */

/*!50001 DROP TABLE IF EXISTS `device_out_page` */;
/*!50001 DROP VIEW IF EXISTS `device_out_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `device_out_page` AS (select `dout`.`id` AS `id`,`d`.`code` AS `dcode`,`u1`.`name` AS `outter`,`dout`.`out_remarks` AS `out_remarks`,`dout`.`status` AS `status`,`u2`.`name` AS `approver`,`dout`.`approval_remarks` AS `approval_remarks`,`dout`.`crtm` AS `crtm`,`dout`.`mdtm` AS `mdtm` from (((`device_out` `dout` left join `user` `u1` on((`u1`.`id` = `dout`.`outter`))) left join `user` `u2` on((`u2`.`id` = `dout`.`approver`))) left join `device` `d` on((`d`.`id` = `dout`.`did`)))) */;

/*View structure for view device_page */

/*!50001 DROP TABLE IF EXISTS `device_page` */;
/*!50001 DROP VIEW IF EXISTS `device_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `device_page` AS (select `d`.`code` AS `code`,`u`.`name` AS `creator`,`d`.`crtm` AS `crtm`,`dt`.`name` AS `device_type`,`d`.`id` AS `id`,`d`.`mdtm` AS `mdtm`,`o`.`name` AS `organization`,`d`.`original` AS `original`,`d`.`prod_date` AS `prod_date`,`d`.`residual` AS `residual`,`d`.`sno` AS `sno`,`d`.`status` AS `status` from (((`device` `d` left join `device_type` `dt` on((`d`.`dtid` = `dt`.`id`))) left join `organization` `o` on((`d`.`ogid` = `o`.`id`))) left join `user` `u` on((`d`.`creator` = `u`.`id`)))) */;

/*View structure for view device_receive_page */

/*!50001 DROP TABLE IF EXISTS `device_receive_page` */;
/*!50001 DROP VIEW IF EXISTS `device_receive_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `device_receive_page` AS (select `dr`.`id` AS `id`,`d`.`code` AS `dcode`,`dr`.`code` AS `drcode`,`u`.`name` AS `username`,`dr`.`receive_date` AS `receive_date`,`dr`.`return_date` AS `return_date`,`dr`.`status` AS `status`,`dr`.`rc_remarks` AS `rc_remarks`,`dr`.`rt_remarks` AS `rt_remarks`,`dr`.`crtm` AS `crtm`,`dr`.`mdtm` AS `mdtm` from ((`device_receive` `dr` left join `device` `d` on((`dr`.`did` = `d`.`id`))) left join `user` `u` on((`dr`.`uid` = `u`.`id`)))) */;

/*View structure for view device_repair_page */

/*!50001 DROP TABLE IF EXISTS `device_repair_page` */;
/*!50001 DROP VIEW IF EXISTS `device_repair_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `device_repair_page` AS (select `dr`.`id` AS `id`,`d`.`code` AS `code`,`u1`.`name` AS `damager`,`dr`.`damage_date` AS `damage_date`,`dr`.`damage_remarks` AS `damage_remarks`,`dr`.`repair_date` AS `repair_date`,`u2`.`name` AS `repairer`,`dr`.`repair_remarks` AS `repair_remarks`,`dr`.`status` AS `status`,`dr`.`crtm` AS `crtm`,`dr`.`mdtm` AS `mdtm` from (((`device_repair` `dr` left join `device` `d` on((`d`.`id` = `dr`.`did`))) left join `user` `u1` on((`u1`.`id` = `dr`.`damager`))) left join `user` `u2` on((`u2`.`id` = `dr`.`repairer`)))) */;

/*View structure for view user_page */

/*!50001 DROP TABLE IF EXISTS `user_page` */;
/*!50001 DROP VIEW IF EXISTS `user_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `user_page` AS (select `u`.`id` AS `id`,`r`.`name` AS `role`,`o`.`name` AS `organization`,`u`.`name` AS `name`,`u`.`pwd` AS `pwd`,`u`.`sex` AS `sex`,`u`.`birth` AS `birth`,`u`.`phone` AS `phone`,`u`.`email` AS `email`,`u`.`login_time` AS `loginTime`,`u`.`login_ip` AS `loginIp`,`u`.`crtm` AS `crtm`,`u`.`mdtm` AS `mdtm` from ((`user` `u` left join `role` `r` on((`u`.`rid` = `r`.`id`))) left join `organization` `o` on((`u`.`ogid` = `o`.`id`)))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
