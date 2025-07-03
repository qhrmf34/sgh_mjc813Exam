ALTER TABLE saled_tbl add constraint fk_location_id foreign key(location_id) references location_tbl(id);
ALTER TABLE saled_tbl add constraint fk_contact_id foreign key(contact_id) references contact_tbl(id);

ALTER TABLE learn_tbl add constraint fk_lecture_id foreign key(lecture_id) references lecture_tbl(id);
ALTER TABLE learn_tbl add constraint fk2_contact_id foreign key(contact_id) references contact_tbl(id);

insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('홍길동','010-11','21324','hong','서울시 영등포구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('이순신','010-22','34111','lee','인천시 계양구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('을지문덕','010-33','93828','ul','서울시 구로구');

insert into saled_tbl(sale_dt,price,qty,product,location_id,discount,contact_id) values ('2025-07-03',2500,2,'곰보빵',1,0,2);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (3000,1,'우유',3,0,1);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (31000,1,'쌀 10kg',1,1000,1);

insert into location_tbl(location) values('인천시');
insert into location_tbl(location) values('서울시');
insert into location_tbl(location) values('경기도');

insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('데이터통신','김교수','60A','2025-07-01','2025-07-10');
insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('데이터보안','이교수','813','2025-06-10','2025-06-25');
insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('웹서버','최교수','705','2025-06-05','2025-06-15');

insert into learn_tbl(lecture_id,score,contact_id) values (3,70,2);
insert into learn_tbl(lecture_id,score,contact_id) values (1,62,2);
insert into learn_tbl(lecture_id,score,contact_id) values (2,80,2);
insert into learn_tbl(lecture_id,score,contact_id) values (3,99,1);
insert into learn_tbl(lecture_id,score,contact_id) values (1,22,1);
insert into learn_tbl(lecture_id,score,contact_id) values (2,41,1);
insert into learn_tbl(lecture_id,score,contact_id) values (1,50,3);
insert into learn_tbl(lecture_id,score,contact_id) values (2,94,3);
insert into learn_tbl(lecture_id,score,contact_id) values (3,91,3);

select a.product, a.qty, a.price, b.location from saled_tbl as a inner join location_tbl as b 
on b.id=a.location_id where b.id=3;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a inner join saled_tbl as b
on a.id=contact_id;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a left join saled_tbl as b
on a.id=contact_id;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a right join saled_tbl as b
on a.id=contact_id;

START TRANSACTION;
savepoint A;
insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('C언어','박교수','70A','2025-08-01','2025-09-10');
insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('JAVA','구교수','113','2025-05-10','2025-07-25');
insert into lecture_tbl(subject, teacher, root_num, start_dt, end_dt) values ('임베디드소프트웨어','지교수','205','2025-09-05','2025-11-15');
rollback to savepoint A; 
