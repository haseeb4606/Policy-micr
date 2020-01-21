create database policy_db;

create table customer(
id bigint auto_increment not null,
uid varchar(100) unique not null ,
first_name varchar (30) not null,
last_name varchar (30) not null,
email varchar (100) not null,
phone bigint (10) not null,
primary key(id)
);

create table policy(
id integer (30) auto_increment not null,
uid varchar (30) not null,
policy_num varchar(50) not null unique,
type varchar(100) not null,
start_date date not null,
end_date date not null,
is_active boolean default true not null,
customer_id bigint,
primary key (id),
foreign key (customer_id) references customer(id));