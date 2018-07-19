drop table if exists user;
create table user(id bigint NOT NULL AUTO_INCREMENT, username varchar(40),
name1 varchar(20), age int(3), balance decimal(10, 2), primary key(id));