use mysql;
show tables;
-- 1. DB 생성
drop database webdb;
create database webdb;
use webdb;

-- 2. DB user 생성
drop user 'webdb'@'localhost';
create user 'webdb'@'localhost' identified by 'webdb';

-- 3. grant privileges
grant all privileges on webdb.* to 'webdb'@'localhost';

