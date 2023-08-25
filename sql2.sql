
show databases;

use sakila;
select * from film;

select  title,film_id,release_year,description from film where title like 'a%an';
select  title,film_id,release_year,description from film where title like '%t_';
select  title,film_id,release_year,description from film where title like '_f_i%egg%';
select  title,film_id,release_year,description from film where title like '_a_';
select title,film_id,release_year,description from film where title like '%t____%;



