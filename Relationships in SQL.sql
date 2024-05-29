----- One-to-One Relationship-----
create database Relationships;
use Relationships;
show tables;

create table Person
(
person_id int primary key,
FirstName varchar(40),
LastName varchar(40),
Gender char
);
desc person;
insert into person values(1,'Heerendra','Babu','M');
insert into person values(2,'Kavya','Maran','F');
insert into person values(3,'Virat','Kohli','M');

-- Displays table data
select *from person;

create table Passport
(
passport_id int primary key,
Passport_number Varchar(40),
pid int , foreign key(pid) references Person(person_id));

-- add uniqueness to pid column to achieve one-to-one because person table should correspond to only one entry in passport table
alter table passport add constraint u_pid unique (pid);
desc passport;
insert into passport values(1,'H966611',1);
insert into passport values(2,'J142561',3);
insert into passport values(3,'L126478',2);
-- insert into passport values(4,'K12356',2); in one-to-one it is invalid.
delete from passport where pid =2;
select *from passport;
select *from person;

---- One-to-Many-Relationship ---
create table Department
(
deptId int primary key,
deptName varchar(40));
insert into Department values(1,'Developing');
insert into Department values(2,'Testing');
desc Department;
select *from Department;

create table Employee
(
empid int primary key,
ename varchar(40),
deptId int,foreign key(deptId) references Department(deptId));
insert into Employee values(1,'Heerendra',1);
insert into Employee values(2,'Jagadeesh',1);
insert into Employee values(3,'Raju',2);
desc Employee;
select *from Employee;
rollback;
select d.deptName,e.ename from Department d join Employee e on d.deptId = e.deptId;

-- Many-to-Many Relationship--
create table student
(
studentID int primary key,
firstName varchar(40),
lastName varchar(40),
email varchar(40),
phone varchar(40));
desc student;
create table course
(
 courseID int primary key,
 courseName varchar(40)
 );
 desc course;
 create table StudentCourse
 (
 studentId int,
 courseId int,
 primary key(studentId, courseId),
 foreign key(studentId)references student(studentId),
 foreign key(courseId) references course(courseId)
 );
 desc studentcourse;
insert into student values(1,'Heerendra','Babu','heerendrababu1@gmail.com','6956874565');
insert into student values(2,'Jagadeesh','kumar','Jagadeesh532@gmail.com','9666556856');
insert into student values(3,'Kanugala','Raju','kanugualatraju33@gmail.com','7896562312');

insert into course values(1,'Maths');
insert into course values(2,'English');
insert into course values(3,'History');

insert into studentcourse values(1,1);
insert into studentcourse values(1,2);
insert into studentcourse values(2,2);
insert into studentcourse values(2,3);
insert into studentcourse values(3,1);
insert into studentcourse values(3,3);

select*from student;
select * from course;
select *from studentcourse;

SELECT s.firstName, s.lastName, c.courseName
FROM student AS s
JOIN StudentCourse AS sc ON s.studentID = sc.studentId
JOIN course AS c ON sc.courseId = c.courseID;


