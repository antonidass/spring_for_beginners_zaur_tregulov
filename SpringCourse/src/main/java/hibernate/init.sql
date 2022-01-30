CREATE DATABASE  my_db;


DROP TABLE IF EXISTS details;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS Departments;

CREATE TABLE IF NOT EXISTS details(
    id serial primary key ,
    city text,
    phone_number text,
    email text
);

CREATE TABLE IF NOT EXISTS employees (
                           id serial primary key,
                           name varchar(15),
                           surname varchar(25),
                           department varchar(20),
                           salary int,
                           dep_id int,
                           FOREIGN KEY (dep_id) REFERENCES Departments(id)
);


CREATE TABLE IF NOT EXISTS Departments(
    id serial primary key ,
    name text,
    max_salary int,
    min_salary int
);





CREATE TABLE IF NOT EXISTS children(
    id serial primary key ,
    name_child text,
    age int
);

CREATE TABLE IF NOT EXISTS section(
    id serial primary key ,
    name_section text
);

CREATE TABLE IF NOT EXISTS child_section(
    id serial primary key ,
    child_id int,
    section_id int,
    FOREIGN KEY (child_id) REFERENCES children(id),
    FOREIGN KEY (section_id) REFERENCES section(id)
);






