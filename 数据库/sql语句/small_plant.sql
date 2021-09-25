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

 Date: 17/04/2021 22:09:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for small_plant
-- ----------------------------
DROP TABLE IF EXISTS `small_plant`;
CREATE TABLE `small_plant`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `plantVarietyCode` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物品种编号',
  `plantVarietyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物品种名称',
  `smallPlantName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小型植物名称',
  `smallPlantCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小型植物编号',
  `plantPrice` decimal(10, 2) NULL DEFAULT NULL COMMENT '植物价格---暂时不启用',
  `plantType` int NULL DEFAULT NULL COMMENT '植物类型：0是多肉植物，1是小型植物，2是大型植物',
  `plantFunction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物的功能，作用，影响',
  `growingEnvironment` int NULL DEFAULT NULL COMMENT '植物生长环境：0是水生植物，1是土生植物',
  `conservationMethod` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '植物的养护方法',
  `enable` bit(1) NULL DEFAULT NULL COMMENT '是否启用 true-启用  false-禁用',
  `activity` bit(1) NULL DEFAULT NULL COMMENT '是否删除  True-未删除  False-已删除',
  `createrCode` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人编号',
  `addTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最近修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of small_plant
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
