/*
 Navicat Premium Dump SQL

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80043 (8.0.43)
 Source Host           : localhost:3306
 Source Schema         : db_homework

 Target Server Type    : MySQL
 Target Server Version : 80043 (8.0.43)
 File Encoding         : 65001

 Date: 19/12/2025 20:45:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID,主键',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  `gender` tinyint UNSIGNED NOT NULL COMMENT '性别, 1:男, 2:女',
  `phone` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '手机号',
  `job` tinyint UNSIGNED NULL DEFAULT NULL COMMENT '职位, 1:班主任,2:讲师,3:学工主管,4:教研主管,5:咨询师',
  `salary` int UNSIGNED NULL DEFAULT NULL COMMENT '薪资',
  `image` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `entry_date` date NULL DEFAULT NULL COMMENT '入职日期',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username` ASC) USING BTREE,
  UNIQUE INDEX `phone`(`phone` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '员工表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, 'shinaian', '123456', '施耐庵', 1, '13309090001', 4, 15000, '1.jpg', '2000-01-01', '2023-10-27 16:35:33', '2023-10-27 16:35:35');
INSERT INTO `emp` VALUES (2, 'songjiang', '123456', '宋江', 1, '13309090002', 2, 8600, '2.jpg', '2015-01-01', '2023-10-27 16:35:33', '2023-10-27 16:35:37');
INSERT INTO `emp` VALUES (3, 'lujunyi', '123456', '卢俊义', 1, '13309090003', 2, 8900, '3.jpg', '2008-05-01', '2023-10-27 16:35:33', '2023-10-27 16:35:39');
INSERT INTO `emp` VALUES (4, 'wuyong', '123456', '吴用', 1, '13309090004', 2, 9200, '4.jpg', '2007-01-01', '2023-10-27 16:35:33', '2023-10-27 16:35:41');
INSERT INTO `emp` VALUES (5, 'gongsunsheng', '123456', '公孙胜', 1, '13309090005', 2, 9500, '5.jpg', '2012-12-05', '2023-10-27 16:35:33', '2023-10-27 16:35:43');
INSERT INTO `emp` VALUES (6, 'huosanniang', '123456', '扈三娘', 2, '13309090006', 3, 6500, '6.jpg', '2013-09-05', '2023-10-27 16:35:33', '2023-10-27 16:35:45');
INSERT INTO `emp` VALUES (7, 'chaijin', '123456', '柴进', 1, '13309090007', 1, 4700, '7.jpg', '2005-08-01', '2023-10-27 16:35:33', '2023-10-27 16:35:47');
INSERT INTO `emp` VALUES (8, 'likui', '123456', '李逵', 1, '13309090008', 1, 4800, '8.jpg', '2014-11-09', '2023-10-27 16:35:33', '2023-10-27 16:35:49');
INSERT INTO `emp` VALUES (9, 'wusong', '123456', '武松', 1, '13309090009', 1, 4900, '9.jpg', '2011-03-11', '2023-10-27 16:35:33', '2023-10-27 16:35:51');
INSERT INTO `emp` VALUES (10, 'lichong', '123456', '林冲', 1, '13309090010', 1, 5000, '10.jpg', '2013-09-05', '2023-10-27 16:35:33', '2023-10-27 16:35:53');
INSERT INTO `emp` VALUES (11, 'huyanzhuo', '123456', '呼延灼', 1, '13309090011', 2, 9700, '11.jpg', '2007-02-01', '2023-10-27 16:35:33', '2023-10-27 16:35:55');
INSERT INTO `emp` VALUES (12, 'xiaoliguang', '123456', '小李广', 1, '13309090012', 2, 10000, '12.jpg', '2008-08-18', '2023-10-27 16:35:33', '2023-10-27 16:35:57');
INSERT INTO `emp` VALUES (13, 'yangzhi', '123456', '杨志', 1, '13309090013', 1, 5300, '13.jpg', '2012-11-01', '2023-10-27 16:35:33', '2023-10-27 16:35:59');
INSERT INTO `emp` VALUES (14, 'shijin', '123456', '史进', 1, '13309090014', 2, 10600, '14.jpg', '2002-08-01', '2023-10-27 16:35:33', '2023-10-27 16:36:01');
INSERT INTO `emp` VALUES (15, 'sunerniang', '123456', '孙二娘', 2, '13309090015', 2, 10900, '15.jpg', '2011-05-01', '2023-10-27 16:35:33', '2023-10-27 16:36:03');
INSERT INTO `emp` VALUES (16, 'luzhishen', '123456', '鲁智深', 1, '13309090016', 2, 9600, '16.jpg', '2010-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:05');
INSERT INTO `emp` VALUES (17, 'liying', '12345678', '李应', 1, '13309090017', 1, 5800, '17.jpg', '2015-03-21', '2023-10-27 16:35:33', '2023-10-27 16:36:07');
INSERT INTO `emp` VALUES (18, 'shiqian', '123456', '时迁', 1, '13309090018', 2, 10200, '18.jpg', '2015-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:09');
INSERT INTO `emp` VALUES (19, 'gudasao', '123456', '顾大嫂', 2, '13309090019', 2, 10500, '19.jpg', '2008-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:11');
INSERT INTO `emp` VALUES (20, 'ruanxiaoer', '123456', '阮小二', 1, '13309090020', 2, 10800, '20.jpg', '2018-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:13');
INSERT INTO `emp` VALUES (21, 'ruanxiaowu', '123456', '阮小五', 1, '13309090021', 5, 5200, '21.jpg', '2015-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:15');
INSERT INTO `emp` VALUES (22, 'ruanxiaoqi', '123456', '阮小七', 1, '13309090022', 5, 5500, '22.jpg', '2016-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:17');
INSERT INTO `emp` VALUES (23, 'ruanji', '123456', '阮籍', 1, '13309090023', 5, 5800, '23.jpg', '2012-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:19');
INSERT INTO `emp` VALUES (24, 'tongwei', '123456', '童威', 1, '13309090024', 5, 5000, '24.jpg', '2006-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:21');
INSERT INTO `emp` VALUES (25, 'tongmeng', '123456', '童猛', 1, '13309090025', 5, 4800, '25.jpg', '2002-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:23');
INSERT INTO `emp` VALUES (26, 'yanshun', '123456', '燕顺', 1, '13309090026', 5, 5400, '26.jpg', '2011-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:25');
INSERT INTO `emp` VALUES (27, 'lijun', '123456', '李俊', 1, '13309090027', 5, 6600, '27.jpg', '2004-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:27');
INSERT INTO `emp` VALUES (28, 'lizhong', '123456', '李忠', 1, '13309090028', 5, 5000, '28.jpg', '2007-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:29');
INSERT INTO `emp` VALUES (29, 'songqing', '123456', '宋清', 1, '13309090029', 5, 5100, '29.jpg', '2020-01-01', '2023-10-27 16:35:33', '2023-10-27 16:36:31');
INSERT INTO `emp` VALUES (30, 'liyun', '123456', '李云', 1, '13309090030', NULL, NULL, '30.jpg', '2020-03-01', '2023-10-27 16:35:33', '2023-10-27 16:36:31');

SET FOREIGN_KEY_CHECKS = 1;
-- 1. 往emp表中插入一条测试数据， 全部的字段都需要插入值 。
    INSERT INTO emp VALUES (31, 'shinaian', '123456', '施耐庵', 1, '13309090031', 4, 15000, '31.jpg', '2000-01-01', '2023-10-27 16:35:33', '2023-10-27 16:35:35');

-- 2. 批量往emp表中插入两条测试数据， 全部的字段都需要插入值 。
    INSERT INTO emp VALUES (32, 'shinaian', '123456', '施耐庵', 1, '13309090032', 4, 15000, '32.jpg', '2000-01-01', '2023-10-27 16:35:33', '2023-10-27 16:35:35'),

-- 3. 为id为2,4,6,8,9这个几个员工，涨100块钱工资 （在当前薪资的基础上 + 100）。
    UPDATE emp SET salary = salary + 100 WHERE id IN (2,4,6,8,9);

-- 4. 删除id为30,31的员工信息
    DELETE FROM emp WHERE id IN (30,31);

-- 5. 将id为6，7，9，12这个几个员工的 入职日期修改为 '2018-09-10' , 密码修改为 '1234567'
    UPDATE emp SET entry_date = '2018-09-10', password = '1234567' WHERE id IN (6,7,9,12);

-- 1. 查询指定字段 name,entry_date 并设置别名为 姓名、入职日期 并返回
    SELECT name AS 姓名, entry_date AS 入职日期 FROM emp;

-- 2. 查询返回所有字段 （两种写法哦）
    SELECT * FROM emp;

-- 3. 查询性别为女 且 有职位的员工，要求查询出 name,entry_date 并起别名 (姓名、入职日期)
    SELECT name AS 姓名, entry_date AS 入职日期 FROM emp WHERE gender = 2;

-- 4. 查询已有的员工关联了 哪几种 职位(不要重复)
    SELECT DISTINCT job FROM emp;

-- 5. 查询 姓名 为 '童威' 或 入职时间在 '2000-01-01' 到 '2010-01-01' 的员工
    SELECT name AS 姓名, entry_date AS 入职日期 FROM emp WHERE name = '童威' OR entry_date BETWEEN '2000-01-01' AND '2010-01-01';

-- 6. 查询在 薪资小于等于5000 的员工信息
    SELECT * FROM emp WHERE salary <= 5000;

-- 7. 查询 没有分配职位 的员工信息
    SELECT * FROM emp WHERE job IS NULL;

-- 8. 查询 有职位 的员工信息
    SELECT * FROM emp WHERE job IS NOT NULL;

-- 9. 查询 密码不等于 '123456' 或 没有职位的员工信息
    SELECT * FROM emp WHERE password != '123456' OR job IS NULL;

-- 10. 查询入职日期 在 '2000-01-01' (包含) 到 '2015-01-01'(包含) 之间的员工信息
    SELECT * FROM emp WHERE entry_date BETWEEN '2000-01-01' AND '2015-01-01';

-- 11. 查询 入职时间 在 '2000-01-01' (包含) 到 '2015-01-01'(包含) 之间 且 性别为女 的员工信息
    SELECT * FROM emp WHERE entry_date BETWEEN '2000-01-01' AND '2015-01-01' AND gender = 2;

-- 12. 查询 职位是 2 (讲师) 或 3 (学工主管) 或 4 (教研主管) 的员工信息（两种写法实现）
    SELECT * FROM emp WHERE job IN (2,3,4);

-- 13. 查询姓名为两个字 且 性别为男 且 薪资高于5000 的员工信息
    SELECT * FROM emp WHERE name LIKE '__小%' AND gender = 1 AND salary > 5000;

-- 14. 查询姓名中包含 '小' 的员工信息  且  入职时间在 '2008-01-01' 之后入职的员工
    SELECT * FROM emp WHERE name LIKE '%小%' AND entry_date > '2008-01-01';

-- 15. 查询出 性别为 男 , 或 入职时间在 '2010-01-01' 之后入职的员工
    SELECT * FROM emp WHERE gender = 1 OR entry_date > '2010-01-01';

-- 16. 查询有职位的， 且 姓名为两个字 的员工信息
    SELECT * FROM emp WHERE job IS NOT NULL AND name LIKE '__小%';

-- 17. 查询所有的性别为男(gender 为 1)的 讲师 (job 为 2) 的员工信息
    SELECT * FROM emp WHERE gender = 1 AND job = 2;

-- 18. 查询薪资小于 8000 或 入职时间在 2010-10-09 之后入职的员工信息
    SELECT * FROM emp WHERE salary < 8000 OR entry_date > '2010-10-09';

-- 19. 根据性别分组 , 统计男性和女性员工的数量
    SELECT gender, COUNT(*) AS 数量 FROM emp GROUP BY gender;

-- 22. 先查询入职时间在 '2015-01-01' (包含) 以前的员工 , 并对结果根据职位分组 , 获取员工数量大于等于2的职位
    SELECT job, COUNT(*) AS 数量 FROM emp WHERE entry_date <= '2015-01-01' GROUP BY job HAVING COUNT(*) >= 2;