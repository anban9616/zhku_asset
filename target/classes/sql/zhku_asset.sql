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

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `ctid` int(11) DEFAULT NULL COMMENT '设备类型id',
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
  `frame_number` varchar(50) DEFAULT NULL COMMENT '车架号',
  `engine_number` varchar(50) DEFAULT NULL COMMENT '发动机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆';

/*Data for the table `car` */

/*Table structure for table `car_out` */

DROP TABLE IF EXISTS `car_out`;

CREATE TABLE `car_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆报废';

/*Data for the table `car_out` */

/*Table structure for table `car_receive` */

DROP TABLE IF EXISTS `car_receive`;

CREATE TABLE `car_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆领取';

/*Data for the table `car_receive` */

/*Table structure for table `car_repair` */

DROP TABLE IF EXISTS `car_repair`;

CREATE TABLE `car_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆维修';

/*Data for the table `car_repair` */

/*Table structure for table `car_type` */

DROP TABLE IF EXISTS `car_type`;

CREATE TABLE `car_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `intlcode` varchar(100) DEFAULT NULL COMMENT '国际编号',
  `model` varchar(100) DEFAULT NULL COMMENT '型号',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `asl` decimal(3,0) DEFAULT NULL COMMENT '使用年限',
  `anrv` decimal(5,3) DEFAULT NULL COMMENT '预计净残值',
  `crtm` varchar(32) DEFAULT NULL COMMENT '创建时间',
  `mdtm` varchar(32) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆类型';

/*Data for the table `car_type` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备';

/*Data for the table `device` */

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
  `anrv` decimal(5,3) DEFAULT NULL COMMENT '预计净残值',
  `crtm` varchar(32) DEFAULT NULL COMMENT '创建时间',
  `mdtm` varchar(32) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备类型';

/*Data for the table `device_type` */

/*Table structure for table `fb` */

DROP TABLE IF EXISTS `fb`;

CREATE TABLE `fb` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `fbtid` int(11) DEFAULT NULL COMMENT '设备类型id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家具图书';

/*Data for the table `fb` */

/*Table structure for table `fb_out` */

DROP TABLE IF EXISTS `fb_out`;

CREATE TABLE `fb_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fbid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家具图书报废\n';

/*Data for the table `fb_out` */

/*Table structure for table `fb_receive` */

DROP TABLE IF EXISTS `fb_receive`;

CREATE TABLE `fb_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fbid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家具图书领取';

/*Data for the table `fb_receive` */

/*Table structure for table `fb_repair` */

DROP TABLE IF EXISTS `fb_repair`;

CREATE TABLE `fb_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fbid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家具图书维修';

/*Data for the table `fb_repair` */

/*Table structure for table `fb_type` */

DROP TABLE IF EXISTS `fb_type`;

CREATE TABLE `fb_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `intlcode` varchar(100) DEFAULT NULL COMMENT '国际编号',
  `model` varchar(100) DEFAULT NULL COMMENT '型号',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `asl` decimal(3,0) DEFAULT NULL COMMENT '使用年限',
  `anrv` decimal(5,3) DEFAULT NULL COMMENT '预计净残值',
  `crtm` varchar(32) DEFAULT NULL COMMENT '创建时间',
  `mdtm` varchar(32) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家具图书类型';

/*Data for the table `fb_type` */

/*Table structure for table `house` */

DROP TABLE IF EXISTS `house`;

CREATE TABLE `house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `code` varchar(7) DEFAULT NULL COMMENT '设备流水号',
  `name` varchar(50) DEFAULT NULL COMMENT '房屋名称',
  `residual` decimal(16,2) DEFAULT NULL COMMENT '净残值',
  `original` decimal(16,2) DEFAULT NULL COMMENT '原值',
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-入库、2-出库中、3-出库、4-领用',
  `prod_date` date DEFAULT NULL COMMENT '生产日期',
  `creator` int(11) DEFAULT NULL COMMENT '登记人',
  `create_time` datetime DEFAULT NULL COMMENT '登记时间',
  `buyer` int(11) DEFAULT NULL COMMENT '购买人',
  `buy_date` date DEFAULT NULL COMMENT '购买日期',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  `asl` decimal(3,0) DEFAULT NULL COMMENT '使用年限',
  `area` decimal(3,0) DEFAULT NULL COMMENT '面积',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='房屋';

/*Data for the table `house` */

/*Table structure for table `house_receive` */

DROP TABLE IF EXISTS `house_receive`;

CREATE TABLE `house_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='房屋领取';

/*Data for the table `house_receive` */

/*Table structure for table `land` */

DROP TABLE IF EXISTS `land`;

CREATE TABLE `land` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ogid` int(11) DEFAULT NULL COMMENT '组织机构id',
  `code` varchar(7) DEFAULT NULL COMMENT '设备流水号',
  `name` varchar(50) DEFAULT NULL COMMENT '房屋名称',
  `residual` decimal(16,2) DEFAULT NULL COMMENT '净残值',
  `original` decimal(16,2) DEFAULT NULL COMMENT '原值',
  `status` decimal(2,0) DEFAULT NULL COMMENT '状态 1-入库、2-出库中、3-出库、4-领用',
  `prod_date` date DEFAULT NULL COMMENT '生产日期',
  `creator` int(11) DEFAULT NULL COMMENT '登记人',
  `create_time` datetime DEFAULT NULL COMMENT '登记时间',
  `buyer` int(11) DEFAULT NULL COMMENT '购买人',
  `buy_date` date DEFAULT NULL COMMENT '购买日期',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  `asl` decimal(3,0) DEFAULT NULL COMMENT '使用年限',
  `area` decimal(3,0) DEFAULT NULL COMMENT '面积',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='土地';

/*Data for the table `land` */

/*Table structure for table `land_receive` */

DROP TABLE IF EXISTS `land_receive`;

CREATE TABLE `land_receive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lid` int(11) DEFAULT NULL COMMENT '设备id',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='土地领取';

/*Data for the table `land_receive` */

/*Table structure for table `organization` */

DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `crtm` datetime DEFAULT NULL COMMENT '创建时间',
  `mdtm` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='组织';

/*Data for the table `organization` */

insert  into `organization`(`id`,`name`,`remarks`,`crtm`,`mdtm`) values 
(1,'财务部','专管财务的部门','2018-09-12 09:52:29','2018-09-12 09:52:32'),
(2,'销售部','负责销售的部门','2018-09-12 09:58:52','2018-09-08 09:58:55');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色';

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`remarks`,`crtm`,`mdtm`,`device_power`,`car_power`,`fb_power`,`land_power`,`house_power`) values 
(1,'超级管理员','管理所有','2018-09-05 09:54:13','2018-09-13 09:54:15',111111,111111,111111,111111,111111),
(2,'设备管理员','管理设备','2018-09-05 09:54:18','2018-09-06 09:54:21',111111,0,0,0,0),
(3,'车辆管理','管理车辆','2018-09-25 09:57:22','2018-09-28 09:57:24',0,111111,0,0,0);

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `user` */

insert  into `user`(`id`,`rid`,`ogid`,`name`,`pwd`,`sex`,`birth`,`phone`,`email`,`login_time`,`login_ip`,`crtm`,`mdtm`) values 
(5,1,1,'zhou','zhou',1,'1998-09-25','13533987654','a@qq.com','2018-09-19 09:45:01','192.168.1.11','2018-09-12 09:45:33','2018-09-20 09:45:41'),
(6,2,2,'jun','jun',2,'2010-09-25','14785462552','b@qq.com','2018-09-12 09:46:42','192.168.10.23','2018-09-01 09:46:54','2018-09-15 09:46:58');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
