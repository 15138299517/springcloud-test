/*
 Navicat Premium Data Transfer

 Source Server         : localhost-MySQL-8.0.27-3306
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : springcloud_test

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 07/04/2022 18:16:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '名字',
  `create_time` timestamp(6) NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_dept
-- ----------------------------
INSERT INTO `tbl_dept` VALUES (1, '财务部', '2022-04-07 15:54:58.165941');
INSERT INTO `tbl_dept` VALUES (2, '人事部', '2022-04-07 15:55:47.446527');
INSERT INTO `tbl_dept` VALUES (3, '研发部', '2022-04-07 15:55:55.118571');
INSERT INTO `tbl_dept` VALUES (4, '项目部', '2022-04-07 15:56:03.908939');
INSERT INTO `tbl_dept` VALUES (5, '产品部', '2022-04-07 15:56:13.899240');
INSERT INTO `tbl_dept` VALUES (6, '测试部', '2022-04-07 16:45:23.259592');

SET FOREIGN_KEY_CHECKS = 1;
