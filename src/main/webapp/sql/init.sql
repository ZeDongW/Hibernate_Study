create database hibernate_demo character default set utf8;

use hibernate_demo;

create table users(
	id int(10) PRIMARY KEY auto_increment comment 'id',
	userName char(20) not null comment '用户名',
	birthday date comment '生日'
) comment '用户表';