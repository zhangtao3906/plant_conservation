/*
 Navicat Premium Data Transfer

 Source Server         : plant_conservation
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : plant_conservation

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 17/04/2021 22:09:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for plant_type
-- ----------------------------
DROP TABLE IF EXISTS `plant_type`;
CREATE TABLE `plant_type`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `plantVarietyCode` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物品种编号',
  `plantVarietyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物品种名称',
  `enable` bit(1) NULL DEFAULT NULL COMMENT '是否启用 true-启用  false-禁用',
  `activity` bit(1) NULL DEFAULT NULL COMMENT '是否删除  True-未删除  False-已删除',
  `createrCode` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人编号',
  `addTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最近修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plant_type
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
