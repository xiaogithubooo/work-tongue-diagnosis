-- 数据源整体结构
--
-- <a href="https://github.com/xiaogithuboo">limou3434</a>
-- 项目数库
DROP DATABASE IF EXISTS work_tongue_diagnosis;
CREATE DATABASE work_tongue_diagnosis COLLATE = utf8mb4_unicode_ci;
USE work_tongue_diagnosis;

-- 项目用户
DROP USER IF EXISTS 'work_td'@'%';
CREATE USER 'work_td'@'%' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON work_tongue_diagnosis.* TO 'work_td'@'%';
FLUSH PRIVILEGES;

-- 项目数表
