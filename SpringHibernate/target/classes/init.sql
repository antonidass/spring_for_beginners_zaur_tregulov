CREATE TABLE IF NOT EXISTS employees (
    id serial not null,
    name text,
    surname text,
    dep text,
    salary int
);

INSERT INTO employees(name, surname, dep, salary)
VALUES ('Anton', 'Ivanov', 'IT', 500),
       ('Oleg', 'Serov', 'Sales', 700),
       ('Masha', 'Popova', 'HR', 230);