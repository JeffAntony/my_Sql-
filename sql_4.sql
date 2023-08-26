
show databases;

use sakila;

select * from actor;
select * from actor where (actor_id between  2 and 7)  and  first_name like "nick" or first_name like "eD"; 
select * from actor where not (last_name like '%A%' or last_name like '%E%');
select * from actor where (first_name like "Matthew" or first_name like "Joe" or first_name like "Grace") and  actor_id < 15;
select * from actor where not(last_name like '%a%' or first_name like '%i%') and actor_id between 10 and 20;


