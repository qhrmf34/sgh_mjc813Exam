ALTER TABLE saled_tbl add constraint fk_location_id foreign key(location_id) references location_tbl(id);
ALTER TABLE saled_tbl add constraint fk_contact_id foreign key(contact_id) references contact_tbl(id);

ALTER TABLE learn_tbl add constraint fk_lecture_id foreign key(lecture_id) references lecture_tbl(id);
ALTER TABLE learn_tbl add constraint fk2_contact_id foreign key(contact_id) references contact_tbl(id);

insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('홍길동','010-11','21324','hong','서울시 영등포구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('이순신','010-22','34111','lee','인천시 계양구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('을지문덕','010-33','93828','ul','서울시 구로구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('이도','010-55','62111','lee','서울시 서대문구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('윤봉길','010-66','83828','yun','서울시 중랑구');
insert INTO contact_tbl(name,phoneNumber,zipNumber,email,addr) values ('장영실','010-44','71324','jang','서울시 은평구');

insert into saled_tbl(sale_dt,price,qty,product,location_id,discount,contact_id) values ('2025-07-03',2500,2,'곰보빵',1,0,2);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (3000,1,'우유',3,0,1);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (31000,1,'쌀 10kg',1,1000,1);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (70000,1,'라면',4,5000,4);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (999000,1,'물만두',2,300,6);
insert into saled_tbl(price,qty,product,location_id,discount,contact_id) values (7700,2,'파스타면',1,0,4);


insert into location_tbl(location) values('인천시');
insert into location_tbl(location) values('서울시');
insert into location_tbl(location) values('경기도');
insert into location_tbl(location) values('충청도');
insert into location_tbl(location) values('광주시');
insert into location_tbl(location) values('제주도');

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
insert into learn_tbl(lecture_id,score,contact_id) values (1,70,4);
insert into learn_tbl(lecture_id,score,contact_id) values (2,44,4);
insert into learn_tbl(lecture_id,score,contact_id) values (3,31,4);
insert into learn_tbl(lecture_id,score,contact_id) values (1,67,5);
insert into learn_tbl(lecture_id,score,contact_id) values (5,37,5);
insert into learn_tbl(lecture_id,score,contact_id) values (2,81,5);
insert into learn_tbl(lecture_id,score,contact_id) values (3,20,5);
insert into learn_tbl(lecture_id,score,contact_id) values (1,40,6);
insert into learn_tbl(lecture_id,score,contact_id) values (2,34,6);
insert into learn_tbl(lecture_id,score,contact_id) values (3,11,6);
insert into learn_tbl(lecture_id,score,contact_id) values (6,21,6);
delete from learn_tbl where contact_id=2 and lecture_id=3;


select a.product, a.qty, a.price, b.location from saled_tbl as a inner join location_tbl as b 
on b.id=a.location_id where b.id=3;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a inner join saled_tbl as b
on a.id=contact_id;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a left join saled_tbl as b
on a.id=contact_id;

select a.name, a.phoneNumber, b.location_id from contact_tbl as a right join saled_tbl as b
on a.id=contact_id;

SELECT 
  IFNULL(b.location_id,''),
  COUNT(a.id) AS contact_count
FROM contact_tbl AS a
LEFT JOIN saled_tbl AS b
  ON a.id = b.contact_id
GROUP BY b.location_id
order by b.location_id desc;

select a.name, a.phoneNumber, count(b.location_id) '아이디개수' from contact_tbl as a right join saled_tbl as b
on a.id=contact_id group by a.name, a.phoneNumber;



ALTER TABLE saled_tbl
DROP FOREIGN KEY fk_location_id;
ALTER TABLE saled_tbl
ADD CONSTRAINT fk_location_id
  FOREIGN KEY (location_id)
  REFERENCES location_tbl(id)
  ON UPDATE CASCADE
  ON DELETE CASCADE;

ALTER TABLE saled_tbl
DROP FOREIGN KEY fk_contact_id;
ALTER TABLE saled_tbl
ADD CONSTRAINT fk_contact_id
FOREIGN KEY (contact_id)
REFERENCES contact_tbl(id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE learn_tbl
DROP FOREIGN KEY fk_lecture_id;
ALTER TABLE learn_tbl
ADD CONSTRAINT fk_lecture_id
FOREIGN KEY (lecture_id)
REFERENCES lecture_tbl(id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE learn_tbl
DROP FOREIGN KEY fk2_contact_id;
ALTER TABLE learn_tbl
ADD CONSTRAINT fk2_contact_id
FOREIGN KEY (contact_id)
REFERENCES contact_tbl(id)
ON UPDATE CASCADE
ON DELETE CASCADE;

select id from saled_tbl where id =2 union select id from lecture_tbl where id=1;

CREATE VIEW smart_student AS
SELECT a.name, c.subject,b.score FROM contact_tbl as a inner join learn_tbl as b 
on a.id=b.contact_id 
inner join lecture_tbl as c
on c.id=b.lecture_id
WHERE b.score >= 80;

select * from smart_student;
drop view smart_student;
/*test 구문*/
/*7월4일 과제*/
CREATE VIEW saled_and_lecture AS
SELECT
  a.name,
  a.phoneNumber,
  b.product,
  b.구매금액,
  c.location,
  d.점수평균,
  d.수강강의수
FROM contact_tbl AS a
INNER JOIN (
  SELECT contact_id, product, SUM(qty * price) AS 구매금액, location_id
  FROM saled_tbl
  GROUP BY contact_id, product, location_id
) AS b ON a.id = b.contact_id
INNER JOIN location_tbl AS c ON b.location_id = c.id
INNER JOIN (
  SELECT contact_id, AVG(score) AS 점수평균, COUNT(DISTINCT lecture_id) AS 수강강의수
  FROM learn_tbl
  GROUP BY contact_id
) AS d ON a.id = d.contact_id
order by name asc;

select * from saled_and_lecture;
drop view saled_and_lecture;
/*가장 빠른 시작일자*/
select a.name,min(c.start_dt)
from contact_tbl as a
inner join learn_tbl as b
on a.id=b.contact_id
inner join(
	select start_dt, id 
	from lecture_tbl
)as c 
on b.lecture_id=c.id
group by a.name;

/*가장 늦은 끝 일자 시간*/
select a.name,max(c.start_dt)
from contact_tbl as a
inner join learn_tbl as b
on a.id=b.contact_id
inner join(
	select start_dt, id 
	from lecture_tbl
)as c 
on b.lecture_id=c.id
group by a.name;

select max(a.score) as 최고점수,b.subject
from learn_tbl as a
inner join lecture_tbl as b
on a.lecture_id=b.id
group by b.subject;

select * from learn_tbl;

/*최우수점수*/
create view max_score as
select  a.contact_id,a.lecture_id, a.score 최고점수
from learn_tbl a
inner join(
select lecture_id,max(score) as 최고점수
from learn_tbl
group by lecture_id
) b
on a.lecture_id=b.lecture_id
and b.최고점수=a.score;

select * from max_score;
drop view max_score;

select a.최고점수,b.name,c.subject
from max_score a
inner JOIN 
contact_tbl b
on a.contact_id=b.id
inner join 
lecture_tbl c
on a.lecture_id=c.id;


/*최하위점수*/
create view min_score as
select  a.contact_id,a.lecture_id, a.score 최저점수
from learn_tbl a
inner join(
select lecture_id,min(score) as 최저점수
from learn_tbl
group by lecture_id
) b
on a.lecture_id=b.lecture_id
and b.최저점수=a.score;

select * from min_score;
drop view min_score;

select a.최저점수,b.name,c.subject
from min_score a
inner JOIN 
contact_tbl b
on a.contact_id=b.id
inner join 
lecture_tbl c
on a.lecture_id=c.id;

/*고객별 판매 총금액 내림차순*/
select * from saled_tbl;

select a.name,b.판매총금액
from contact_tbl a
inner join 
(select contact_id,sum(price*qty-discount) 판매총금액
from saled_tbl
group by contact_id) b
on a.id=b.contact_id
order by b.판매총금액;

/*각상품별 판매총금액 내림차순*/
select product,price*qty-discount as 판매총금액
from saled_tbl
order by 판매총금액 desc;


