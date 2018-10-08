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
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-入库、2-出库中、3-出库、4-领用、5-报修',
  `prod_date` date DEFAULT NULL COMMENT '生产日期',
  `creator` int(11) DEFAULT NULL COMMENT '登记人',
  `create_time` datetime DEFAULT NULL COMMENT '登记时间',
  `buyer` int(11) DEFAULT NULL COMMENT '购买人',
  `buy_date` date DEFAULT NULL COMMENT '购买日期',
  `sno` varchar(32) DEFAULT NULL COMMENT '序列号',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='设备';

/*Data for the table `device` */

insert  into `device`(`id`,`ogid`,`dtid`,`code`,`residual`,`original`,`status`,`prod_date`,`creator`,`create_time`,`buyer`,`buy_date`,`sno`,`crtm`,`mdtm`) values 
(1,1,1,'S180001',5000.00,100000.00,1,'2018-06-14',1,'2018-10-10 16:22:27',NULL,NULL,'GX232XG323','2018-10-10 16:22:50','2018-10-11 16:22:53');

/*Table structure for table `device_out` */

DROP TABLE IF EXISTS `device_out`;

CREATE TABLE `device_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) DEFAULT NULL COMMENT '设备id',
  `outter` int(11) DEFAULT NULL COMMENT '报废人',
  `out_date` datetime DEFAULT NULL COMMENT '报废日期',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `status` decimal(1,0) DEFAULT NULL COMMENT '状态 1-申请、2-准许、3-拒绝',
  `approver` int(11) DEFAULT NULL COMMENT '审批人',
  `approval_remarks` varchar(200) DEFAULT NULL COMMENT '审批意见',
  `approval_date` datetime DEFAULT NULL COMMENT '申请日期',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备报废';

/*Data for the table `device_out` */

/*Table structure for table `device_receive` */

DROP TABLE IF EXISTS `device_receive`;

CREATE TABLE `device_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `did` int(11) DEFAULT NULL COMMENT '设备id',
  `code` varchar(9) DEFAULT NULL COMMENT '单据号',
  `recipients` varchar(32) DEFAULT NULL COMMENT '领用人',
  `receive_date` datetime DEFAULT NULL COMMENT '领取时间',
  `return_date` datetime DEFAULT NULL COMMENT '归还日期',
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-领用、2-归还',
  `rc_remarks` varchar(200) DEFAULT NULL COMMENT '领用备注',
  `rt_remarks` varchar(200) DEFAULT NULL COMMENT '归还备注',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备领取';

/*Data for the table `device_receive` */

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
  `status` decimal(1,0) DEFAULT NULL COMMENT '状态 1-报修、2-维修',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备保修';

/*Data for the table `device_repair` */

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='设备类型';

/*Data for the table `device_type` */

insert  into `device_type`(`id`,`name`,`brand`,`intlcode`,`model`,`remarks`,`asl`,`anrv`,`crtm`,`mdtm`) values 
(1,'蜗牛','耐克','SADFAEQ345','ASDG34534','你好慢',10,12345.000,'2018-10-09 16:30:04','2018-10-25 16:30:07');

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
  `device_power` int(11) DEFAULT NULL COMMENT '设备管理权力，1-增加，2-删除，3-修改，4-删除，5-审核，6-只能操作自己发布的',
  `car_power` int(11) DEFAULT NULL COMMENT '车辆管理权力，1-增加，2-删除，3-修改，4-删除，5-审核，6-只能操作自己发布的',
  `fb_power` int(11) DEFAULT NULL COMMENT '家具图书管理权力，1-增加，2-删除，3-修改，4-删除，5-审核，6-只能操作自己发布的',
  `land_power` int(11) DEFAULT NULL COMMENT '土地管理权力，1-增加，2-删除，3-修改，4-删除，5-审核，6-只能操作自己发布的',
  `house_power` int(11) DEFAULT NULL COMMENT '房屋管理权力，1-增加，2-删除，3-修改，4-删除，5-审核，6-只能操作自己发布的',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色';

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`remarks`,`crtm`,`mdtm`,`device_power`,`car_power`,`fb_power`,`land_power`,`house_power`) values 
(1,'超级管理员','管理所有','2018-09-05 09:54:13','2018-09-13 09:54:15',111111,111111,111111,111111,111111),
(2,'设备管理员','管理设备','2018-09-05 09:54:18','2018-09-06 09:54:21',111111,0,0,0,0);

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
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `user` */

insert  into `user`(`id`,`rid`,`ogid`,`name`,`pwd`,`sex`,`birth`,`phone`,`email`,`login_time`,`login_ip`,`crtm`,`mdtm`) values 
(1,1,1,'zhou','zhou',1,'1998-09-25','13533987654','a@qq.com','2018-10-08 16:51:37','127.0.0.1','2018-09-12 09:45:33','2018-09-20 09:45:41'),
(2,2,2,'zhou3','zhou3',2,'2015-09-09','13533801121','123@qq.com','2018-09-26 16:34:58','192.168.116.128','2018-09-26 16:19:39','2018-09-27 01:28:15'),
(3,1,1,'junliang','junliang',1,'2018-10-17','14785462552','2290838597@qq.com','2018-10-08 16:48:28','127.0.0.1','2018-10-08 11:10:26','2018-10-08 11:10:47');

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

/*View structure for view device_page */

/*!50001 DROP TABLE IF EXISTS `device_page` */;
/*!50001 DROP VIEW IF EXISTS `device_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `device_page` AS (select `d`.`code` AS `code`,`u`.`name` AS `creator`,`d`.`crtm` AS `crtm`,`dt`.`name` AS `device_type`,`d`.`id` AS `id`,`d`.`mdtm` AS `mdtm`,`o`.`name` AS `organization`,`d`.`original` AS `original`,`d`.`prod_date` AS `prod_date`,`d`.`residual` AS `residual`,`d`.`sno` AS `sno`,`d`.`status` AS `status` from (((`device` `d` left join `device_type` `dt` on((`d`.`dtid` = `dt`.`id`))) left join `organization` `o` on((`d`.`ogid` = `o`.`id`))) left join `user` `u` on((`d`.`creator` = `u`.`id`)))) */;

/*View structure for view user_page */

/*!50001 DROP TABLE IF EXISTS `user_page` */;
/*!50001 DROP VIEW IF EXISTS `user_page` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `user_page` AS (select `u`.`id` AS `id`,`r`.`name` AS `role`,`o`.`name` AS `organization`,`u`.`name` AS `name`,`u`.`pwd` AS `pwd`,`u`.`sex` AS `sex`,`u`.`birth` AS `birth`,`u`.`phone` AS `phone`,`u`.`email` AS `email`,`u`.`login_time` AS `loginTime`,`u`.`login_ip` AS `loginIp`,`u`.`crtm` AS `crtm`,`u`.`mdtm` AS `mdtm` from ((`user` `u` left join `role` `r` on((`u`.`rid` = `r`.`id`))) left join `organization` `o` on((`u`.`ogid` = `o`.`id`)))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
