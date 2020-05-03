use db_phone;
create table tbl_phone(
id INT(4) NOT NULL AUTO_INCREMENT,
phone_name VARCHAR(32) NOT NULL,
price INT(10) NOT NULL,
PRIMARY KEY (id)
);
insert into tbl_phone values(null,'Galaxy S3',6000000);
insert into tbl_phone values(null,'Moto G',1949000);
insert into tbl_phone values(null,'Xiaomi',1499000);