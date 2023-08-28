
show databases;

use sakila;

select * from film_id;

select film_id,title from film_list where film_id<7 and not(film_id= 4 or film_id= 6);
select * from film_list order by category;
select * from film_list order by ( desc and asc);
select * from film_list order by 5;
select fid ,category,title from film_list order by price;

select * from address;
select district ,address,address_id from address order by district, address_id desc;

#sorting with order by (asc and desc);
#sorting based on address and grouped by district

-- limit 3,2 is offset and 2 is number
select * from address limit 5,5;

select * from address limit 5 offset 3;

select * from address limit 3;

# table - dual dummy table=> logic

select * from dual;
-- dual table is a logical table where can we write the logic;

select now() from dual;

-- pseudo coloumn which has specific meaning which is available with system

select now();
