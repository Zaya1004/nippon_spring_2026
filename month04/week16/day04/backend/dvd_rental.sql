select * from actor;

select first_name from actor;

select first_name, last_name from actor;

-- Alias
select first_name as "First Name", last_name "Last Name" from actor;

-- Exercises 
select city_id, city from city;

select country from country;

select * from film;


--LIMIT
select * from country limit 10;


-- ORDER BY
select * from country order by country desc limit 10;

select * from city order by city_id asc limit 10;

select * from film order by title desc limit 20;

select first_name || '' || last_name as "Full Name" from actor;

-- DISTINCT
select DISTINCT first_name from actor;

-- WHERE
select * from country;
select * from country where country = 'Afghanistan';

select * from actor where first_name = 'Warren';

-- R rating films with title, decription, rating
select * from film;
select title, description, rating from film where rating = 'R';

-- customer names, email with active is false
select first_name, last_name, email from customer where active = 0;

-- rental rate ni 3s baga kinonuudiin title, bolon rental rate iig songo
select * from film;
select title, rental_rate from film where rental_rate <= 3;

-- rental husnegtees return date ni null bga hereglegchid
select * from rental where return_date is null;

-- AND operator kinonii urt ni 180 min-aas ih, rental rate ni 1-s baga buh kino
select title, length, rental_rate from film where rental_rate < 1 and length > 180;

-- 'Allen', 'Chase', 'Davis' ovogtoi buh actors
select * from actor where last_name in ('Allen', 'Chase', 'Davis');

-- '2007-02-15', '2007-02-16' gesen udruud ni payment hiigdsn payments
select payment_id, amount, payment_date from payment 
where
payment_date:: date in ('2007-02-15', '2007-02-16');

-- buh film-s dugaaraar ni usuh daraallaar haruulhda 1,2,3 gsn dugaar oruulahguigeer ehnii 20 kio
select * from film  where film_id not in (1, 2, 3) order by film_id asc limit 20;

-- payment-uud dotroos id n 17500 - 17505 hoorond bga buh tulburuudiig buurah daraallaar
select  * from payment where payment_id between 17500 and 17505;
