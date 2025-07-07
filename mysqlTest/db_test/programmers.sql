/*https://school.programmers.co.kr/learn/courses/30/lessons/59406*/0
SELECT count(*) from ANIMAL_INS;

/*https://school.programmers.co.kr/learn/courses/30/lessons/59036*/
SELECT animal_id,name from animal_ins where INTAKE_CONDITION='sick';

/*https://school.programmers.co.kr/learn/courses/30/lessons/59038*/
SELECT min(datetime) from animal_ins;

/*https://school.programmers.co.kr/learn/courses/30/lessons/59039*/
SELECT animal_id from animal_ins where name is null;

/*https://school.programmers.co.kr/learn/courses/30/lessons/59041*/
SELECT name, count(name) count from animal_ins group by name having count(name)>=2 order by name;

/*https://school.programmers.co.kr/learn/courses/30/lessons/59047*/
SELECT animal_id, name from animal_ins where name like'%el%' and animal_type='Dog' order by name;