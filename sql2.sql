
show databases;

use sakila;

select  title,film_id,release_year,description from file where title like 'a%an';
select  title,film_id,release_year,description from file where title like '%t_';
select  title,film_id,release_year,description from file where title like '_f_i%egg%';
select  title,film_id,release_year,description from file where title like '_a_';



