create database joins;
use joins;
create table bloodgroup
(
bid int primary key,
bname varchar(40)
);
insert into bloodgroup values(1,'b+ve'),(2,'b-ve'),(3,'o-ve'),(4,'o+ve'),(5,'o-ve');
select *from bloodgroup;

create table patient
(
pid numeric primary key,
pname varchar(40),
bid int,foreign key(bid) references bloodgroup(bid),
age numeric);
insert into patient values(1,'Babu',2,24);
insert into patient values(2,'choudayya',3,27);
insert into patient values(3,'jagadeesh',1,21);
insert into patient values(4,'Raju',3,29);
insert into patient values(5,'prasad',null,32);

select *from patient;
-- Inner join only matched records based on codition from Left side table and Right side table
select p.pname,b.bname,p.age from patient p join bloodgroup b on p.bid=b.bid;

-- All data from left table will be added to resultSet,but only the matched records from right table is included to result set.--
select p.*,b.* from patient p left outer join bloodgroup b on p.bid=b.bid;

-- Right Outer Join -- 
create table Animal
(
Aid int primary key,
Aname varchar(40));
insert into Animal values(1,'Tiger');
insert into Animal values(2,'Bear');
insert into Animal values(3,'Tortoise');
insert into Animal values(4,'Eagle');
insert into Animal values(5,'Kangaroo');
select *from Animal;

create table country
(
 cid int primary key,
 cname varchar(40),
 NAid int, foreign key(NAid) references Animal(Aid));
 insert into country values(1,'USA',4);
 insert into country values(2,'India',1);
 insert into country values(3,'Australia',5);
-- All data from Right table will be added to resultSet,but only the matched records from Left table is included to result set.--
select cname ,Aname from country right outer join Animal on country.NAid = animal.Aid;

-- In full outer join all data from left outer join and all data from right outer join will be added to result set by using union in mysql.--
select cname ,Aname from country left outer join Animal on country.NAid = animal.Aid union 
select cname ,Aname from country right outer join Animal on country.NAid = animal.Aid;


-- cross join -- without join it will produce cartesian product which means row present in 1st table multiplied by all rows present in the second table.
select *from Animal cross join country;

select *from Animal join Country on Animal.Aid = Country.NAid;

