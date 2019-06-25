-- 创建数据库
CREATE DATABASE hib;
-- 打开数据库
USE hib;
CREATE TABLE school(
	scid INT PRIMARY KEY AUTO_INCREMENT,
	scname VARCHAR(100),
	address VARCHAR(200)
);
CREATE TABLE student(
	sid INT AUTO_INCREMENT PRIMARY KEY,
	sname VARCHAR(20),
	birthday DATE,
	gendar VARCHAR(2),
	phone VARCHAR(12)
);

INSERT INTO school(scname,address)VALUES('西安三中','西安市新城区长乐西路');