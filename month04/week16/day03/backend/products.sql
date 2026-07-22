create table products (
id SERIAL primary key,
name VARCHAR(200) not null unique,
description text,
price numeric(10, 2) not null,
stock_quantity int, 
is_active boolean default true);


insert into products (name, description, price, stock_quantity)
values ('Laptop', 'Portable computer for work and study', 120000.00, 6),
('Mouse', 'Wireless mouse for easy navigation', 25000.00, 7),
('Keyboard', 'USB keyboard for comfortable typing', 45000.00, 4);

select * from products;