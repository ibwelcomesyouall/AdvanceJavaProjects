CREATE DATABASE jlcdb;
use jlcdb;

CREATE TABLE jlcusers(
userid int primary key,
fullname varchar(30),
email varchar(50),
phone bigint,
username varchar(15) unique,
password varchar(15));

select * from jlcusers;