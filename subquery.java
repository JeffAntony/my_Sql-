Google Classroom
Classroom
SQL Sessions
Batch A - August 2023
Home
Calendar
Enrolled
To-do
S
SQL Sessions
Batch A - August 2023
J
JAVA Full Stack Development
Physical Batch - C Jaipur
J
JAVA Full Stack Development
Physical Batch-B Jaipur (June 2023)
C
C++ DSA Program
Physical Batch Jaipur - 8th Feb 2023
Archived classes
Settings
Stream
Classwork
People
SQL Sessions Batch A - August 2023
SQL Sessions
Batch A - August 2023

Meet
Upcoming
Woohoo, no work due soon!

Announce something to your class

Announcement: "21 Sept file"
REGex Software
Created 1:48 PM1:48 PM
21 Sept file

21_sept_SQL Session Offline - REGex qqq (2023-09-21 10:29 GMT+5:30)
Video

subquery_21sept.sql
SQL

Add class comment…


Announcement: "SQL Session Offline - REGex qqq 7…"
REGex Software
Created 10:55 AM10:55 AM
SQL Session Offline - REGex qqq
7 September 2023, 11:00am – 24 September 2023, 1:30pm ·
Time zone: Asia/Kolkata
Google Meet joining info
Video call link: https://meet.google.com/bpa-ifkp-sfp
Or dial: ‪(US) +1 631-910-9121‬ PIN: ‪262 956 406‬#
More phone numbers: https://tel.meet/bpa-ifkp-sfp?pin=5692223712985

Add class comment…

Assignment: "HackerRank & SQLZOO"
REGex Software posted a new assignment: HackerRank & SQLZOO
Created Sep 15Sep 15
1 class comment

Announcement: "15 September file"
REGex Software
Created Sep 15Sep 15
15 September file

15_SQL Session Offline - REGex qq (2023-09-15 10:14 GMT+5:30)
Video

9September.sql
SQL

15Sept.sql
SQL

Add class comment…


Announcement: "14 September file"
REGex Software
Created Sep 14Sep 14
14 September file

14_SQL Session Offline - REGex (2023-09-14 16:41 GMT+5:30)
Video

Add class comment…


Announcement: "8 September"
REGex Software
Created Sep 11Sep 11
8 September

8September_groupby.sql
SQL

Create_dataType_6September.sql
SQL

8_sept_SQL Session Offline - REGex (2023-09-08 11:46 GMT+5:30)
Video

Add class comment…


Announcement: "7 September"
REGex Software
Created Sep 7Sep 7 (Edited Sep 8)
7 September

Create_dataType_6September.sql
SQL

SQL_7Sept Session Offline - REGex (2023-09-07 11:44 GMT+5:30)
Video

Add class comment…


Announcement: "6th September"
REGex Software
Created Sep 6Sep 6
6th September

SQL_6September_create_statement (2023-09-06 11:58 GMT+5:30)
Video

Create_dataType_6September.sql
SQL

Add class comment…

Assignment: "Write Article on Linkedln | mySQL"
REGex Software posted a new assignment: Write Article on Linkedln | mySQL
Created Sep 6Sep 6
9 class comments

Announcement: "5 September"
REGex Software
Created Sep 6Sep 6
5 September

2023-09-05 12-01-44.mkv
Video

Add class comment…

Stream
use employees;

show tables;


select * from employees;
-- e,[ 10003   => hiring_date  1986-08-28
select hire_date from employees where emp_no=10003;  

select * from employees where hire_date>"1986-08-28";

select * from employees where first_name="Georgi" and birth_date="1953-09-02" ;
-- nested sub query
select * from employees 
where hire_date> ( select hire_date from employees where emp_no=10003);


-- nested queries
SELECT emp_no, first_name, last_name, hire_date
FROM employees JOIN titles USING (emp_no)
WHERE title = 'Assistant Engineer'
AND hire_date < ANY (SELECT hire_date FROM
employees JOIN titles USING (emp_no)
WHERE title = 'Manager');

show tables;
select * from titles;
-- title == emp_Np 10001
select title from titles where emp_no in (10001,10002);

-- subquery return 1 row => = , >, <, >=,<= 
select * from titles 
where title =  (select title from titles where emp_no in (10001,10002));

select title from titles where emp_no in (10001,10002);
select * from titles 
where title =ANY  (select title from titles where emp_no in (10001,10002));

select salary from salaries where emp_no=10002; 

select * from salaries 
where salary <=ANY ( select salary from salaries where emp_no=10002)
order by salary desc;




subquery_21sept.sql
Displaying subquery_21sept.sql.
