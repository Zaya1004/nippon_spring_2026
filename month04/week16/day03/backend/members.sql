create table members (
id SERIAL primary key,
name VARCHAR(100) not null,
age int,
city VARCHAR(50)
);

insert into members (name, age, city)
values ('Khangaikhuu', 44,' Khuvsgul'),
('Nora', 19, 'Ulaanbaatar'), 
('Saka', 23, 'Darkhan'),
('Khishgee', 25, 'Ulaanbaatar'),
('Khongoroo', 25, 'Erdenet'),
('Tuga', 46, 'Ulaanbaatar');

select * from members where city = 'Ulaanbaatar';


select * from members order by age asc limit 2;


select * from members where age >= 20 and city = 'Ulaanbaatar';


select * from members where name like 'А';