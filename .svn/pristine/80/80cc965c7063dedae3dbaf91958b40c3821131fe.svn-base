/*
Navicat MySQL Data Transfer

Source Server         : 47.93.225.12 链接
Source Server Version : 50721
Source Host           : 47.93.225.12:3306
Source Database       : lrs_test

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-10 14:02:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_logs
-- ----------------------------
DROP TABLE IF EXISTS `sys_logs`;
CREATE TABLE `sys_logs` (
  `id` varchar(50) NOT NULL,
  `user` varchar(50) DEFAULT NULL COMMENT '操纵用户',
  `role` varchar(50) DEFAULT NULL COMMENT '操作角色',
  `description` varchar(100) DEFAULT NULL COMMENT '操作描述（模块）',
  `url` varchar(100) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL COMMENT '操作类型',
  `content` varchar(255) DEFAULT NULL COMMENT '操作内容',
  `date` varchar(25) DEFAULT NULL COMMENT '操作时间',
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of sys_logs
-- ----------------------------
INSERT INTO `sys_logs` VALUES ('003fbfdf-5b02-4fc7-a1a3-0cab76d95bf1', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:41:54', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0067a67b-7664-460e-98f6-c3d4c5116faf', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:57:18', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('00852423-f705-4169-b538-7009b117a70e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 14:22:43', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('00854ff0-f2f1-487e-bc58-f6c148db96fd', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:28:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('00937cb2-d012-46ce-bf8d-3cfe5e655ed5', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 13:58:00', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('00d1f6fc-a5f6-4812-b4f3-547a36ba4afe', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:10:05', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('00fbb685-6c5c-4018-954e-1e8c7399798e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 15:36:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0116cdf6-a791-40f2-bc16-f1f422971e57', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 14:19:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('013f3ceb-cb24-4f61-890d-a8339d967750', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 12:41:57', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0219ff5fe9504498828693accff18695', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:06:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('02964d1f-e15f-469c-ad48-677e1bea25db', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 11:18:57', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('032f91d8-85e4-4c0c-950f-7a6e3b871239', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:25:22', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('033b8121-5126-4c13-bf95-dc3f504e8be3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:04:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('034c9e47-f85a-4e33-b344-7db5769976d3', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:48:01', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('0356e69d-d16b-4ebb-a35e-6340b76f8d5e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:47:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0484910b-a3dc-4207-8dbe-c66302422702', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 10:28:42', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('05c0416b-acde-43c2-a0ce-41f2c6ab63f9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 10:39:29', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('06c7b536-f7d8-4129-8280-43b001733a12', 'test5', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:07:02', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('07616392-36ab-4ff2-80d1-a90fd24ba2e4', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:43:20', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('07907aa3-2bd8-4df7-8b49-ab970a1c234d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 14:55:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0793fd27-bb3c-4810-a89c-07bb98cee221', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:14:05', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('082309d0-d52a-4091-afdf-c6c96f9844f3', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 11:20:55', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('087fbe48-9bcc-4ec1-8ec9-e105d2562f12', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 10:28:39', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('0a277adc-f259-48c2-989a-657980e90d6f', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:01:00', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0a4a654a-05f8-4565-b180-ea510bfd990d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-02 22:06:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0a70fc15-ded3-49b0-bd6c-f9ec6bdbf9ef', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:18:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0a7aaa81-8d2d-4f59-bec6-f3193cc013a1', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 11:26:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0ac8ddba-7ee3-459d-a7a2-adca94bd1ca3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 16:42:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0ad6579064774f41bf2b824ccd9583a9', 'admin', '', '暂无数据', '/resourceRecommend/add2', '添加', '用户添加数据', '2018-08-29 16:42:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0ae829cf-0f9b-4f9c-9761-94663bcaa2ba', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 10:38:36', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0b86066a-3729-4e74-bafe-2383d2b6fab5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 17:44:21', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('0c943078-0e88-4fcc-a080-43cad13b4d0c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-22 11:19:59', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0caaee47-c70c-431b-9cc3-dbdf44dc0b64', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:58:54', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0cd63ecf-881d-49a9-acbb-0ddc5cff5aeb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0ded7501-2be2-4592-b528-e9d8e4d3fc9d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 13:59:36', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0df92d16-6a27-4233-875c-803f60cee3e4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 11:19:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0e247fcd-fff2-4ae2-9771-e0846c0151da', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:06:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('0e8945de-6db3-4658-8345-13939ac0a4e6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 09:45:37', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('0f173d28-ad47-4e51-b5b8-728d7329bfd6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:59:14', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('0f537114-4fb0-4490-b516-45c7d4f48ab4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:03:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('0f674e22-a0bb-4c2a-928b-589bd90ef57f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:45:38', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('0fe05087-6076-4a4d-b1ed-68deb1e5d805', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 11:04:11', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('11488a7f-f1b3-45fd-97b7-8dcd5ee6e5c8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:20:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1241dcb2-8605-47f5-8514-67bf21695164', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:44:34', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('12477b10-c7f7-4030-996b-7fde1960dab8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:58:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('12c01fc9-a3f3-4bdf-a45c-a0ff34a92a1f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 09:18:03', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('13302456-9327-4dd6-91d7-26ff1497b30c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:43:25', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('144256fb-abc9-475e-ad72-61bf270ae285', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:02:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('14978d9a-1cf0-43df-b459-be46bdf4ec2b', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:07:55', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('171e0df1-6e64-4e8e-bf74-cc2953e3ef03', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:02:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('17d7552e-ff57-44f7-a7c5-0eb05b598b70', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:23:21', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('17e934ad-12d3-4faf-a59b-2165d300d4fc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 11:00:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('17fc683d-ff1b-496f-ae35-c5f91d7d2fa5', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:15:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('18c819df-86a5-4722-98aa-3648ed7564d2', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 13:57:54', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('1906d67f-fcc7-4d44-82ed-b91c42475d9b', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:05:29', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('193a8a5c-8891-487f-bd97-2ace76bebbd7', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 17:56:48', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1966b49d-0c4e-42b0-834f-bd13caf8897f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:54:47', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('19cbd55b-88d2-43a3-b022-486d56bc55d9', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 09:47:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('19eb68dc-d417-46ad-afcf-7b83229c0dbe', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:48:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1ae7a1a3-6a48-45fe-9e2c-197bbe4e2e53', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:41:36', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('1b03ff4f-44f2-4f26-854d-deadcbff58a8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:16:46', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('1bd19a74-c82a-4b42-b155-e1d199a30ad4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:20:25', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1be4879b-c386-49d6-ab72-7f4c0d1ff67e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 11:30:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('1c3792bf-f526-4661-b31e-0ba20d8f0aaa', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 17:41:53', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('1c921bd4-b714-456e-84ac-c8a6f0f962dc', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:17:55', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('1ca3c5a2-dc6d-4fe5-b068-1c6fd58710cb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 09:01:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1cd1011b-bd5b-42fd-8447-1ca737877d3d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:33:47', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('1d743b94-56d5-4036-9c0e-20724e248e22', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:56:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('1ed5b256-3db9-41fb-9e4a-4e27e7413c14', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 10:45:34', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('1f004ffb-0747-474b-a2e3-ed03b57ab3cb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:12:58', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('1f0cd45b-a237-4299-b6c7-2294bf5c1e90', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 16:39:54', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('2023e4e4-7c21-459d-b429-f9c8bd8f3453', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 12:08:54', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('209356ed-1291-4ced-8adf-0b34a6805b0b', 'test5', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:26:53', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('20c92dbc-8449-49ed-b166-c8ced5c0399c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:58:33', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('212c9d32-705c-428a-aeec-91c80709b9e3', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:34:01', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('213658a8-37a8-4fcd-9e16-a348c3a76a96', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:08:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('21a2d24d-0ebb-4537-9df2-ed106efc0762', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:58:46', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('22607ff4-2295-4067-b81a-a529c6454df4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 09:59:56', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('22bf9d7e-f92e-4d23-9c7c-63d0c0ef324a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:53:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('2333b4bb-32d7-46ea-9b2f-dbecbc7e1adb', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:54:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('23674a8a-a5cc-43f4-adcb-ff9de4310fe5', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:45:32', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('239c4792-7cd8-439b-8c8f-77ff8ab4b443', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:00:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('245c3064-3e89-48f4-987a-33b850f24693', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-22 10:11:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('24b423a3-edf9-49a8-86bf-0fb027df39d5', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:10:02', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('2561e40e-738f-4af5-8dae-167f3e6d1931', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:41:46', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('25d916be-3ecb-49d1-96ba-33d20c2916b1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 17:02:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('26a89ca7-5972-4299-b655-2fa170209d72', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:00:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('278f1de6-1e97-4a87-9550-8c1fa89bd961', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:13:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('27ac1279-4dca-4560-a08a-329b37d76bd4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:23:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('297ddaff-ec2c-43c8-8108-1f4c0368aa4e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 10:25:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('2d066311-4480-4fe4-bc92-05b1cc1fc3fc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 11:15:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('2d146e18-5c34-4b33-9ed2-fda70e7963fd', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:03:43', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('2ea74b8a-3da9-432b-83eb-35487bd30379', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:00', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('2f4eef3d-0065-41a7-b367-cfba2163f106', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:51:38', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('3064d6914d4a4aaf812357f18ffcc865', 'admin', '', '暂无数据', '/resourceRecommend/add', '添加', '用户添加数据', '2018-08-08 17:30:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3067bc30-4cd1-4b6f-b526-cd8a020e4c6f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:43:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('30ae4c31-0349-428a-ad1d-58dbe5d5c1b1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 17:07:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('31f04217a2ae40a1ba83363eaaad3c15', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:14:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('32621128-2246-4bb3-9bfd-c2056882051c', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-04 09:48:34', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('327849ac-5918-40be-8259-4427bfc67d8f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:54:21', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('32bfa99d-58a4-4ee5-9791-ac2e25ca732b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 11:09:10', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('331d5c5c-5dd2-4b03-9a7d-d77074aafbc9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 12:30:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3320524a-7d83-4564-b826-5808af5229d1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 08:56:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3408ebfa-e360-487d-9647-6a2058c4ad5e', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 16:05:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3442725a-6cf3-4107-ad70-3b11ed96a264', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:09:27', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('344c99c783794d43ac146269723f472a', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-29 16:41:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('35ab5c16-ad5e-41bf-a7e8-09e48dea2a33', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:22:31', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('369b460c-8696-418e-af0a-13402bfdc9a5', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:07:39', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('36cc5f2b-b4b5-4f90-bdcb-87794d6764f4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:10:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('375b744e-fd5d-45dd-aaa9-cf501a644c1a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 09:56:56', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('375c3aa7-9684-4cc1-8d3d-de55f5142728', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:52:54', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('37604d6c-e871-44fe-ae4a-01bc1dc60206', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:33:32', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('37c337fa-4016-43a9-a41d-b06219235c5f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:04:17', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('38afb024-f9ae-431c-8ee3-22ebee47aff8', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:52:57', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('3967f05b-5e3e-4a39-a7ed-7618033cc61c', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 09:39:51', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('3a34a602-6f82-4395-9d87-ac5d3532f61b', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:46:43', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3a66d279-4f15-43fb-b35a-b4af82d1a369', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 11:21:59', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('3a9dba53-3afa-433d-bcce-dd7681f052ee', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 11:56:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3b2059ed-8030-4fb5-9a06-131628a5da85', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:59:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3c1cea2d-67ca-478d-920e-9b14c13918fa', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 17:15:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3c31c10c-dd88-4aa4-9245-e44d349145b2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 10:11:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3c84d5fb-b813-4d99-9b66-1bf84f312776', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:17:53', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('3d022be3-a9fc-4333-8b37-e1419404134e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:12:42', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3d21024f-9a4d-4f10-af5f-d4edf688ea8d', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:20:26', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3f026702-8308-4ae9-9bd3-5de1c657c19d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 10:46:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('3f9865be-477c-47e1-87b2-ba963aefde6a', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:28:51', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('3fb39960-8982-40f9-a1c6-34a715dbe578', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 09:36:53', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('3fec736b-46a4-4987-931d-5d47b50202cb', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:42:13', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('4018f300-6c68-4337-adb6-4905e0bd6dec', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:33:32', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('40288187651f221d01651f23298f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 22:42:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40288187651f241c01651f25c1eb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 22:44:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028818765516dd80165516e3e850000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 17:05:04', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028818765517f1e01655180b8370000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 17:25:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881876551c606016551c65db10000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 18:41:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40288187655245250165524593c00000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 21:00:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028818765527197016552743abf0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 21:51:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028818765527197016552a4d6340001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 22:44:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028818765527197016552a4d6fa0002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 22:44:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881876552b204016552b4780d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-19 23:01:23', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651887ad01651888083c0000', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-08 15:54:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46518d2a6016518d30cd60000', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-08 17:16:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46518d2a6016518db103a0001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-08 17:25:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46518d2a6016518db8fb50002', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-08 17:26:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651925aa0165192623d20000', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-08 18:47:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c39f1d00000', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:08:03', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c3b323d0001', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:09:26', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c3c8c820002', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:10:54', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c3dbdc00003', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:12:12', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c3ff7460004', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:14:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c400dbd0005', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:14:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c374e01651c404d6d0006', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:15:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c510e01651c5168a80000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:33:41', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c539401651c59d4fb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:42:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c5c5e01651c5cb5eb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:46:01', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c5c5e01651c5cb9d40001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:46:03', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c61ba01651c6200680000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:51:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c7e2401651c7e90480000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:23:01', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c816201651c81e1840000', 'deptadmin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:26:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c816201651c830e970002', 'normaladmin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:27:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c816201651c84c90a0003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:29:48', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651c9e2301651c9e7bed0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:57:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651caf0301651caf4e110000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:16:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651caf0301651caf97bb0001', 'normaladmin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:16:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651caf0301651cafd1040002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:16:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cc2e801651cc3571f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:38:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cca2801651ccb1ddd0000', 'normaladmin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:46:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cca2801651ccc71850001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:48:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cca2801651ccd08cb0002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:48:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cca2801651cce34010003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:50:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651cca2801651ccf0ca20004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 11:50:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d3baa01651d3c0adf0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 13:49:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d49aa01651d4aee130000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:06:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d49aa01651d4b3bf70001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:06:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d538901651d53e60e0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:16:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d639601651d648f490000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:34:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d68cc01651d69290d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:39:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d6b9601651d6be3070000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:42:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d6b9601651d8786b50001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 15:12:25', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651d98ae01651d9900b90000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 15:31:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651dcf7401651dd1da890000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 16:33:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4651ddafb01651ddb72c60000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 16:44:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465214b520165214db0eb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:47:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465214b520165214db2710001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:47:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465214b520165214dc7560002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:47:50', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465214b520165214f5fd00004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:49:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4652177200165217771c00000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 09:33:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465218f240165219013ce0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 10:00:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46521995401652199ab230000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 10:10:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465219954016521d5c9230001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 11:16:23', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46522d229016522d31ecc0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 15:53:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46522d22901652305e77a0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:48:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46530c4c8016530ca15f30000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 08:57:54', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46535f064016535f2805b0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 09:00:09', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4654597b7016545987da30000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 09:55:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4654597b70165459909cb0001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-17 09:56:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46545f45b016545f5394d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:37:03', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46545fa18016545fa50580000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:42:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46545ff7d016545ffe5590000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:48:42', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46545ff7d01654604f34c0003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:54:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46545ff7d0165460547460004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:54:35', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546058101654605fb5d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:55:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465460581016546064ec90001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:55:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546095f0165465e1bdb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 13:31:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4654678ae01654678e54a0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 14:00:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546c1c6016546c20b730000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 15:20:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546da26016546daa39f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 15:47:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546e11c016546e199e90000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 15:55:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46546f8de016546f959ed0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 16:21:11', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4654743a00165474426050000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 17:42:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46554ec80016554f09b360000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 09:26:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465554a300165554ad9be0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 11:04:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465555fa90165556071020000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 11:28:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46555d92e016555d9af830000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 13:40:54', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46555e091016555e13ed00000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 13:49:09', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e4655626a60165562700510000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 15:05:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46556358c0165563650ff0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 15:22:04', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46556832701655683761d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:46:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46556856401655685a5d90000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:48:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465568a8d0165568b2f4d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:54:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465568a8d0165568fb3c60001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:59:42', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e465568a8d0165569832d80002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 17:08:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881e46559f824016559f93b520000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 08:53:50', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c4bc201651c4d85e40000', 'admin', null, '用户登录', '/new/loginindex', '1', '用户登录', '2018-08-09 09:29:27', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c574701651c5e77290000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:47:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c5f7d01651c60452f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:49:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c65a301651c6618ad0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:56:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c86d001651c87f2460000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:33:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c8a2801651c8b946b0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:37:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c8ffc01651c9747950000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:50:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651c8ffc01651d5ce6d50001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 14:25:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb651e09ff01651e0ded3c0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 17:39:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb652264ee0165226588910000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 13:53:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6522a3f9016522a4691d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 15:02:04', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6522ea30016522ea83010000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:18:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6522ea300165230581870008', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:48:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6522ea3001652306d3610009', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:49:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6523089101652308dd900000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:51:48', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6530e27a016530e326f50000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 09:25:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6530e27a0165312d1fa40001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 10:46:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6530e27a0165312d21190002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 10:46:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531d437016531d5b6dc0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 13:50:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531f6ba016531fa53ae0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 14:30:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531fff80165320856c50000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 14:45:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531fff8016532685b880005', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 16:30:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531fff801653268b0990006', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 16:30:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531fff80165328c3a3e0007', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:09:35', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6531fff80165328c426d0008', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:09:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6532936401653293aaaf0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:17:42', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6532a06f016532a13b4c0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:32:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6532a06f016532b0cbd90001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:49:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881eb6532a06f016532b0d38a0002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 17:49:33', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed6531278d0165312d83b80000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 10:46:30', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed6531278d01653181bd9d0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 12:18:30', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed6531278d016531d804330002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 13:52:45', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed6531278d016531e3c8ce0007', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-13 14:05:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed6531278d016531e3eb1e0008', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-13 14:05:45', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed653c697201653c69face0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 15:08:23', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed653c697201653c6d8a580001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-15 15:12:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed653c697201653c6dc5490002', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-15 15:12:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ed653c697201653c9837880003', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-15 15:58:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef6535ef0d016535f09f740000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 08:58:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef6535fa59016535fad3c40000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 09:09:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653649ee0165364ad3a00000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:36:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653649ee01653650eec50003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:43:18', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef65371cc30165372131380000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:30:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653789b80165378ac2d30000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 16:26:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef6537b4fd016537b62ef50000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 17:13:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653b18de01653b1c99500000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 09:04:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653b373001653b37ef2f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 09:34:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef653b495401653b4d25860000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 09:57:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402881ef6554f85b016554f971170000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 09:35:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981652152fa01652153e7a60000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:54:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981652163b8016521649b1f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 09:12:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981652163b80165219db08e0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 10:15:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981652163b8016521cd08790002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 11:06:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653625050165362736370000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 09:57:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653631b701653632c5460000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:10:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816536346601653636785d0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:14:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028998165363dae0165363e2f7f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:22:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653640c3016536413a000000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:26:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816536581601653658c2040000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:51:51', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028998165365816016537053ff20001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:00:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653718f901653719880a0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:22:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028998165372e330165373ba6790000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:59:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028998165373ca60165373d57fc0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 15:01:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4028998165373e4e0165373ed4fe0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 15:03:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('40289981653778c901653779a2290000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 16:07:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816537860c016537871ed80000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 16:22:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816537b716016537b8dc240000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 17:16:26', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816537bcd7016537bda3930000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 17:21:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653b308201653b318e670000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 09:27:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('40289981653b43d401653b45731b0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 09:48:51', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816554e6de016554e847e90000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 09:17:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816554efaf016554f053770000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 09:26:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816555111201655511cbf00000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 10:02:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816559fcb501655a2fae980000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 09:53:18', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('402899816559fcb501655a4425db0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 10:15:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4053efe1-3422-4c22-9bb1-f3a118fc9524', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 16:20:20', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('40f392f6-c014-4601-9bf7-37dfaa80e78d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:50:57', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('41175c29-bc42-45c7-8ead-b190c4203d4b', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:12:30', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('413ea434-ab0d-45cd-878d-a719a70e3855', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:18:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4224873c-09d1-4d4b-9af4-52ebc8cabbeb', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:07:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('42791b4a-4a22-46d1-beee-d9833e2222af', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 10:33:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('428c2ed6-0b42-4298-b676-3a74d50d31a1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:55:02', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('42b9afc3-b5ea-4f81-b053-c1d91ad3b272', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:22:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4301ad6b-9f84-4124-b7ca-6cba6cdfb970', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 09:06:27', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('453d30b5-4c6f-4715-9e60-d7acb9f5180b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:44:18', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('45482a89-da51-4b8d-8e26-086832245a53', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:52:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('45bbd681-1abc-4261-9c08-04d45e1a35ce', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 11:39:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4629961e-1fd3-4130-bb7e-4dd37ca147cc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:23:48', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('464a9af0-ca53-48fd-addc-4fefeaf8f15b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:44:42', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('46bb734d-0fcd-43cd-bec0-7c3d6063a4dc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:27:48', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('47cc0498-6a7b-42ae-8629-0b9fae3c9ae2', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:46:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('480635ca-d0a2-446c-962d-ffcd17c83190', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 13:40:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('489b7d0b-c069-4603-bcfb-c720db8c4e78', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:50:03', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4931e2b8-74cd-4c2f-bc9b-5a40f70cde76', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 17:56:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('494a5fbf-9494-4ba0-9fb3-41f318afe008', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:04:44', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('4ac8f337-0917-4a98-9f66-23a4a4da1846', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 11:11:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4ae0da1a-6f60-489a-9830-4574f32e75b6', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 10:54:44', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('4b7586e0-9dbe-44bd-abb7-4ebbdb163dc9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 09:27:40', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4bc683c9-8858-4095-b135-25bf8dc1bfeb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 17:11:53', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('4be74ff0-a1fa-4fce-8883-68376ec31cbb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:35:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('4d3e566d-5da4-4aaa-a3c0-f144d6911244', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4d7c42f5-462b-4d5b-8c5d-dcaea51e46ec', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:56:42', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4d91a76a-44b7-4c20-aada-5862e723f153', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 15:56:57', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4dc0c9d4-ea4a-4cd1-8245-1ad0dbadaf61', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:59:12', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('4fa41aa1-cd24-4acd-8d57-2e141a26a636', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:04:26', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('5103b64b-d3ca-4795-874d-60fc93d9386d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 11:21:26', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('51640033-e8af-4d2f-964a-752237cc1df3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:15:35', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('51700a6b-e360-48b7-a37d-cd3153f8f30d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 11:25:42', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('52292ec8-1115-458f-89a9-dcc60ce45433', 'test6', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:28:00', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('526800ff-ffa9-4cb1-8e0e-599bab92ad78', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:33:37', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('5288e5db-9be8-407d-86c7-dc8a5ab9651a', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:40:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('5289d972-8c18-4dd0-aeef-25aaf2848d78', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:59:04', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('53158fae-f913-4757-a111-dc2df7cda613', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 09:09:30', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('538c86ca-8fdf-4fa1-8d7c-3039049353c5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 12:08:49', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('54eaebb2-ab2c-415e-96bb-36a404733757', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 11:07:42', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('54ef1747-1291-4017-8c2d-930a6a0dce88', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 16:00:01', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('554e6165-b689-4f23-a213-006e12c95cec', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:22:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('55b25f44-7015-455e-9ae9-437ff496ef35', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:02:28', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('55b7818d-1931-43d5-8f8a-3d725236d8b6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 09:01:51', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('55d7b6c8-0b08-409b-a4d7-331353fbd13f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 14:40:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5656b48fe1dd4d9fac46f5c91c502944', 'admin', '', '暂无数据', '/resourceRecommend/add', '添加', '用户添加数据', '2018-08-29 16:42:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('56fba115-af72-4a4d-9eb1-55721c55653b', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:12:12', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('571fc198-814f-4031-9794-b362d7b95be5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 14:59:17', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('574c1eb4-a8a8-4599-a18f-53657df0baa3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:49:43', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('57a523e1-b72a-44da-a9a3-75a0764a9804', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-02 21:45:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5810c723-6739-44fe-bfd7-1a6dbdc7810f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:07:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('58b9ffc5-1ea5-4fee-8d0d-944748ea6af7', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:50:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('58cf205d-191b-4a50-b92d-c0eef520ee15', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:15:06', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('58d96a5d-26b1-4fbe-9805-1004df4bff9a', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:45:53', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('595f7820-f5d9-43ff-9480-88f64cf0318a', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 15:35:24', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('59fa06b6-e750-4647-973e-0dbc71ef808d', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:56:57', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('5afb7699-48be-457d-b732-d1bc52b1bab1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:36:07', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('5b68464d-3e4c-4b18-8809-4988ac7c9720', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 15:41:25', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5c0ada34874c41dcb70799590ad26876', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:02:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5c115740-202d-4571-9fb1-16fc9e71ef8e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:53:13', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('5c6a76b5-07c4-4bc1-9a34-06db234ac736', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 10:51:33', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5c919859-ea1a-4a45-8949-026d582c5a67', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:03:56', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('5ccad7bd-148b-4aff-8f78-aa4fb6169734', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:21:04', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('5d311a0a-ac0f-4179-a614-b45d8b2afe71', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 15:10:26', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5d7a1fc8-036d-4b5d-a427-38672eec6d7f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 11:34:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5e66fcb2-8a9d-49dc-ba4c-dd83a8e7a1ce', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:48:46', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('5e992cd2-8d3a-46ec-b7ee-f4489c7e0c11', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:36:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('5f7a13b8-dab3-453e-b0d5-69e9e566d34e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:35:10', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('5fc39aa3-d82f-4ba5-9f36-7f1d955ca396', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 14:06:09', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6050de2d-abc0-4ad2-8cac-167b7c915cb9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:58:56', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('6091d470-6164-4262-89ca-2118bcb117c5', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:23:35', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('609c2300-384f-4e20-9fb8-88f2dd56aadb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:26:58', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('60a934bf-5baa-4add-b5ff-297f1f8b65ba', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:02:22', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('61bc2c6c-68e4-4b7f-8bc2-62394b23ec9d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 14:05:15', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('62266a83-e687-4a92-95c5-40ca3fc24208', 'test5', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:18:21', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('63d494d85bd24d469d9b415132de9f88', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 15:58:10', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('63e33e7a-6fcb-46c7-915b-1eb28d08be21', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:27:51', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('643b9c94-d2e1-4d91-91cf-059b3c8c2684', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:36:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6468d34b-6172-49a8-8c1a-42ced68aa2ae', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:38:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('64a19bec-76d3-4357-b4fa-63186535f41f', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:40:55', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('64fa5d26-17c9-409c-b2dd-c90a4dd79140', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-22 11:20:40', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('650e7aee-dec4-4881-b4fe-48e6249331ce', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 17:11:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('657bb11af7e04d72b67c863e378ccdef', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:06:11', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('659421e1-2782-4245-b9bb-9d1ba97ffd04', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:58:14', '10.0.12.19');
INSERT INTO `sys_logs` VALUES ('661519b5-7620-447e-b1ef-6b89a9cf0cf6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:29:31', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('66329942-8596-43e2-9b74-fa73346e5dd7', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:58:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('676148ed-11b9-45e8-b455-011ec8dd5f0b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:34:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('67b89c60-939d-429f-811a-8af8d9daadf5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:37:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('67cffd03-31a3-4ae3-bf55-68dec5250e96', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:10:23', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('68696b63-f75f-4e3c-bb30-d7227d57e480', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:21:46', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('69b539e9-d9fb-4aac-8c7b-ccf8b03463eb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 12:39:17', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('69c78693-58c1-49ad-9a8b-eb7a9c7db7dd', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:41:50', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6a979d39-7cc0-413c-a63a-d0c98be5faef', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:35:33', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('6ab33aed-8c37-41e7-90ec-79fa189867e2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:53:41', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('6b2508bd-9514-44f4-ab54-869bbd20d11c', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:22:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6b3e9389-7df9-4ef3-8ad4-65abd6aa47a8', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:16:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6c2510d2-5a6f-4884-aa46-ab545901d5d1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 10:38:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6c4780e7-ad19-4aa1-b87b-b074b5f22c1e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:44:02', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6cb66a94-5ec5-4972-8617-4cd7aaa584f7', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 14:47:41', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('6d6972fe-3b64-4274-8327-a281db107921', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:01:09', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('6d6d0e09-9232-4f5a-8b3e-581381ae252c', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:20:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6d789c19-02bc-4830-9a09-0af00ce9a8be', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 15:16:33', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6d81f1d2-a8fb-440b-b823-ea93375594d1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:29:18', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('6da0f81e-def5-4897-9b35-fb24bc9e1f19', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6db09d66-8f93-4b51-9253-4c1ef2d868ef', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:40:33', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6dd4579f-d8a0-4313-bfc0-268df84929bd', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:35:29', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6dd72fb5-5509-42f8-bf45-c6da0bb2b28b', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:02:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6e29bcf1-f228-49af-8b76-658267a3552c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 08:26:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6ed5e38b-edcd-4354-8bb3-b635cffd2775', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:15:18', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('6f348dcd-5688-4c6e-87a5-b7ca87156646', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:29:03', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('6ff1393bc2384d20b23428a6d2b7426f', 'admin', '', '暂无数据', '/resourceRecommend/add', '添加', '用户添加数据', '2018-08-08 17:30:29', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('70b6d4f3-0f9e-4521-afbc-2a4b430d9977', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:04:36', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('70f89187-bb8b-4d74-bcb4-c97546fe4762', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 15:30:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('711bfdd6-3d76-4ea3-8b66-4a078c6751d8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 14:01:56', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('71398cfc-f29d-4128-8539-9f43aa2a707b', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 10:46:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('714ecad0-d8cc-46aa-b82b-1973e15c113a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 14:20:51', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('715f73b2-28b0-4698-a73e-129f383a4669', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:01:00', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('71a6180c-2114-431e-91ae-0a7da90c1f8e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 09:00:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('71b0f3e4-2c02-401a-a1fa-518980097956', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:23:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('71f5eab4-b116-49c4-bcdf-24d8d4b05c7a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 09:47:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('7350884f-4267-4dd3-9ce9-36c90ed100c7', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:00:32', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('74aa3bf6-8e7d-4115-82aa-6e71dfa959fb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 10:50:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('75bf7284-37fa-47ee-906e-029cb80639a3', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:46:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7611213e-136c-4515-a2db-a8fb75025751', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:57:54', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('76261696-2f80-4b24-90ae-56e845c9a7b7', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:59:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('764e458f-6645-4279-a8ca-294c986f7bb6', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:10:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('76969673-07f2-440b-9bba-e7a2a7b1d1ec', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 09:47:50', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('77593d73-b2ae-44e4-8532-be117cbc9113', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:28:25', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('777a2955-4d6a-4db8-a4bd-90c44b706c0b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 09:48:20', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('77a2110d-1d51-494b-94c6-a9eeb93ddd58', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:05:08', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('77b5e7bd-0074-4c7e-86d0-a74215c4e075', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:04:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('77c0bd0b-f6a1-4a29-9d45-c0c41268a374', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 16:01:29', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7852d79c-3c75-4991-a2a3-1b22fbd42ec2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 14:26:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('7a699efd-d646-42ce-bccc-7e926c19e923', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-22 16:16:48', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7aa92140-f63a-4ca5-963d-8a911ad2c43f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:59:11', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('7b077654-487d-4a87-83a1-ee53276ca134', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:33:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('7bf2242f-0dc9-4541-8e3c-138663bb8b68', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:37:35', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('7c028905-bf95-4ef8-bc69-bd6cca2211f8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:10:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('7c2efa5a-0492-4318-abef-d0a5753b98df', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:00:18', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('7cd0384d-78da-4177-8da8-522e5c764e33', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:47:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7d277a70-b26c-41dd-9371-3a8a488c7139', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:56:22', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('7d70111a-06a5-43ad-adbe-5722acabc465', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:10:26', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('7e339f12-934e-4257-b6fb-9a9ec7f2f271', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:25:41', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('7e4e1b34-800c-42af-a49b-bf42d93c00f9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:00:05', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('7ed3bf44-5124-4375-b88a-3356a070c415', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:05:06', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7f24ade4-1a2e-42a0-821c-05c8edea7e4b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:18:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7f93bbec-0244-4716-8809-2a5ecb619b34', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:36:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7f99f6d0-2388-41aa-85b3-c7cbedb39806', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:32:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('7fabdea0-4221-4618-81bd-2a181515b6a6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:05:56', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('81260cb9-29da-4c38-8b04-78ae3f6f754a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 13:46:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8139b1c5-464f-4c44-a86b-9414a8491069', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:31:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('816e2362-9974-44c6-ac29-82842f519230', 'test5', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:21:56', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('81861c04-4ce3-45c4-83cf-8ed09c01aa87', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 08:16:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('81890801-7630-4602-b7b4-d5853dd2a44f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 09:15:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('81ac6692-951e-47ed-beb2-67f46d2e4e13', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:14:32', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('81fd7e74-e86c-4170-9000-44ef650ad08e', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:07:11', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8200cdfd-1ea2-4882-af93-1ce34791e1db', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 13:59:21', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8256d29f-6e80-470c-8069-d116acb8a1eb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 15:06:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('837d628a-255b-4f68-8d5b-42147bac5ccc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 12:35:11', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('83812ec8-3bfb-4c80-b19e-b59de7afebad', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:37:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('84131b21-a055-4e3d-9a30-004c112f26fa', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 11:36:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('84bdedf2-e452-41a8-9428-3ff0f05b9d32', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:41:11', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('852568a1-265b-4245-b844-32053e599c72', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 10:15:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8542ca3b-5c54-444a-bf77-da28a396d5d8', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:13:21', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('85c45b1f-506f-4a86-b18e-d5967a4828f3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:23:18', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('861e33b0-f82f-4813-b2e1-479dff8815d8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 12:12:21', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('862fd793-583d-4e7b-8707-f7dc217e85ff', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:08:29', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('865cf763-ecd1-408f-9f98-c552189bea31', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 11:13:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('870d50c2-33a4-4b09-85ca-657a5450baf7', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-24 17:28:26', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('877d3b4a-8da5-4760-b755-6952f9a4c79c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:11:19', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8849cc3c-8b5c-42f7-b95e-f09cef217361', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:11:51', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('886ae86b-0364-4f62-8709-3772feae1638', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 08:24:57', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('88bf3276-7b02-4ed1-a77b-f1690d678696', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 14:47:50', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('88dd577f-f120-4fdc-897a-b0d4b9310cf1', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:07:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('88e9cf0c-2411-45f4-8dd5-094277ec078c', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:06:47', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8a0621a7-85dc-4d01-a7fc-f2a7e05e1c2d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:25:11', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a168293-fa06-49e4-9260-b631eb7f80b2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:54:05', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('8a2c52ae-e98d-4be1-879f-b62741328f7a', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:20:24', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a402c7a-2268-4e9e-befe-e05bd5bb9058', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:59:48', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8a808bea65181bbf01651c5695820000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:39:20', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea65181bbf01651c56f8ec0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:39:46', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea651c5a4f01651c5ab8420000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:43:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea651c5a4f01651c5ad0d40001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:43:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea651c672201651c68acbf0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 09:59:06', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea651c672201651c9d750b0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-09 10:56:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea651c67220165215302bc0002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 08:53:32', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea652193b4016521a505db0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 10:23:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea016521b577f10000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 10:41:05', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea0165220acd5a0003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 12:14:17', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea0165229183860004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 14:41:26', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea016522edf9530006', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:22:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea016523038607000d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:45:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6521b4ea0165230499cb000e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 16:47:08', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d016523353d0f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-10 17:40:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d016531de507c0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-13 13:59:37', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d0165363f3f4c0002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:23:59', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d0165364cf10f0003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 10:38:56', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d016537105bf60004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:12:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d01653737ca7e0005', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 14:55:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6523261d01653788762d0006', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 16:23:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6537a2c8016537a36baf0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 16:53:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6537cb4d016537cd65880000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-14 17:38:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6537cb4d0165456472cf0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 08:58:55', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6537cb4d01654573bc920002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 09:15:37', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea6537cb4d0165466a638c0004', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 13:45:02', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea65468fe3016546902ddb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 14:26:18', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655518650165551b22340000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 10:12:46', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655528380165552bd7680000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 10:31:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655535bc016555371ce40000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 10:43:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165556384270000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 11:31:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d5016555e29e2e0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 13:50:39', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165567ce2390002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:39:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165567d3c880003', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 16:39:32', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165567d6dfa0004', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 16:39:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165567d8afb0005', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 16:39:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d50165568110a60006', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 16:43:43', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d5016556bad3310007', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 17:46:48', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a59eed20008', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 10:39:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a5a5da60009', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 10:39:56', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a88e252000a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 11:30:44', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a90be44000b', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 11:39:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a93e242000c', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 11:42:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a9425ee000d', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 11:43:03', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655a946d11000e', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 11:43:21', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655aca9851000f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 12:42:31', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bea655562d501655b00c8bf0010', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 13:41:42', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8a808bf26545c1ea016545c2c2e20000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 10:41:56', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf26545c1ea016545cb1c530001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-17 10:51:03', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf26545c1ea016545cb595f0002', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-17 10:51:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf2655688880165568982e60000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:52:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf26556888801655699bd9b0001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 17:10:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf2655b0d7701655b0e4b310000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 13:56:27', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bf2655b0d7701655b1590750001', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-21 14:04:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb653b593201653b64e3380000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 10:23:12', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb653b593201653c28b7cb0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 13:57:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb653c43ef01653c4466110000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 14:27:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb653c43ef01653c5441ae0001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-15 14:44:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65404f1a0165405124ab0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 09:19:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65405f320165405fbd9c0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 09:35:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65419127016541b7a5af0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 15:51:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6541e246016541e32bf80000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 16:38:51', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6541e7cc016541e815e50000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 16:44:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6541ec3f016541f11e970000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 16:54:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb654202ee016542047b280000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-16 17:15:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6545602401654566ede70000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 09:01:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6545c260016545c2d1bd0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 10:42:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6545c260016545eac0b90001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:25:37', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6545c260016545eb12160002', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:25:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6545c260016545eb16af0003', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 11:25:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65467d900165467e20fb0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 14:06:35', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65467f5d01654680250f0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 14:08:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6546b9e8016546ba3f5e0000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 15:12:15', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6546b9e8016546eb99240001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 16:06:09', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6546f23501654712bf710000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-17 16:48:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb65554dc80165554e55230000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 11:08:41', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a0165556e02c60000', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 11:43:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a016555e2f0a30001', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 13:51:00', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a016555e3437c0002', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 13:51:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a016555e45f040003', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 13:52:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a016555e863b90004', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 13:56:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a0165567cddac0005', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 16:39:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a0165567d4bec0006', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-20 16:39:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8a808bfb6555662a016556a565190007', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-20 17:23:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8b7122d4-05bb-4e46-b5fe-50c954b42ce9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 08:39:59', '10.0.12.19');
INSERT INTO `sys_logs` VALUES ('8c29e272-ad83-4b5e-af9e-71d1f74de80c', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:52:33', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8ca35c3b-7b94-4b50-8bf6-bad7748e3ffe', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:19:24', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('8d201ab9-3909-4a93-8440-1521cb4b9b6a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:56:06', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('8d6752ed-533e-4727-8545-6d4e938e678c', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:11:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8d84a2a8-8920-4a7d-bf87-82dbe5746477', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 15:32:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8da45231-7c73-4e2d-90b9-9868fb74f075', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-22 10:10:54', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('8e442fbf-29b2-4092-ae7d-45d1a5889ba4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:59:42', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('8e6c3bef-1a44-4451-bd29-3d4f71e8883a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:50:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('8f70a0a1-ebf0-4a08-8965-6674cac476bc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 10:07:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('90aed527-4e0a-4f06-a9f9-c62f30fbadfe', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:53:22', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('91638e00-90d5-4020-94cd-0e33aa84fed4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:08:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('91a7e361-03ee-42f4-9a8e-509afbcb1fa5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 08:39:01', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('922288ba-18c7-47b7-bfcf-6404557df2f4', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:18:32', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('92e5eb2a-4de4-4ede-8e21-03e43191dfa7', 'test6', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:22:18', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('93306278-3fa3-4173-9153-03efd3bf01d9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 15:58:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('9458f7d7-7007-4215-ac42-399ece97c39d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 16:53:52', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('945c84d6-5a87-4565-b83b-f0b95f429b87', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-24 09:10:26', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('94c490e58a914f6a80acb1f053d547c5', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 17:05:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('952527bc-ce6b-4566-9d0b-19915d24c8f8', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:51:28', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('953976a7-aa2e-4f15-a0cc-6b81a18749a4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 16:38:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('95632eb2473846b1a6b09cadfd03881f', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:11:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('95da0285-d34c-45d5-8fbb-4472a123c933', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:28:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('95eafd29-73a1-424b-b43a-bea323ee66c0', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:25:05', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('95ed8210-107f-463c-906a-01e086d1cd9e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:36:44', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('96411d25-b281-47aa-8357-95651ff3376a', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:00:59', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('9674304a-e27f-4969-9496-325ae872a014', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 13:41:37', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('96d5a3ba-b127-4ab4-b180-3d496c6ab580', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 16:37:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('982d35a1-050a-495e-88dc-f4c7a087e332', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 13:41:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('986a37f4-2ada-4890-906e-0d3733e00f22', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 14:47:34', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('98e78650-991b-4419-8844-7f8fedb5a2ab', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:13:39', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('99d2b7e7-216c-4bf1-8f6a-db8382e842b9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 08:56:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('9b1cc699-0186-49ab-b822-13709cde8e77', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 11:08:51', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('9b6f374f-6577-4e4e-9c48-1e9a212f9155', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:07:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('9ba430b0-d4c5-45d4-b7af-b86231f2f786', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 09:14:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('9bbf2f9f-1900-47c0-91f3-1d0e6c1aa424', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:00:29', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('9bf88c74-3fe7-4bc6-9037-4e69315278a6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:48:43', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('9d4395f4-bc18-4dba-b75c-59fe5fa4092b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 09:40:21', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('9e1f030f-0d5b-492c-b56c-0b76a1e97f99', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:47:17', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('9ebf3c1c-e50a-4d29-bc33-13bb12ccba7b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:46:58', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('9eeaaeee-e92f-4276-959b-95e62707c8c6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:50:40', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('9eeb7f8b-23c7-45e5-849d-8ca104884793', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 14:39:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a08d2ac1-6db2-4783-92ab-0b8dcb6197d8', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:29:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('a20ab853-9a0d-4347-b303-4389b58e36a5', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:08:28', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('a2927db0-c30f-40fa-b2be-82c7bd6ad04e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 11:44:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('a3433b7b-8d9e-40a4-888a-957f2d0bffa2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:07:19', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('a3768653-216f-4d81-aeaf-a2ae60b104eb', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:04:16', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('a43d0ded-5c6c-4c55-92f6-dc2994a94d5c', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:03:53', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('a47b2b96-992f-4a28-802a-5967c8b6845a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:01:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a51064bf-6f42-4313-9e83-f27290c0f8a6', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:24:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a532e234-d06b-4ec9-8d7b-a79e75d0a7d3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 10:52:54', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('a5b9fc3b-2b21-4664-886b-cdd60b56e5ed', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:08:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a6bd1e69-e9ac-4d83-a119-fa9b560acacc', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:47:53', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('a6e8d0d7-f693-4e05-ad39-52a8a1d5852a', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:21:56', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a7ac608d-ba1e-4bb9-bf59-cf33a5403cea', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:28:41', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('a7ec7ecd-d52e-4a32-b529-873403486ac0', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 17:27:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a87b41c5-aca5-4d75-9d45-5aeec300e849', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 11:17:02', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a9789ab6-3ad9-4cf2-ba89-188983fafab8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:18:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('a9cbf250-2a1c-46da-aa12-ded560a3c6ab', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:07:54', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('aa2144db-1c4f-40fd-96e9-ba0312b72bd8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:34:17', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('aa2d3780-c551-4cbe-bae1-0398ac305da2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:24:22', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('aab36664-06b1-4f75-a959-5a6181675bd2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-02 22:03:32', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('aad0dab5-8c47-487d-9f0b-24a185d85c9e', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-29 14:07:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('ac8f0d21-be46-49f9-be0a-60289ac958b0', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-02 23:34:31', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('ad401c0e-681c-435d-833f-e06b4780efdc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 13:59:20', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ad67cad4-2728-4d9c-a232-24fa5f0b96fd', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:53:47', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('adcb391f-52f3-4eca-a604-119731b49c62', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:00:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('aecace3f-c277-4769-8a70-f79c97b5ff49', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:39:00', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('aee60f4b-38d4-42ec-a51b-a686eca6343b', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:22:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('afedf9f7-9d72-484f-98ce-941e68cb455a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:16:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b06b85a5-6dae-4073-b461-9e2bc9b50157', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:00:04', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('b0db361a-a528-4fb4-adfb-e60f91d0669c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 17:16:49', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('b11505c2-e4a8-4903-b014-f63e13b1059c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 13:42:24', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b1472c09-d577-40d6-9b9e-be4891ccb699', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 13:41:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b155629c-8c48-4c66-be5f-5cf22ad3f62b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:18:03', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('b1634b4e-084f-4e50-9264-61b78d3cb38a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:11:22', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b26069aa-71b4-4e66-900a-797b464a45c7', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 09:54:59', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('b28a57d6-a2a0-4813-98ad-54856c683c65', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:15:39', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('b2a2a209-576a-47f6-9b31-1b1bcb454e7e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b303d73a-ce42-46a8-9e42-45440ffd9e6c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 12:18:02', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('b3f48308-0473-4e6f-a271-b16bee7733b6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 17:28:02', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('b4130039-23e2-4b5b-90e8-b1f229042178', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 11:27:43', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b46092af-9754-4591-862e-fd607a884e3a', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:08:38', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('b4fc7c82-b49a-4d29-aa19-c0206a61f9ff', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:00:21', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b4fdea15-3caf-4c65-a09d-feaa6cb7a2a0', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:01:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b5714376-2476-4fa1-a70a-74729de5aac7', 'test7', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:22:26', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('b600afee-f135-4291-ab50-e51f82a60e09', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:41:59', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b6866e34-fd39-47dc-b197-bf0ee6f3cb54', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:52:02', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('b70ee760-2add-474d-a394-ac23c4a2f837', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:34:35', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('b7370c60-feb3-4dc8-85ee-3dfc5c03e2e5', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:19:40', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('b7379f7f-73f8-4c17-980d-7f2393577451', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 13:42:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b7908ef8-4ab7-4752-84b6-df1cf05be50d', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:02:07', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b8eb049c-bde2-4251-b258-097b4b854736', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:13:39', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('b981f6dc-617b-451c-a590-e0771ee1c111', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 11:25:17', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b99be84f-bf9e-4a40-9611-129b0e24a145', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:44:39', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('b9a6ed03-efa6-49f7-9084-cf75de40619c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 10:57:22', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ba92c0d2-9b68-4724-a77e-8d8b3cbc05af', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 17:09:14', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('baff240d-0131-4522-b437-6ae99ed0d34b', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:27:45', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('bb0c2ec3-6220-46f7-ad65-241ac46823bb', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:41:08', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('bb1dba36-be5f-4bbf-a9aa-5f765baec332', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 14:42:55', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('bbb0e338-bdc0-43fc-8618-0c0af8de1c6f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 17:32:31', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('bbf6f750-5d0e-4018-b64f-b56811bc9bc5', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 11:24:19', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('bc11bba4-b6c0-45e3-9ef4-b6246de3a661', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:34:29', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('bccfa38a-dc5e-4124-a74d-a6d29eec8903', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 14:29:49', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('bd14af92-5ad1-44f3-b80d-9f48e0715f68', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:41:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('bd98d249-71c5-44b7-b72a-76b1dc070d4a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 10:53:15', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('be568361-9b8f-40ca-a356-06c8b3abec9f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:53:18', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('be5a33c7-a1cd-4546-89a7-035086f95df7', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:57:40', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('be7ef567-9136-4cc4-a758-23ccdefc437e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 09:30:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('be7f6d3b-1d7a-4162-ae74-a3912e2e0b97', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:19:35', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c003c915-3f53-4c53-a631-06dbd994fb96', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 12:43:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c09ac828-d43d-4c19-b15f-05194c4478d8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:59:26', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c0a8764e-9102-482d-bf90-5269aeacd7c2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:06:35', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('c0d388c9-492a-4163-8fd0-0cc6ede89161', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:12:41', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c14830c7-a7d7-434e-801f-972a481e6c37', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 09:47:23', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('c2679bfe-bb77-4f55-b82f-28e4cf8a4df1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:01:37', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('c300595e-d4f9-4481-b423-94820a22fbfe', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:29:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c3624267-98e7-4622-a481-47faee8394c2', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:23:40', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('c45bcbb2-722f-45e1-9309-2ec81d293881', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:42:41', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('c4785b67-9497-4ff3-9f84-a1a3846c545d', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-22 09:43:10', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c489a899-5707-4135-b730-36f0d0018d85', 'test5', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:19:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('c562d1f7-5a4a-49c3-9605-41e9e04ba5c1', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:59:13', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c59b91ea-d828-4fd6-af3f-0199b9b817f1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-22 09:43:07', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c60c4c5e-3166-4c30-a091-05b7ce14fe7c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:54:14', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('c62a4e75-0a35-489f-b31b-fdf5ee551ac8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 11:57:47', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('c7884689-668f-4f2f-aded-f778dc5f3956', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 08:53:34', '10.0.12.19');
INSERT INTO `sys_logs` VALUES ('c78a6a7d-056c-48a3-9897-220511a13c54', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:57:00', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('c7f59f9f-e3ce-48fb-a5b4-709defa02f58', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 13:58:17', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('c8d0476c-f803-4b85-8ddf-5a54950bb1cd', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:44:16', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('c8d64cb8-a665-44e4-b24c-e1004f140260', 'test7', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:29:28', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('c90cc10d-cb3f-43c3-b7be-ee6d59f8164d', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:07:31', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ca2fac22-2b7e-45f6-bab0-3d98b3d421e4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 15:53:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('cacd1e84-c8ef-4f25-957a-bc4b5fa5f9a1', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:25:05', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('cb4aa7fa-a0af-4655-91a2-d3ae7d5d748c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:45:04', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('cc5e78b0-4ca7-4e77-8eac-39d126e67752', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 15:03:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('cc7d29d6-85b8-4d04-a303-f83f921b598a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 15:01:58', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('cca10438-48ba-47b3-a303-800485f7da43', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:40:11', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('cd5ee426-014c-4f33-9390-2139b17bf75d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:25:32', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('cd77ebcb-fca4-44ea-ae79-f7600f3e16cd', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-04 09:48:42', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('ce23d89a-d29c-45b6-b66f-a5b2ca1cfb66', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:01:39', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ce41e924-fd79-44cc-bb90-00e3bceaa1d1', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:56:49', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('cf8f28f9-018e-4f10-bf26-b763e00010ed', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 09:27:12', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('cfdd4345-e447-40cf-aba2-21f07fe661f1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 10:13:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('cfe4ad6a-0d6b-49b9-90fe-005241988b37', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:29:02', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d05243a5-a0be-4f6d-8820-8f77a56b9759', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:28:22', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d0c32d56-4d27-4382-9d25-14deec8ecbfc', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:21:48', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d0caa118-3b2e-40bf-a662-92a139840f2b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:20:08', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('d12af766-adc7-47b5-bb3b-164f72b396d5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:37:52', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d1825a88-4131-4096-822c-c54f7d293605', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:43:55', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d190a2bf-123a-4ea2-ab4d-2086166dba23', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 15:59:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d1dcc338-0d9d-40bf-8326-7723a60daccf', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:39:11', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d2289ff9-cff5-4e5e-b482-82c45bbaae98', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:09:21', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d35064d4-e2c6-4d61-b271-ab61f8c06fec', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:55:40', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d3a7ce57-f769-418b-8ff4-6e8833bf5a08', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:04:05', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d428312a-bd6e-4270-9974-12804f96a7b4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-02 23:39:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d429475d-aee7-47e0-b2fa-d4b86dc299b8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:13:29', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('d52fc867-73f7-430b-8755-3e0f15f248cc', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d53fb593-10e2-48d4-a580-c8c0a7b93e5c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:09:01', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('d616c66f-c04a-40c2-8269-39b34950f7d8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:55:51', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('d62052e6-43ad-4e47-a3e1-d46df996918d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:00:40', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d66fe56e-d6be-4b63-8982-8f6755f84341', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 11:18:54', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('d69d5f3d-9d18-4351-9cf5-20a9c32cd5a8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:24:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d6d029e9-b2a0-4b6e-8347-53503b78ce60', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:39:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d7b963e7-778b-4080-b782-bde62fc5ba44', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 18:33:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d7ea2d03-5e28-4947-a882-59dfcc0e2499', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 11:25:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d8317076-a629-4c0d-b3a1-4fcbd6e634f3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 13:41:06', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('d8667a63-87f7-457f-9157-987922b8f01a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 16:56:31', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d912bb3a-8a37-4d83-968f-16e18cdd09cb', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:58:15', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d947de4e-4577-42e7-b3c4-88e9c3fa7707', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:48:10', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('d95561c1-04f8-4af6-8b12-23b5178286c5', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 13:52:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d9568e59-14c5-496b-a868-65ea7a622a00', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:41:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d96fce2e-f0b9-49ed-adde-798cb0ee2f09', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:38:50', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('d9b0a464-c6fd-4e84-a993-246ff9fb7f97', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 14:46:00', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('da53c643-2d4f-4c81-b03b-5c2bb4be5f52', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-04 09:49:40', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('dac03fb8-ec9a-41b2-b793-c116421eb415', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 11:30:46', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('dacfff8e-88ec-4672-a298-23e93e139002', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 15:35:31', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('dae96df6-dcf0-476b-8168-103660739f14', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:29:07', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('db4f3b3e-7978-4d5d-83cb-cb9cd8e44320', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:10:52', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('dc02df6b-c3a7-446a-a280-2f225dc68a63', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:25:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('dc1c21c5-66cf-4c54-9940-0b702cc96d84', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 10:06:24', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('dc3c7c23-1e49-4353-8b7b-f9aa9572946d', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:04:26', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('dc7355e1-b0f1-496a-84aa-d8b23745030a', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 16:28:08', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('dd8446a0-5af6-4668-a48d-e14e8a55afc9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:01:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('de1867e8-844a-499b-881e-7dfe9abfb284', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:48:04', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('df479dfd-53a9-405d-b72b-cd1d846e4e9e', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-31 10:29:25', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('e018e2e4-5988-44e0-ac8c-cdbb49b843a8', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:52:34', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e0b2cf8b-a5f0-4807-9585-7f8d2058114a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 10:15:57', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('e15022fe-7918-4a73-83c4-880810e7fbdf', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:52:56', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e27c2d05-f82a-441a-b5d8-369b735abe9c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 08:59:19', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('e2a17181-26e9-4b73-b2c6-a6e431cdb8c1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:39:08', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('e2c1a2e5-8a62-47cb-8c2a-f3bc246cceb4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:53:33', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('e342c70a-cdcb-4991-a48e-524211d5bcab', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 17:04:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e3846721-169b-4853-9848-0a9daf89abfd', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:23:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e426af0f-acc2-4705-9b39-caa932a08362', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 09:39:01', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e5ad5075-66f1-4186-bb6d-5657de3f7ee8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-10 09:21:14', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e6ab1422-56bf-445e-a201-b0103b200599', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 14:29:51', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e6b32313-b5b2-4a29-939e-359ad4bae0e2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 10:54:55', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('e7cb2142-e499-4adb-a5ff-96bb04bd3f45', 'admin', null, '资源类型', '/statistical/subscriber', '1', '资源类型', '2018-08-23 09:52:04', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e7e7d5b2-5c9d-4b86-b8e2-40b14079b734', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:20:40', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('e7f34c85d4cd4f1b9a269a7bd428a036', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 17:26:49', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e8d19312-99f4-4e25-9436-e7e7de60d5f9', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 11:08:13', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('e9a91c26-6f3b-40a3-a4e9-7ff055832ea4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-04 14:28:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('e9b4b92b-6b56-4a59-ba4c-140900c3de29', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:20:23', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('e9c02bc7-7f6b-4725-9743-f6d39181d29c', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:14:19', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('e9c97e4d-7379-4688-aa0f-91328510c159', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:10:28', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('eaabc8ff-8bf5-4bc8-ad5c-808d2c0eee77', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 14:06:11', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('eacb71b6-dce2-47d9-8ed9-af985134c2c8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:55:28', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('eb36fff4-ea60-4c90-9622-e7835e8b08ce', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:37:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('ebbd8730-f408-42eb-9b5a-d763ade7b90e', 'test1', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 13:48:31', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('ec42dba1-add7-4f0a-893f-338e76fdb407', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-30 09:40:06', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('ec643ac4-f8a6-48b4-afe3-0961b0fd1143', 'test3', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:11:51', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('ece071f8-794b-4bf2-b38d-d7aca3bd61c4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 13:57:14', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('ece7cbdd-5d02-4342-a453-899a941c5753', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 11:02:28', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('ecf9a4ee-1974-40a0-a201-c7e56f1f811c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:10:45', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('edac349a-07d1-44c7-ad07-e56ed1938949', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:22:01', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('ee155e254ae14244992588c141212851', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-08 16:06:10', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('ee781f5e-2a92-4f87-94a0-b1e502254aea', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 17:39:15', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('eeb732f6-5408-43ee-8f11-0600fd54d51e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 09:10:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ef219918-23fb-4a0e-a3f0-f6e4549d4d7e', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:40:16', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('ef9097f4-35c7-45a7-aa2a-15e83f3e1340', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-07 13:34:58', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f03b3bf3-2546-40be-8918-c7eb5499096b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 10:06:07', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f05f63ec-1002-42a5-88ba-ef8bf08dceb1', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 14:18:23', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f06a57a1-a1cd-4cc8-b1fe-e1219d185154', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 15:29:42', '10.0.11.118');
INSERT INTO `sys_logs` VALUES ('f0b88e45-dcdf-40dd-aed7-dea603474996', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:40:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f0f5d41a-ab62-4f99-8400-f3634e385f97', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 08:57:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f129b8ea-5b3c-41b1-9308-846221b37d18', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 16:48:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f167f562-086a-411b-8c8a-d79e91e679a0', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-09-03 14:05:14', '10.0.11.39');
INSERT INTO `sys_logs` VALUES ('f33bc0a8-f9d9-4d2e-9ebe-f45faa3112f6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:05:38', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('f3af94c1-07a9-4b8d-a8f9-abe6cf501314', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 13:35:39', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('f3fb8fe9-3d7f-4256-9505-36d9e2c93ca8', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:00:30', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f43aee2c-64f9-4e18-aeb3-3a2f11f83dd7', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 17:18:01', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f55327f0-7e09-46d2-9062-dd9973984893', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 16:59:18', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f5d3b7dc-6b42-4a1c-ae92-4686cac31393', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 15:04:17', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f617d678-d841-4de4-be98-d2d997ae5492', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-01 10:56:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f652b042-efe6-4244-9ffd-cda632d3d0d8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 15:49:25', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f6758f0b-55d8-4fc3-ac3c-7a4d0b67ff6a', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 13:47:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f67b5e06-21ab-447b-9aa4-1e24ebd0c4f9', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:50:27', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f69f25a8-401e-4177-8c61-4b267b90e4b2', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-28 09:27:05', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f6b075fc-4c37-4500-a990-75720dc07861', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 09:57:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('f77ed263-bc61-42d7-8c51-5d8f03a8c486', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 16:21:27', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f853a2ce-7fcc-4034-9788-d1d38d41c261', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:27:38', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f8a0abe6-5b73-47e2-8277-653929b369a3', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-21 16:12:05', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f8aa9ff3-8564-4d41-8873-491d70377faa', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-23 14:52:12', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('f8ecfcd1-3866-49a3-8fb6-33531f4ae1e4', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-24 09:51:20', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('f9ecbc8d-f2bc-4a2c-a2e8-43919ec7aff8', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 08:55:44', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('fa7c7037-538d-4353-b848-6819843a88a0', 'test4', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:26:11', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('fb8b26b1-a391-4b7d-86cd-8e052ce7f19d', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-05 09:34:23', '10.0.11.114');
INSERT INTO `sys_logs` VALUES ('fba8d1e1-a201-4d25-a717-c613dc9b262b', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 15:28:57', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('fc529c2a-2568-4623-ade9-7a74429d379f', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-29 15:13:36', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('fc6bfc80-4ca4-4858-8e75-a002c96a6d71', 'test2', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 14:24:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('fcbfd1a0-a194-4bb8-8e6a-ff9615181434', 'admin', null, '资源订购统计', '/statistical/subscriber', '1', '资源订购统计', '2018-08-23 11:07:45', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('fce624d7-c818-4280-83a8-fb6f2e16d239', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 14:26:19', '10.0.11.106');
INSERT INTO `sys_logs` VALUES ('fcff411f-8e8b-474f-a094-204071acd11d', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 15:35:59', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('fd1efe4d-5332-4d78-8d2a-144f914b6398', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-03 15:21:09', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('fd4ba98e-ac99-4f10-ba45-908e6b92ade6', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:05:29', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('fde658a4-2f02-4826-926c-d04d72c23a5c', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-09-06 17:38:33', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('fe7f847d-39fa-4152-90f5-6e94446b70bf', 'admin', null, '资源订购统计', '/statistical/subscriberInfo', '1', '资源订购统计', '2018-08-23 17:00:52', '127.0.0.1');
INSERT INTO `sys_logs` VALUES ('febce662-215d-4671-b6d1-f04c34e5dc20', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:37:39', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('fed0194e-7ca3-4097-9a5a-6ad01d0ce605', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 09:36:53', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('fefb23b8-e043-431a-a7b1-8fceccb2af7e', 'admin', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-31 10:49:47', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_logs` VALUES ('ff1d4b9e-7127-4588-abbf-39575a78cea3', 'kirswu', null, '用户登录', '/loginindex', '1', '用户登录', '2018-08-30 11:09:06', '10.0.11.123');
INSERT INTO `sys_logs` VALUES ('ffd2bedad05241f4b2e8ad076be4c312', 'admin', '', '用户登录', '/new/loginindex', '登录', '用户登录系统', '2018-08-29 16:41:57', '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for sys_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module` (
  `id` varchar(36) NOT NULL COMMENT '主键id',
  `module_name` varchar(36) DEFAULT '' COMMENT '模块名称',
  `parent_id` varchar(36) DEFAULT '0' COMMENT '父级id',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `action` varchar(100) DEFAULT '' COMMENT '访问地址',
  `role_id` varchar(36) DEFAULT NULL COMMENT '关联角色id',
  `level` int(1) DEFAULT '1' COMMENT '级别',
  `tree_level` varchar(30) DEFAULT '' COMMENT '树的层级',
  `module_order` int(11) DEFAULT '1' COMMENT '三级菜单排序',
  `icon` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='1.parentId是父级id\r\n2.ordernum是整个表的排序\r\n3.action是菜单 的路径\r\n4.level是菜单 的级别\r\n5.treelevel是一种树形的字符串结构如 一级001，二级001001，001002，三级001001001,001001002\r\n6.module_order主要用于每一个级别的排序，必须从1开始\r\n';

-- ----------------------------
-- Records of sys_module
-- ----------------------------
INSERT INTO `sys_module` VALUES ('1', '我的工作台', '0', '1', '/module', '', '1', '001', '1', 'icon-home');
INSERT INTO `sys_module` VALUES ('10', '数据库管理', '5', '10', '/database/grid', null, '2', '005001', '1', null);
INSERT INTO `sys_module` VALUES ('100', '基础数据管理', '0', '7', '', null, '1', '100', '1', 'icon-comments-alt');
INSERT INTO `sys_module` VALUES ('1001', '套信息维护', '100', '1001', '/coverinfo/list', null, '2', '100001', '1', null);
INSERT INTO `sys_module` VALUES ('1002', '户号维护', '100', '1002', '/acount/list', null, '2', '100002', '2', null);
INSERT INTO `sys_module` VALUES ('1003', '代理公司维护', '100', '1003', '/corporation/list', null, '2', '100003', '3', null);
INSERT INTO `sys_module` VALUES ('11', '数据库收录品种管理', '5', '11', '/database/varietyManagementList', null, '2', '005002', '2', null);
INSERT INTO `sys_module` VALUES ('111', '数据库收录品种管理列表', '11', '31', '/database/varietyManagementList', null, '3', '005002001', '4', null);
INSERT INTO `sys_module` VALUES ('12', '数据库订购管理', '5', '12', '../database/orderManagementList', null, '2', '005003', '3', null);
INSERT INTO `sys_module` VALUES ('121', '数据库订购管理列表', '12', '30', '../database/orderManagementList', '', '3', '005003001', '3', null);
INSERT INTO `sys_module` VALUES ('13', '数据库附加文档管理', '5', '13', '../database/additionalDocumentManagementList', null, '2', '005004', '4', null);
INSERT INTO `sys_module` VALUES ('131', '数据库附加文档管理列表', '13', '32', '../database/additionalDocumentManagementList', null, '3', '005004001', '5', null);
INSERT INTO `sys_module` VALUES ('2', '资源荐购', '0', '2', '', null, '1', '002', '1', 'icon-desktop');
INSERT INTO `sys_module` VALUES ('20', '数据库管理列表', '10', '20', '../database/grid', null, '3', '005001001', '1', null);
INSERT INTO `sys_module` VALUES ('21', '新增', '10', '21', '../database/add', null, '3', '005001002', '2', null);
INSERT INTO `sys_module` VALUES ('22', '荐购清单', '2', '25', '../resourceRecommend/list', null, '2', '002001', '4', null);
INSERT INTO `sys_module` VALUES ('23', '新增荐购', '2', '22', '../resourceRecommend/add', null, '2', '002002', '1', null);
INSERT INTO `sys_module` VALUES ('24', '用户管理', '9', '36', '/user/list', null, '2', '009001', '1', null);
INSERT INTO `sys_module` VALUES ('25', '角色管理', '9', '37', '/role/list', null, '2', '009002', '1', null);
INSERT INTO `sys_module` VALUES ('251', '角色列表', '25', '371', '/role/list', '', '3', '009002001', '3', null);
INSERT INTO `sys_module` VALUES ('252', '添加角色', '25', '372', '/role/add', '', '3', '009002002', '4', null);
INSERT INTO `sys_module` VALUES ('261', 'Tasks', '26', '261', '/task/list', null, '3', '009003001', '5', null);
INSERT INTO `sys_module` VALUES ('262', 'Members', '26', '262', '', null, '3', '009003002', '6', null);
INSERT INTO `sys_module` VALUES ('263', 'Comments', '26', '263', '', null, '3', '009003002', '7', null);
INSERT INTO `sys_module` VALUES ('27', '日志管理', '9', '39', '/log/list', null, '2', '009004', '1', null);
INSERT INTO `sys_module` VALUES ('271', '日志列表', '27', '271', '/log/list', null, '3', '009004001', '8', null);
INSERT INTO `sys_module` VALUES ('28', '参数管理', '9', '40', '/param/list', null, '2', '009005', '1', null);
INSERT INTO `sys_module` VALUES ('281', '参数列表', '28', '281', '/param/list', null, '3', '009005001', '9', null);
INSERT INTO `sys_module` VALUES ('29', '用户列表', '24', '41', '/user/list', null, '3', '009001001', '1', null);
INSERT INTO `sys_module` VALUES ('3', '荐购分配', '0', '3', '', null, '1', '003', '1', 'icon-list');
INSERT INTO `sys_module` VALUES ('30', '添加用户', '24', '42', '/user/add', null, '3', '009001002', '2', null);
INSERT INTO `sys_module` VALUES ('301', '荐购遴选', '3', '301', '/selection/recommended', null, '2', '003001', '1', null);
INSERT INTO `sys_module` VALUES ('302', '审核分配', '3', '302', '/selection/toAuditAssignment', '', '2', '003002', '2', '');
INSERT INTO `sys_module` VALUES ('31', '组织架构', '9', '43', '/organ/list', null, '2', '009006', '1', null);
INSERT INTO `sys_module` VALUES ('32', '荐购初审', '2', '23', '/resourceRecommend/firstTrial', null, '2', '002003', '2', null);
INSERT INTO `sys_module` VALUES ('33', '荐购复审', '2', '24', '/resourceRecommend/secondTrial', '', '2', '002004', '3', null);
INSERT INTO `sys_module` VALUES ('4', '订单处理', '0', '4', '', null, '1', '004', '1', 'icon-credit-card');
INSERT INTO `sys_module` VALUES ('402881e4651cc2e801651cc493e80001', '批量删除', '25', '373', '/role/del', null, '3', '009002003', null, '');
INSERT INTO `sys_module` VALUES ('402881e465214b520165214ef3b10003', '批量删除', '24', '44', '/user/del', null, '3', '009001004', null, '');
INSERT INTO `sys_module` VALUES ('402881e46545ff7d016546031d1a0001', '添加套信息', '1001', '1', 'coverinfo/add', null, '3', '100001001', null, '');
INSERT INTO `sys_module` VALUES ('402881e46545ff7d01654603b1360002', '删除套信息', '1001', '2', 'coverinfo/del', null, '3', '100001003', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522ea90530001', '单条荐购', '23', '1', '/resourceRecommend/singadd', null, '3', '002002001', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522ed1a420002', '批量荐购', '23', '2', '/resourceRecommend/batchAdd', null, '3', '002002003', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522ee43540003', '荐购初审列表', '32', '1', '/resourceRecommend/firstTrial', null, '3', '002003001', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522f077ca0004', '审核', '32', '2', '/resourceRecommend/oneTrial', null, '3', '002003003', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522f35d130005', '荐购复审列表', '33', '1', '/resourceRecommend/secondTrial', null, '3', '002004001', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522f3d7590006', '审核', '33', '2', '/resourceRecommend/twoTrial', null, '3', '002004003', null, '');
INSERT INTO `sys_module` VALUES ('402881eb6522ea30016522f721c30007', '建构清单列表', '22', '1', '/resourceRecommend/list', null, '3', '002001001', null, '');
INSERT INTO `sys_module` VALUES ('402881f364821184016482133e500001', '列表', '24', '43', 'test1', null, '3', '009001003', null, '');
INSERT INTO `sys_module` VALUES ('411', '订购管理列表', '41', '44', '../orderManagement/list', null, '3', '004001001', '1', null);
INSERT INTO `sys_module` VALUES ('412', '添加', '41', '45', '../orderManagement/add', null, '3', '004001002', '2', null);
INSERT INTO `sys_module` VALUES ('42', '订购审核', '4', '44', '/orderManagement/orderAudit', null, '2', '004002', '1', null);
INSERT INTO `sys_module` VALUES ('43', '续订停订', '4', '46', '../orderManagement/continuedOrder', '', '2', '004003', '2', null);
INSERT INTO `sys_module` VALUES ('44', '年度订单', '4', '47', '../orderManagement/annualOrder', null, '2', '004004', '3', null);
INSERT INTO `sys_module` VALUES ('49f3384f-54f9-4843-8aab-4d8ff1dbc7e2', '资源修改评审', '6', '4', '/dataMaintain/toUpdResReview', null, '2', '006004', null, '');
INSERT INTO `sys_module` VALUES ('5', '数据库管理', '0', '6', '', null, '1', '005', '1', 'icon-cogs');
INSERT INTO `sys_module` VALUES ('50', '资源管理', '9', '44', '/auth/list', null, '2', '009007', '1', 'icon-group');
INSERT INTO `sys_module` VALUES ('5f639168-3566-446c-820d-1ea0b05f50ee', '驳回', '49f3384f-54f9-4843-8aab-4d8ff1dbc7e2', '2', '/dataMaintain/refusalReview', null, '3', '006004003', null, '');
INSERT INTO `sys_module` VALUES ('6', '订购管理', '0', '5', '', null, '1', '006', '1', 'icon-bookmark');
INSERT INTO `sys_module` VALUES ('61', '订购管理', '6', '61', '/dataMaintain/maintain', null, '3', '006001', '1', null);
INSERT INTO `sys_module` VALUES ('62', '资源信息维护', '6', '62', '/dataMaintain/resourcesMaintain', null, '3', '006002', '2', null);
INSERT INTO `sys_module` VALUES ('63', '订购信息维护', '6', '63', '/dataMaintain/subscribeMaintain', null, '3', '006003', '3', null);
INSERT INTO `sys_module` VALUES ('7', '统计分析', '0', '8', '', null, '1', '007', '1', 'icon-comments-alt');
INSERT INTO `sys_module` VALUES ('71', '资源订购统计', '7', '71', '/statistical/subscriber', null, '3', '007001', '1', null);
INSERT INTO `sys_module` VALUES ('72', '资源到货统计', '7', '72', '/statistical/arrival', '', '3', '007002', '2', null);
INSERT INTO `sys_module` VALUES ('73', '工作量统计', '7', '73', '/statistical/workload', '', '3', '007003', '3', null);
INSERT INTO `sys_module` VALUES ('74', '资源分析', '7', '74', '/statistical/analysis', '', '3', '007004', '4', null);
INSERT INTO `sys_module` VALUES ('75', '年度统计', '7', '75', '/statistical/annualStatistics', null, '2', '007005', '5', null);
INSERT INTO `sys_module` VALUES ('8', '经费管理', '0', '9', '', null, '1', '008', '1', 'icon-laptop');
INSERT INTO `sys_module` VALUES ('81', '预算管理', '8', '81', '/fundManage/toBudgetManage', null, '2', '008001', '1', null);
INSERT INTO `sys_module` VALUES ('82', '决算管理', '8', '82', '/fundManage/toCypherManage', null, '2', '008002', '2', null);
INSERT INTO `sys_module` VALUES ('83', '年度经费支出表管理', '8', '83', '/fundManage/toYearFundPay', null, '2', '008003', '3', null);
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522edd8be0005', '选择分配单位', '301', '1', '/selection/dist_unit', null, '3', '003001001', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f136ba0007', '同意', '302', '1', '/selection/assignAgree', null, '3', '003002001', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f1a0530008', '驳回', '302', '2', '/selection/assignRefuse', null, '3', '003002003', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f3dbfa0009', '同意', '42', '1', '/orderManagement/orderAuditAgree', null, '3', '004002001', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f489de000a', '驳回', '42', '2', '/orderManagement/orderAuditRefuse', null, '3', '004002003', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f63341000b', '续订', '43', '1', '/orderManagement/orderListAgree', null, '3', '004003001', null, '');
INSERT INTO `sys_module` VALUES ('8a808bea6521b4ea016522f6a69d000c', '停订', '43', '2', '/orderManagement/orderListRefuse', null, '3', '004003003', null, '');
INSERT INTO `sys_module` VALUES ('8cad98b6-3068-4db6-80e3-e46c328c69eb', '指标维护', '100', '4', '/quota/list', null, '2', '100004', null, '');
INSERT INTO `sys_module` VALUES ('9', '系统管理', '0', '10', '', null, '1', '009', '1', 'icon-user');
INSERT INTO `sys_module` VALUES ('f01de868-9af0-4780-ab80-3bd52de1ea7d', '同意', '49f3384f-54f9-4843-8aab-4d8ff1dbc7e2', '1', '/dataMaintain/agreeReview', null, '3', '006004001', null, '');

-- ----------------------------
-- Table structure for sys_notify
-- ----------------------------
DROP TABLE IF EXISTS `sys_notify`;
CREATE TABLE `sys_notify` (
  `id` varchar(36) NOT NULL,
  `user_id` varchar(36) DEFAULT NULL,
  `recommend_flow_one_count` int(10) DEFAULT '0' COMMENT '荐购初审',
  `recommend_flow_two_count` int(10) DEFAULT '0' COMMENT '荐购复审',
  `resource_flow_one_count` int(10) DEFAULT '0' COMMENT '荐购遴选',
  `resource_flow_two_count` int(10) DEFAULT '0' COMMENT '审核分配',
  `order_flow_count` int(10) DEFAULT '0' COMMENT '订购审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=greek;

-- ----------------------------
-- Records of sys_notify
-- ----------------------------
INSERT INTO `sys_notify` VALUES ('495e7428-30ed-422f-b121-bd9390a25b8c', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', '7', '0', '0', '0', '0');
INSERT INTO `sys_notify` VALUES ('599d9138-5df1-4b8b-a4ef-aaf7ebc3957c', '8d767d5d-45a6-42b6-bd68-b37ac1d97087', '0', '0', '0', '0', '0');
INSERT INTO `sys_notify` VALUES ('a24208f9-64ad-47fc-a7c1-b4d7e18a0129', 'f9054b59-6a13-4eba-a458-d1382170fba0', '0', '0', '0', '0', '4');
INSERT INTO `sys_notify` VALUES ('b7368700-f0a7-410e-aa4d-f5087de1bbc5', '1402ea58-f99c-405b-bc9b-d8778e042fc1', '0', '0', '0', '0', '4');
INSERT INTO `sys_notify` VALUES ('bd9e7953-8d21-4fc7-97e3-8cb43587566c', '402881f364a0f38c0164a0f529b00000', '7', '0', '0', '0', '4');
INSERT INTO `sys_notify` VALUES ('d266a160-5aea-4551-a25c-2504be92fc81', 'f46573d7-76d5-45a3-9037-d9ed91772134', '0', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for sys_organ
-- ----------------------------
DROP TABLE IF EXISTS `sys_organ`;
CREATE TABLE `sys_organ` (
  `id` varchar(36) NOT NULL,
  `organ_code` varchar(20) DEFAULT NULL COMMENT '机构代码',
  `organ_name` varchar(200) DEFAULT NULL COMMENT '机构名称',
  `pid` varchar(50) DEFAULT NULL COMMENT '机构类别',
  `create_time` varchar(22) DEFAULT NULL,
  `create_by` varchar(22) DEFAULT NULL,
  `update_time` varchar(22) DEFAULT NULL,
  `update_by` varchar(22) DEFAULT NULL,
  `tree_level` varchar(255) DEFAULT NULL,
  `is_del` varchar(1) DEFAULT '' COMMENT '删除标志，0正常，1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_organ
-- ----------------------------
INSERT INTO `sys_organ` VALUES ('402881e964a283ce0164a297c3f00000', 'D05', '医科', '402881f3648811d4016488124bc20000', null, null, null, null, '001005', '');
INSERT INTO `sys_organ` VALUES ('402881ed6531278d016531d9d6c20003', 'D06', '机械', '402881f3648811d4016488124bc20000', null, null, null, null, '001006', null);
INSERT INTO `sys_organ` VALUES ('402881ed6531278d016531da36780004', 'D07', '冶金', '402881f3648811d4016488124bc20000', null, null, null, null, '001007', null);
INSERT INTO `sys_organ` VALUES ('402881ed6531278d016531da7ef30005', 'D08', '标准', '402881f3648811d4016488124bc20000', null, null, null, null, '001008', null);
INSERT INTO `sys_organ` VALUES ('402881ed6531278d016531daba160006', 'D09', '计量', '402881f3648811d4016488124bc20000', null, null, null, null, '001009', null);
INSERT INTO `sys_organ` VALUES ('402881f3648811d4016488124bc20000', 'nstl', 'NSTL', '0', null, null, null, null, '001', '');
INSERT INTO `sys_organ` VALUES ('8a808bf264a0bef00164a0f31faa0002', 'D01', '化工', '402881f3648811d4016488124bc20000', null, null, null, null, '001001', '');
INSERT INTO `sys_organ` VALUES ('8a808bf264a0bef00164a0f529020004', 'D02', '中科', '402881f3648811d4016488124bc20000', null, null, null, null, '001002', '');
INSERT INTO `sys_organ` VALUES ('8a808bf264a0bef00164a0f58bc60005', 'D03', '中信', '402881f3648811d4016488124bc20000', null, null, null, null, '001003', '');
INSERT INTO `sys_organ` VALUES ('8a808bf264a0bef00164a0f78df00006', 'D04', '农科', '402881f3648811d4016488124bc20000', null, null, null, null, '001004', '');

-- ----------------------------
-- Table structure for sys_param
-- ----------------------------
DROP TABLE IF EXISTS `sys_param`;
CREATE TABLE `sys_param` (
  `id` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `is_del` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pid` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_param
-- ----------------------------
INSERT INTO `sys_param` VALUES ('1', 'quanbu', '0', '1', '全部', '0', null, null);
INSERT INTO `sys_param` VALUES ('402881876551c606016551e4b89a0001', 'orderType_one', '0', '3', '订购类型1', '8b808bfb64bsa28a0164dsae0bb10004', null, null);
INSERT INTO `sys_param` VALUES ('402881876551c606016551e551a40002', 'orderType_two', '0', '3', '订购类型2', '8b808bfb64bsa28a0164dsae0bb10004', null, null);
INSERT INTO `sys_param` VALUES ('402881876552452501655250ac850001', 'stopCause_one', '0', '3', '原因1', '8b808bfb64dsa28a0164dsae0bb10008', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525136a30002', 'stopCause_two', '0', '3', '原因2', '8b808bfb64dsa28a0164dsae0bb10008', null, null);
INSERT INTO `sys_param` VALUES ('4028818765524525016552519f980003', 'orderingMode_one', '0', '3', '模式1', '8b808bfb64dsa28a0164dsae0bb10005', null, null);
INSERT INTO `sys_param` VALUES ('402881876552452501655251e53f0004', 'orderingMode_two', '0', '3', '模式2', '8b808bfb64dsa28a0164dsae0bb10005', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525253380005', 'openRange_one', '0', '3', '范围1', '8b808bfb64dsa28a0164dsae0bb10006', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525294150006', 'openRange_two', '0', '3', '范围2', '8b808bfb64dsa28a0164dsae0bb10006', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525338f10007', 'currency_contract_CNY', '0', '3', '人民币', '8b808bfb64dsa28a0164dsae0bb10007', null, null);
INSERT INTO `sys_param` VALUES ('4028818765524525016552550ff70008', 'currency_contract_USD', '0', '3', '美元', '8b808bfb64dsa28a0164dsae0bb10007', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525578710009', 'currency_contract_GBP', '0', '3', '欧元', '8b808bfb64dsa28a0164dsae0bb10007', null, null);
INSERT INTO `sys_param` VALUES ('40288187655245250165525687c8000a', 'currency_contract_CHF', '0', '3', '瑞士法郎', '8b808bfb64dsa28a0164dsae0bb10007', null, null);
INSERT INTO `sys_param` VALUES ('4028818765524525016552572bbd000b', 'currency_contract_JPY', '0', '3', '日元', '8b808bfb64dsa28a0164dsae0bb10007', null, null);
INSERT INTO `sys_param` VALUES ('4028818765527197016552abf9480003', 'fundType_one', '0', '3', '类型1', '8b808bfb64dsa28a0164dsae0bb10009', null, null);
INSERT INTO `sys_param` VALUES ('4028818765527197016552acff860004', 'fundType_two', '0', '3', '类型2', '8b808bfb64dsa28a0164dsae0bb10009', null, null);
INSERT INTO `sys_param` VALUES ('402881e4651d639601651d64e3da0001', '11111', '0', '2', '测试1', '1', null, null);
INSERT INTO `sys_param` VALUES ('402881e4651d639601651d652c0b0002', '222', '1', '3', '测试2', '402881e4651d639601651d64e3da0001', null, null);
INSERT INTO `sys_param` VALUES ('402881e964a198080164a225e82e0000', 'C01001', '0', '2', '遴选指标', '1', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531d437016531db41270001', 'C003004', '0', '3', '不推荐购买', '8a808bfb64daa28a0164daac7c820000', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531d437016531e179740002', 'state_publication_active', '0', '3', 'Active', '8a808bfb64daa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531d437016531e25bb70003', 'state_publication_forthcoming', '0', '3', 'Forthcoming', '8a808bfb64daa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531d437016531e2caf10004', 'state_publication_merged/incorporated', '0', '3', 'Merged/Incorporated', '8a808bfb64daa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531d437016531e44feb0005', 'state_publication_researched/unresolved', '0', '3', 'Researched/Unresolved', '8a808bfb64daa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531fff80165322222a40001', 'state_publication_ceased', '0', '3', 'Ceased', '8a808bfb64daa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531fff80165323c0e540002', 'country_Germany', '0', '3', 'Germany', '8a808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531fff80165323c60750003', 'country_UnitedStates', '0', '3', 'United States', '8a808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531fff80165323c96da0004', 'country_GermanyAustralia', '0', '3', 'Australia', '8a808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881eb6531fff80165328c8edb0009', 'country_UnitedKingdom', '0', '3', 'United Kingdom', '8a808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881ef653649ee0165364f523c0001', 'language_chinese', '0', '3', '中文', '8b808bfb64bsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881ef653649ee0165365059b60002', 'language_english', '0', '3', '英语', '8b808bfb64bsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881ef653649ee01653651586d0004', 'language_japanese', '0', '3', '日语', '8b808bfb64bsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('402881ef653649ee01653651f5510005', 'language_french', '0', '3', '法语', '8b808bfb64bsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362ab6370001', 'publishing_frequency_monthly', '0', '3', 'Monthly', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362b599d0002', 'publishing_frequency_annual', '0', '3', 'Annual', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362bda760003', 'publishing_frequency_bimonthly', '0', '3', 'Bi-monthly', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362c60410004', 'publishing_frequency_quarterly', '0', '3', 'Quarterly', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362cefa70005', 'publishing_frequency_daily', '0', '3', 'Daily', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653625050165362daba70006', 'publishing_frequency_irregular', '0', '3', 'Irregular', '8b808bfb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c301653643a9d80001', 'carrier_print', '0', '3', 'Print', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c3016536443e900002', 'carrier_online', '0', '3', 'Online - full text', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c301653644a9c10003', 'carrier_email', '0', '3', 'E-mail', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c30165364515d40004', 'carrier_printloose', '0', '3', 'Print (loose leaf)', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c3016536456bd80005', 'carrier_cd', '0', '3', 'CD-ROM', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('40289981653640c3016536460f590006', 'carrier_onlinecontent', '0', '3', 'Online - full content', '8b808afb64dsa28a0164dsae0bb10003', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a108eb0e0003', 'C001', '0', '2', '币种', '1', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a10927030004', 'C001001', '0', '3', 'RMB', '8a808bf264a102ba0164a108eb0e0003', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a109971a0005', 'C001002', '0', '3', 'US', '8a808bf264a102ba0164a108eb0e0003', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a109cd010006', 'C001003', '0', '3', 'UK', '8a808bf264a102ba0164a108eb0e0003', '1', '1');
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a10ac1fc0007', 'C002', '0', '2', '学科', '1', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a10afefe0008', 'C002001', '0', '3', '文学', '8a808bf264a102ba0164a10ac1fc0007', null, null);
INSERT INTO `sys_param` VALUES ('8a808bf264a102ba0164a10b22050009', 'C002002', '0', '3', '理工', '8a808bf264a102ba0164a10ac1fc0007', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64daa28a0164daac7c820000', '\r\naudit_opinion', '0', '2', '审核意见', '1', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64daa28a0164daacfe070001', 'audit_opinion_yes', '0', '3', '同意', '8a808bfb64daa28a0164daac7c820000', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64daa28a0164daad43c50002', 'audit_opinion_no', '0', '3', '学科不符', '8a808bfb64daa28a0164daac7c820000', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64daa28a0164daae0bb10003', 'audit_opinion_goodidea', '0', '3', 'Good idea', '8a808bfb64daa28a0164daac7c820000', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64daa28a0164dsae0bb10003', 'state_publication', '0', '2', '出版状态', '1', null, null);
INSERT INTO `sys_param` VALUES ('8a808bfb64dsa28a0164dsae0bb10003', 'country', '0', '2', '国别', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808afb64dsa28a0164dsae0bb10003', 'carrier', '0', '2', '载体', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64bsa28a0164dsae0bb10003', 'language', '0', '2', '语种', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64bsa28a0164dsae0bb10004', 'orderType\n\n', '0', '2', '订购类型', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10003', 'publishing_frequency', '0', '2', '出版频率', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10005', 'orderingMode', '0', '2', '订购模式', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10006', 'openRange', '0', '2', '开通范围', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10007', 'currency_contract', '0', '2', '合同币种', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10008', 'stopCause', '0', '2', '停订原因', '1', null, null);
INSERT INTO `sys_param` VALUES ('8b808bfb64dsa28a0164dsae0bb10009', '\r\nfundType', '0', '2', '经费类型', '1', null, null);
INSERT INTO `sys_param` VALUES ('ca5e0d14-db7d-4684-b6b4-fb5b0ae1683a', 'country_netherlands', '0', '3', 'Netherlands', '8a808bfb64dsa28a0164dsae0bb10003', null, null);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `createdate` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `api` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '续停订', '2018-08-31 14:07:44', '1', null);
INSERT INTO `sys_role` VALUES ('402881e4651c8b8301651c8e131d000a', '系统管理人员', '2018-08-09 10:39:57', '1', null);
INSERT INTO `sys_role` VALUES ('402881f364a0f0a60164a0f214ef0000', '超级管理员角色', '2018-09-10 08:25:38', '1', null);
INSERT INTO `sys_role` VALUES ('4be199ed-da7c-4e10-99b6-dc752f95ca36', '审核分配', '2018-08-31 14:04:32', '1', null);
INSERT INTO `sys_role` VALUES ('69ca989d-0421-46cd-8696-dc96317889ee', '订购信息维护', '2018-08-30 15:17:03', '1', null);
INSERT INTO `sys_role` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '荐购复审员', '2018-08-30 14:52:55', '1', null);
INSERT INTO `sys_role` VALUES ('9c57c42c-3cac-465a-b68d-e3d1ff0b9e1b', '荐购遴选', '2018-08-30 15:13:15', '1', null);
INSERT INTO `sys_role` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '订购审核', '2018-08-31 14:07:36', '1', null);
INSERT INTO `sys_role` VALUES ('d2d24ac7-9e60-4e71-b9cf-e552eb6b43fd', '荐购人', '2018-08-31 16:03:44', '1', null);
INSERT INTO `sys_role` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '荐购初审员', '2018-08-30 15:10:53', '1', null);
INSERT INTO `sys_role` VALUES ('f988ef18-60d8-46a4-a970-c8db85791417', '资源信息维护', '2018-08-30 15:16:41', '1', null);

-- ----------------------------
-- Table structure for sys_role_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_module`;
CREATE TABLE `sys_role_module` (
  `role_id` varchar(36) DEFAULT NULL,
  `module_id` varchar(36) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_module
-- ----------------------------
INSERT INTO `sys_role_module` VALUES ('4028810764838cfb0164838d5bec0000', '2');
INSERT INTO `sys_role_module` VALUES ('4028810764838cfb0164838d5bec0000', '23');
INSERT INTO `sys_role_module` VALUES ('4028810764838cfb0164838d5bec0000', '32');
INSERT INTO `sys_role_module` VALUES ('4028810764838cfb0164838d5bec0000', '33');
INSERT INTO `sys_role_module` VALUES ('4028810764838cfb0164838d5bec0000', '22');
INSERT INTO `sys_role_module` VALUES ('4028810764839b140164839e26d60000', '2');
INSERT INTO `sys_role_module` VALUES ('4028810764839b140164839e26d60000', '23');
INSERT INTO `sys_role_module` VALUES ('4028810764839b140164839e26d60000', '32');
INSERT INTO `sys_role_module` VALUES ('4028810764839b140164839e26d60000', '33');
INSERT INTO `sys_role_module` VALUES ('4028810764839b140164839e26d60000', '22');
INSERT INTO `sys_role_module` VALUES ('4028810764839f540164839fd7fc0000', '2');
INSERT INTO `sys_role_module` VALUES ('4028810764839f540164839fd7fc0000', '23');
INSERT INTO `sys_role_module` VALUES ('4028810764839f540164839fd7fc0000', '32');
INSERT INTO `sys_role_module` VALUES ('4028810764839f540164839fd7fc0000', '33');
INSERT INTO `sys_role_module` VALUES ('4028810764839f540164839fd7fc0000', '22');
INSERT INTO `sys_role_module` VALUES ('402881e4651c8b8301651c8e131d000a', '');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '2');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '33');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '402881eb6522ea30016522f35d130005');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '402881eb6522ea30016522f3d7590006');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '22');
INSERT INTO `sys_role_module` VALUES ('7eba0e76-71bf-4cfe-8059-57e413acfffb', '402881eb6522ea30016522f721c30007');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '2');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '32');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '402881eb6522ea30016522ee43540003');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '402881eb6522ea30016522f077ca0004');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '22');
INSERT INTO `sys_role_module` VALUES ('f11c14a7-1ae7-4e4a-bb2f-968e0b762c78', '402881eb6522ea30016522f721c30007');
INSERT INTO `sys_role_module` VALUES ('9c57c42c-3cac-465a-b68d-e3d1ff0b9e1b', '3');
INSERT INTO `sys_role_module` VALUES ('9c57c42c-3cac-465a-b68d-e3d1ff0b9e1b', '301');
INSERT INTO `sys_role_module` VALUES ('9c57c42c-3cac-465a-b68d-e3d1ff0b9e1b', '8a808bea6521b4ea016522edd8be0005');
INSERT INTO `sys_role_module` VALUES ('f988ef18-60d8-46a4-a970-c8db85791417', '6');
INSERT INTO `sys_role_module` VALUES ('f988ef18-60d8-46a4-a970-c8db85791417', '62');
INSERT INTO `sys_role_module` VALUES ('69ca989d-0421-46cd-8696-dc96317889ee', '6');
INSERT INTO `sys_role_module` VALUES ('69ca989d-0421-46cd-8696-dc96317889ee', '63');
INSERT INTO `sys_role_module` VALUES ('4be199ed-da7c-4e10-99b6-dc752f95ca36', '3');
INSERT INTO `sys_role_module` VALUES ('4be199ed-da7c-4e10-99b6-dc752f95ca36', '302');
INSERT INTO `sys_role_module` VALUES ('4be199ed-da7c-4e10-99b6-dc752f95ca36', '8a808bea6521b4ea016522f136ba0007');
INSERT INTO `sys_role_module` VALUES ('4be199ed-da7c-4e10-99b6-dc752f95ca36', '8a808bea6521b4ea016522f1a0530008');
INSERT INTO `sys_role_module` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '4');
INSERT INTO `sys_role_module` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '42');
INSERT INTO `sys_role_module` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '8a808bea6521b4ea016522f3dbfa0009');
INSERT INTO `sys_role_module` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '8a808bea6521b4ea016522f489de000a');
INSERT INTO `sys_role_module` VALUES ('9d72389c-c08e-4618-8895-7d4614db0f2d', '44');
INSERT INTO `sys_role_module` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '4');
INSERT INTO `sys_role_module` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '43');
INSERT INTO `sys_role_module` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '8a808bea6521b4ea016522f63341000b');
INSERT INTO `sys_role_module` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '8a808bea6521b4ea016522f6a69d000c');
INSERT INTO `sys_role_module` VALUES ('1c46c870-cc8d-405f-9760-baac8e032d09', '44');
INSERT INTO `sys_role_module` VALUES ('d2d24ac7-9e60-4e71-b9cf-e552eb6b43fd', '2');
INSERT INTO `sys_role_module` VALUES ('d2d24ac7-9e60-4e71-b9cf-e552eb6b43fd', '23');
INSERT INTO `sys_role_module` VALUES ('d2d24ac7-9e60-4e71-b9cf-e552eb6b43fd', '402881eb6522ea30016522ea90530001');
INSERT INTO `sys_role_module` VALUES ('d2d24ac7-9e60-4e71-b9cf-e552eb6b43fd', '402881eb6522ea30016522ed1a420002');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '2');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '23');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522ea90530001');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522ed1a420002');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '32');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522ee43540003');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522f077ca0004');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '33');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522f35d130005');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522f3d7590006');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '22');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881eb6522ea30016522f721c30007');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '3');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '301');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522edd8be0005');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '302');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f136ba0007');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f1a0530008');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '4');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '42');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f3dbfa0009');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f489de000a');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '43');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f63341000b');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8a808bea6521b4ea016522f6a69d000c');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '44');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '6');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '49f3384f-54f9-4843-8aab-4d8ff1dbc7e2');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', 'f01de868-9af0-4780-ab80-3bd52de1ea7d');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '5f639168-3566-446c-820d-1ea0b05f50ee');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '61');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '62');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '63');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '5');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '10');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '20');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '21');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '11');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '111');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '12');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '121');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '13');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '131');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '100');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8cad98b6-3068-4db6-80e3-e46c328c69eb');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '1001');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881e46545ff7d016546031d1a0001');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881e46545ff7d01654603b1360002');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '1002');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '1003');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '7');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '71');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '72');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '73');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '74');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '75');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '8');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '81');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '82');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '83');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '9');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '24');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '29');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '30');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881f364821184016482133e500001');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881e465214b520165214ef3b10003');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '25');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '251');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '252');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '402881e4651cc2e801651cc493e80001');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '27');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '271');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '28');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '281');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '31');
INSERT INTO `sys_role_module` VALUES ('402881f364a0f0a60164a0f214ef0000', '50');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `createdate` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `role_id` varchar(36) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `img_url` varchar(200) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `isAdmin` varchar(1) DEFAULT NULL COMMENT '是否是管理员',
  `login_date` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `img_check` varchar(255) DEFAULT NULL,
  `img_code` varchar(255) DEFAULT NULL,
  `organ_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1402ea58-f99c-405b-bc9b-d8778e042fc1', 'e10adc3949ba59abbe56e057f20f883e', 'xinghen', '2018-09-03 10:45:34', null, null, null, null, '274673388@qq.com', '星痕', '3', null, '18201612588', null, null, '8a808bf264a0bef00164a0f58bc60005');
INSERT INTO `sys_user` VALUES ('15ba8062-b963-43f2-8500-1ce0efddead7', 'e10adc3949ba59abbe56e057f20f883e', 'test7', '2018-08-30 15:43:39', null, null, null, null, '704003423@qq.com', '订购资源维护', '3', '2018-09-03 15:22:26', '13271057501', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('39cf8846-d925-445b-bfc6-f916170a92cb', 'e10adc3949ba59abbe56e057f20f883e', 'test5', '2018-08-30 15:39:55', null, null, null, null, '704023493@qq.com', '续停订', '3', '2018-09-03 15:21:56', '13241057404', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('402881f364a0f38c0164a0f529b00000', 'e10adc3949ba59abbe56e057f20f883e', 'admin', '2018-07-16 10:39:38', null, null, null, null, '1203342093@qq.com', '超级管理员', '1', '2018-09-10 14:01:56', '13801234567', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('544c0300-dc4d-4450-8851-eb8d80fd97da', 'e10adc3949ba59abbe56e057f20f883e', 'test4', '2018-08-30 15:36:30', null, null, null, null, '704003473@qq.com', '订购审核', '3', '2018-09-03 15:21:04', '13241057509', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('8d767d5d-45a6-42b6-bd68-b37ac1d97087', '123456', 'test2', '2018-08-30 15:28:03', null, null, null, null, '704003495@qq.com', '荐购遴选', '3', '2018-09-06 13:40:33', '13241057503', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'e10adc3949ba59abbe56e057f20f883e', 'kirswu', '2018-08-30 10:51:13', null, null, null, null, '704003493@qq.com', '荐购初审', '2', '2018-09-04 10:54:44', '13241057501', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('e9c0284c-bdf3-495b-b44d-7528fce91181', 'e10adc3949ba59abbe56e057f20f883e', 'test6', '2018-08-30 15:42:57', null, null, null, null, '703003493@qq.com', '资源信息维护', '3', '2018-09-03 15:22:18', '13241027504', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('f46573d7-76d5-45a3-9037-d9ed91772134', 'e10adc3949ba59abbe56e057f20f883e', 'test1', '2018-08-30 15:26:01', null, null, null, null, '704003494@qq.com', '荐购复审', '2', '2018-09-06 17:39:30', '13241057502', null, null, '402881f3648811d4016488124bc20000');
INSERT INTO `sys_user` VALUES ('f9054b59-6a13-4eba-a458-d1382170fba0', 'e10adc3949ba59abbe56e057f20f883e', 'test3', '2018-08-30 15:29:57', null, null, null, null, '704003496@qq.com', '审核分配', '3', '2018-09-03 15:20:40', '13241057504', null, null, '402881f3648811d4016488124bc20000');

-- ----------------------------
-- Table structure for sys_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_roles`;
CREATE TABLE `sys_user_roles` (
  `sys_user_id` varchar(36) NOT NULL,
  `roles_id` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_roles
-- ----------------------------
INSERT INTO `sys_user_roles` VALUES ('8a808bf264a102ba0164a106617e0000', '1');
INSERT INTO `sys_user_roles` VALUES ('8a808bf264a102ba0164a106617e0000', '2');
INSERT INTO `sys_user_roles` VALUES ('8a808bf264a102ba0164a106617e0000', '402881f364a0f0a60164a0f214ef0000');
INSERT INTO `sys_user_roles` VALUES ('40289981650e466601650e7de1990000', '402881f364a0f0a60164a0f214ef0000');
INSERT INTO `sys_user_roles` VALUES ('402881e4651c816201651c82dcb50001', '1');
INSERT INTO `sys_user_roles` VALUES ('402881e4651c7e2401651c8067af0001', '1');
INSERT INTO `sys_user_roles` VALUES ('402881e4651c7e2401651c8067af0001', '2');
INSERT INTO `sys_user_roles` VALUES ('15ba8062-b963-43f2-8500-1ce0efddead7', '69ca989d-0421-46cd-8696-dc96317889ee');
INSERT INTO `sys_user_roles` VALUES ('e9c0284c-bdf3-495b-b44d-7528fce91181', 'f988ef18-60d8-46a4-a970-c8db85791417');
INSERT INTO `sys_user_roles` VALUES ('39cf8846-d925-445b-bfc6-f916170a92cb', '1c46c870-cc8d-405f-9760-baac8e032d09');
INSERT INTO `sys_user_roles` VALUES ('544c0300-dc4d-4450-8851-eb8d80fd97da', '9d72389c-c08e-4618-8895-7d4614db0f2d');
INSERT INTO `sys_user_roles` VALUES ('f9054b59-6a13-4eba-a458-d1382170fba0', '4be199ed-da7c-4e10-99b6-dc752f95ca36');
INSERT INTO `sys_user_roles` VALUES ('8d767d5d-45a6-42b6-bd68-b37ac1d97087', '9c57c42c-3cac-465a-b68d-e3d1ff0b9e1b');
INSERT INTO `sys_user_roles` VALUES ('dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'd2d24ac7-9e60-4e71-b9cf-e552eb6b43fd');
INSERT INTO `sys_user_roles` VALUES ('dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'f11c14a7-1ae7-4e4a-bb2f-968e0b762c78');
INSERT INTO `sys_user_roles` VALUES ('f46573d7-76d5-45a3-9037-d9ed91772134', '7eba0e76-71bf-4cfe-8059-57e413acfffb');
INSERT INTO `sys_user_roles` VALUES ('1402ea58-f99c-405b-bc9b-d8778e042fc1', '402881e4651c8b8301651c8e131d000a');
INSERT INTO `sys_user_roles` VALUES ('1402ea58-f99c-405b-bc9b-d8778e042fc1', '4be199ed-da7c-4e10-99b6-dc752f95ca36');
INSERT INTO `sys_user_roles` VALUES ('1402ea58-f99c-405b-bc9b-d8778e042fc1', '69ca989d-0421-46cd-8696-dc96317889ee');
INSERT INTO `sys_user_roles` VALUES ('402881f364a0f38c0164a0f529b00000', '402881f364a0f0a60164a0f214ef0000');

-- ----------------------------
-- Table structure for t_acount_num
-- ----------------------------
DROP TABLE IF EXISTS `t_acount_num`;
CREATE TABLE `t_acount_num` (
  `id` varchar(36) NOT NULL,
  `acount_num` varchar(255) DEFAULT NULL COMMENT '户号',
  `proxy_cor_id` varchar(100) DEFAULT NULL COMMENT '代理公司编码',
  `organ_id` varchar(36) DEFAULT NULL COMMENT '订购单位--机构',
  `mark` text COMMENT '备注',
  `create_time` varchar(30) DEFAULT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_time` varchar(30) DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_acount_num
-- ----------------------------
INSERT INTO `t_acount_num` VALUES ('1', '1', '1', '8a808bf264a0bef00164a0f529020004', '1', null, null, null, null);
INSERT INTO `t_acount_num` VALUES ('402881e46556670b016556679bd70000', '1111', '402881e4655604020165560a09550002', '8a808bf264a0bef00164a0f31faa0002', '12312312', '2018-08-20 16:15:54', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_acount_num` VALUES ('402881e46556670b016556681d020001', '123123123', '402881e4655604020165560a09550002', '8a808bf264a0bef00164a0f78df00006', '多填几个户号123213', '2018-08-20 16:16:28', '402881f364a0f38c0164a0f529b00000', '2018-08-20 16:24:23', '402881f364a0f38c0164a0f529b00000');
INSERT INTO `t_acount_num` VALUES ('402881e46556670b016556681d2c0002', '234', '402881e4655604020165560a09550002', '8a808bf264a0bef00164a0f78df00006', '多填几个户号', '2018-08-20 16:16:28', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_acount_num` VALUES ('402881e46556670b016556681d510003', '345', '402881e4655604020165560a09550002', '8a808bf264a0bef00164a0f78df00006', '多填几个户号', '2018-08-20 16:16:28', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_acount_num` VALUES ('402881e46556670b016556681d6c0004', '456', '402881e4655604020165560a09550002', '8a808bf264a0bef00164a0f78df00006', '多填几个户号', '2018-08-20 16:16:28', '402881f364a0f38c0164a0f529b00000', null, null);

-- ----------------------------
-- Table structure for t_cover_info
-- ----------------------------
DROP TABLE IF EXISTS `t_cover_info`;
CREATE TABLE `t_cover_info` (
  `id` varchar(50) NOT NULL COMMENT '套题名',
  `pub_country` varchar(36) DEFAULT NULL COMMENT '出版国',
  `publisher` varchar(255) DEFAULT NULL COMMENT '出版社',
  `subject` varchar(36) DEFAULT NULL COMMENT '学科',
  `language` text COMMENT '语种',
  `eissn` varchar(9) DEFAULT NULL,
  `pissn` varchar(9) DEFAULT NULL,
  `eisbn` varchar(9) DEFAULT NULL,
  `pisbn` varchar(9) DEFAULT NULL,
  `create_time` varchar(22) DEFAULT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_time` varchar(22) DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  `cover_name` varchar(50) DEFAULT NULL,
  `is_del` varchar(1) DEFAULT '0' COMMENT '0未删除1已删除',
  `cover_id` varchar(255) DEFAULT NULL,
  `pebs` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_8ca3f0esxha0k9sqk5kkg9qsp` (`pebs`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cover_info
-- ----------------------------
INSERT INTO `t_cover_info` VALUES ('19c047bd-37da-457c-bded-5e839931e980', '402881eb6531fff80165328c8edb0009', 'Blauw Media Uitgeverij B.V.', '8a808bf264a102ba0164a10b22050009', '402881ef653649ee0165364f523c0001,402881ef653649ee01653651f5510005', '11', '11', '11', '11', '2018-09-07 16:52:20', '402881f364a0f38c0164a0f529b00000', null, null, 'ceshi11', '0', null, null, null);
INSERT INTO `t_cover_info` VALUES ('402881e46546c1c6016546cac01a0004', '402881eb6531fff80165323c0e540002', '机械工业出版社', '8a808bf264a102ba0164a10afefe0008', '402881ef653649ee0165365059b60002', '123456789', '123456789', '123456789', '123456789', '2018-08-17 15:30:17', '402881f364a0f38c0164a0f529b00000', '2018-08-30 16:03:15', '402881f364a0f38c0164a0f529b00000', 'Community Connect', '0', null, null, null);
INSERT INTO `t_cover_info` VALUES ('402881e46546da26016546db1fca0001', '402881eb6531fff80165323c60750003', '机械工业出版社', '8a808bf264a102ba0164a10b22050009', '402881ef653649ee0165364f523c0001,402881ef653649ee0165365059b60002', '1234567', '1234567', 'text', '1234567', '2018-08-17 15:48:10', '402881f364a0f38c0164a0f529b00000', '2018-08-31 15:12:10', '402881f364a0f38c0164a0f529b00000', 'Community Connect', '0', null, null, null);
INSERT INTO `t_cover_info` VALUES ('402881e46546da26016546db1fca0002', '402881eb6531fff80165323c0e540002', '中图', '8a808bf264a102ba0164a10afefe0008', '402881ef653649ee01653651586d0004', '321', '321', '321', '321', null, null, '2018-08-30 16:03:32', '402881f364a0f38c0164a0f529b00000', 'Community Connect', '0', null, null, null);
INSERT INTO `t_cover_info` VALUES ('402881e46546da26016546db1fca0003', '402881eb6531fff80165323c0e540002', '英图', '8a808bf264a102ba0164a10afefe0008', '402881ef653649ee0165365059b60002', '321321', '321321', '321321', '321321321', null, null, '2018-08-30 16:04:56', '402881f364a0f38c0164a0f529b00000', 'abcd', '0', null, null, null);
INSERT INTO `t_cover_info` VALUES ('780a4c46-2c1e-4bcc-8966-691aca44f0f1', '402881eb6531fff80165323c96da0004', 'Blauw Media Uitgeverij B.V.', '8a808bf264a102ba0164a10afefe0008', '402881ef653649ee0165364f523c0001,402881ef653649ee01653651586d0004,402881ef653649ee01653651f5510005', '22', '22', '22', '22', '2018-09-07 16:53:21', '402881f364a0f38c0164a0f529b00000', null, null, 'ceshi 22', '0', null, null, null);

-- ----------------------------
-- Table structure for t_cover_param
-- ----------------------------
DROP TABLE IF EXISTS `t_cover_param`;
CREATE TABLE `t_cover_param` (
  `cover_id` varchar(36) DEFAULT NULL,
  `param_id` varchar(36) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=greek;

-- ----------------------------
-- Records of t_cover_param
-- ----------------------------
INSERT INTO `t_cover_param` VALUES ('402881e46546c1c6016546cac01a0004', '402881ef653649ee0165364f523c0001');
INSERT INTO `t_cover_param` VALUES ('402881e46546c1c6016546cac01a0004', '402881ef653649ee0165365059b60002');

-- ----------------------------
-- Table structure for t_order_info
-- ----------------------------
DROP TABLE IF EXISTS `t_order_info`;
CREATE TABLE `t_order_info` (
  `id` varchar(36) NOT NULL COMMENT '序号',
  `u_order_number` varchar(50) DEFAULT NULL COMMENT '唯一订购号',
  `order_number` varchar(50) DEFAULT NULL COMMENT '订购号',
  `carrier` varchar(50) DEFAULT NULL COMMENT '载体',
  `organization_id` varchar(36) DEFAULT NULL COMMENT '订购机构',
  `order_year` varchar(4) DEFAULT NULL COMMENT '订购年份',
  `c_start_year` varchar(4) DEFAULT NULL COMMENT '合同起始年',
  `c_end_year` varchar(4) DEFAULT NULL COMMENT '合同终止年',
  `order_status` varchar(10) DEFAULT NULL COMMENT '订购状态0未订购1已订购2停订3续订4驳回',
  `order_type` varchar(20) DEFAULT NULL COMMENT '订购类型',
  `order_pattern` varchar(20) DEFAULT NULL COMMENT '订购模式',
  `opening_range` varchar(100) DEFAULT NULL COMMENT '开通范围',
  `a_start_year` varchar(4) DEFAULT NULL COMMENT '全文可访问起始年',
  `a_end_year` varchar(4) DEFAULT NULL COMMENT '全文可访问截止年',
  `reason` varchar(100) DEFAULT NULL COMMENT '停订原因',
  `has_metadata` varchar(1) DEFAULT NULL COMMENT '本地元数据保存',
  `arrival_status` varchar(5) DEFAULT NULL COMMENT '到货情况(1到货0未到货)',
  `is_ordered` varchar(5) DEFAULT NULL COMMENT '是否订到(0未订到1订到)',
  `auditing_year` varchar(4) DEFAULT NULL COMMENT '决算年度',
  `fund_source` varchar(100) DEFAULT NULL COMMENT '经费来源',
  `budget` decimal(20,0) DEFAULT NULL COMMENT '预算额度',
  `should_pay` decimal(20,0) DEFAULT NULL COMMENT '应支付价格',
  `paid` decimal(20,0) DEFAULT NULL COMMENT '支付价格',
  `not_pay` decimal(20,0) DEFAULT NULL COMMENT '未支付价格',
  `cny_total` decimal(20,0) DEFAULT NULL COMMENT '合计人民币',
  `order_pay` decimal(20,0) DEFAULT NULL COMMENT '订购价格/合同金额',
  `subsidy` decimal(20,0) DEFAULT NULL COMMENT '补贴额度',
  `order_per_pay` decimal(20,0) DEFAULT NULL COMMENT '续订预估价格',
  `fund_type` varchar(20) DEFAULT NULL COMMENT '经费类型',
  `currency` varchar(50) DEFAULT NULL COMMENT '合同币种',
  `systime` varchar(20) DEFAULT NULL COMMENT '修改日期',
  `sysuserid` varchar(36) DEFAULT '' COMMENT '修改人id',
  `sysusername` varchar(20) DEFAULT NULL COMMENT '修改人姓名',
  `flow_status` varchar(1) DEFAULT '0' COMMENT '审核状态0待审核 1通过 2驳回',
  `flow_one_userid` varchar(36) DEFAULT NULL COMMENT '初审人id',
  `flow_one_username` varchar(20) DEFAULT NULL COMMENT '初审人姓名',
  `flow_one_systime` varchar(20) DEFAULT NULL COMMENT '初审日期',
  `flow_two_userid` varchar(36) DEFAULT NULL COMMENT '复审人id',
  `flow_two_username` varchar(20) DEFAULT NULL COMMENT '复审人姓名',
  `flow_two_systime` varchar(20) DEFAULT NULL COMMENT '复审日期',
  `create_id` varchar(36) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `sys_cover_id` varchar(255) DEFAULT NULL COMMENT '套',
  `trial_opinion` varchar(255) DEFAULT NULL COMMENT '审判意见',
  `res_id` varchar(255) DEFAULT NULL COMMENT '订单ID',
  `pebs` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_info
-- ----------------------------
INSERT INTO `t_order_info` VALUES ('3015e4d3-47f0-42af-b1aa-4207d9e5939c', 'J000000003', null, 'carrier_print', '402881f3648811d4016488124bc20000', '2018', null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-09-05 17:02:50', null, null, null, null, null, null, null, null, null, '402881f364a0f38c0164a0f529b00000', '2018-09-05 17:02:50', null, 'yes', null, null);
INSERT INTO `t_order_info` VALUES ('5d6ff4ba-2446-4f2d-9e97-cb428b9c1097', 'J000000001', null, 'carrier_print', '402881f3648811d4016488124bc20000', '2018', null, null, '4', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-09-05 17:02:04', null, null, null, null, null, null, null, null, null, '402881f364a0f38c0164a0f529b00000', '2018-09-05 17:02:04', null, 'yes', null, null);
INSERT INTO `t_order_info` VALUES ('5e693463-bf6a-497b-ad62-ae6327ddb004', 'J000000002', null, 'carrier_print', '402881f3648811d4016488124bc20000', '2018', null, null, '4', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-09-05 17:02:50', null, null, null, null, null, null, null, null, null, '402881f364a0f38c0164a0f529b00000', '2018-09-05 17:02:50', null, 'yes', null, null);
INSERT INTO `t_order_info` VALUES ('cfc8ec04-4b82-43f2-a70b-fe07a8cb4241', 'J000000004', null, 'carrier_print', '402881f3648811d4016488124bc20000', '2018', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-09-06 14:00:01', null, null, null, null, null, null, null, null, null, '402881f364a0f38c0164a0f529b00000', '2018-09-06 14:00:01', null, 'yes', '10f6d95b646a4979ae809d0cdbed22e0', null);
INSERT INTO `t_order_info` VALUES ('f699ffcb-684a-4913-a906-d72e0a2dfa6a', 'J000000005', null, 'carrier_print', '402881f3648811d4016488124bc20000', '2018', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-09-06 15:05:42', null, null, null, null, null, null, null, null, null, '402881f364a0f38c0164a0f529b00000', '2018-09-06 15:05:42', null, null, null, null);

-- ----------------------------
-- Table structure for t_proxy_corporation
-- ----------------------------
DROP TABLE IF EXISTS `t_proxy_corporation`;
CREATE TABLE `t_proxy_corporation` (
  `id` varchar(36) NOT NULL,
  `proxy_cor_name` varchar(255) DEFAULT NULL COMMENT '代理公司名称',
  `proxy_cor_code` varchar(50) DEFAULT NULL COMMENT '代理公司编号',
  `create_time` varchar(30) DEFAULT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_time` varchar(30) DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_proxy_corporation
-- ----------------------------
INSERT INTO `t_proxy_corporation` VALUES ('1', '1', '1', null, null, null, null);
INSERT INTO `t_proxy_corporation` VALUES ('3c7962a1-5ca5-42dd-b0ec-e5fa33423e23', '公司11', '11', '2018-08-21 09:57:09', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_proxy_corporation` VALUES ('402881e4655604020165560a09550002', '公司3', 'c3', '2018-08-20 14:33:42', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_proxy_corporation` VALUES ('402881e4655604020165560a874a0003', '公司4', 'c4', '2018-08-20 14:34:15', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_proxy_corporation` VALUES ('402881e4655604020165560b06eb0004', '公司5', 'c5', '2018-08-20 14:34:47', '402881f364a0f38c0164a0f529b00000', null, null);
INSERT INTO `t_proxy_corporation` VALUES ('402881e4655604020165560c704c0005', '公司6', 'c6', '2018-08-20 14:36:20', '402881f364a0f38c0164a0f529b00000', '2018-08-20 14:54:46', '402881f364a0f38c0164a0f529b00000');

-- ----------------------------
-- Table structure for t_recommend_info
-- ----------------------------
DROP TABLE IF EXISTS `t_recommend_info`;
CREATE TABLE `t_recommend_info` (
  `id` varchar(36) NOT NULL,
  `title` varchar(500) DEFAULT NULL COMMENT '题名',
  `Pissn` varchar(9) DEFAULT NULL COMMENT '印本issn',
  `Eissn` varchar(9) DEFAULT NULL COMMENT '电子issn',
  `Pisbn` varchar(9) DEFAULT NULL COMMENT '印本isbn',
  `Eisbn` varchar(9) DEFAULT NULL COMMENT '印本isbn',
  `organization_id` varchar(36) DEFAULT NULL COMMENT '推荐机构',
  `reason` varchar(500) DEFAULT NULL COMMENT '推荐理由',
  `flow_status` varchar(1) DEFAULT NULL COMMENT '审核状态(0:待审核1:初审通过2:初审未通过3:复审通过4:复审未通过5:未参加审核)',
  `flow_one_userid` varchar(36) DEFAULT NULL COMMENT '初审人id',
  `flow_one_username` varchar(255) DEFAULT NULL COMMENT '初审人姓名',
  `flow_one_systime` varchar(20) DEFAULT NULL COMMENT '初审日期',
  `flow_two_userid` varchar(36) DEFAULT NULL COMMENT '复审人id',
  `flow_two_username` varchar(20) DEFAULT NULL COMMENT '复审人姓名',
  `flow_two_systime` varchar(20) DEFAULT NULL COMMENT '复审日期',
  `systime` varchar(20) DEFAULT NULL COMMENT '修改日期',
  `sysuserid` varchar(36) DEFAULT NULL COMMENT '修改人id',
  `sysusername` varchar(20) DEFAULT NULL COMMENT '修改人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_recommend_info
-- ----------------------------
INSERT INTO `t_recommend_info` VALUES ('0dfed2bba4ff461f83d073cf03ff05bc', 'Natural History Museum in Belgrade. Bulletin', null, null, '1921-3212', null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('138f734897634ac38f17ebf951ad8850', 'N S W Civil Practice & Procedure', null, '1001-324X', null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('13ac340a008b4d7198ee2348232a2c55', 'Where GuestBook. Tennessee: Nashville & Memphis', '1002-0713', null, null, null, '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('18fab18a8d0d4550bcc36cedd8c5f274', 'South East & West Fishing', null, null, '1002-0845', null, '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('19d2fcbca23943ac98e1560a784fc7a1', '测试添加4545', '', 'text-1222', '', '', '402881f3648811d4016488124bc20000', '', '5', null, null, null, null, null, null, '2018-09-10 10:55:35', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('1f8782c2b57d4dd5a54a5c3fe75825f9', '测试33323', '', 'text-0101', '', '', '402881f3648811d4016488124bc20000', '', '5', null, null, null, null, null, null, '2018-09-10 10:52:09', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('240d928ed2ea49ba88f7c1bdb9b15d14', 'L X I Connexion', '1007-7623', null, null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:34:14', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('2b7c4b6c566b4d68bf0f9b151395b901', 'ceshitianjia1111321', '', '', '', '321321', '402881f3648811d4016488124bc20000', '', '3', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:02:21', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:02:38', '2018-09-04 16:15:43', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('2d5f51a7526e43ed8866790b095b8157', '测试添加11111', '', '11111', '', '', '402881f3648811d4016488124bc20000', '', '3', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:01:32', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:01:39', '2018-09-04 13:41:16', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('2db2143b77ae4ac18ce9dcbdac6fb9a1', 'South Oakland Eccentric', null, '1004-3521', null, null, '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('37ce397ddb2a4f788940b6def6cb7146', 'New Testament Tools, Studies and Documents', null, '1001-3211', null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:34:14', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('3c046c40c38248bcad9a250138ebf950', '测试212121', '321321321', '', '', '', '402881f3648811d4016488124bc20000', '', '0', null, null, null, null, null, null, '2018-09-06 13:50:17', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('3c2c908845b54fa693a8cae70ccfe4c2', 'ceshi kjh', '', 'text-1232', '', '', '402881f3648811d4016488124bc20000', '', '5', null, null, null, null, null, null, '2018-09-10 10:59:15', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('52619a66528c42d397c144e4bc710867', 'TechTarget Magazin: Strategien und Loesungen fuer die IT-Infrastruktur', null, null, '1067-931x', null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 15:33:04', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('5a71722f98b5439a9e0ff7a67f6d86e5', 'University of Technology, Sydney. Handbook', '1131-936X', null, null, null, '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', '', 'text-1231', '', '', '402881f3648811d4016488124bc20000', 'ceshi1122', '5', null, null, null, null, null, null, '2018-09-10 09:05:33', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('61feda3c1e03452a9c3f74ed4343dc84', 'Lift & Crane Applications and Equipment', '1832-4444', null, null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('63800b5b825142bfab75bcdc50eaf1ea', 'F+D Fotografie', null, null, '3874-3241', null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:34:14', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('7ab226e5282d4e019893262bf27fd4e5', 'Naturschutz und Biologische Vielfalt', null, null, '1451-3212', null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:34:14', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('8db8e81a2612434eb50044889ed00ab1', 'Victoria, South Australia, Tasmania Nursery Register: the who-grows-it, where-to-get-it directory of the nursery industry', null, '1007-9637', null, null, '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('92a0fb60e8154a2cb4235cdde162362d', 'Where GuestBook', '', '', '', '1001-3213', '402881f3648811d4016488124bc20000', '', '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:44:32', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('9ca774aa11284967aeb32f574f331166', 'Knippie', null, null, null, '3451-343X', '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('9e87984462834deeaa16c0a50f7138b8', 'Insider Commercial Property Guides. Midlands', null, null, null, '1001-652X', '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('a382f3d875664b1eb60bbc773c033e95', '测试添加3323', '', 'texx-3332', '', '', '402881f3648811d4016488124bc20000', '测试添加3323', '5', null, null, null, null, null, null, '2018-09-10 09:24:47', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('a43aff8b2dff4a3ebe49a5c347398f27', 'Parkersburg News and Sentinel', '1262-8732', null, null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('ab7be91eb82d4bd8b016874d9f75191b', 'Meridian Travel', null, '8372-9387', null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('b151bfda1b7e47049cf507a992ee8600', 'Journal of Coatings Technology and Research', null, null, '3827-9102', null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:45:13', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:45:44', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', '测试123', '测试123', '测试123', '402881f3648811d4016488124bc20000', '测试123', '3', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-06 15:04:14', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-06 15:04:27', '2018-09-06 14:57:10', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('bb2b43f387ef471aa2b5ede06c560c65', 'Uniting World', null, null, null, '1671-5373', '402881f3648811d4016488124bc20000', null, '0', null, null, null, null, null, null, '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('bd61aea70bca4c44990c64da16e192b9', 'ceshitianjia2', '', '', '', '11211131', '402881f3648811d4016488124bc20000', '', '3', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:02:21', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 17:02:38', '2018-09-04 15:08:41', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('c18fd9bb1fb94140833897fa701e5f61', 'New South Wales. Department of Water and Energy. Annual Report', null, null, null, '1654-3342', '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 15:30:00', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('ccb196a57c71482dae41487124e6e0eb', '测试xxxxl', '', 'texx-xxxl', '', '', '402881f3648811d4016488124bc20000', '', '5', null, null, null, null, null, null, '2018-09-10 10:58:32', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('d19654c5a35a4564b7aa444c55a1ac1f', '321321', '', 'texx-8732', '', '', '402881f3648811d4016488124bc20000', '', '5', null, null, null, null, null, null, '2018-09-10 09:27:11', '402881f364a0f38c0164a0f529b00000', 'admin');
INSERT INTO `t_recommend_info` VALUES ('dc6bb7d82bc3453c94b4b817396c1f1b', 'Smart Investor', null, null, null, '1671-6371', '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-05 15:33:04', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('e6859546590b440797bbd65b542f8606', 'Gallery Guide', null, '7683-3342', null, null, '402881f3648811d4016488124bc20000', null, '3', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '2018-09-03 14:28:14', 'f46573d7-76d5-45a3-9037-d9ed91772134', 'test1', '2018-09-03 14:34:14', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu');
INSERT INTO `t_recommend_info` VALUES ('f2496e319aee4db3b30b5598ccca7e21', 'lalallall', '', '3123213', '', '', '402881f3648811d4016488124bc20000', '', '3', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-06 11:24:45', '402881f364a0f38c0164a0f529b00000', 'admin', '2018-09-06 13:59:44', '2018-09-06 10:26:03', '402881f364a0f38c0164a0f529b00000', 'admin');

-- ----------------------------
-- Table structure for t_resource_info
-- ----------------------------
DROP TABLE IF EXISTS `t_resource_info`;
CREATE TABLE `t_resource_info` (
  `id` varchar(36) NOT NULL COMMENT '序号',
  `recommend_id` varchar(36) NOT NULL COMMENT '荐购id',
  `title` varchar(500) DEFAULT NULL COMMENT '题名',
  `other_title` varchar(500) DEFAULT NULL COMMENT '其他题名',
  `series_number` int(10) DEFAULT NULL COMMENT '分辑号',
  `series_title` varchar(500) DEFAULT NULL COMMENT '分辑名',
  `author` varchar(255) DEFAULT NULL COMMENT '责任者',
  `Pissn` varchar(9) DEFAULT NULL COMMENT '印本ISSN',
  `Eissn` varchar(9) DEFAULT NULL COMMENT '电子ISSN',
  `Pisbn` varchar(9) DEFAULT NULL COMMENT '印本isbn',
  `Eisbn` varchar(9) DEFAULT NULL COMMENT '电子isbn',
  `cover_id` varchar(36) DEFAULT NULL COMMENT '套id',
  `kind_id` varchar(36) DEFAULT NULL COMMENT '种类id',
  `coiling_period` varchar(10) DEFAULT NULL COMMENT '卷期',
  `subject` varchar(50) DEFAULT NULL COMMENT '学科',
  `publisher` varchar(255) DEFAULT NULL COMMENT '出版社',
  `country` varchar(250) DEFAULT NULL COMMENT '国别',
  `pub_year` varchar(12) DEFAULT NULL COMMENT '出版年',
  `founded_year` varchar(12) DEFAULT NULL COMMENT '创刊年',
  `language` varchar(500) DEFAULT NULL COMMENT '语种',
  `pub_feq` varchar(50) DEFAULT NULL COMMENT '出版频率',
  `Intro` varchar(500) DEFAULT NULL COMMENT '内容简介',
  `classi_number` varchar(11) DEFAULT NULL COMMENT '分类号',
  `url` varchar(255) DEFAULT NULL COMMENT '期刊URL地址',
  `carrier` varchar(50) DEFAULT NULL COMMENT '载体',
  `type` varchar(50) DEFAULT NULL COMMENT '文献类型',
  `pub_pattern` varchar(50) DEFAULT NULL COMMENT '出版模式',
  `pub_status` varchar(50) DEFAULT NULL COMMENT '出版状态',
  `systime` varchar(20) DEFAULT NULL COMMENT '修改日期',
  `sysuserid` varchar(36) DEFAULT NULL COMMENT '修改人id',
  `sysusername` varchar(20) DEFAULT NULL COMMENT '修改人姓名',
  `dist_unit` varchar(255) DEFAULT NULL COMMENT '分配成员单位',
  `order_status` varchar(2) NOT NULL DEFAULT '0' COMMENT '是否分配订单（0未分配1已分配）',
  `distribution_status` int(2) DEFAULT '0' COMMENT '遴选分配（0 荐购审核未通过 1 未分配 2 已分配 3 审核通过 4 审核驳回 5 订单驳回）',
  `trial_opinion` varchar(255) DEFAULT NULL COMMENT '审核意见',
  `review_status` int(1) DEFAULT '0' COMMENT '0 初始状态或修改完成 1 修改待审核',
  PRIMARY KEY (`id`,`recommend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resource_info
-- ----------------------------
INSERT INTO `t_resource_info` VALUES ('10f6d95b646a4979ae809d0cdbed22e0', 'f2496e319aee4db3b30b5598ccca7e21', 'lalallall', '', null, null, '', '', '3123213', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english,language_japanese,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-06 10:26:03', '402881f364a0f38c0164a0f529b00000', 'admin', '8a808bf264a0bef00164a0f58bc60005', '1', '3', 'yes', '0');
INSERT INTO `t_resource_info` VALUES ('11de8b9cec444e0496801f7f6d415724', '9ca774aa11284967aeb32f574f331166', 'Knippie', 'knippie', null, null, 'Michael Dewey, Paul Schreier', null, null, null, '3451-343X', '402881e46546c1c6016546cac01a0004', null, '26卷', 'C002002', 'Sanoma Uitgevers B.V.', 'country_netherlands', '2016', '2006', 'language_english', 'publishing_frequency_quarterly', 'Zeitschrift fuer Kindschaftsrecht und Jugendhilfe', null, 'NULL', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, null);
INSERT INTO `t_resource_info` VALUES ('2900d0502561468b8c58efc1f845ad07', '7ab226e5282d4e019893262bf27fd4e5', 'Naturschutz und Biologische Vielfalt', 'naturschutz biologische vielfalt', null, null, 'Pat Walker (Editor-in-Chief), Lindsey Anderson (Managing Editor)', null, null, '1451-3212', null, '402881e46546c1c6016546cac01a0004', null, '21卷', 'C002002', 'Bundesamt fuer Naturschutz', 'country_Germany', '2011', '2001', 'language_english', 'publishing_frequency_daily', 'Office Mag: 100% pratique pour le bureau', null, 'http://www.buchweltshop.de/bfn/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, null);
INSERT INTO `t_resource_info` VALUES ('2b9f825ea0ca451f931fa4b239db4e80', '5a71722f98b5439a9e0ff7a67f6d86e5', 'University of Technology, Sydney. Handbook', 'university technology sydney handbook', null, null, 'Jennifer Weis', '1131-936X', null, null, null, '402881e46546c1c6016546cac01a0004', null, '15卷', 'C002002', 'University of Technology, Sydney', 'country_GermanyAustralia', '2005', '1995', 'language_english', 'publishing_frequency_daily', 'Community Connect', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('369bee7065954477816d6af2f40912a9', '2d5f51a7526e43ed8866790b095b8157', '测试添加11111', '', null, null, '', '', '11111', '', '', null, null, '', 'C002001', '321321321', 'country_Germany', '', '', 'language_english,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-04 13:41:16', '402881f364a0f38c0164a0f529b00000', 'admin', '8a808bf264a0bef00164a0f78df00006', '1', '3', 'yes', '0');
INSERT INTO `t_resource_info` VALUES ('391a2681a02542f992aecfe5276fb504', 'ab7be91eb82d4bd8b016874d9f75191b', 'Meridian Travel', 'meridian travel', null, null, 'Ray Dickie (Editor-in-Chief)', null, '8372-9387', null, null, '402881e46546c1c6016546cac01a0004', null, '28卷', 'C002002', 'DOrizon Media', 'country_netherlands', '2018', '2008', 'language_english', 'publishing_frequency_irregular', 'Western Australia. Department of Environment and Conservation. Annual Report', null, 'http://www.meridiantravel.nl', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('3be9422dc33b46d08339eb147f2472ce', '52619a66528c42d397c144e4bc710867', 'TechTarget Magazin: Strategien und Loesungen fuer die IT-Infrastruktur', 'techtarget magazin strategien loesungen die it infrastruktur', null, null, 'Jennifer Weis', null, null, '1067-931x', null, '402881e46546c1c6016546cac01a0004', null, '17卷', 'C002002', 'Vogel IT-Medien GmbH', 'country_Germany', '2007', '1997', 'language_english', 'publishing_frequency_monthly', 'Business Travel Planner (Online)', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '8a808bf264a0bef00164a0f529020004', '0', '0', null, '0');
INSERT INTO `t_resource_info` VALUES ('3d91b70bcfc54a65bdb7cbc5aa6c1ec4', '2db2143b77ae4ac18ce9dcbdac6fb9a1', 'South Oakland Eccentric', 'south oakland eccentric', null, null, 'Jennifer Weis', null, '1004-3521', null, null, '402881e46546c1c6016546cac01a0004', null, '16卷', 'C002002', 'Observer, Eccentric & Mirror Newspapers, Inc.', 'country_UnitedStates', '2006', '1996', 'language_english', 'publishing_frequency_irregular', 'Clavier Companion: a practical magazine on piano teaching', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_forthcoming', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('3f9c510fa83748c4b762b87e18fdb316', 'bd61aea70bca4c44990c64da16e192b9', 'ceshitianjia2', '', null, null, '', '', '', '', '11211131', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_japanese,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-04 15:08:41', '402881f364a0f38c0164a0f529b00000', 'admin', '8a808bf264a0bef00164a0f78df00006', '1', '3', null, '0');
INSERT INTO `t_resource_info` VALUES ('470267c09d3143fabf7225df9a6380b5', 'd19654c5a35a4564b7aa444c55a1ac1f', '321321', 'GuestBook', null, null, '测试添加3323', '', 'texx-8732', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-10 09:27:11', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);
INSERT INTO `t_resource_info` VALUES ('4b974497d45049fc91a979a1975670a2', '1f8782c2b57d4dd5a54a5c3fe75825f9', '测试33323', '', null, null, '', '', 'text-0101', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_japanese', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-10 10:52:09', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);
INSERT INTO `t_resource_info` VALUES ('4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10b22050009', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2011', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e2caf10004', '2018-09-10 11:22', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, '0');
INSERT INTO `t_resource_info` VALUES ('5af02c4c512649cca6fb4dad8d7e1018', '37ce397ddb2a4f788940b6def6cb7146', 'New Testament Tools, Studies and Documents', 'new testament tools studies documents', null, null, 'Bart D Ehrman, Eldon J Epp', null, '1001-3211', null, null, '402881e46546c1c6016546cac01a0004', null, '20卷', 'C002002', 'Brill', 'country_netherlands', '2010', '2000', 'language_english', 'publishing_frequency_quarterly', 'Soins. Cadres de Sante', null, 'http://www.brill.nl/default.aspx?partid=18&pid=7398', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('5d938e73d7a04fcaac1f40c254f2e30b', '61feda3c1e03452a9c3f74ed4343dc84', 'Lift & Crane Applications and Equipment', 'lift crane applications equipment', null, null, 'Pat Walker (Editor-in-Chief), Lindsey Anderson (Managing Editor)', '1832-4444', null, null, null, '402881e46546c1c6016546cac01a0004', null, '23卷', 'C002002', 'Milo Media LLC', 'country_UnitedStates', '2013', '2003', 'language_english', 'publishing_frequency_monthly', 'Maritim Logg: paa sjoemannens side', null, 'http://www.liftlink.com', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('5fa01cfd6cf4453b894c638cfa85bfc9', '2b7c4b6c566b4d68bf0f9b151395b901', 'ceshitianjia1111321', '', null, null, '', '', '', '', '321321', null, null, '', 'C002001', '321321321', 'country_Germany', '', '', 'language_english,language_japanese', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-04 16:15:43', '402881f364a0f38c0164a0f529b00000', 'admin', '8a808bf264a0bef00164a0f78df00006', '1', '3', null, '0');
INSERT INTO `t_resource_info` VALUES ('608f53d714c146e5a23d23c9267bbdfe', '19d2fcbca23943ac98e1560a784fc7a1', '测试添加4545', '测试添加4545', null, null, '测试添加4545', '', 'text-1222', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english,language_japanese', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-10 10:55:35', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);
INSERT INTO `t_resource_info` VALUES ('6e73e045b7514b49a9a5b9d3e8409aae', 'b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', '1234123', null, '测试123', '测试123', '测试123', '测试123', '测试123', null, null, '1', '8a808bf264a102ba0164a10afefe0008', '测试123', '402881eb6531fff80165323c0e540002', '2018', '2018', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '测试123', null, '测试123', '40289981653640c301653643a9d80001', '测试123', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-07 16:42', '402881f364a0f38c0164a0f529b00000', 'admin', '402881e964a283ce0164a297c3f00000', '1', '3', null, '0');
INSERT INTO `t_resource_info` VALUES ('76e0358b5f9042fa81d429c9c92e99a6', 'bb2b43f387ef471aa2b5ede06c560c65', 'Uniting World', 'uniting world', null, null, 'Jennifer Weis', null, null, null, '1671-5373', '402881e46546c1c6016546cac01a0004', null, '14卷', 'C002002', 'Uniting International Mission', 'country_GermanyAustralia', '2004', '1994', 'language_english', 'publishing_frequency_quarterly', 'Databased Advisor Magazine: expert advice on business database, development & collaboration technology', null, 'http://www.uim.uca.org.au/uim/uim_resources/general/uniting_world', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('7abe08ff383743f78b4d71d23e16f5ec', '9e87984462834deeaa16c0a50f7138b8', 'Insider Commercial Property Guides. Midlands', 'insider commercial property guides midlands', null, null, 'Norbert Aprissnig, Sascha Burkhardt', null, null, null, '1001-652X', '402881e46546c1c6016546cac01a0004', null, '30卷', 'C002002', 'Newsco-Insider', 'country_UnitedKingdom', '2020', '2010', 'language_english', 'publishing_frequency_annual', 'V M B G - Mitteilungen (Ausgabe B G M)', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('82581620186341febefb0d615076a4e0', 'e6859546590b440797bbd65b542f8606', 'Gallery Guide', 'gallery guide', null, null, 'Norbert Aprissnig, Sascha Burkhardt', null, '7683-3342', null, null, '402881e46546c1c6016546cac01a0004', null, '32卷', 'C002002', 'Louise Blouin Media', 'country_UnitedStates', '2022', '2012', 'language_english', 'publishing_frequency_quarterly', 'Total Mobile', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('8736289344c34f428592e85a8eee3a66', 'b151bfda1b7e47049cf507a992ee8600', 'Journal of Coatings Technology and Research', 'journal coatings technology research', null, null, 'Ray Dickie (Editor-in-Chief)', null, null, '3827-9102', null, '402881e46546c1c6016546cac01a0004', null, '29卷', 'C002002', 'Springer New York LLC', 'country_UnitedStates', '2019', '2009', 'language_english', 'publishing_frequency_monthly', 'Xiandaihua Nongye', null, 'http://www.springer.com/west/home/materials?SGWID=4-10041-70-173705603-0&teaserId=272095&CENTER_ID=71177', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('923048e5aa28438b83f5a5d5196632ed', 'ccb196a57c71482dae41487124e6e0eb', '测试xxxxl', '测试xxxxl', null, null, '测试xxxxl', '', 'texx-xxxl', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-10 10:58:32', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);
INSERT INTO `t_resource_info` VALUES ('a7ab949aaed14456a93c75b2b654ecdd', '240d928ed2ea49ba88f7c1bdb9b15d14', 'L X I Connexion', 'l x i connexion', null, null, 'Michael Dewey, Paul Schreier', '1007-7623', null, null, null, '402881e46546c1c6016546cac01a0004', null, '27卷', 'C002002', 'Nelson Publishing, Inc.', 'country_UnitedStates', '2017', '2007', 'language_english', 'publishing_frequency_daily', 'V M B G Mitteilungen (Ausgabe B G M S)', null, 'http://www.lxiconnexion.com/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('acffb5eba29143448ad8cdcca6ce464d', '0dfed2bba4ff461f83d073cf03ff05bc', 'Natural History Museum in Belgrade. Bulletin', 'natural history museum belgrade bulletin', null, null, 'Ljiljana Protic (Editor-in-Chief)', null, null, '1921-3212', null, '402881e46546c1c6016546cac01a0004', null, '25卷', 'C002002', 'Prirodnjacki Muzej u Beogradu', 'country_Germany', '2015', '2005', 'language_english', 'publishing_frequency_bimonthly', 'Yonne Eco', null, 'http://prirodnjackimuzej.org/index.php?option=com_content&task=view&id=68&Itemid=51', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('aefa82de8e4445e19e25cc701168407e', '13ac340a008b4d7198ee2348232a2c55', 'Where GuestBook. Tennessee: Nashville & Memphis', 'where guestbook tennessee nashville memphis', null, null, 'Jennifer Weis', '1002-0713', null, null, null, '402881e46546c1c6016546cac01a0004', null, '11卷', 'C002002', 'Morris Visitor Publications', 'country_UnitedStates', '2001', '1991', 'language_english', 'publishing_frequency_monthly', 'Electricity Week', null, 'http://wheretraveler.com/classic/us/tn/nas/tp/gb/current/HTML/Pair.html?-1:81', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c30165364515d40004', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 13:52', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, '0');
INSERT INTO `t_resource_info` VALUES ('b863c825902e43e2a6f924e7ebb34b05', '8db8e81a2612434eb50044889ed00ab1', 'Victoria, South Australia, Tasmania Nursery Register: the who-grows-it, where-to-get-it directory of the nursery industry', 'victoria south australia tasmania nursery register who grows it where to get it directory nursery industry', null, null, 'Jennifer Weis', null, '1007-9637', null, null, '402881e46546c1c6016546cac01a0004', null, '12卷', 'C002002', 'The Reference Publishing Co. Ltd.', 'country_GermanyAustralia', '2002', '1992', 'language_english', 'publishing_frequency_annual', 'The Eagle (Union)', null, 'http://www.ausreg.com.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('b9fc2d02fcd245ef80d85ab1b05ae3c8', '63800b5b825142bfab75bcdc50eaf1ea', 'F+D Fotografie', 'f d fotografie', null, null, 'Norbert Aprissnig, Sascha Burkhardt', null, null, '3874-3241', null, '402881e46546c1c6016546cac01a0004', null, '33卷', 'C002002', 'Blauw Media Uitgeverij B.V.', 'country_netherlands', '2023', '2013', 'language_english', 'publishing_frequency_daily', 'Total Securitization: the market source for he latest global news on ABS, MBS, CMBS and CDOs', null, 'http://www.handbook.uts.edu.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('c0a3d56880064495978ae8d4d84b7b84', '92a0fb60e8154a2cb4235cdde162362d', 'Where GuestBook', 'GuestBook', null, null, '', '', '', '', '1001-3213', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_UnitedStates', '2015', '2012', 'language_chinese,language_english,language_japanese', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-03 14:44:32', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('c960bb5c21a84e299175e2bcc7dcfd40', 'c18fd9bb1fb94140833897fa701e5f61', 'New South Wales. Department of Water and Energy. Annual Report', 'new south wales department water energy annual report', null, null, 'Pat Walker (Editor-in-Chief), Lindsey Anderson (Managing Editor)', null, null, null, '1654-3342', '402881e46546c1c6016546cac01a0004', null, '22卷', 'C002002', 'New South Wales, Department of Water and Energy', 'country_GermanyAustralia', '2012', '2002', 'language_english', 'publishing_frequency_irregular', 'K R O Extra', null, 'http://www.dwe.nsw.gov.au/about/reports.shtml', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('d2239494e3ba48d38367a6346a24d60c', '18fab18a8d0d4550bcc36cedd8c5f274', 'South East & West Fishing', 'south east west fishing', null, null, 'Jennifer Weis', null, null, '1002-0845', null, '402881e46546c1c6016546cac01a0004', null, '13卷', 'C002002', 'East Gippsland Newspapers', 'country_GermanyAustralia', '2003', '1993', 'language_english', 'publishing_frequency_bimonthly', 'Dessert Professional: pastry, baking, chocolate and ice cream', null, 'http://www.eastvicmedia.com.au/index.php?option=com_content&task=view&id=133&Itemid=233', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:23', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('e285445a1a6a491181ba9e3d23671679', 'a43aff8b2dff4a3ebe49a5c347398f27', 'Parkersburg News and Sentinel', 'parkersburg news sentinel', null, null, 'Bart D Ehrman, Eldon J Epp', '1262-8732', null, null, null, '402881e46546c1c6016546cac01a0004', null, '19卷', 'C002002', 'Ogden Newspapers of Minnesota, Inc.', 'country_UnitedStates', '2009', '1999', 'language_english', 'publishing_frequency_bimonthly', 'Travel Weekly (Australia)', null, 'http://newsandsentinel.com/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('ed28515c39ed42d3861d249c944aa278', '138f734897634ac38f17ebf951ad8850', 'N S W Civil Practice & Procedure', 'n s w civil practice procedure', null, null, 'Ljiljana Protic (Editor-in-Chief)', null, '1001-324X', null, null, '402881e46546c1c6016546cac01a0004', null, '24卷', 'C002002', 'Lawbook Co.', 'country_GermanyAustralia', '2014', '2004', 'language_english', 'publishing_frequency_annual', 'Journal fuer Gynaekologische Endokrinologie (Print): Assistierte Reproduktion - Kontrazeption - Menopause', null, 'http://www.thomsonreuters.com.au/catalogue/shopexd.asp?id=1181', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', null, '0', null, null, '0');
INSERT INTO `t_resource_info` VALUES ('ee8f9dc99cae45df8f98f3ef0994d24c', 'dc6bb7d82bc3453c94b4b817396c1f1b', 'Smart Investor', 'smart investor', null, null, 'Nicole Pedersen-McKinnon, Michael Gill (Editor-in-Chief)', null, null, null, '1671-6371', '402881e46546c1c6016546cac01a0004', null, '18卷', 'C002002', 'Fairfax Business Media', 'country_GermanyAustralia', '2008', '1998', 'language_english', 'publishing_frequency_annual', 'Antiques & Collectibles Journal', null, 'http://www.afrsmartinvestor.com.au/', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_active', '2018-09-03 14:21:24', 'dcb6d33d-ab73-428c-8b9a-70bed2b30571', 'kirswu', '8a808bf264a0bef00164a0f78df00006', '0', '0', 'yes', '0');
INSERT INTO `t_resource_info` VALUES ('f6650a8d38dd48b8964248f6c123f6d5', 'a382f3d875664b1eb60bbc773c033e95', '测试添加3323', '测试添加3323', null, null, '测试添加3323', '', 'texx-3332', '', '', null, null, 'ceshi1231', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '2010', '2011', 'language_english,language_japanese', 'publishing_frequency_monthly', '测试添加3323', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '印刷本', 'state_publication_merged/incorporated', '2018-09-10 09:24:47', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);
INSERT INTO `t_resource_info` VALUES ('ff16ee624d8b477dad851e882336f744', '3c2c908845b54fa693a8cae70ccfe4c2', 'ceshi kjh', 'ceshi kjh', null, null, 'ceshi kjh', '', 'text-1232', '', '', '402881e46546c1c6016546cac01a0004', null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', '2018-09-10 10:59:15', '402881f364a0f38c0164a0f529b00000', 'admin', null, '0', '0', null, null);

-- ----------------------------
-- Table structure for t_resource_info_record
-- ----------------------------
DROP TABLE IF EXISTS `t_resource_info_record`;
CREATE TABLE `t_resource_info_record` (
  `id` varchar(36) DEFAULT NULL COMMENT '序号',
  `info_id` varchar(50) DEFAULT NULL COMMENT '资源表id',
  `recommend_id` varchar(36) DEFAULT NULL COMMENT '荐购id',
  `title` varchar(500) DEFAULT NULL COMMENT '题名',
  `other_title` varchar(500) DEFAULT NULL COMMENT '其他题名',
  `series_number` int(10) DEFAULT NULL COMMENT '分辑号',
  `series_title` varchar(500) DEFAULT NULL COMMENT '分辑名',
  `author` varchar(255) DEFAULT NULL COMMENT '责任者',
  `Pissn` varchar(9) DEFAULT NULL COMMENT '印本ISSN',
  `Eissn` varchar(9) DEFAULT NULL COMMENT '电子ISSN',
  `Pisbn` varchar(9) DEFAULT NULL COMMENT '印本isbn',
  `Eisbn` varchar(9) DEFAULT NULL COMMENT '电子isbn',
  `cover_id` varchar(36) DEFAULT NULL COMMENT '套id',
  `kind_id` varchar(36) DEFAULT NULL COMMENT '种类id',
  `coiling_period` varchar(10) DEFAULT NULL COMMENT '卷期',
  `subject` varchar(50) DEFAULT NULL COMMENT '学科',
  `publisher` varchar(255) DEFAULT NULL COMMENT '出版社',
  `country` varchar(250) DEFAULT NULL COMMENT '国别',
  `pub_year` varchar(12) DEFAULT NULL COMMENT '出版年',
  `founded_year` varchar(12) DEFAULT NULL COMMENT '创刊年',
  `language` varchar(500) DEFAULT NULL COMMENT '语种',
  `pub_feq` varchar(50) DEFAULT NULL COMMENT '出版频率',
  `Intro` varchar(500) DEFAULT NULL COMMENT '内容简介',
  `classi_number` varchar(11) DEFAULT NULL COMMENT '分类号',
  `url` varchar(255) DEFAULT NULL COMMENT '期刊URL地址',
  `carrier` varchar(50) DEFAULT NULL COMMENT '载体',
  `type` varchar(50) DEFAULT NULL COMMENT '文献类型',
  `pub_pattern` varchar(50) DEFAULT NULL COMMENT '出版模式',
  `pub_status` varchar(50) DEFAULT NULL COMMENT '出版状态',
  `systime` varchar(20) DEFAULT NULL COMMENT '修改日期',
  `sysuserid` varchar(36) DEFAULT NULL COMMENT '修改人id',
  `sysusername` varchar(20) DEFAULT NULL COMMENT '修改人姓名',
  `dist_unit` varchar(255) DEFAULT NULL COMMENT '分配成员单位'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resource_info_record
-- ----------------------------
INSERT INTO `t_resource_info_record` VALUES ('6e73e045b7514b49a9a5b9d3e8409aae', '6e73e045b7514b49a9a5b9d3e8409aae', 'b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', '1234123', null, '测试123', '测试123', '测试123', '测试123', '测试123', null, null, '1', '8a808bf264a102ba0164a10afefe0008', '测试123', '402881eb6531fff80165323c0e540002', '2018', '2018', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '测试123', null, '测试123', '40289981653640c301653643a9d80001', '测试123', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-07 14:35', '402881f364a0f38c0164a0f529b00000', 'admin', '402881e964a283ce0164a297c3f00000');
INSERT INTO `t_resource_info_record` VALUES ('1aa26acf9c0c457ab69eb1ec2e158e80', '6e73e045b7514b49a9a5b9d3e8409aae', 'b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', null, null, '测试123', '测试123', '测试123', '测试123', '测试123', null, null, '1', '8a808bf264a102ba0164a10afefe0008', '测试123', '402881eb6531fff80165323c0e540002', '2017', '2018', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '测试123', null, '测试123', '40289981653640c301653643a9d80001', '测试123', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-07 14:59', '402881f364a0f38c0164a0f529b00000', 'admin', '402881e964a283ce0164a297c3f00000');
INSERT INTO `t_resource_info_record` VALUES ('fcf2834c33a34bfda58c9b11b98e4d1c', '6e73e045b7514b49a9a5b9d3e8409aae', 'b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', null, null, '测试123', '测试123', '测试123', '测试123', '测试123', null, null, '1', '8a808bf264a102ba0164a10afefe0008', '测试123', '402881eb6531fff80165323c0e540002', '2018', '2018', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '测试123', null, '测试123', '40289981653640c301653643a9d80001', '测试123', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-07 16:42', '402881f364a0f38c0164a0f529b00000', 'admin', '402881e964a283ce0164a297c3f00000');
INSERT INTO `t_resource_info_record` VALUES ('b2cec424f9b84819a50910dc97298b84', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c3016536456bd80005', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 12:25', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('45814841b1ad405b8a0a5bdd2a5aa645', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-07 17:10', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('4eb10c6c019d41f0b5fa420fc0d9ecbf', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2011', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:09', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('5574814605d94c73983a4faa461033e2', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2011', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:07', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('b62720f361e54b5192dcd68ee62341f2', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2010', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:08', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('1fe090b8fb7b4602b70e3e9c8c05c900', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2011', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:09', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('8b48ea0b68e341ca930bca120b3b7814', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2018', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:14', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('25e8e3643e6a4a07ade45dbf2bebe8ee', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2019', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '4028818765524525016552519f980003', '402881eb6531d437016531e179740002', '2018-09-10 10:17', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('71aa62b4bb004f3198d4787de3a35cd9', '4eb10c6c019d41f0b5fa420fc0d9ecbf', '61786656e7f04ed5aadbf82d42e83425', 'ceshi1122', 'ceshi1122', null, null, 'ceshi1122', '', 'text-1231', '', '', null, null, 'ceshi1231', '8a808bf264a102ba0164a10b22050009', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2011', '2011', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', 'ceshi1122', null, 'www.baidu.com', 'carrier_print', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e2caf10004', '2018-09-10 11:22', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('d9353b190a7947c8a52e1f27ad98df40', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 11:26', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('14a1720d53b84bee833a18937be71b22', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c301653644a9c10003', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 11:29', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('a2cdca834b71474688baa561768eca73', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c3016536456bd80005', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 12:25', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('4f12ae6f6486473a9619211fc30e90ab', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c30165364515d40004', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 12:25', '402881f364a0f38c0164a0f529b00000', 'admin', null);
INSERT INTO `t_resource_info_record` VALUES ('b9041811e8414eea8944e2dcf56cbab8', 'b2cec424f9b84819a50910dc97298b84', '3c046c40c38248bcad9a250138ebf950', '测试212121', '测试212121', null, null, '测试212121', '321321321', '', '', '', null, null, '', '8a808bf264a102ba0164a10afefe0008', 'Blauw Media Uitgeverij B.V.', '402881eb6531fff80165323c0e540002', '2015', '2016', '402881ef653649ee0165365059b60002,402881ef653649ee01653651586d0004', 'publishing_frequency_monthly', '', null, '', '40289981653640c30165364515d40004', '期刊[J]', '402881876552452501655251e53f0004', '402881eb6531d437016531e179740002', '2018-09-10 13:52', '402881f364a0f38c0164a0f529b00000', 'admin', null);

-- ----------------------------
-- Table structure for t_resource_log
-- ----------------------------
DROP TABLE IF EXISTS `t_resource_log`;
CREATE TABLE `t_resource_log` (
  `id` varchar(36) NOT NULL COMMENT '序号',
  `recommend_id` varchar(36) NOT NULL COMMENT '荐购id',
  `title` varchar(500) DEFAULT NULL COMMENT '题名',
  `other_title` varchar(500) DEFAULT NULL COMMENT '其他题名',
  `series_number` int(10) DEFAULT NULL COMMENT '分辑号',
  `series_title` varchar(500) DEFAULT NULL COMMENT '分辑名',
  `author` varchar(255) DEFAULT NULL COMMENT '责任者',
  `Pissn` varchar(9) DEFAULT NULL COMMENT '印本ISSN',
  `Eissn` varchar(9) DEFAULT NULL COMMENT '电子ISSN',
  `Pisbn` varchar(9) DEFAULT NULL COMMENT '印本isbn',
  `Eisbn` varchar(9) DEFAULT NULL COMMENT '电子isbn',
  `cover_id` varchar(36) DEFAULT NULL COMMENT '套id',
  `kind_id` varchar(36) DEFAULT NULL COMMENT '种类id',
  `coiling_period` varchar(10) DEFAULT NULL COMMENT '卷期',
  `subject` varchar(50) NOT NULL COMMENT '学科',
  `publisher` varchar(255) DEFAULT NULL COMMENT '出版社',
  `country` varchar(50) DEFAULT NULL COMMENT '国别',
  `pub_year` varchar(12) DEFAULT NULL COMMENT '出版年',
  `founded_year` varchar(12) DEFAULT NULL COMMENT '创刊年',
  `language` varchar(500) DEFAULT NULL COMMENT '语种',
  `pub_feq` varchar(50) DEFAULT NULL COMMENT '出版频率',
  `Intro` varchar(500) DEFAULT NULL COMMENT '内容简介',
  `classi_number` varchar(11) DEFAULT NULL COMMENT '分类号',
  `url` varchar(255) DEFAULT NULL COMMENT '期刊URL地址',
  `carrier` varchar(20) DEFAULT NULL COMMENT '载体',
  `type` varchar(20) DEFAULT NULL COMMENT '文献类型',
  `pub_pattern` varchar(50) DEFAULT NULL COMMENT '出版模式',
  `pub_status` varchar(50) DEFAULT NULL COMMENT '出版状态',
  `flow_status` varchar(255) DEFAULT NULL COMMENT '审核状态',
  `flow_one_userid` varchar(36) DEFAULT NULL COMMENT '初审人id',
  `flow_one_username` varchar(20) DEFAULT NULL COMMENT '初审人姓名',
  `flow_one_systime` varchar(20) DEFAULT NULL COMMENT '初审日期',
  `flow_two_userid` varchar(36) DEFAULT NULL COMMENT '复审人id',
  `flow_two_username` varchar(20) DEFAULT NULL COMMENT '复审人姓名',
  `flow_two_systime` varchar(20) DEFAULT NULL COMMENT '复审日期',
  `change_description` varchar(255) DEFAULT NULL COMMENT '变更说明',
  `sys_time` varchar(20) DEFAULT NULL COMMENT '修改日期',
  `sys_user_id` varchar(36) DEFAULT NULL COMMENT '修改人id',
  `sys_username` varchar(20) DEFAULT NULL COMMENT '修改人姓名',
  `create_id` varchar(36) DEFAULT NULL,
  `create_time` varchar(20) DEFAULT NULL,
  `dist_unit` varchar(50) DEFAULT NULL COMMENT '分配成员单位',
  `distribution_status` int(1) DEFAULT '1' COMMENT '0 荐购审核未通过 1 未分配 2 已分配 3 审核通过 4 审核驳回 5 订单驳回',
  `order_u_number` varchar(50) DEFAULT '' COMMENT '订单ID',
  `trial_opinion` varchar(255) DEFAULT NULL,
  `changedescription` varchar(255) DEFAULT NULL,
  `systime` varchar(255) DEFAULT NULL,
  `sysuserid` varchar(255) DEFAULT NULL,
  `sysusername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`recommend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_resource_log
-- ----------------------------
INSERT INTO `t_resource_log` VALUES ('10f6d95b646a4979ae809d0cdbed22e0', 'f2496e319aee4db3b30b5598ccca7e21', 'lalallall', '', null, null, '', '', '3123213', '', '', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_english,language_japanese,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', null, null, null, null, null, null, null, null, '2018-09-06 10:26:03', '402881f364a0f38c0164a0f529b00000', 'admin', null, null, '8a808bf264a0bef00164a0f58bc60005', '2', 'J000000004', null, null, null, null, null);
INSERT INTO `t_resource_log` VALUES ('369bee7065954477816d6af2f40912a9', '2d5f51a7526e43ed8866790b095b8157', '测试添加11111', '', null, null, '', '', '11111', '', '', null, null, '', 'C002001', '321321321', 'country_Germany', '', '', 'language_english,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', null, null, null, null, null, null, null, null, '2018-09-04 13:41:16', '402881f364a0f38c0164a0f529b00000', 'admin', null, null, '8a808bf264a0bef00164a0f78df00006', '2', 'J000000001', 'yes', null, null, null, null);
INSERT INTO `t_resource_log` VALUES ('3f9c510fa83748c4b762b87e18fdb316', 'bd61aea70bca4c44990c64da16e192b9', 'ceshitianjia2', '', null, null, '', '', '', '', '11211131', null, null, '', 'C002001', 'Blauw Media Uitgeverij B.V.', 'country_Germany', '', '', 'language_japanese,language_french', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', null, null, null, null, null, null, null, null, '2018-09-04 15:08:41', '402881f364a0f38c0164a0f529b00000', 'admin', null, null, '8a808bf264a0bef00164a0f78df00006', '2', 'J000000002', null, null, null, null, null);
INSERT INTO `t_resource_log` VALUES ('5fa01cfd6cf4453b894c638cfa85bfc9', '2b7c4b6c566b4d68bf0f9b151395b901', 'ceshitianjia1111321', '', null, null, '', '', '', '', '321321', null, null, '', 'C002001', '321321321', 'country_Germany', '', '', 'language_english,language_japanese', 'publishing_frequency_monthly', '', null, '', 'carrier_print', '', '', 'state_publication_active', null, null, null, null, null, null, null, null, '2018-09-04 16:15:43', '402881f364a0f38c0164a0f529b00000', 'admin', null, null, '8a808bf264a0bef00164a0f78df00006', '2', 'J000000003', null, null, null, null, null);
INSERT INTO `t_resource_log` VALUES ('6e73e045b7514b49a9a5b9d3e8409aae', 'b5cbd8fce76a47bfbe4b0b9475f3f195', '测试123', '测试123', null, null, '测试123', '测试123', '测试123', '测试123', '测试123', null, null, '1', 'C002002', '测试123', 'country_Germany', '2018', '2018', 'language_chinese', 'publishing_frequency_monthly', '测试123', null, '测试123', 'carrier_print', '测试123', '测试123', 'state_publication_active', null, null, null, null, null, null, null, null, '2018-09-06 14:57:10', '402881f364a0f38c0164a0f529b00000', 'admin', null, null, '402881e964a283ce0164a297c3f00000', '2', 'J000000005', null, null, null, null, null);
