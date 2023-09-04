
show databases;

use sakila;
select concat("H","I") from dual;
select now;
---- concat used to join two char , and make it string 
select concat("I","A","M","9") from dual;
-- --uppercase of a string.
select concat("A","I","M");
select concat_ws("hey","hello") from dual;
-- us means uppercase letters.
select ucase("hi");
select concat_ws("hello","bye");
---- substr remove number of char in the string. 
select   substr("Morning",1,2);

-- count the index number of char in a string-- 
select  instr("hello","hell");
-- 
select instr("wherer","whe");
select locate("a","rajasthan",3);
---- locate the char position from the string--

select ltrim("    xyz");  
---- remove white space from left side --  

select trim("   zyz    ");
-- remove white space from both end-- 

select trim(leading " " from "   xchdf   ");
select trim(leading " " from "     fgknsfl");
---- leading remove white space from both end--  
select trim(both "z " from "   xchdf yx     ");
-- both cut from both sides-- 

select trim(both "z " from "   xchdf  zzd  yx");

select lpad("hell" ,6,"#");
-- adding char to left side of -- 

select rpad("hello" ,6,"#");
  --  adding char to right side of --  
 select replace("hello" ,"lo","in"); 
 -- replacing  char -- 
 
 select replace("bye","ye","if");
 
select * from language;
select count(*) from language;

-- dml - data maipulation language-- 
-- crud operation = create upadate and delete-- 
-- insert statement insert into table values_

insert into language value(null,"portugese",now());
describe language;
  select * from language;
  
  insert into language values (11,"Portugese",now());
  