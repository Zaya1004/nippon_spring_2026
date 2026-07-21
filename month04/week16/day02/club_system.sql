create table clubs (
id SERIAL primary key, 
name VARCHAR(150) not null unique,
founded_date date default current_date,
is_active boolean default true
); 

create table members (
id SERIAL primary key, 
club_id INT references clubs(id), -- foreign key linking to clubs
email VARCHAR(200) unique not null,
full_name VARCHAR(100) not null,
subscription_fee Numeric(10, 2) check (subscription_fee >= 0),
joined_at timestamptz default now()
); 

-- Data Definition Language (DDL)
--1.
alter table members add column phone VARCHAR(20);
--2.
alter table members alter column full_name type varchar(250);
--3. 
alter table clubs add column category varchar(50) default 'General'not null;
--4.
alter table clubs add constraint check_category_length check (Length(category) > 2); 

--exercises 1
insert into clubs( name, founded_date, category, is_active)
values ('Chess Club', '2026-07-21', 'Board Games', true);

select * from clubs;

insert into members (id, club_id, email, full_name, subscription_fee)
values (1, 'sainzayaz65@gmail.com', 'Saizaya', 50000.00);

select * from members;

-- exercises 2
truncate table members restart identity;

drop table clubs cascade ;
select * from members;

drop table members;

drop database club_system;


