/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : techmansys

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-06-20 14:38:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for choose
-- ----------------------------
DROP TABLE IF EXISTS `choose`;
CREATE TABLE `choose` (
  `stu_id` bigint(20) NOT NULL,
  `cour_no` int(11) NOT NULL,
  `teacher_id` bigint(20) NOT NULL,
  `grades` smallint(6) DEFAULT NULL,
  KEY `学生` (`stu_id`),
  KEY `教师` (`teacher_id`),
  KEY `课程` (`cour_no`),
  CONSTRAINT `学生` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `教师` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `课程` FOREIGN KEY (`cour_no`) REFERENCES `course` (`cour_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of choose
-- ----------------------------
INSERT INTO `choose` VALUES ('2017339960010', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960001', '1002', '1010002', null);
INSERT INTO `choose` VALUES ('2017339960001', '1011', '1010001', '98');
INSERT INTO `choose` VALUES ('2017339960002', '1011', '1010001', '88');
INSERT INTO `choose` VALUES ('2017339960003', '1011', '1010001', '92');
INSERT INTO `choose` VALUES ('2017339960004', '1011', '1010001', '66');
INSERT INTO `choose` VALUES ('2017339960005', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960008', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960009', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960010', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960012', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960013', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960014', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960015', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960016', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960017', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960018', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960019', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960020', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960021', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960022', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960023', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960024', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960025', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960026', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960027', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960028', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960029', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960030', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960031', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960032', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960033', '1011', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960001', '1010', '1010013', '88');
INSERT INTO `choose` VALUES ('2017339960002', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960003', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960004', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960005', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960008', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960009', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960010', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960012', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960013', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960014', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960015', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960016', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960017', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960018', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960019', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960020', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960021', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960022', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960023', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960024', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960025', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960026', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960027', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960028', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960029', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960030', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960031', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960032', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960033', '1010', '1010013', null);
INSERT INTO `choose` VALUES ('2017339960001', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960002', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960003', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960004', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960005', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960008', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960009', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960010', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960012', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960013', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960014', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960015', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960016', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960017', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960018', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960019', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960020', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960021', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960022', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960023', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960024', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960025', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960026', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960027', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960028', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960029', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960030', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960031', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960032', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960033', '1009', '1010007', null);
INSERT INTO `choose` VALUES ('2017339960035', '1001', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960035', '1003', '1010001', null);
INSERT INTO `choose` VALUES ('2017339960035', '1005', '1010014', '100');
INSERT INTO `choose` VALUES ('2017339960099', '1001', '1010001', null);

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cour_no` int(11) NOT NULL,
  `cour_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `credit` tinyint(4) NOT NULL,
  PRIMARY KEY (`cour_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1000', '计算机网络', '3');
INSERT INTO `course` VALUES ('1001', '操作系统', '3');
INSERT INTO `course` VALUES ('1002', '编译原理', '3');
INSERT INTO `course` VALUES ('1003', '计算机组成原理', '4');
INSERT INTO `course` VALUES ('1004', '计算机系统结构', '2');
INSERT INTO `course` VALUES ('1005', '线性代数', '3');
INSERT INTO `course` VALUES ('1006', '微积分', '4');
INSERT INTO `course` VALUES ('1007', '实变函数', '3');
INSERT INTO `course` VALUES ('1008', '数字逻辑电路', '3');
INSERT INTO `course` VALUES ('1009', '数据库系统原理', '3');
INSERT INTO `course` VALUES ('1010', '概率论与数理统计', '3');
INSERT INTO `course` VALUES ('1011', '数据结构', '4');
INSERT INTO `course` VALUES ('1012', 'Java程序设计', '3');
INSERT INTO `course` VALUES ('1013', '人工智能导论', '3');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `classes` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `subject` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`stu_id`),
  CONSTRAINT `stuId` FOREIGN KEY (`stu_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20173399600036 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2017339960001', 'Bob', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960002', 'Alan', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960003', 'Alice', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960004', 'Tom', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960005', 'Jerry', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960008', 'Peter', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960009', 'Cristal', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960010', 'Bill Gates', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960012', 'Mason', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960013', 'Liam', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960014', 'Mike', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960015', 'James', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960016', 'Ethan', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960017', 'Noah', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960018', 'Jacob', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960019', 'Justin', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960020', 'Jayden', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960021', 'Helen', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960022', 'Hale', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960023', 'Klies', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960024', 'Masin', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960025', 'Sin', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960026', 'Vidal', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960027', 'Rod', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960028', 'Rails', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960029', 'Jackson', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960030', 'Jealous', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960031', 'Tailn', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960032', 'Reain', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960033', 'Quail', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960035', 'Jalinyile', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960098', 'Gerge', '17计算机科学与技术(1)班', '计算机科学与技术');
INSERT INTO `student` VALUES ('2017339960099', 'Zex', '17计算机科学与技术(1)班', '计算机科学与技术');

-- ----------------------------
-- Table structure for teach
-- ----------------------------
DROP TABLE IF EXISTS `teach`;
CREATE TABLE `teach` (
  `teacher_id` bigint(20) NOT NULL,
  `cour_no` int(11) NOT NULL,
  `time` enum('秋季学期','春季学期') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`teacher_id`,`cour_no`),
  KEY `课程号` (`cour_no`),
  CONSTRAINT `教师号` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `课程号` FOREIGN KEY (`cour_no`) REFERENCES `course` (`cour_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teach
-- ----------------------------
INSERT INTO `teach` VALUES ('1010001', '1001', '秋季学期');
INSERT INTO `teach` VALUES ('1010001', '1003', '秋季学期');
INSERT INTO `teach` VALUES ('1010001', '1011', '春季学期');
INSERT INTO `teach` VALUES ('1010002', '1002', '春季学期');
INSERT INTO `teach` VALUES ('1010003', '1002', '春季学期');
INSERT INTO `teach` VALUES ('1010007', '1009', '春季学期');
INSERT INTO `teach` VALUES ('1010008', '1000', '秋季学期');
INSERT INTO `teach` VALUES ('1010012', '1000', '秋季学期');
INSERT INTO `teach` VALUES ('1010013', '1010', '秋季学期');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` bigint(20) NOT NULL,
  `teacher_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `department` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`teacher_id`),
  CONSTRAINT `teacherId` FOREIGN KEY (`teacher_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1010001', 'teacher1', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010002', 'teacher2', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010003', 'teacher3', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010004', 'teacher4', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010005', 'teacher5', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010006', 'teacher6', '计算机科学与技术系');
INSERT INTO `teacher` VALUES ('1010007', 'teacher7', '数字媒体系');
INSERT INTO `teacher` VALUES ('1010008', 'teacher8', '数字媒体系');
INSERT INTO `teacher` VALUES ('1010009', 'teacher9', '数字媒体系');
INSERT INTO `teacher` VALUES ('1010010', 'teacher10', '数字媒体系');
INSERT INTO `teacher` VALUES ('1010011', 'teacher11', '数字媒体系');
INSERT INTO `teacher` VALUES ('1010012', 'teacher12', '数学系');
INSERT INTO `teacher` VALUES ('1010013', 'teacher13', '数学系');
INSERT INTO `teacher` VALUES ('1010014', 'teacher14', '数学系');
INSERT INTO `teacher` VALUES ('1010015', 'teacher15', '数学系');
INSERT INTO `teacher` VALUES ('1010016', 'Wang', '数字媒体系');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `identity` enum('超级管理员','教师','学生') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `账号` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20173399600036 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('超级管理员', '8888', '123456');
INSERT INTO `user` VALUES ('教师', '1010001', '123456');
INSERT INTO `user` VALUES ('教师', '1010002', '123456');
INSERT INTO `user` VALUES ('教师', '1010003', '123456');
INSERT INTO `user` VALUES ('教师', '1010004', '123456');
INSERT INTO `user` VALUES ('教师', '1010005', '123456');
INSERT INTO `user` VALUES ('教师', '1010006', '123456');
INSERT INTO `user` VALUES ('教师', '1010007', '123456');
INSERT INTO `user` VALUES ('教师', '1010008', '123456');
INSERT INTO `user` VALUES ('教师', '1010009', '123456');
INSERT INTO `user` VALUES ('教师', '1010010', '123456');
INSERT INTO `user` VALUES ('教师', '1010011', '123456');
INSERT INTO `user` VALUES ('教师', '1010012', '123456');
INSERT INTO `user` VALUES ('教师', '1010013', '123456');
INSERT INTO `user` VALUES ('教师', '1010014', '123456');
INSERT INTO `user` VALUES ('教师', '1010015', '123456');
INSERT INTO `user` VALUES ('教师', '1010016', '12345');
INSERT INTO `user` VALUES ('学生', '2017339960001', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960002', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960003', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960004', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960005', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960008', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960009', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960010', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960012', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960013', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960014', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960015', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960016', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960017', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960018', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960019', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960020', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960021', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960022', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960023', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960024', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960025', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960026', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960027', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960028', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960029', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960030', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960031', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960032', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960033', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960035', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960098', '123456');
INSERT INTO `user` VALUES ('学生', '2017339960099', '123456');
