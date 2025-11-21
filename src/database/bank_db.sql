create database bank_db;
use bank_db;

create table users (
	user_id int auto_increment primary key,
    username varchar(50) unique not null,
    password varchar(255) not null,
    role enum('admin','customer') not null
);

create table accounts (
	account_id int auto_increment primary key,
    user_id int,
    account_type enum('savings','current') not null,
    balance double default 0.0,
    account_number varchar(10) unique not null,
    foreign key (user_id) references users (user_id) on delete cascade
);

create table transaction (
	transaction_id int auto_increment primary key,
    account_number varchar(10),
    type enum('deposit','withdrawal','transfer') not null,
    amount double not null,
    date timestamp default current_timestamp,
    foreign key (account_number) references accounts(account_number)
);