SET MODE PostgreSQL;
--CREATE DATABASE users_information;
--\c users_information

 CREATE TABLE IF NOT EXISTS signup(
      id int PRIMARY KEY auto_increment,
      name VARCHAR,
      username VARCHAR,
      email VARCHAR,
      password VARCHAR,

);
 CREATE TABLE IF NOT EXISTS login (
      id int PRIMARY KEY auto_increment,
      username VARCHAR,
      email VARCHAR,
      password VARCHAR,

);


--CREATE DATABASE users_information_test WITH TEMPLATE users_information;