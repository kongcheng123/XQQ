/*
创建数据库xqq
 */
create   database   xqq  default   charset   utf8;

/*
管理员表
 */
create table admin(
  id int(11) not null PRIMARY KEY auto_increment comment '管理员id',
  adminName varchar(30) not null comment '账号名称',
  adminPwd varchar(50) not null comment '账号密码',
  createTime varchar(50) not null comment '创建时间',
  updateTime varchar(50) not null comment '更改时间'
 );

/*
文章表
 */
create table article(
  id int(11) not null PRIMARY KEY auto_increment comment '文章id',
  title varchar(50) not null comment '文章标题',
  imgUrl varchar(100) not null comment '文章头图片',
  description varchar(100) not null comment '文章描述',
  content varchar(100000) not null comment '文章内容',
  createTime varchar(50) not null comment '创建时间',
  updateTime varchar(50) not null comment '更改时间'
);